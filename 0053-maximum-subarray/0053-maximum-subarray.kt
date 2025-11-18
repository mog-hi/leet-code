class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        val sumList = mutableListOf<Int>()
        for (num in nums) {
            sum += num
            sumList.add(sum)
        }

        var left = 0
        var result = sumList[0]

        var min = 0

        for (s in sumList) {
            if (s - min > result) {
                result = s - min
            }
            if (sumList[left] < min) {
                min = sumList[left]
            }
            left ++ 
        }

        return result
    }
}
