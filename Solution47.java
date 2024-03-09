package lv0;

import java.util.Arrays;

/*
 * 문자열 myString이 주어집니다. 
 * myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, 
 * "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 
 * solution 함수를 완성하세요.
 */

public class Solution47 
{
	public static String solution(String myString) 
	{
	        String answer = "";
	        char[] str = new char[myString.length()];
	        myString=myString.toLowerCase();
	        
	        for(int i=0; i<myString.length(); i++)
	        {
	        	if(myString.charAt(i)=='a')
	        	{
	        		str[i]=Character.toUpperCase(myString.charAt(i));
	        	}
	        	else
	        	{
	        		str[i]=myString.charAt(i);
	        	}
	        }
	        
	        for(int i=0;i<str.length;i++)
	        {
	        	answer=answer+str[i];
	        }
	        return answer;
	}
	
	public static void main(String[] args)
	{
		String myString = "abstract algebra";
		String result = solution(myString);
		System.out.println(result.toString());
	}
}

