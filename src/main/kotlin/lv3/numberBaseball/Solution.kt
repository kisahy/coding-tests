package lv3.numberBaseball

class Solution {
    fun solution(n: Int, submit: (Int) -> String): Int {
        val candidates = mutableListOf<String>()

        for(a in 1..9) {
            for(b in 0..9) {
                for(c in 0..9) {
                    for(d in 0..9) {
                        if (setOf(a, b, c, d).size == 4)
                            candidates.add("$a$b$c$d")
                    }
                }
            }
        }

        val history = mutableListOf<Pair<String, Pair<Int, Int>>>()

        var possible = candidates.toMutableList()

        while(possible.isNotEmpty()) {
            val guess = chooseBest(possible, candidates)

            val result = submit(guess.toInt())

            if (result == "4S 0B") return guess.toInt()

            val (strike, ball) = parseResult(result)

            history.add(guess to (strike to ball))

            possible = possible.filter { it ->
                val (s, b) = resultSubmit(it, guess)
                s == strike && b == ball
            }.toMutableList()
        }

        return -1
    }

    private fun chooseBest(
        possible: List<String>,
        candidates: List<String>
    ): String {
        if (possible.size <= 2) return possible.first()

        var best = possible.first()
        var minWorstCase = Int.MAX_VALUE

        for (guess in candidates) {
            val outcomeCounts = mutableMapOf<Pair<Int, Int>, Int>()

            for (target in possible) {
                val (strike, ball) = resultSubmit(guess, target)
                outcomeCounts[strike to ball] = (outcomeCounts[strike to ball] ?: 0) + 1
            }

            val worstCase = outcomeCounts.values.maxOrNull() ?: Int.MAX_VALUE

            if (worstCase < minWorstCase || (worstCase == minWorstCase && guess in possible)) {
                minWorstCase = worstCase
                best = guess
            }
        }

        return best
    }

    private fun resultSubmit(a: String, b: String): Pair<Int, Int> {
        var strike = 0
        var ball = 0

        for (i in 0 until 4) {
            if (a[i] == b[i]) strike++
            else if (b[i] in a) ball++
        }

        return strike to ball
    }

    private fun parseResult(result: String): Pair<Int, Int> {
        val parts = result.split(" ")
        val strike = parts[0].replace("S", "").toInt()
        val ball = parts[1].replace("B", "").toInt()

        return strike to ball
    }
}