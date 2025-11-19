package lv1

import lv1.descendingStringSorter.Solution
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DescendingStringSorterTest {
    val solution = Solution()

    @Test
    fun test() {
        assertEquals("gfedcbZ", solution.solution("Zbcdefg"))
    }
}