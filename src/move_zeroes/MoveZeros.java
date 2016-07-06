package move_zeroes;

public class MoveZeros {
	
//	283. Move Zeroes  QuestionEditorial Solution  My Submissions
//	Total Accepted: 95028
//	Total Submissions: 210223
//	Difficulty: Easy
//	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//	For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
//
//	Note:
//	You must do this in-place without making a copy of the array.
	
//	Minimize the total number of operations.
	
	public static void moveZeroes(int[] nums) {
	    if (nums == null || nums.length == 0) return;        

	    int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0) nums[insertPos++] = num;
	    }        

	    while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    }
	}
	
//	public static void moveZeroes(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//        	if(nums[i] == 0) {
//        		for (int j = i + 1; j < nums.length; j++) {
//					if(nums[j] != 0) {
//						nums[i] = nums[j];
//						nums[j] = 0;
//						break;
//					}
//				}
//        	}
//        }
//    }
}
