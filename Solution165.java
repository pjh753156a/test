package programmers3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *  문자열 my_string이 매개변수로 주어질 때,
	my_string 안에 있는 숫자만 골라 
	오름차순 정렬한 리스트를 
	return 하도록 
	solution 함수를 작성해보세요.
 */

public class Solution165 
{
	public static int[] solution(String my_string) 
	{
		int[] answer = {};
		List<Character> list = new ArrayList<Character>();
		
		for(int i=0;i<my_string.length();i++)
		{
			if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57)
			{
				list.add(my_string.charAt(i));
			}
		}
		
		Collections.sort(list);
		
		answer= new int[list.size()];
		
		
		for(int i=0; i<answer.length;i++)
		{
			answer[i]=list.get(i)-48;
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		String my_string = "hi12392";
		int[] result = solution(my_string);
		System.out.println(Arrays.toString(result));
 	}
}
