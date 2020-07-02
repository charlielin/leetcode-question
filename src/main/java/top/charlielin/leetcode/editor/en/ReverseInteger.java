//Given a 32-bit signed integer, reverse digits of an integer. 
//
// Example 1: 
//
// 
//Input: 123
//Output: 321
// 
//
// Example 2: 
//
// 
//Input: -123
//Output: -321
// 
//
// Example 3: 
//
// 
//Input: 120
//Output: 21
// 
//
// Note: 
//Assume we are dealing with an environment which could only store integers with
//in the 32-bit signed integer range: [−231, 231 − 1]. For the purpose of this pro
//blem, assume that your function returns 0 when the reversed integer overflows. 
// Related Topics Math


package top.charlielin.leetcode.editor.en;

public class ReverseInteger {

  public static void main(String[] args) {
    Solution solution = new ReverseInteger().new Solution();
    int res = solution.reverse(-1203);
    System.out.println(res);
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public int reverse(int x) {
//      boolean sign = x > 0;
      int xx = x;
      long yy = 0;

      while (xx != 0) {
        yy = yy * 10 + xx % 10;
        xx = xx / 10;
      }
      return (int)yy == yy ? (int)yy : 0;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}