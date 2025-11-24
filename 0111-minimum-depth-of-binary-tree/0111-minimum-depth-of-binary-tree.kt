/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0
        val queue = ArrayDeque<Pair<TreeNode, Int>>()
        queue.addLast(Pair(root!!, 1))

        while(queue.isNotEmpty()) {
            val (temp, depth) = queue.removeFirst()

            if (temp.right == null && temp.left == null) {
                return depth
            }

            if (temp.left != null) {
                queue.addLast(Pair(temp.left, depth + 1))
            } 

            if (temp.right != null) {
                queue.addLast(Pair(temp.right, depth + 1))
            }
        }

        return 0
    }
}
