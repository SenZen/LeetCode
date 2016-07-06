package largest_rectangle_in_histogram;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleArea {
	
//	84. Largest Rectangle in Histogram  QuestionEditorial Solution  My Submissions
//	Total Accepted: 63340
//	Total Submissions: 257828
//	Difficulty: Hard
//	Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
//
//
//	Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
//
//
//	The largest rectangle is shown in the shaded area, which has area = 10 unit.
//
//	For example,
//	Given heights = [2,1,5,6,2,3],
//	return 10.
	
	//TLE
//	public static int findBoundary(int[] array, int i) {
//		int len = 1;
//		for (int j = 1; j < array.length; j++) {
//			if(i + j < array.length && array[i] <= array[i + j]) len++;
//			else break;		
//		}
//		
//		for (int j = 1; j < array.length; j++) {
//			if(i - j >= 0 && array[i] <= array[i - j]) len++;
//			else break;
//			}
//		return len;
//	}
//	
//	public static int largestRectangleArea(int[] heights) {
//	
//	//brute force
//	int max = 0;
//	
//	for (int i = 0; i < heights.length; i++) {
//		if (heights[i] * findBoundary(heights, i) > max) max = heights[i] * findBoundary(heights, i);
//	}
//	
//	return max;
//}

	
	public static int largestRectangleArea(int[] heights) {
//		int len = heights.length;
//		int min = heights[0], index = 0;
//		for (int i = 0; i < heights.length; i++) {
//			if (heights[i] < min) {
//				min = heights[i]; 
//				index = i;
//			}
//		}
//		int max = min * len;
//		
//		if (index == 0) {
//			int[] array = new int[len - 1];
//			for (int i = 0; i < array.length; i++) {
//				array[i] = heights[i + 1];
//			}
//			largestRectangleArea(array);
//		}
//		
//		if (index == len - 1) {
//			int[] array = new int[len - 1];
//			for (int i = 0; i < array.length; i++) {
//				array[i] = heights[i];
//			}
//			largestRectangleArea(array);
//		}
//		
//		else {
//			
//		}
		int len = heights.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){
            int h = (i == len ? 0 : heights[i]);
            if(s.isEmpty() || h >= heights[s.peek()]){
                s.push(i);
            }else{
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;
            }
        }
        return maxArea;
    
	}
        
    }

