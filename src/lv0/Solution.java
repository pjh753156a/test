package lv0;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 정수 start_num와 end_num가 주어질 때, 
 * start_num부터 end_num까지의 숫자를 
 * 차례로 담은 리스트를 return하도록 
 * solution 함수를 완성해주세요.
 */

class Solution 
{
    public static int[] solution(int start_num, int end_num) 
    {
        int[] answer = {};
        answer = new int[end_num-start_num+1];
        for(int i=start_num;i<=end_num;i++)
        {
        	answer[i-start_num]=i;
        }
        return answer;
    }
    
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int start_num = sc.nextInt();
		
		System.out.println("두번째 정수를 입력하세요");
		int end_num = sc.nextInt();
		
		int[] arr = solution(start_num,end_num);
		System.out.println(Arrays.toString(arr));
	}
}