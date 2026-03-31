class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        currmax = 1 
        currmin = 1
        res = max(nums)
        for n in nums:
            temp = currmax * n
            currmax = max(temp, currmin*n, n)
            currmin = min(temp, currmin*n, n)
            res = max(currmax, res)

        return res