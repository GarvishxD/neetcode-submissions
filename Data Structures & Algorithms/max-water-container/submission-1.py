class Solution:
    def maxArea(self, heights: List[int]) -> int:
        n = len(heights)
        left = 0
        right = n-1
        largest = float('-inf')
        while left < right:
            
            if(heights[left] < heights[right]):
                area = (right - left)*heights[left]
                left+=1;
            else:
                area = (right - left) * heights[right]
                right-=1
            largest = max(largest ,area)
        return largest