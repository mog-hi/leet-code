class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val sortedIntervals = intervals.toList().sortedBy { it.first() }

        var left = sortedIntervals[0][0]
        var right = sortedIntervals[0][1]
        val answer: MutableList<IntArray> = mutableListOf()

        for (i in 1 until intervals.size) {
            val (start, end) = sortedIntervals[i]

            if (start <= right) {
                right = maxOf(right, end)
            } else {
                answer.add(intArrayOf(left, right))
                left = start
                right = end
            }
        }
        answer.add(intArrayOf(left, right))

        return answer.toTypedArray()
    }
}
