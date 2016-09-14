package house_robber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HouseRobbery {
    public static int rob(int[] nums) {
    	int last = 0;
        int now = 0;
        int tmp;
        for (int i = 0; i < nums.length; i++) {
        	tmp = now;
            now = Math.max(last + nums[i], now);
            last = tmp;
		}
        return now;   
    	}
    
}
