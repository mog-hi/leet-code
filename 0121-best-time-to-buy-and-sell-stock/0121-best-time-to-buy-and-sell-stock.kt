class Solution {
    fun maxProfit(prices: IntArray): Int {
        var min = prices[0]
        var result = 0
        for (price in prices) {
            if (min > price) {
                min = price
            } else if (price - min > result ) {
                result = price - min
            }
        }
        return result
    }
}