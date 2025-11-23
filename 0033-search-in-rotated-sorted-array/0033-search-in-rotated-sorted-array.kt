class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right) {
            val mid = (left + right) / 2


            println("$left $mid $right")

            println("${nums[left]} ${nums[mid]} ${nums[right]}")

            if (target == nums[mid]) {
                return mid
            } 
            // 구간의 오른 쪽에 있다. left = mid + 1
            else if ((target > nums[mid] && target <= nums[right]) || (target < nums[mid] && target < nums[left] &&nums[mid] > nums[right] ) || (target > nums[mid] && nums[mid] > nums[right])) {
                println("right")
                left = mid + 1
            } else {
                println("left")
                right = mid - 1
            }


            // 구간의 왼쪽에 있다.
            // if ((target > nums[mid] && target > nums[right]) || )

        }
        return -1
    }
}