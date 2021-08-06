package com.fahmi.puzzle_game

class Board(size: Int) {

    private val size: Int
    private var numOfMoves: Int
    private val places: MutableList<Place>
    private val listener: MutableList<BoardChangeListener>

    fun rearrange() {
        numOfMoves = 0
        for (i in 0 until size * size) {
            swapTiles()
        }
        do {
            swapTiles()
        } while (!solvable() || solved())
    }

    //    swap two  titles randomly
    private fun swapTiles() {
        val p1: Place? = at(rendoms.nextInt(size) + 1, rendoms.nextInt(size) + 1)
        val p2: Place? = at(rendoms.nextInt(size) + 1, rendoms.nextInt(size) + 1)

        if (p1 != p2) {
            val t: Tile? = p1?.tile
            p1!!.tile = p2?.tile
            p2!!.tile = t
        }
    }
//    is the puzzle current arrangement



}