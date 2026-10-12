class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        ans = set()
        for i in range(n-2):
            left = i+1
            right = n-1               
            while left < right:

                sum = nums[i] + nums[left] + nums[right]
                if sum > 0:
                    right = right-1
                elif sum <0:
                    left+=1
                else:
                    ans.add((nums[i] , nums[left] , nums[right]))
                    left+=1
                    right-=1
        res = []
        for i in ans:
            res.append(list(i))
        return res