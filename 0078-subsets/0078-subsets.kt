class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val used = BooleanArray(nums.size)
        val result: MutableList<List<Int>> = mutableListOf()

        fun backtrack(subsets: MutableList<Int>) {
            println(subsets)
            result.add(subsets.toList())
            
            for (i in nums.indices) {
                if (used[i]) continue
                if (subsets.size == 0 || (subsets.size > 0 && i > subsets.last())) {
                    subsets.add(i)
                    used[i] = true
                    // println(subsets)
                    backtrack(subsets)
                    used[i] = false
                    subsets.removeLast()
                }
            }
        }

        backtrack(mutableListOf())
        return result.map { subset -> subset.map { nums[it] } }
    }
}
