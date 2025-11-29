class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result: MutableList<List<Int>> = mutableListOf()

        fun backtrack(sum: Int, start: Int, combinations: MutableList<Int>) {
            if (sum == target) {
                result.add(combinations.toList())
            }

            for (i in start until candidates.size) {
                if (sum + candidates[i] <= target) {
                    combinations.add(candidates[i])
                    backtrack(sum + candidates[i], i, combinations)
                    combinations.removeLast()
                }
            }
        }
        
        backtrack(0, 0, mutableListOf())
        return result.toList()
    }
}
