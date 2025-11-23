class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        val max = piles.max()
        val sum = piles.sum()

        var left = 1
        var right = piles.max()

        while (left <= right) {
            val mid = left + (right - left) / 2

            var temp = 0L
            for (pile in piles) {
                temp += pile/mid + if(pile%mid == 0) 0 else 1
            }

            if (temp > h) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }

        return left
    }
}
