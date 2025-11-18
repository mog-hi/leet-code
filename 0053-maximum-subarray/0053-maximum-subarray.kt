class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var currentSum = 0
        var result = nums[0]
        for (num in nums) {
            currentSum = maxOf(currentSum + num, num)
            result = maxOf(result, currentSum)
        }

        return result
    }
}
