package programmers;

/*
 * 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 
 * 각 자리수의 합을 return 하도록 solution 함수를 완성해주세요.
 */

public class Solution72 
{
	public static int solution(String num_str) 
	{
	        int answer = 0;
	        for(int i=0;i<num_str.length();i++)
	        {
	        	answer=answer+Character.getNumericValue(num_str.charAt(i));
	        }
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		String num_str = "123456789";
		int result = solution(num_str);
		System.out.println(result);
	}
}
