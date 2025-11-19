class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var minLen = nums.size + 1
        var left = 0

        for (idx in nums.indices) {
            sum += nums[idx]

            while (sum >= target && left <= idx) {
                minLen = minOf(minLen, idx-left+1)
                sum -= nums[left]
                left++
            }
        }

        return if (minLen <= nums.size) minLen else 0
    }
}