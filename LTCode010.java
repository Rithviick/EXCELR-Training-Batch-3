class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
}

public class LTCode010 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 2, 3, 2}; // Example input
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}