package algorithms

import java.util.*


class Test {
    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        val row = mat.size
        val col = mat[0].size
        val ans = Array(row) { IntArray(col) }
        for (i in 0 until row) {
            sort(ans, mat, i, 0, row, col)
        }
        for (i in 1 until col) {
            sort(ans, mat, 0, i, row, col)
        }
        return ans
    }

    private fun sort(ans: Array<IntArray>, mat: Array<IntArray>, row: Int, col: Int, rowLimit: Int, colLimit: Int) {
        var row = row
        var col = col
        val queue: Queue<Int> = PriorityQueue { a: Int, b: Int -> b - a }
        val positionR = row
        val positionC = col
        while (col < colLimit && row < rowLimit) {
            queue.offer(mat[row++][col++])
        }

        while (row != positionR && col != positionC) {
            ans[--row][--col] = queue.poll()
        }
    }
}


