package board

import board.Direction.*

fun createSquareBoard(width: Int): SquareBoard = object : SquareBoard {
    override val width: Int = width

    override fun getCellOrNull(i: Int, j: Int): Cell? =
            getAllCells().firstOrNull { it == Cell(i, j) }

    override fun getCell(i: Int, j: Int): Cell = TODO()

    override fun getAllCells(): Collection<Cell> =
            (1..width).flatMap { i ->
                (1..width).map { j ->
                    Cell(i, j) } }

    override fun getRow(i: Int, jRange: IntProgression): List<Cell> =
            getAllCells().filter { it.i == i && it.j in jRange }

    override fun getColumn(iRange: IntProgression, j: Int): List<Cell> = TODO()

    override fun Cell.getNeighbour(direction: Direction): Cell? = TODO()
}

fun <T> createGameBoard(width: Int): GameBoard<T> = TODO()

