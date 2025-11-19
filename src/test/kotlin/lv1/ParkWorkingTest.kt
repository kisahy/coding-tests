package lv1

import lv1.parkWorking.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ParkWorkingTest {
    val solution = Solution()

    @Test
    fun test() {
        assertArrayEquals(intArrayOf(2, 1), solution.solution(arrayOf("SOO", "OOO", "OOO"), arrayOf("E 2", "S 2", "W 1")))
        assertArrayEquals(intArrayOf(0, 1), solution.solution(arrayOf("SOO","OXX","OOO"), arrayOf("E 2","S 2","W 1")))
        assertArrayEquals(intArrayOf(0, 0), solution.solution(arrayOf("OSO","OOO","OXO","OOO"), arrayOf("E 2","S 3","W 1")))
    }
}