class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var result = nums[0]
        var minPrefix = 0
        var sum = 0
        for (num in nums) {
            sum += num
            result = maxOf(result, sum - minPrefix)
            minPrefix = minOf(minPrefix, sum)
        }

        return result
    }
}
