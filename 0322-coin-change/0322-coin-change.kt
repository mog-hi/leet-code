class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val ways = IntArray(amount + 1) { Int.MAX_VALUE }
        ways[0] = 0

        for (i in 1 .. amount) {
            for (coin in coins) {
                if (i - coin >= 0 && ways[i - coin] < Int.MAX_VALUE) {
                    ways[i] = minOf(ways[i - coin] + 1, ways[i])
                }
            }
        }

        return if (ways[amount] == Int.MAX_VALUE) -1 else ways[amount]
    }
}
