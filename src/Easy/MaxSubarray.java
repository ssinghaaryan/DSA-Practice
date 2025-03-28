package Easy;

public class MaxSubarray {
	
	public static int maxSubarray(int[] nums) {
		
		int maxSum = nums[0]; //store first element of array in maxSum
		int curSum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			
			if(curSum < 0) { // if at any point sum < 0, 
				curSum = 0; // set it back to 0
			}
			curSum += nums[i]; 
			maxSum = Math.max(maxSum, curSum); // max of current sum or existing sum
		}
		return maxSum;
	}
	
	public static void main(String[]args) {
		
		int[] nums = {-2,1, -3,4, -1,2,1, -5,4};
		System.out.println(maxSubarray(nums));
		
	}

}
