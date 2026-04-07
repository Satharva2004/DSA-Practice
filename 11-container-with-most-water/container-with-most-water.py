class Solution:
    def maxArea(self, height: List[int]) -> int:
        # res = 0
        # for l in range(len(height)):
        #     for r in range(l+1, len(height)):
        #         mins = min(height[r], height[l])
        #         area = (r - l) * mins
        #         res = max(res, area)

        # return res
        res = 0
        l = 0 
        r = len(height)-1
        while l < r:
            mins = min(height[r], height[l])
            area = (r - l) * mins
            res = max(res, area)
            if height[l] < height[r]:
                l+=1
            elif height[l] > height[r]:
                r-=1
            else:
                r-=1
        return res
