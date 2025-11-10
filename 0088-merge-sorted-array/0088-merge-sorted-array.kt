class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var idx1 = m - 1
        var idx2 = n - 1

        var x = n + m - 1

        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] > nums2[idx2]) {
                nums1[x] = nums1[idx1]
                idx1--
                x--
            } else if (nums1[idx1] < nums2[idx2]) {
                nums1[x] = nums2[idx2]
                idx2--
                x--
            } else {
                nums1[x] = nums1[idx1]
                nums1[x-1] = nums2[idx2]
                idx1--
                idx2--
                x-=2
            }
        }

        while (idx2 >= 0) {
            nums1[x] = nums2[idx2]
            idx2--
            x--
        }
    }
}