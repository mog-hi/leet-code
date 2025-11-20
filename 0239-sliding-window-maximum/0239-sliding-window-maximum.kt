class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val queue = ArrayDeque<Int>()
        val result = mutableListOf<Int>()
        for (i in nums.indices) {
            if (queue.isNotEmpty() && i - queue.first() >= k) {
                queue.removeFirst()
            }
            while (queue.isNotEmpty() && nums[queue.last()] <= nums[i]) {
                queue.removeLast()
            }  
        
            queue.addLast(i)

            if (i >= k - 1) {
                result.add(nums[queue.first()])
            }
        }

        return result.toIntArray()
    }
}
