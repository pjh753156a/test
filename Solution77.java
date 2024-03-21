package lv00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 배열 arr과 delete_list가 있습니다. 
 * arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 
 * return 하는 solution 함수를 작성해 주세요.
 */

public class Solution77 
{
	public static int[] solution(int[] arr, int[] delete_list) 
	{
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		
		for(int i=0;i<delete_list.length;i++)
		{
			list.remove(Integer.valueOf(delete_list[i]));
		}
		
		answer = new int[list.size()];
		
		for(int i=0; i<answer.length;i++)
		{
			answer[i]=list.get(i);
		}
		
	    return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {110, 66, 439, 785, 1};
		int[] delete_list = {377, 823, 119, 43};
		int[] result = solution(arr, delete_list);
		System.out.println(Arrays.toString(result));
	}
}
