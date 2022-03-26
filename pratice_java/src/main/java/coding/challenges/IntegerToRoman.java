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

public class IntegerToRoman {
	
	public String intToRoman(int num) {
		String romanStr = "";
		while(num>0) {
			if(num>=1000) {
				num = num - 1000;
				romanStr = romanStr +"M";	
			}else if(num>=500) {
				//900
				if(num>=900) {
					romanStr = romanStr +"CM";
					num-=900;
				}else {
				num = num - 500;
				romanStr = romanStr +"D";
				}
			}else if(num>=100) {
				//400
				if(num>=400) {
					romanStr = romanStr +"CD";
					num-=400;
				}else {
				num = num - 100;
				romanStr = romanStr +"C";
				}
			}else if(num>=50) {
				//90
				if(num>=90) {
					romanStr = romanStr +"XC";
					num-=90;
				}else {
				num = num - 50;
				romanStr = romanStr +"L";
				}
			}else if(num>=10) {
				//40
				if(num>=40) {
					romanStr = romanStr +"XL";
					num-=40;
				}else {
				num = num - 10;
				romanStr = romanStr +"X";
				}
			}else if(num>=5) {
				//9
				if(num>=9) {
					romanStr = romanStr +"IX";
					num-=9;
				}else {
				num = num - 5;
				romanStr = romanStr +"V";
				}
			}else {
				//4
				if(num>=4) {
					romanStr = romanStr +"IV";
					num-=4;
				}else {
					romanStr = romanStr +"I";
					num--;
				}
			}
		}
		return romanStr;
        
    }
	public static void main(String[] args) {
		IntegerToRoman integerToRoman = new IntegerToRoman();
		int num = 1994;
		//for(int i=1;i<=10;i++) {
		String romanStr = integerToRoman.intToRoman(num);
		System.out.println("num "+num+" romanStr "+romanStr);
		//System.out.println("num "+i+" romanStr "+romanStr);
		//}

	}

}
