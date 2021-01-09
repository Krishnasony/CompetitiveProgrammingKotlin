class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size==1)
              return 1
        else if(nums.size==2){
              if(nums[0] != nums[1])
                    return 2
              else  return 1
        }else {
            var j = 0
            for(i in 0..nums.size-1){
                 if(i+1 !== nums.size && nums[i]!=nums[i+1])
                     nums[j++] = nums[i]
            }
            if(nums.size-1>=0)
               nums[j++] = nums[nums.size-1]
            return j
        }
    }
}