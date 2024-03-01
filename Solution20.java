package lv0;

import java.util.Arrays;

/*
 *  알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
 *  my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., 
 *  my_string에서 'Z'의 개수, my_string에서 'a'의 개수, 
 *  my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를
 *  순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
 */

public class Solution20 
{
	public static int[] solution(String my_string) 
	{
	        int[] answer = {};
	        answer = new int[52];
	        
	        for(int i=0;i<answer.length;i++)
	        {
	        	answer[i]=0;
	        }
	   
	        char[] chr = new char[52];
	        for(int i=0;i<26;i++)
	        {
	        	chr[i]=(char)(i+65);
	        }
	        
	        for(int i=26;i<52;i++)
	        {
	        	chr[i]=(char)(i+71);
	        }
	        
	        for(int i=0;i<my_string.length();i++)
	        {
	        	answer=compare(answer,chr,my_string.charAt(i));
	        }

	        	
	        return answer;
	}
	
	public static int[] compare(int[] answer,char[] chr,char my_string) 
	{
		for(int i=0; i<chr.length;i++)
		{
			if(my_string==chr[i])
			{
				answer[i]++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		String my_string = "Programmers";
		int[] result = solution(my_string);
		System.out.println(Arrays.toString(result));
	}
}
