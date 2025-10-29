package lv1.memoryScore

class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        val person = name.mapIndexed { index, s -> s to yearning[index] }.toMap()

        val answer = mutableListOf<Int>()

        for (picture in photo) {
            var score = 0

            for (people in picture) {
                score += person.getOrDefault(people, 0)
            }

            answer.add(score)
        }

        return answer.toIntArray()
    }
}