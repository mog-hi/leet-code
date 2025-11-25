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
    fun hasCycle(head: ListNode?): Boolean {
        val map = mutableMapOf<ListNode?, Boolean>()
        
        var temp = head
        while(temp?.next != null) {
            if (!map.getOrDefault(temp, false)) {
                map[temp] = true
            } else {
                return true
            }
            temp = temp?.next
        }

        return false
    }
}