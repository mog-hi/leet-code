class Solution {
    fun shortestSubarray(nums: IntArray, k: Int): Int {
        val sumArray = LongArray(nums.size + 1)
        sumArray[0] = 0L
        var sum = 0L
        for (i in 1 until sumArray.size) {
            sum += nums[i - 1]
            sumArray[i] = sum
        }

        var queue = ArrayDeque<Int>()
        var result = Int.MAX_VALUE

        for (i in 0 until sumArray.size) {
            while (queue.isNotEmpty() && sumArray[i] - sumArray[queue.first()] >= k) {
                result = minOf(result, i - queue.first())
                queue.removeFirst()
            }

            while (queue.isNotEmpty() && sumArray[queue.last()] > sumArray[i]) {
                queue.removeLast()
            }
            queue.addLast(i)
        }
        
        return if(result == Int.MAX_VALUE) -1 else result
    }
}
