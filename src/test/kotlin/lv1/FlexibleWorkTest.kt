import lv1.flexibleWork.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlexibleWorkTest {
    val solution = Solution()

    @Test
    fun test() {
        assertEquals(
            3,
            solution.solution(
                intArrayOf(700, 8000, 1100),
                arrayOf<IntArray>(
                    intArrayOf(710, 2359, 1050, 700, 650, 631, 659),
                    intArrayOf(800, 801, 805, 800, 759, 810, 809),
                    intArrayOf(1105, 1001, 1002, 600, 1059, 1001, 1100)
                ),
                5
            )
        )

        assertEquals(
            2,
            solution.solution(
                intArrayOf(730, 855, 700, 720),
                arrayOf<IntArray>(
                    intArrayOf(710, 700, 650, 735, 700, 931, 912),
                    intArrayOf(908, 901, 805, 815, 800, 831, 835),
                    intArrayOf(705, 701, 702, 705, 710, 710, 711),
                    intArrayOf(707, 731, 859, 913, 934, 931, 905)
                ),
                1
            )
        )
    }
}