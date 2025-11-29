class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val pq = PriorityQueue<Int>(reverseOrder())
        pq.addAll(nums.toList())

        for (i in 1 until k) {
            pq.poll()
        }
        return pq.poll()
    }
}