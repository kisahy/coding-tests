package lv1

import lv1.mostReceivedGift.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MostReceivedGiftTest
{
    val solution = Solution()

    @Test
    fun test() {
        assertEquals(
            2,
            solution.solution(
                arrayOf("muzi", "ryan", "frodo", "neo"),
                arrayOf("muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi")
            )
        )

        assertEquals(
            4,
            solution.solution(
                arrayOf("joy", "brad", "alessandro", "conan", "david"),
                arrayOf("alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david")
            )
        )

        assertEquals(
            0,
            solution.solution(
                arrayOf("a", "b", "c"),
                arrayOf("a b", "b a", "c a", "a c", "a c", "c a")
            )
        )
    }
}