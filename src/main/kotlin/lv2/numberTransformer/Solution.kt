package lv2.numberTransformer

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun solution(x: Int, y: Int, n: Int): Int {
        if (x == y) return 0

        //현재 숫자와 연산 횟수를 저장하기 위한 큐 생성
        val queue: Queue<Pair<Int, Int>> = LinkedList()
        // 0..y 범위의 확인 여부 기록 배열 생성
        val checked = BooleanArray(y + 1)
        //큐 초기 설정 x가 시작값이기 때문에 x에 연산 횟수는 0
        queue.offer(Pair(x, 0))
        //x 확인 기록
        checked[x] = true

        while (queue.isNotEmpty()) {
            //큐에서 값을 꺼내 사용
            val (current, count) = queue.poll()
            //조건에 따른 연산 결과
            val nextNumbers = listOf(current + n, current * 2, current * 3)
            //각 연산 결과가 y에 도달했는지 판단
            for (number in nextNumbers) {
                //연산 결과가 y보다 크거나 이미 확인한 값이면 넘어가기
                if (number > y || checked[number]) continue
                //연산 결과가 y와 같으면 연산 횟수 반환
                if (number == y) return count + 1
                //연산 결과가 아직 y에 도달하지 못했고 미확인된 값이기 때문에 확인 기록하고 큐에 연산 결과 저장
                checked[number] = true
                queue.offer(Pair(number, count + 1))
            }
        }

        return -1
    }
}