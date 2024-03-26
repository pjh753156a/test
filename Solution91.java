package Iv000;

import java.util.Arrays;

/*
 * 이차원 정수 배열 arr이 매개변수로 주어집니다. 
 * arr의 행의 수가 더 많다면 열의 수가 행의 수와 같아지도록 각 행의 끝에 0을 추가하고, 
 * 열의 수가 더 많다면 행의 수가 열의 수와 같아지도록 
 * 각 열의 끝에 0을 추가한 이차원 배열을 
 * return 하는 solution 함수를 작성해 주세요.
 */

public class Solution91 
{
	public static int[][] solution(int[][] arr) 
	{
		int[][] answer = {};
		
		if(arr.length>arr[0].length)
		{
			answer = new int[arr.length][arr.length];
			for(int i=0; i<arr.length;i++)
			{
				System.arraycopy(arr[i],0,answer[i],0, arr[i].length);
			}
		}
		else if(arr.length<arr[0].length)
		{
			answer = new int[arr[0].length][arr[0].length];
			for(int i=0; i<arr.length;i++)
			{
				System.arraycopy(arr[i],0,answer[i],0, arr[i].length);
			}
			for(int i=arr.length;i<arr[0].length;i++)
			{
				Arrays.fill(answer[i],0);
			}
		}
		else
		{
			answer=arr;
		}
		
	    return answer;
	
	}
	

	public static void main(String[] args) 
	{
		int[][] arr = {{572, 22, 37,1}, {287, 726, 384,1}, {85, 137, 292,1}, {487, 13, 876,1}};
		int[][] result = solution(arr);
		
		for(int i=0; i<result.length;i++)
		{
			System.out.println(Arrays.toString(result[i]));
		}
	}
}

