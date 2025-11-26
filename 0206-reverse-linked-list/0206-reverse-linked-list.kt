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
    fun reverseList(head: ListNode?): ListNode? {
        var prev = head?.let { ListNode(it.`val`) }  ?: null
        var next = head?.next

        while (next != null) {
            val temp = next?.let { ListNode(it.`val`) }  ?: null

            temp?.next = prev
            prev = temp

            next = next?.next
        }

        return prev
    }
}
