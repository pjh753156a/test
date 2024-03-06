package print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때,
 * num_list를 n 번째 원소 이후의 원소들과 
 * n 번째까지의 원소들로 나눠 n 번째 원소 이후의 
 * 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution30 
{
	public static int[] solution(int[] num_list, int n)
	{
	        int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	              
	        for(int i=n;i<num_list.length;i++)
	        {
	        	list.add(num_list[i]);
	        }
	        
	        for(int i=0;i<n;i++)
	        {
	        	list.add(num_list[i]);
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
		int[] num_list = {2, 1, 6};
		int n = 1;
		int[] result = solution(num_list,n);
		System.out.println(Arrays.toString(result));
	}

}
