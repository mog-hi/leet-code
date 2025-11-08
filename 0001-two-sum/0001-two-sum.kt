class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diff = nums.mapIndexed { index, num -> Pair(target - num, index) }.toMap()

        nums.forEachIndexed { index, num ->
            val pair = diff.getOrDefault(num, -1)
            if (pair > index && pair != -1) {
                return intArrayOf(index, pair)
            }
        }
        return intArrayOf()
    }
}