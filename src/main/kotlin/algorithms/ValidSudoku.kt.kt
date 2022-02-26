package algorithms

import java.util.*

/**
 * @author Bill.Lin on 2021/8/21
 */
class `ValidSudoku.kt` {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowMap: MutableMap<Int, MutableSet<Int>> = HashMap()
        val colMap: MutableMap<Int, MutableSet<Int>> = HashMap()
        val nineMap: MutableMap<Int?, MutableSet<Int>> = HashMap()
        val posMap: MutableMap<Int, Int> = HashMap()
        var count = 1
        for (i in 0..2) {
            for (j in 0..2) {
                posMap[10 * i + j] = count++
            }
        }
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] != '.') {
                    val rowSet = rowMap.getOrDefault(i, HashSet())
                    if (rowSet.contains(board[i][j] - '0')) return false
                    rowSet.add(board[i][j] - '0')
                    rowMap[i] = rowSet
                    val colSet = colMap.getOrDefault(j, HashSet())
                    if (colSet.contains(board[i][j] - '0')) return false
                    colSet.add(board[i][j] - '0')
                    colMap[j] = colSet
                    val ninePos = posMap[10 * (i / 3) + j / 3]
                    val nineSet = nineMap.getOrDefault(ninePos, HashSet())
                    if (nineSet.contains(board[i][j] - '0')) return false
                    nineSet.add(board[i][j] - '0')
                    nineMap[ninePos] = nineSet
                }
            }
        }
        return true
    }
}