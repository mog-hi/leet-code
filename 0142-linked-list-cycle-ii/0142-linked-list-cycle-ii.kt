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
    fun detectCycle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while (fast?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next

            if (fast == slow) {
                var pt1 = head
                var pt2 = slow
                while (pt1 != pt2) {
                    pt1 = pt1?.next
                    pt2 = pt2?.next
                }

                return pt1
            }
        }

        return null
    }
}
