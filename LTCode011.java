class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        int diffBit = xor & -xor;
        int num1 = 0, num2 = 0;

        for (int num : nums) {
            if ((num & diffBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[]{num1, num2};
    }
}

public class LTCode011 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1, 3, 2, 5}; // Example input
        int[] result = solution.singleNumber(nums);
        System.out.println("The two unique numbers are: " + result[0] + " and " + result[1]);
    }
}
