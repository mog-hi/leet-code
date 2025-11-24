class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val n = nums1.size
        val m = nums2.size
        val mergedArray = mutableListOf<Int>()

        var i = 0
        var j = 0

        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                mergedArray.add(nums1[i])
                i++
            } else {
                mergedArray.add(nums2[j])
                j++
            }
        }

        while (i < n) {
            mergedArray.add(nums1[i])
            i++ 
        }

        while (j < m) {
            mergedArray.add(nums2[j])
            j++
        }

        return if ((n + m)%2 == 0) {
            (mergedArray[(n+m)/2 -1] + mergedArray[(n+m)/2].toDouble()) / 2
        } else {
            mergedArray[(n+m-1)/2].toDouble()
        }
    }
}