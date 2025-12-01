class Solution {
    fun shortestSubarray(nums: IntArray, k: Int): Int {
        val sumArr = LongArray(nums.size + 1)
        val stack = ArrayDeque<Int>()
        var answer = Int.MAX_VALUE

        var sum = 0L
        for (i in nums.indices) {
            sum += nums[i]
            sumArr[i+1] = sum
        }
        println(sumArr)
        for (i in sumArr.indices) {
            while (stack.isNotEmpty() && sumArr[stack.last()] > sumArr[i]) {
                stack.removeLast()
            }
            while (stack.isNotEmpty() && sumArr[i] - sumArr[stack.first()] >= k) {
                answer = minOf(answer, i - stack.first())
                stack.removeFirst()
            }
            stack.addLast(i)
        }

        return if (answer == Int.MAX_VALUE) -1 else answer
    }
}
