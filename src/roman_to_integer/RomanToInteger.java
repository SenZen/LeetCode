package roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('Z', 0);
		map.put('I', 1);
	    map.put('V', 5);
	    map.put('X', 10);
	    map.put('L', 50);
	    map.put('C', 100);
	    map.put('D', 500);
	    map.put('M', 1000);
	    
	    int result = 0;
	    String n = s + 'Z';
	    for (int i = s.length(); i - 1 >= 0; i--) {
			int cur = map.get(n.charAt(i - 1));
			int pre = map.get(n.charAt(i));
			if(cur >= pre) result += cur;
			else result -= cur;
		}
	    return result;
	}
}
