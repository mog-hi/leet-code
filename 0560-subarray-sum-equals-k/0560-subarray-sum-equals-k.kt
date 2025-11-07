class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
       val map = mutableMapOf<Int, Int>()

       var sum = 0
       var result = 0
       
       map[0] = 1
       for (num in nums) {
        sum += num

        val count = map.getOrDefault(sum-k, 0)
        result += count

        map[sum] = map.getOrDefault(sum, 0) + 1
       }

       return result
    }
}
