class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
         val map: MutableMap<Int, Int> = HashMap()
         for (i in nums.indices) {
              val complement = target - nums[i]
              if (map.containsKey(complement)) {
                    return intArrayOf(map[complement]!!, i)
              }
              map[nums[i]] = i
          }
         throw IllegalArgumentException("No two sum solution")
    }
}