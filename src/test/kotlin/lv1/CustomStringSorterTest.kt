package lv1

import lv1.customStringSorter.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class CustomStringSorterTest {
    val solution = Solution()

    @Test
    fun test() {
        assertContentEquals(arrayOf("car", "bed", "sun"), solution.solution(arrayOf("sun", "bed", "car"), 1))
        assertContentEquals(arrayOf("abcd", "abce", "cdx"), solution.solution(arrayOf("abce", "abcd", "cdx"), 2))
    }
}