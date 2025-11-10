package lv3.bannedSpell

class Solution {
    val chars = "abcdefghijklmnopqrstuvwxyz"

    fun numberToSpell(number: Long): String {
        var n = number
        var spell = ""

        while (n > 0) {
            val index: Int = ((n - 1) % 26).toInt()
            spell = chars[index] + spell
            n = (n - 1)/ 26
        }

        return spell
    }

    fun spellToNumber(spell: String): Long {
        var number = 0L

        for (c in spell) {
            number = number * 26 + (chars.indexOf(c) + 1)
        }

        return number
    }

    fun solution(n: Long, bans: Array<String>): String {
        val banned = bans.map { spellToNumber(it) }.sorted()

        fun countBanned(mid: Long): Int {
            var l = 0
            var r = banned.size

            while (l < r) {
                val m = (l + r) / 2

                if (banned[m] <= mid) l = m + 1 else r = m
            }

            return l
        }

        var left = 1L
        var right = spellToNumber("zzzzzzzzzzz") + banned.size
        var answer = -1L

        while (left <= right) {
            val mid = left + (right - left) / 2

            val bannedCount = countBanned(mid).toLong()

            val allowedCount = mid - bannedCount

            if (allowedCount >= n) {
                answer = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return numberToSpell(answer)
    }


}