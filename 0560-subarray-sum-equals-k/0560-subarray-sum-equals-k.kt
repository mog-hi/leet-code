class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
       val map = mutableMapOf<Int, Int>()
       map[0] = 1

       var sum = 0
       var result = 0
    
       for (num in nums) {
        sum += num
        result += map.getOrDefault(sum-k, 0)
        map[sum] = map.getOrDefault(sum, 0) + 1
       }

       return result
    }
}
