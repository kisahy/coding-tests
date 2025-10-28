package lv1.flexibleWork

class Solution {
    fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
        var answer: Int = 0

        for ((index, times) in timelogs.withIndex()) {
            var week = startday

            var hour = schedules[index] / 100
            var minute = schedules[index] % 100 + 10

            hour = if (minute < 60) hour else hour + (minute / 60)
            minute = if (minute < 60) minute else minute % 60

            val cutTime = hour * 100 + minute

            var perception = false
            for (time in times) {

                if (week < 6 && time > cutTime) {
                    perception = true
                }

                week = if (week == 7) 1 else week + 1
            }

            if (!perception) {
                answer += 1
            }
        }

        return answer
    }
}