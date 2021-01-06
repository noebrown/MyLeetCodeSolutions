import java.lang.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solutionArray = new int[2];
        
        for (int i = 0; i< nums.length; i++) {
            for (int j = i+1; i< nums.length; i++) {
                    if (nums[j] == target - nums[i]) {
                       solutionArray[0] = i;
                       solutionArray[1] = j;
                       return solutionArray;
                    } 
                }                
            }
            throw new IllegalArgumentException("No two sum solution"); 
    }
}

