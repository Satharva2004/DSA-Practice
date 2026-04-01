class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        res = []
        digitToChar = {
            "2": "abc",
            "3": "def",
            "4": "ghi",
            "5": "jkl",
            "6": "mno",
            "7": "pqrs",
            "8": "tuv",
            "9": "wxyz"
        }

        def backtracking(i, curr):
            if(len(curr) == len(digits)):
                res.append(curr)
                return
            
            for c in digitToChar[digits[i]]:
                backtracking(i+1, curr+c)

        if digits:
            backtracking(0, "")
        return res