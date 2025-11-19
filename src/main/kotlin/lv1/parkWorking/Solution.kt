package lv1.parkWorking

class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var puppyH = 0
        var puppyW = 0

        val maxH = park.size - 1
        val maxW = park.first().length - 1

        val coordinate = mutableMapOf<Int, Map<Int, String>>()

        for (h in park.indices) {
            if (park[h].contains("S")) {
                puppyH = h
            }

            if (park[h].indexOf("S") > -1) {
                puppyW = park[h].indexOf("S")
            }

            coordinate[h] = park[h].mapIndexed {index, ch -> index to ch.toString()}.toMap()
        }

        for(route in routes) {
            val (direction, m) = route.split(" ")

            val move = m.toInt()

            if (
                direction == "N"
                && puppyH - move > 0
                && coordinate?.get(puppyH - move)?.get(puppyW) != "X"
            ) {
                puppyH -= move
            } else if (
                direction == "S"
                && puppyH + move <= maxH
                && coordinate?.get(puppyH + move)?.get(puppyW) != "X"
            ) {
                puppyH += move
            } else if (
                direction == "W"
                && puppyW - move > 0
                && coordinate?.get(puppyH)?.get(puppyW - move) != "X"
            ) {
                puppyW -= move
            } else if (
                direction == "E"
                && puppyW + move <= maxW
                && coordinate?.get(puppyH)?.get(puppyW + move) != "X"
            ) {
                puppyW += move
            }
        }

        //모든 명령을 수행 후 로봇 강아지의 좌표 배열 [세로, 가로] 반환
        return intArrayOf(puppyH, puppyW)
    }
}