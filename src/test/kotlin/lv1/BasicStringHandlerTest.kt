package lv1

import lv1.basicStringHandler.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BasicStringHandlerTest {
    val solution = Solution()

    @Test
    fun test() {
        assertEquals(false, solution.solution("a234"))
        assertEquals(true, solution.solution("1234"))
    }
}