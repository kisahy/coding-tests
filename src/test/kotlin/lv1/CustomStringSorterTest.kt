package lv1

import lv1.customStringSorter.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class CustomStringSorterTest {
    val solution = Solution()

    @Test
    fun test() {
        assertArrayEquals(arrayOf("car", "bed", "sun"), solution.solution(arrayOf("sun", "bed", "car"), 1))
        assertArrayEquals(arrayOf("abcd", "abce", "cdx"), solution.solution(arrayOf("abce", "abcd", "cdx"), 2))
    }
}