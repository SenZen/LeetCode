import java.util.ArrayList;

import add_digits.AddDigits;
import course_schedule.CanFinish;
import largest_rectangle_in_histogram.LargestRectangleArea;
import remove_duplicates_from_sorted_list.DeleteDuplicates;
import remove_duplicates_from_sorted_list.DeleteDuplicates.ListNode;
import reverse_strings.ReverseString;
import reverse_words.ReverseWords;
import two_sum.TwoSum;
import two_sum_of_integers.GetSum;
import ugly_number.IsUgly;
import ugly_number_2.NthUglyNumber;

public class Solution {
	
    public static boolean isPowerOfThree(int n) {
    	
    	if(n <= 0) return false;
    	
        if(n == 3 && n % 3 == 0 || n ==1) return true;
        
        else 
        	
        return isPowerOfThree(n/3);
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPowerOfThree(0));
	}

}
