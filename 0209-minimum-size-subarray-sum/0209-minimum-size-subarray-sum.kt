class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var sum = 0
        var minLen = nums.size + 1
        var left = 0

        for (idx in 0 until nums.size) {
            sum += nums[idx]

            while (sum >= target && left < idx) {
                minLen = minOf(minLen, idx-left+1)
                sum -= nums[left]
                left++
            }

            if (sum >= target) {
                minLen = minOf(minLen, idx-left+1)
            }
        }

        return if (minLen <= nums.size) minLen else 0
    }
}