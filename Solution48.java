package programmers;

import java.security.DigestOutputStream;

/*
 * 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, 
 * my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution48 
{
	public static String solution(String my_string, String alp) 
	{
	        String answer = "";
	        for(int i=0;i<my_string.length();i++)
	        {
	        	if(my_string.charAt(i)==alp.charAt(0))
	        	{
	        		answer=answer+ Character.toUpperCase(my_string.charAt(i));
	        	}
	        	else
	        	{
	        		answer=answer+my_string.charAt(i);
	        	}	        	
	        }
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		String my_string = "programmers";
		String alp = "p";
		String result = solution(my_string, alp);
		System.out.println(result);
	}
}
