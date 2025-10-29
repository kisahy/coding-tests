package lv2

import lv2.nextGreaterNumberFinder.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NextGreaterNumberFinderTest {
    val solution = Solution()

    @Test
    fun test() {
        assertArrayEquals(
            intArrayOf(3, 5, 5, -1),
            solution.solution(intArrayOf(2, 3, 3, 5))
        )

        assertArrayEquals(
            intArrayOf(-1, 5, 6, 6, -1, -1),
            solution.solution(intArrayOf(9, 1, 5, 3, 6, 2))
        )
    }
}