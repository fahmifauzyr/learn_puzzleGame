package com.fahmi.puzzle_game

class Tile(
    private var number: Int? = null
) {
    fun number(): Int {
        return number!!
    }
}