package lv2

import lv2.numberTransformer.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberTransformerTest {
    val solution = Solution()

    @Test
    fun test() {
        assertEquals(
            2,
            solution.solution(10, 40, 5)
        )

        assertEquals(
            1,
            solution.solution(10, 40, 30)
        )

        assertEquals(
            -1,
            solution.solution(2, 5, 4)
        )
    }
}