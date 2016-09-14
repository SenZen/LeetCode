package line_reflection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class LineReflection {
	// Given n points on a 2D plane, find if there is such a line parallel to
	// y-axis that reflect the given points.
	//
	// Example 1:
	// Given points = [[1,1],[-1,1]], return true.
	//
	// Example 2:
	// Given points = [[1,1],[-1,-1]], return false.
	public static boolean isReflected(int[][] points) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		HashSet<String> set = new HashSet<>();
		for (int[] p : points) {
			max = Math.max(max, p[0]);
			min = Math.min(min, p[0]);
			String str = p[0] + "a" + p[1];
			set.add(str);
		}
		int sum = max + min;
		for (int[] p : points) {
			String str = (sum - p[0]) + "a" + p[1];
			if (!set.contains(str))
				return false;
		}
		return true;
	}
}
