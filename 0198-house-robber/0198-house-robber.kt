class Solution {
    fun rob(nums: IntArray): Int {
        var prev1 = 0
        var prev2 = 0

        for (n in nums) {
            val pick = prev2 + n
            val nopick = prev1

            prev1 = maxOf(pick, nopick)
            prev2 = nopick
        }

        return maxOf(prev1, prev2)
    }
}
