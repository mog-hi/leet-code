class Solution {
    fun maxProfit(prices: IntArray): Int {
       var maxProfit = 0
       var minLeft = Int.MAX_VALUE
       var left = 0

       for (i in 1 until prices.size) {
            minLeft = minOf(minLeft, prices[left])
            maxProfit = maxOf(maxProfit, prices[i] - minLeft)
            left++
       }
       return maxProfit
    }
}
