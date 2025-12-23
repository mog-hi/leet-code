class Solution:
    def romanToInt(self, s: str) -> int:
        symbolValue = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000,
            'IV': 4,
            'IX': 9,
            'XL': 40,
            'XC': 90
        }

        answer = 0

        left = 0
        right = 1

        numWithTwo = {4, 9, 40, 90, 400, 900}
        while left < len(s):
            if right >= len(s):
                answer += symbolValue[s[left]]
                break

            leftNum = symbolValue[s[left]]
            rightNum = symbolValue[s[right]]

            if rightNum - leftNum in numWithTwo:
                answer += rightNum - leftNum
                left += 2
                right += 2
            else:
                answer += leftNum
                left += 1
                right += 1

        return answer
        