class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freq = {}
        for i in nums:
            freq[i] = freq.get(i , 0) + 1
        ans = list(freq.keys())
        ans.sort(key = lambda a : freq[a] , reverse = True)
        result = []
        for i in range(0,k):
            result.append(ans[i])
        return result

