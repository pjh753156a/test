package programmers3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
 * 정수 배열 emergency 가 매개변수로 주어질 때 
 * 응급도가 높은 순서대로 진료 순서를 정한 배열을 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution153 
{
	public static int[] solution(int[] emergency) 
	{
		int[] answer = {};
		int number=1;
		answer = new int[emergency.length];
		List<Integer> list = new ArrayList<Integer>();
		int max=0;
		
		for(int i=0;i<emergency.length;i++)
		{
			list.add(emergency[i]);
		}
		
		for(int i=0;i<emergency.length;i++)
		{
			for(int j=0;j<emergency.length;j++)
			{
				if(emergency[j]==Collections.max(list))
				{
					answer[j]=number;
					number++;
					
				}
			}
			list.remove(Collections.max(list));
		}
		
		return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] emergency = {1, 2, 3, 4, 5, 6, 7};
		int[] result = solution(emergency);
		System.out.println(Arrays.toString(result));
	}

}
