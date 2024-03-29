package programmers2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 정수 배열 array와 정수 n이 매개변수로 주어질 때, 
 * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution127 
{
	public static int solution(int[] array, int n) 
	{
		int answer = 0;
		int min=0;
		List<Integer> list = new ArrayList<Integer>();
		
		
		min=Math.abs(n-array[0]);
		for(int i=0;i<array.length;i++)
		{
			if(min>Math.abs(n-array[i]))
			{	
				list.clear();
				list.add(array[i]);
				min=Math.abs(n-array[i]);
			}
			else if(min==Math.abs(n-array[i]))
			{
				list.add(array[i]);
			}
		}
		
		Collections.sort(list);
		
		
		answer=list.get(0);
		
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] array = {77, 71, 75,77,77,78,80,80,84,82,82,84};
		int n=83;
		int result = solution(array, n);
		System.out.println(result);
	}

}
