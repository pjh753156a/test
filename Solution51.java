package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 문자열 배열 strArr가 주어집니다. 
 * 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 
 * 남은 문자열을 순서를 유지하여 배열로 return 하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution51 
{
	public static String[] solution(String[] strArr) 
	{
	        String[] answer = {};
	        List<String> list = new ArrayList<String>();
	        int count=0;
	        for(int i=0;i<strArr.length;i++)
	        {
	        	if(strArr[i].contains("ad"))
	        	{
	        		continue;
	        	}
	        	list.add(strArr[i]);
	        }
	        answer=new String[list.size()];

	        for(int i=0;i<answer.length;i++)
	        {
	        	answer[i]=list.get(i);
	        }
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		String[] strArr = {"and","notad","abcd"};
		String[] result = solution(strArr);
		System.out.println(Arrays.toString(result));
	}
}
