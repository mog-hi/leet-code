class Solution {
    fun climbStairs(n: Int): Int {
        var one = 1
        var two = 2

        for (i in 3..n) {
            val temp = one + two
            one = two
            two = temp
        }
        
        if (n == 1) return one
        return two
    }
}