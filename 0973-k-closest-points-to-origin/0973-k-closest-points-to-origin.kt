class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val pq = PriorityQueue<Pair<Int, IntArray>>(compareBy { it.first })
        
        for (i in points.indices) {
            val distance = points[i][0]*points[i][0] + points[i][1]*points[i][1]
            pq.add(distance to points[i])
        }

        val answer = Array(k) { IntArray(2) }
        for (i in 0 until k) {
            val point = pq.poll()
            answer[i] = point.second
        }

        return answer
    }
}
