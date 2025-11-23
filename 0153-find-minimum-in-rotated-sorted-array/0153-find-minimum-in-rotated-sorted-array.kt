class Solution {
    fun findMin(nums: IntArray): Int {
        var result = Int.MAX_VALUE
        for (num in nums) {
            result = minOf(num, result)
        }
        return result
    }
}
