class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] } 

        var left = intervals[0][0]
        var right = intervals[0][1]
        val answer: MutableList<IntArray> = mutableListOf()

        for (i in 1 until intervals.size) {
            val (start, end) = intervals[i]

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
