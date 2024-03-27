package programmers2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 문자열 my_str과 n이 매개변수로 주어질 때, 
 * my_str을 길이 n씩 잘라서 저장한 배열을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution106 
{
	public static String[] solution(String my_str, int n) 
	{
		String[] answer = {};
		int num=n;
		int count=1;
	
		while(true)
		{
			if(num>=my_str.length())
			{
				break;
			}
			num=num+n;
			count++;
		}
		
		answer = new String[count];
	
		count=0;
		
		
		
		for(int i=0;i<my_str.length();i=i+n)
		{
			if(i+n>=my_str.length())
			{
				answer[count]=my_str.substring(i);
			}
			else
			{
				answer[count]=my_str.substring(i,i+n);
			}
			
			System.out.println(answer[count]);
			count++;
			
		}
		
	
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		String my_str = "abc1Addfggg4556b";
		int n=6;
		String[] result = solution(my_str, n);
		System.out.println(Arrays.toString(result));
	}
}
