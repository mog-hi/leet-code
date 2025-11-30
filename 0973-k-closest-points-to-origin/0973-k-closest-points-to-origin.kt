class Solution {
    fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {
        val pq = PriorityQueue<Int>()
        val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
        for (i in points.indices) {
            val distance = points[i][0]*points[i][0] + points[i][1]*points[i][1]
            pq.add(distance)
            if (map.containsKey(distance)) {
                map[distance]?.add(i)
            } else {
                map[distance] = mutableListOf(i)
            }
        }

        val answer = Array(k) { IntArray(2) }
        for (i in 0 until k) {
            val closet = pq.poll()
            val idx = map[closet]!!.removeLast()
            answer[i] = points[idx]
        }

        return answer
    }
}
