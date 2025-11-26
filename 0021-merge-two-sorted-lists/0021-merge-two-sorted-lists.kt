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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var ptr1 = list1
        var ptr2 = list2
        
        val answer = ListNode(0)
        var insertPtr = answer
        while (ptr1 != null && ptr2 != null) {
            if (ptr1!!.`val` < ptr2!!.`val`) {
                insertPtr?.next = ptr1
                ptr1 = ptr1?.next
            } else {
                insertPtr?.next = ptr2
                ptr2 = ptr2?.next
            }
            insertPtr = insertPtr!!.next
        }

        if (ptr1 != null) {
            insertPtr.next= ptr1
        }

        if (ptr2 != null) {
            insertPtr.next= ptr2
        }

        return answer.next
    }
}