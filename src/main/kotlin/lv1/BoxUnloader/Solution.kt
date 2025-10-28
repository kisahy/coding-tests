package com.kisahy.lv1.BoxUnloader

class Solution {
    fun solution(n: Int, w: Int, num: Int): Int {
        val boxes = mutableMapOf<Int, Pair<Int, Int>>()

        for (boxNum in 1 .. n) {
            val row = (boxNum - 1) / w
            val index = (boxNum - 1) % w
            val col = if (row % 2 == 0) index + 1 else w - index

            boxes[boxNum] = row to col
        }

        val (targetRow, targetCol) = boxes[num] ?: return 0

        return boxes.count { (_, box) ->
            val (row, col) = box
            row >= targetRow && col == targetCol
        }
    }
}