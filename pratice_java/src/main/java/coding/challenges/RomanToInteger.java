package coding.challenges;
/***
 * 
 * @author yogen
 *
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 
12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However,
 the numeral for four is not IIII. Instead, the number four is written as IV. 
 Because the one is before the five we subtract it making four. 
 The same principle applies to the number nine, which is written as IX. 
 There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {

	public static void main(String[] args) {
		RomanToInteger romanToInteger = new RomanToInteger();
		String romanString = "III";
		int romanInteger = romanToInteger.romanToInt(romanString);
		System.out.println("RomanString "+romanString+" RomanInteger "+ romanInteger);
		
	}

	private int romanToInt(String s) {
		int strlen = s.length();
		int romanInt = 0;
		boolean specialIFlag=false;
		boolean specialXFlag=false;
		boolean specialCFlag=false;
		for(int i=strlen-1; i>=0;i-- ) {
			char c = s.charAt(i);
			switch(c) {
			case 'I' :
				if(specialIFlag) {
					romanInt=romanInt-1;
				}else {
					romanInt=romanInt+1;
				}
				specialIFlag = false;
				specialXFlag=false;
				specialCFlag=false;
				break;
			case 'V':
				romanInt=romanInt+5;
				specialIFlag = true;
				specialXFlag=false;
				specialCFlag=false;
				break;
			case 'X':
				if(specialXFlag) {
					specialIFlag = false;
					romanInt=romanInt-10;
				}else {
					specialIFlag = true;
					romanInt=romanInt+10;
				}
				specialXFlag=false;
				specialCFlag=false;
				break;
			case 'L':
				romanInt=romanInt+50;
				specialIFlag = false;
				specialXFlag=true;
				specialCFlag=false;
				break;
			case 'C':
				if(specialCFlag) {
					specialXFlag=false;
					romanInt=romanInt-100;
				}else {
					specialXFlag=true;
					romanInt=romanInt+100;
				}
				specialIFlag = false;
				specialCFlag=false;
				break;
			case 'D':
				romanInt=romanInt+500;
				specialCFlag = true;
				specialIFlag = false;
				specialXFlag=false;
				break;
			case 'M':
				romanInt=romanInt+1000;
				specialCFlag = true;
				specialIFlag = false;
				specialXFlag=false;
				break;
			default:
				System.out.println("Invalid Char "+c);
				break;
			}
				
		}
		return romanInt;
	}

}
