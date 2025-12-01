class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size
        val answer = IntArray(n)
        val stack = ArrayDeque<Int>()
    
        for (i in n-1 downTo 0) {
            while (stack.isNotEmpty()) {
                if (temperatures[stack.last()] > temperatures[i]) {
                    answer[i] = stack.last() - i
                    break
                } else {
                    stack.removeLast()
                }
            }

            stack.addLast(i)
        }

        return answer
    }
}
