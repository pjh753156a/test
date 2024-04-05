package programmers3;

import java.util.Arrays;

/*
 * 문자열 배열 strlist가 매개변수로 주어집니다. 
 * strlist 각 원소의 길이를 담은 배열을 retrun 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution174 
{
	public static int[] solution(String[] strlist) 
	{
        int[] answer = {};
        answer = new int[strlist.length];
        
        for(int i=0; i<answer.length;i++)
        {
        	answer[i]=strlist[i].length();
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String[] strlist = {"We", "are", "the", "world!"};
		int[] result = solution(strlist);
		System.out.println(Arrays.toString(result));
	}
}
