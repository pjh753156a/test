package lv0;

import java.util.Arrays;

/*
 * 정수 리스트 num_list와 정수 n이 주어질 때, 
 * num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution32 
{
	public static int[] solution(int[] num_list, int n) 
	{
        int[] answer = {};
        answer = new int[n];
        for(int i=0;i<n;i++)
        {
        	answer[i]=num_list[i];
        }
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] num_list = {5, 2, 1, 7, 5};
		int n = 3;
		int[] result = solution(num_list,n);
		System.out.println(Arrays.toString(result));
	}
}
