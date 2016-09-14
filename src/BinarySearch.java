
public class BinarySearch {
	
	public static int binarySearch(int[] array, int start, int end, int target) {
		if(start > end) return -1;
		
		int mid = start + ((end - start) / 2);//prevent stack overflow
//		(low < 0 && high > 0) ? (low + high) / 2 : low + (high - low) / 2 //if low can be smaller that 0
//		int mid = (end + start) / 2;
		
		if(array[mid] > target) return binarySearch(array, start, mid - 1, target);
		if(array[mid] < target) return binarySearch(array, mid + 1, end, target);
		else return array[mid];
	} 
}
