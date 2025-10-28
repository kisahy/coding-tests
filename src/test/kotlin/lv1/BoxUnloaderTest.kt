package lv1

import com.kisahy.lv1.BoxUnloader.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BoxUnloaderTest {
    val solution = Solution()

    @Test
    fun test() {
        assertEquals(3, solution.solution(22, 6, 8))
        assertEquals(4, solution.solution(13, 3, 6))
    }
}