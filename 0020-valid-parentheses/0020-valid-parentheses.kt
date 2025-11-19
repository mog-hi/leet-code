class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (temp in s) {
            if (isLeft(temp)) {
                stack.addLast(temp)
            } else {
                if (stack.isEmpty()) {
                    return false
                }

                val left = stack.removeLast()
                if (!isPair(left, temp)) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }
}

fun isLeft(s: Char): Boolean = s == '(' || s == '{' || s == '['

fun isPair(left: Char, right: Char): Boolean = if (
    (left == '[' && right == ']') ||
    (left == '{' && right == '}') ||
    (left == '(' && right == ')') 
) true else false
