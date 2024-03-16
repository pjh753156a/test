package lv00;

import java.util.Arrays;

/*
 * 정수 배열 arr이 매개변수로 주어집니다. 
 * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다. 
 * arr에 최소한의 개수로 0을 추가한 배열을 return 하는 
 * solution 함수를 작성해 주세요.
 */

public class Solution64 
{
	public static int[] solution(int[] arr) 
	{
        int[] answer = {};
        int number2=1;
        while(number2<arr.length)
        {
        	number2=number2*2;
        }
        
        answer=new int[number2];
        
        for(int i=0;i<number2;i++)
        {
        	if(i<arr.length)
        	{
        		answer[i]=arr[i];
        	}
        	else
        	{
        		answer[i]=0;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		int[] arr = {58, 172, 746, 89};
		int[] result = solution(arr);
		System.out.println(Arrays.toString(result));
	}
}
