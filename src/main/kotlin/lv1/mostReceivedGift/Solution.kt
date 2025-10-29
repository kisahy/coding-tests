package lv1.mostReceivedGift

class Solution {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val result = friends.associateWith { friend -> 0 }.toMutableMap()

        val combinations = friends.flatMapIndexed { index, f1 ->
            friends
                .drop(index + 1)
                .map { f2 ->
                    listOf(f1, f2).sorted().joinToString(separator = " ")
                }
        }

        val counts = gifts.groupingBy { it }.eachCount()
        val points = friends.associateWith { friend -> 0 }.toMutableMap()

        for (gift in gifts) {
            val (giver, receiver) = gift.split(" ")

            points[giver] = points.getOrPut(giver) { 0 } + 1
            points[receiver] = points.getOrPut(receiver) { 0 } - 1
        }


        for (f in combinations) {
            val (f1, f2) = f.split(" ")

            val givenF1 = counts["$f1 $f2"] ?: 0
            val givenF2 = counts["$f2 $f1"] ?: 0

            if (givenF1 > givenF2) {
                result[f1] = result.getOrPut(f1) { 0 } + 1
            } else if (givenF1 < givenF2) {
                result[f2] = result.getOrPut(f2) { 0 } + 1
            } else {
                val pointF1 = points[f1] ?: 0
                val pointF2 = points[f2] ?: 0

                if (pointF1 > pointF2) {
                    result[f1] = result.getOrPut(f1) { 0 } + 1
                } else if (pointF1 < pointF2) {
                    result[f2] = result.getOrPut(f2) { 0 } + 1
                }
            }
        }

        return result.values.maxOrNull() ?: 0
    }
}