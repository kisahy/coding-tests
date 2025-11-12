package lv3

import lv3.numberBaseball.Solution
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberBaseballTest {
    val solution = Solution()

    @Test
    fun `비밀번호 1357 일 때 탐색 성공 테스트`() {

    }

    private fun countStrikeAndBall(a: String, b: String): Pair<Int, Int> {
        var strike = 0
        var ball = 0
        for (i in 0 until 4) {
            if (a[i] == b[i]) strike++
            else if (b[i] in a) ball++
        }
        return strike to ball
    }

    fun submit(n: Int, password: String): Int {
        // mock submit 함수 정의
        val s: (Int) -> String = { guess ->
            val guessStr = guess.toString().padStart(4, '0')
            val (strike, ball) = countStrikeAndBall(guessStr, password)
            "${strike}S ${ball}B"
        }


        return solution.solution(n, s)
    }

    @Test
    fun test() {
        assertEquals(
            1357,
            submit(3024, "1357")
        )

        assertEquals(
            3986,
            submit(3024, "3986")
        )

        assertEquals(
            7685,
            submit(33, "7685")
        )
    }
}