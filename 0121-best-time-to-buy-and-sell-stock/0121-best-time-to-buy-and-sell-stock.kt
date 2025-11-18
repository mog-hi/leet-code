class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var left = 0
        var minLeftValue = prices[0]
        for (right in 1 until prices.size) {
            if (prices[left] < minLeftValue) {
                minLeftValue = prices[left]
            } 
            if (prices[right] - minLeftValue > maxProfit) {
                maxProfit = prices[right] - minLeftValue
            }
            left++
        }
        return maxProfit
    }
}
