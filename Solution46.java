package lv0;

import java.util.Arrays;

/*
 * 문자열 배열 strArr가 주어집니다. 
 * 모든 원소가 알파벳으로만 이루어져 있을 때, 
 * 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
 * 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution46
{
	public static String[] solution(String[] strArr) 
	{
	        String[] answer = {};
	        for(int i=0;i<strArr.length;i++)
	        {
	        	if(i%2==0)
	        	{
	        		strArr[i]=strArr[i].toLowerCase();
	        	}
	        	else if(i%2==1)
	        	{
	        		strArr[i]=strArr[i].toUpperCase();
	        	}
	        }
	        
	        answer = new String[strArr.length];
	        
	        
	        for(int i=0; i<answer.length;i++)
	        {
	        	answer[i]=strArr[i];
	        }
	        return answer;
	}

	public static void main(String[] args) 
	{
		String[] strArr = {"aBc","AbC"};
		String[] result = solution(strArr);
		System.out.println(Arrays.toString(result));
	}
}
