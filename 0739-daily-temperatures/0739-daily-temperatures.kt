class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val idxStack = ArrayDeque<Int>()
        val result = IntArray(temperatures.size)

        for (i in temperatures.size - 1 downTo 0) {
            while (idxStack.isNotEmpty() && temperatures[idxStack.last()] <= temperatures[i]) {
                idxStack.removeLast()
            }
            if (idxStack.isNotEmpty()) {
                result[i] = idxStack.last() - i
            } else {
                result[i] = 0
            }

            idxStack.addLast(i)
        }

        return result 
    }
}
