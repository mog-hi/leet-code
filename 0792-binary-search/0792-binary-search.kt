class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) / 2
            val temp = nums[mid]
            if (temp == target) {
                return mid
            } else if (temp > target) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }

        return -1
    }
}
