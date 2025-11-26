/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        // idea1: 결국 끝점에서 만난다. 끝점까지 온 다음 역으로 가서 갈라지기 직전 노드 리턴
        // 문제: 역으로 갈 방법이 없음

        // idea2: (힌트 받음) lastA에선 headB로, lastB에서 headA로 가게 하면 같은 거리 이동 후 intersect에서 서로 만나게됨

        var pointerA = headA
        var pointerB = headB

        var isPointerAVisitedHeadB = false
        var isPointerBVisitedHeadA = false

        while(pointerA != pointerB) {
            pointerA = if (pointerA == null) headB else pointerA.next
            pointerB = if (pointerB == null) headA else pointerB.next
        }

        return pointerA
    }
}