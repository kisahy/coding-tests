package lv1

import lv1.memoryScore.Solution
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class MemoryScoreTest {
    val solution = Solution()
    @Test
    fun test() {
        assertArrayEquals(
            intArrayOf(19, 15, 6),
            solution.solution(
                arrayOf("may", "kein", "kain", "radi"),
                intArrayOf(5, 10, 1, 3),
                arrayOf<Array<String>>(
                    arrayOf("may", "kein", "kain", "radi"),
                    arrayOf("may", "kein", "brin", "deny"),
                    arrayOf("kon", "kain", "may", "coni")
                )
            )
        )

        assertArrayEquals(
            intArrayOf(67, 0, 55),
            solution.solution(
                arrayOf("kali", "mari", "don"),
                intArrayOf(11, 1, 55),
                arrayOf<Array<String>>(
                    arrayOf("kali", "mari", "don"),
                    arrayOf("pony", "tom", "teddy"),
                    arrayOf("con", "mona", "don")
                )
            )
        )

        assertArrayEquals(
            intArrayOf(5, 15, 0),
            solution.solution(
                arrayOf("may", "kein", "kain", "radi"),
                intArrayOf(5, 10, 1, 3),
                arrayOf<Array<String>>(
                    arrayOf("may"),
                    arrayOf("kein", "deny", "may"),
                    arrayOf("kon", "coni")
                )
            )
        )
    }
}