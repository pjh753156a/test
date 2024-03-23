package lv00;

/*
 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 
 * 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution87 
{
	public static String solution(String myString) 
	{
		String answer = "";
		for(int i=0;i<myString.length();i++)
		{
			if(myString.charAt(i)<'l')
			{
				answer=answer+'l';
			}
			else
			{
				answer=answer+myString.charAt(i);
			}
		}
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		String myString = "abcdevwxyz";
		String result = solution(myString);
		System.out.println(result);
	}
}
