package excel_sheet_column_title;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {
//	Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
//			For example:
//
//			    1 -> A
//			    2 -> B
//			    3 -> C
//			    ...
//			    26 -> Z
//			    27 -> AA
//			    28 -> AB
//	
//	int x = 26;
//	if(Math.pow(x, 6) > Integer.MAX_VALUE) System.out.println("OK");
    public static String convertToTitle(int n) {
    
    	return n == 0 ? "" : convertToTitle( --n / 26) + (char)('A' + (n % 26));
    }

}
