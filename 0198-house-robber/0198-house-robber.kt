class Solution {
    fun rob(nums: IntArray): Int {
        val n = nums.size
        val robs = IntArray(n)
        
        if (n <= 1) {
            return nums[0]
        } else if (n <= 2) {
            return maxOf(nums[0], nums[1])
        }

        robs[0] = nums[0]
        robs[1] = nums[1]
        robs[2] = nums[0] + nums[2]

        for (i in 3 .. n-1) {
            println(i)
            robs[i] = maxOf(robs[i-2], robs[i-3]) + nums[i]
            println(robs[i])
        }

        return maxOf(robs[n-1], robs[n-2])
    }
}