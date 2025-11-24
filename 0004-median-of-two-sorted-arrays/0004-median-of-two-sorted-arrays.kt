class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val n = nums1.size
        val m = nums2.size
        val mergedArray = IntArray(n + m)

        var i = 0
        var j = 0
        var insertPoint = 0

        while (i < n && j < m) {
            if (insertPoint > (n+m)/2) {
                return mergedArray.findMedian()
            }
            if (nums1[i] < nums2[j]) {
                mergedArray[insertPoint] = nums1[i]
                i++
            } else {
                mergedArray[insertPoint] = nums2[j]
                j++
            }
            insertPoint++
        }

        while (i < n) {
            mergedArray[insertPoint] = nums1[i]
            i++ 
            insertPoint++
        }

        while (j < m) {
            mergedArray[insertPoint] = nums2[j]
            j++
            insertPoint++
        }

        return mergedArray.findMedian()
    }

    private fun IntArray.findMedian(): Double {
        val n = this.size
        return if (n % 2 == 0) {
            (this[n / 2 - 1] + this[n/2].toDouble()) / 2
        } else {
            this[(n - 1) / 2].toDouble()
        }
    }
}
