//Given an array of integers, return indices of the two numbers such that they a
//dd up to a specific target. 
//
// You may assume that each input would have exactly one solution, and you may n
//ot use the same element twice. 
//
// Example: 
//
// 
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
// 
// Related Topics Array Hash Table


package top.charlielin.leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    Solution solution = new TwoSum().new Solution();
    int[] nums = new int[]{3, 2, 4};
    int[] res = solution.twoSum(nums, 6);
    System.out.println(Arrays.toString(res));
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; i++) {
        numMap.put(nums[i], i);
      }

      for (int i = 0; i < nums.length; i++) {
        int anotherNums = target - nums[i];
        if (numMap.containsKey(anotherNums)) {
          int index = numMap.get(anotherNums);
          if (index != i) {
            return new int[]{i, index};
          }
        }
      }
      return new int[]{0, 0};
    }
  }
  //leetcode submit region end(Prohibit modification and deletion)

}