package lv2.nextGreaterNumberFinder

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val size = numbers.size
        val answer = IntArray(size) { -1 }
        val stack = ArrayDeque<Int>()

        for (i in size - 1 downTo 0) {
            val num = numbers[i]

            while (stack.isNotEmpty() && numbers[stack.last()] <= num) {
                stack.removeLast()
            }

            if (stack.isNotEmpty()) {
                answer[i] = numbers[stack.last()]
            }

            stack.addLast(i)
        }

        println(answer.joinToString(" "))
        return answer
    }
}