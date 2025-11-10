package lv3

import lv3.bannedSpell.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BannedSpellTest {
    val solution = Solution()

    @Test
    fun test() {
        assertEquals(
            "ah",
            solution.solution(30, arrayOf("d", "e", "bb", "aa", "ae"))
        )

        assertEquals(
            "jxk",
            solution.solution(7388, arrayOf("gqk", "kdn", "jxj", "jxi", "fug", "jxg", "ewq", "len", "bhc"))
        )
    }
}