package lv1

import lv1.runningRace.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RunningRaceTest
{
    val solution = Solution()

    @Test
    fun test() {
        assertArrayEquals(
            arrayOf("mumu", "kai", "mine", "soe", "poe"),
            solution.solution(arrayOf("mumu", "soe", "poe", "kai", "mine"), arrayOf("kai", "kai", "mine", "mine"))
        )
    }
}