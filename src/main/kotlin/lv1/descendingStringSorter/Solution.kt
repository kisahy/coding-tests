package lv1.descendingStringSorter

class Solution {
    fun solution(s: String): String {
        return s.toCharArray().sortedDescending().joinToString("")
    }
}