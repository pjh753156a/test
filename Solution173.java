package programmers3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution173
{
	public static int[] solution(int n) 
	{
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=n;i=i+2)
		{
			list.add(i);
		}
		
		answer = new int[list.size()];
		
		for(int i=0;i<answer.length;i++)
		{
			answer[i]=list.get(i);
		}
		
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		int n = 15;
		int[] result = solution(n);
		System.out.println(Arrays.toString(result));
	}
}
