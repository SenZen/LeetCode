package two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
//1. Two Sum
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution.
//
//Example:
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
	public static int[] twoSum(int[] nums, int target) {

		// O(n2)
//		int[] res = {0,0};
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] + nums[j] == target) {
//					res[0] = i;
//					res[1] = j;
//				}
//			}
//		}
//		return res;
		
		//O(n)
		int[] res = {0,0};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			
			if(map.containsKey(target - nums[i])) {
				res[1] = i;
				res[0] = map.get(target - nums[i]);
			}
			
			map.put(nums[i], i);
		}
		return res;
    	}
		
}
