class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1
        
        while (left <= right) {
            val mid = (left + right) / 2
            val temp = nums[mid]
            
            if (temp == target) {
                left = mid 
                right = mid
                while (left - 1 >= 0 && nums[left -1] == target) {
                    left--
                }
                while (right + 1 < nums.size && nums[right + 1] == target) {
                    right++
                }
                return intArrayOf(left, right)
            } else if (temp > target) {
                right = mid -1
            } else {
                left = mid + 1
            }
        }

        return intArrayOf(-1, -1)
    }
}