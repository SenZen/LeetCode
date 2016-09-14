import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.stream.IntStream;

import javax.management.openmbean.KeyAlreadyExistsException;

import WaterAndJugProblem.WaterandJugProblem;
import add_digits.AddDigits;
import bitwise_and_of_numbers_range.BitwiseANDofNumbersRange;
import count_numbers_with_unique_digits.CountNumbersWithUniqueDigits;
import course_schedule.CanFinish;
import excel_sheet_column_title.ExcelSheetColumnTitle;
import factorial_trailing_zeroes.FactorialTrailingZeroes;
import happy_number.HappyNumber;
import house_robber.HouseRobbery;
import implement_strStr.ImplementStrStr;
import intersection_of_two_arrays_2.Intersect;
import largest_rectangle_in_histogram.LargestRectangleArea;
import line_reflection.LineReflection;
import median_of_two_sorted_arrays.MedianOfTwoSortedArrays;
import minimum_path_sum.MinimumPathSum;
import palindrome_permutation.PalindromePermutation;
import pow.Pow;
import remove_duplicate_letters.RemoveDuplicateLetters;
import remove_duplicates_from_sorted_list.DeleteDuplicates;
import remove_duplicates_from_sorted_list.DeleteDuplicates.ListNode;
import reverse_strings.ReverseString;
import reverse_words.ReverseWords;
import roman_to_integer.RomanToInteger;
import super_pow.SuperPow;
import two_sum.TwoSum;
import two_sum_of_integers.GetSum;
import ugly_number.IsUgly;
import ugly_number_2.NthUglyNumber;
import unique_paths.UniquePaths;
import valid_anagram.ValidAnagram;
import word_search.WordSearch;

public class Solution { 
	
//	public static int calStr(String s) {
//		if(s == null) return 0;
//		int a = 0, b = 0, c = 0, d = 0;
//		for (int i = 0; i < s.length(); i++) {
//			if(s.charAt(i) == 'n') a++;
//			if(s.charAt(i) == 't') b++;
//			if(s.charAt(i) == 'e') c++;
//			if(s.charAt(i) == 's') d++;
//		}
//		return a * b * c * d;
//	}
//	
//	public static int findEm(int m, int n, int[] x) {
//		int target = 0;
//		int temp[] = null;
//		for (int i = 0; i <= x.length; i++) {
//			temp[i] = m;
//			m++;
//		}
//		for (int i = 0; i < x.length; i++) {
//			target = target + temp[i] - x[i];
//		}	
//		return target + temp[x.length];
//	}
//	
//	public static int neteaseCateen(int m, int n, int[][] sati) {
//		int[] foodVolumn = new int[n];
//		int[] satiDegree = new int[n];
//		
//		int maxSati = 0, maxFood = 0;
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i = 0; i < sati.length; i++) {
//			map.put(sati[i][1] / sati[i][0], sati[i][0]);
//			satiDegree[i] = sati[i][1] / sati[i][0];
//		}
//		
//		Arrays.sort(satiDegree);
//		
//		for (int i = 0; i < satiDegree.length; i++) {
//			
//			if(maxFood < m) {
//				maxFood += map.get(satiDegree[i]);
//				maxSati += map.get(satiDegree[i]) * satiDegree[i];
//			}
//		}
//		return maxSati;
//	}
//	
//	public static String findWay(int n, int[][] matrix) {
//		int[][] temp = new int[matrix.length][matrix[0].length];
//		for (int i = 0; i < temp.length; i++) {
//			for (int j = 0; j < temp[0].length; j++) {
//				if(matrix[i][j] == 0) temp[i][j] = 0;
//				else temp[i][j] = Integer.MAX_VALUE;
//			}
//		}
//		// 初始化
//		for (int i = 1; i < temp.length; i++) {
//			if(temp[i][0] != Integer.MAX_VALUE && temp[i - 1][0] != Integer.MAX_VALUE) temp[i][0] = temp[i - 1][0] + 1;
//		}
//		
//		for (int i = 1; i < temp[0].length; i++) {
//			if(temp[0][i] != Integer.MAX_VALUE && temp[0][i - 1] != Integer.MAX_VALUE) temp[0][i] = temp[0][i - 1] + 1;
//		}
//		
//		// 求新矩阵值
//		for (int i = 1; i < temp.length; i++) {
//			for (int j = 1; j < temp[0].length; j++) {
//				if(matrix[i - 1][j] == Integer.MAX_VALUE && matrix[i][j - 1] == Integer.MAX_VALUE) temp[i][j] = 0;
//				if(matrix[i - 1][j] == Integer.MAX_VALUE || matrix[i][j - 1] == Integer.MAX_VALUE) temp[i][j] = Math.min(matrix[i - 1][j], matrix[i][j - 1]);
//				else temp[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
//			}
//		}
//		
//		return temp[matrix.length][matrix[0].length] == 0 ? "Failure!" : "Success!";
//	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toBinaryString(-10));
	}

}
