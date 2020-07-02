/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int output = 0;
        while(x != 0){
            int pop = x % 10;
            x = x / 10;
            if(output > Integer.MAX_VALUE / 10 || (output == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)){
                output = 0;
                break;
            }else if(output < Integer.MIN_VALUE / 10 || (output == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)){
                output = 0;
                break;
            }
            output = output * 10 + pop;
        }
        return output;
    }
}
// @lc code=end

