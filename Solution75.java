package lv00;

import java.math.BigInteger;

/*
 * 0 이상의 두 정수가 문자열 a, b로 주어질 때, 
 * a + b의 값을 문자열로 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution75 
{
	public static String solution(String a, String b) 
	{
        String answer = "";
        BigInteger bigIntegerValue1 = new BigInteger(a);
        BigInteger bigIntegerValue2 = new BigInteger(b);
        BigInteger bigIntegerValue3=bigIntegerValue1.add(bigIntegerValue2);
        answer = bigIntegerValue3.toString();
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String a = "18446744073709551615";
		String b = "287346502836570928366";
		String result = solution(a, b);
		System.out.println(result.toString());
	}
}
