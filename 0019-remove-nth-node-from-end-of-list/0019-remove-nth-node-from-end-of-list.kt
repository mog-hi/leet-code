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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head?.next == null) return null

        var left = head
        var right = head
        for (i in 0 until n) {
            if (right?.next == null) {
                return head?.next
            }
            right = right?.next
        }
        println(right?.`val`)

        if (right == null) {

        }

        while (right?.next != null) {
            left = left?.next
            right = right?.next
        }
       
        println(left?.`val`)
        println(right?.`val`)
        left?.next = left?.next?.next
        return head
    }
}