class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val used = BooleanArray(nums.size)
        val result: MutableList<List<Int>> = mutableListOf()

        fun backtrack(path: MutableList<Int>) {
            if (path.size == nums.size) {
                result.add(path.toList())
            }
            
            for (i in nums.indices) {
                if (!used[i]) {
                    path.add(nums[i])
                    used[i] = true
                    backtrack(path)
                    path.removeLast()
                    used[i] = false
                }
            }
        }

        backtrack(mutableListOf())
        return result
    }
}