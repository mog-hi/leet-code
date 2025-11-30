class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val maxHeap = PriorityQueue<Pair<Int, IntArray>>(compareByDescending { it.first })
        
        for (i in 0 until k) {
            maxHeap.add(getDistance(points[i]) to points[i])
        }

        for (i in k until points.size) {
            val distance = getDistance(points[i])
            if (distance < maxHeap.peek().first) {
                maxHeap.poll()
                maxHeap.add(distance to points[i])
            }
        }

        val answer: MutableList<IntArray> = mutableListOf()

        for (point in maxHeap) {
            answer.add(point.second)
        }

        return answer.toTypedArray()
    }

    fun getDistance(point: IntArray): Int = point[0] * point[0] + point[1] * point[1]
}
