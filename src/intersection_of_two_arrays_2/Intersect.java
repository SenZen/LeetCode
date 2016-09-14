package intersection_of_two_arrays_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {

	public static int binarySearch(int[] array, int start, int end, int target) {
		if (start > end)
			return -1;

		int mid = start + ((end - start) / 2);// prevent stack overflow
		// (low < 0 && high > 0) ? (low + high) / 2 : low + (high - low) / 2
		// //if low can be smaller that 0
		// int mid = (end + start) / 2;

		if (array[mid] > target)
			return binarySearch(array, start, mid - 1, target);
		if (array[mid] < target)
			return binarySearch(array, mid + 1, end, target);
		else
			return mid;
	}

	public static int[] intersect(int[] nums1, int[] nums2) {
		// SB 方法
		// if(nums1.length > nums2.length) return intersect(nums2, nums1);
		//
		// List<Integer> resList = new ArrayList<Integer>();
		//
		// for (int i = 0; i < nums1.length; i++) {
		// Arrays.sort(nums2);
		// int searchResult = binarySearch(nums2, 0, nums2.length - 1,
		// nums1[i]);
		// if(searchResult != -1) {
		// nums2[searchResult] = Integer.MAX_VALUE;
		// resList.add(nums1[i]);
		// }
		// }
		//
		// int[] res = new int[resList.size()];
		//
		// for(int i = 0; i < resList.size(); i++) res[i] = resList.get(i);
		// return res;

		// two poniters for each of sorted arrays
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int pnt1 = 0;
		int pnt2 = 0;
		ArrayList<Integer> myList = new ArrayList<Integer>();
		while ((pnt1 < nums1.length) && (pnt2 < nums2.length)) {
			if (nums1[pnt1] < nums2[pnt2]) {
				pnt1++;
			} else {
				if (nums1[pnt1] > nums2[pnt2]) {
					pnt2++;
				} else {
					myList.add(nums1[pnt1]);
					pnt1++;
					pnt2++;
				}
			}
		}
		int[] res = new int[myList.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = (Integer) myList.get(i);
		}
		return res;
	}
}
