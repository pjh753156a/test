package programmers;

import java.util.Arrays;

/*
 * 문자열 myString이 주어집니다. 
 * myString을 문자 "x"를 기준으로 나눴을 때 
 * 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution54 
{
	public static int[] solution(String myString) 
	{
	        int[] answer = {};
	        String[] src=myString.split("x",-1);
	        answer= new int[src.length];
	        
	        for(int i=0;i<answer.length;i++)
	        {
	        	answer[i]=src[i].length();
	        }
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		String myString = "xooxoxxox";
		int[] result = solution(myString);
		System.out.println(Arrays.toString(result));
	}
}
