package median_of_two_sorted_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {
//	4. Median of Two Sorted Arrays  QuestionEditorial Solution  My Submissions
//	Total Accepted: 101527
//	Total Submissions: 530056
//	Difficulty: Hard
//	There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//	Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//	Example 1:
//	nums1 = [1, 3]
//	nums2 = [2]
//
//	The median is 2.0
//	Example 2:
//	nums1 = [1, 2]
//	nums2 = [3, 4]
//
//	The median is (2 + 3)/2 = 2.5
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	
    	// 22ms scan the list/array 7 times. Better to scan only once
//    	ArrayList<Double> list = new ArrayList<Double>();
//        
//        for (int i = 0; i < nums1.length; i++) {
//        	list.add(nums1[i]);
//		}
//        
//        for (int i = 0; i < nums2.length; i++) {
//        	list.add(nums2[i]);
//		}
//        
//        Collections.sort(list);
//        
//        return ((double)list.get((list.size() - 1) / 2) + (double)list.get(list.size()  / 2)) / 2;
    	
    	// cause they are sorted 2 arrays, place the smallest one into a new array and stop at (len1+len2) / 2 or near
//    	21ms
//    	ArrayList<Integer> firstList = new ArrayList<Integer>();
//    	ArrayList<Integer> secondList = new ArrayList<Integer>();
//    	ArrayList<Integer> result = new ArrayList<Integer>();
//    	
//    	for (int i = 0; i < nums1.length; i++) {
//    		firstList.add(nums1[i]);
//    	}
//    
//    	for (int i = 0; i < nums2.length; i++) {
//    		secondList.add(nums2[i]);
//    	}
//    	
//    	int len = nums1.length + nums2.length;
//    	
//    	while (!firstList.isEmpty() && !secondList.isEmpty()) {	
//			if(firstList.get(0) <= secondList.get(0)) {
//				result.add(firstList.get(0)); 
//				firstList.remove(0);
//			}
//			else {
//				result.add(secondList.get(0));
//				secondList.remove(0);
//			}
//    	}
//    	if(result.size() > len / 2)
//    	{
//    	return ((double)result.get((len - 1) / 2) + (double)result.get(len / 2)) / 2;
//    	}
//    	
//    	else {
//    		if(firstList.isEmpty()) {
//    			result.addAll(secondList);
//    			return ((double)result.get((len - 1) / 2) + (double)result.get(len / 2)) / 2;
//    		}
//    		
//    		else {
//    			result.addAll(firstList);
//    			return ((double)result.get((len - 1) / 2) + (double)result.get(len / 2)) / 2;
//    		}
//    	}
    	
    	// 6ms Genius
        int N1 = nums1.length, N2 = nums2.length;
        if (N1 > N2) return findMedianSortedArrays(nums2, nums1);
        
        int low = 0, high = 2 * N1;
        while (low <= high) {
            int C1 = (low + high) / 2;
            int C2 = N1 + N2 - C1;
            
            double L1 = (C1 == 0) ? Integer.MIN_VALUE : nums1[(C1 - 1) / 2];
            double R1 = (C1 == 2 * N1) ? Integer.MAX_VALUE : nums1[C1 / 2];
            double L2 = (C2 == 0) ? Integer.MIN_VALUE : nums2[(C2 - 1) / 2];
            double R2 = (C2 == 2 * N2) ? Integer.MAX_VALUE : nums2[C2 / 2];
            
            if (L1 > R2) high = C1 - 1;
            else if (L2 > R1) low = C1 + 1;
            else return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
        }
        return -1;

    }  
}
