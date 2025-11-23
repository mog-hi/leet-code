class Solution {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) / 2

            if (nums[mid] < nums[left]) {
                left = left + 1
            } else if (nums[mid] > nums[right]) {
                left = mid + 1
            } else {
                return nums[left]
            }
        }

        return nums[left] 
    }
}
