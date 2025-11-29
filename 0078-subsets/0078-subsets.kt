class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()

        fun backtrack(prev: Int, subsets: MutableList<Int>) {
            result.add(subsets.toList())
            
            for (i in prev until nums.size) {
                subsets.add(nums[i])
                backtrack(i + 1, subsets)
                subsets.removeLast()
            }
        }

        backtrack(0, mutableListOf())
        return result
    }
}
