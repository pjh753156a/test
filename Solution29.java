package print;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution29 
{
	public static int[] solution(int[] num_list, int n)
	{
	        int[] answer = {};
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=n-1;i<num_list.length;i++)
	        {
	        	list.add(num_list[i]);
	        }
	        answer=new int[list.size()];
	        for(int i=0;i<answer.length;i++)
	        {
	        	answer[i]=list.get(i);
	        }
	        return answer;
	}

	public static void main(String[] args) 
	{
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 2; 
		int[] result = solution(num_list,n);
		System.out.println(Arrays.toString(result));
	}
}
