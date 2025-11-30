class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val maxHeap = PriorityQueue<Pair<Int, IntArray>>(compareByDescending { it.first })
        
        for (i in points.indices) {
            val distance = points[i][0]*points[i][0] + points[i][1]*points[i][1]
            maxHeap.add(distance to points[i])

            if (maxHeap.size > k) {
                maxHeap.poll()
            }
        }

        val answer: MutableList<IntArray> = mutableListOf()

        for (point in maxHeap) {
            answer.add(point.second)
        }

        return answer.toTypedArray()
    }
}
