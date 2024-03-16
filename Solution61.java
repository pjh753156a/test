package lv00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
 * 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때,
 * flag를 차례대로 순회하며 flag[i]가 true라면 
 * X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, 
 * flag[i]가 false 라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 
 * X를 return 하는 solution 함수를 작성해 주세요.
 */

public class Solution61
{
	public static int[] solution(int[] arr, boolean[] flag) 
	{
	        int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0; i<flag.length;i++)
	        {
	        	if(flag[i])
	        	{
	        		list=extend(list,arr[i]);
	        	}
	        	else
	        	{
	        		list=remove(list,arr[i]);
	        	}
	        }
	        
	        answer = new int[list.size()];
	        		
	        for(int i=0; i<answer.length;i++)
	        {
	        	answer[i]=list.get(i);
	        }
	        return answer;
	}
	
	
	public static List<Integer> extend(List<Integer> list, int arr) 
	{
	        for(int i=0; i<arr*2;i++)
	        {
	        	list.add(arr);
	        }
	        return list;
	}
	
	public static List<Integer> remove(List<Integer> list, int arr) 
	{
			for(int i=0; i<arr;i++)
			{
				list.remove(list.size()-1);
			}
			return list;
	}
	 
	 
	public static void main(String[] args)
	{
		int arr[] = {3, 2, 4, 1, 3};
		boolean flag[] = {true, false, true, false, false};
		int[] result = solution(arr, flag);
		System.out.println(Arrays.toString(result));
 	}
}
