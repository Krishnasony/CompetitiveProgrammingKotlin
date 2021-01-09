class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for(i in nums.indices)
           if(target<=nums[i])
               return i
        return nums.size     
    }
}