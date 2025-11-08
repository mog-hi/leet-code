class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0

        while (left < numbers.size) {
            for (right in left+1 until numbers.size) {
                if (numbers[left] + numbers[right] == target) {
                    return intArrayOf(left+1, right+1)
                }
            }
            left ++
        }
        return intArrayOf()
    }
}
