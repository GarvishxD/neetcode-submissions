class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        suffix = [0]*n
        prefix = [0]*n
        suffix[0] = 1
        prefix[len(nums) - 1] = 1
        for i in range(1, len(nums)):
            suffix[i] = nums[i-1]* suffix[i-1]
        
        for i in range(len(nums)-2 , -1 , -1):
            prefix[i] = prefix[i+1]*nums[i+1]
        ans = [0]*n
        for i in range(n):
            ans[i] = prefix[i]*suffix[i]
        return ans