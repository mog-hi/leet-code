class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result: MutableSet<List<Int>> = mutableSetOf()

        fun backtrack(sum: Int, combinations: MutableList<Int>) {
            if (sum == target) {
                result.add(combinations.sorted())
            }

            for (num in candidates) {
                if (sum + num <= target) {
                    combinations.add(num)
                    backtrack(sum+num, combinations)
                    combinations.removeLast()
                }
            }
        }
        
        backtrack(0, mutableListOf())
        return result.toList()
    }
}
