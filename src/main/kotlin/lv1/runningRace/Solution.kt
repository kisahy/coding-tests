package lv1.runningRace

class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String>
    {
        val position: MutableMap<String, Int> = players.mapIndexed { rank, player -> player to rank }.toMap().toMutableMap()

        for (player in callings) {
            val rank = position[player]!!

            if (rank < 1) {
                continue
            }

            val prevPlayer = players[rank - 1]

            players[rank - 1] = player
            players[rank] = prevPlayer

            position[player] = rank - 1
            position[prevPlayer] = rank
        }

        return players
    }
}