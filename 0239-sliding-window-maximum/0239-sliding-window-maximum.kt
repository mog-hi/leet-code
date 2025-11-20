class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val queue = ArrayDeque<Int>()
        val result = mutableListOf<Int>()
        for (i in nums.indices) {
            while (queue.isNotEmpty() && i - queue.first() >= k) {
                queue.removeFirst()
            }
            while (queue.isNotEmpty() && nums[queue.last()] <= nums[i]) {
                queue.removeLast()
            }  

            if (i >= k - 1) {
                if (queue.isNotEmpty()) {
                    result.add(nums[queue.first()])
                } else {
                    result.add(nums[i])
                }
            }
            
            queue.addLast(i)
        }

        return result.toIntArray()
    }
}
