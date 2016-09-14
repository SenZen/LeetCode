package intersection_of_two_arrays;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
//	349. Intersection of Two Arrays  QuestionEditorial Solution  My Submissions
//	Total Accepted: 25925
//	Total Submissions: 58262
//	Difficulty: Easy
//	Given two arrays, write a function to compute their intersection.
//
//	Example:
//	Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
	 public static int[] intersection(int[] nums1, int[] nums2) {
		 
		 //O(n2)
//	        Set<Integer> set = new HashSet<Integer>();
//	        
//	        for (int i = 0; i < nums1.length; i++) {
//				for (int j = 0; j < nums2.length; j++) {
//					if (nums1[i] == nums2[j]) {
//						set.add(nums1[i]);
//					}
//				}
//			}
//	       int[] result = new int[set.size()];
//	       int index = 0;
//	       for(Integer i: set) {
//	    	   result[index++] = i;
//	       }
//	       
//	       return result;
		 
//		 O(n)
		 Set<Integer> n1 = new HashSet<Integer>();
		 Set<Integer> intersection = new HashSet<Integer>();
		 
		 for (int i = 0; i < nums1.length; i++) {
			n1.add(nums1[i]);
		}
		 
		 for (int i = 0; i < nums2.length; i++) {
			if(n1.contains(nums2[i])) {
				intersection.add(nums2[i]);
			}
		}
		int[] result = new int[intersection.size()];
		int index = 0;
		for(Integer i: intersection) {
			result[index++] = i;
		}
    
			return result;	 
	    }
}
