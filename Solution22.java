package lv0;

/*
 * 정수 start_num와 end_num가 주어질 때, 
 * start_num에서 end_num까지 1씩 감소하는 수들을 
 * 차례로 담은 리스트를 return
 * 하도록 solution 함수를 완성해주세요.
 */


import java.util.Arrays;

public class Solution22
{
	public static int[] solution(int start, int end_num) 
	{
        int[] answer = {};
        answer = new int[start-end_num+1];
        for(int i=0;i<answer.length;i++)
        {
        	answer[i]=start--;
        }
        return answer;
    }

	public static void main(String[] args) 
	{
		int start_num = 10;
		int end_num = 3;
		int[] result = solution(start_num,end_num);
		System.out.println(Arrays.toString(result));
	}

}
