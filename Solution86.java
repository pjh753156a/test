package lv00;

import java.util.Arrays;

/*
 * 정수 배열 arr와 자연수 k가 주어집니다.
 * 만약 k가 홀수라면 arr의 모든 원소에 k를 곱하고, 
 * k가 짝수라면 arr의 모든 원소에 k를 더합니다.
 * 이러한 변환을 마친 후의 arr를 return 하는 
 * solution 함수를 완성해 주세요.
 */

public class Solution86
{
    public static int[] solution(int[] arr, int k)
    {
        int[] answer = {};
        if(k%2==1)
        {
        	for(int i=0;i<arr.length;i++)
        	{
        		arr[i]=arr[i]*k;
        	}
        }
        else if(k%2==0)
        {
        	for(int i=0;i<arr.length;i++)
        	{
        		arr[i]=arr[i]+k;
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
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 2;
		int[] result = solution(arr, k);
		System.out.println(Arrays.toString(result));
	}
}
