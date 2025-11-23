class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        var mid = 0
        while (left <= right) {
            println ("$left $right")
            mid = left + (right-left) / 2

            if (target == nums[mid]) {
                return mid
            }

            if (left == right) {
                return if (target > nums[left]) left + 1 else left
            }

            if (target > nums[mid]) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return mid
    }
}
