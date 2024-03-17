package lv00;

import java.util.Arrays;

/*
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다.
 * arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, 
 * arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 
 * return 하는 solution 함수를 작성해 주세요.
 */


public class Solution67
{
	public static int[] solution(int[] arr, int n) 
	{
	    int[] answer = {};
	        if(arr.length%2==1)
	        {
	        	for(int i=0; i<arr.length;i++)
	        	{
	        		if(i%2==0)
	        		{
	        			arr[i]=arr[i]+n;
	        		}
	        	}
	        }
	        else if(arr.length%2==0)
	        {
	        	for(int i=0; i<arr.length;i++)
	        	{
	        		if(i%2==1)
	        		{
	        			arr[i]=arr[i]+n;
	        		}      		
	        	}
	        }
	        
	        answer = new int[arr.length];
	        for(int i=0;i<answer.length;i++)
	        {
	        	answer[i]=arr[i];
	        }
	        return answer;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {49, 12, 100, 276, 33};
		int n = 27; 
		int[] result = solution(arr, n);
		System.out.println(Arrays.toString(result));
	}
}
