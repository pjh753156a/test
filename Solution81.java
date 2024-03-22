package lv00;

/*
 * 정수 리스트 num_list와 찾으려는 정수 n이 주어질 때, 
 * num_list안에 n이 있으면 1을 없으면 0을 return
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution81 
{
    public static int solution(int[] num_list, int n) 
    {
        int answer = 0;
        for(int i=0;i<num_list.length;i++)
        {
        	if(num_list[i]==n)
        	{
        		answer=1;
        	}
        }
        return answer;
    }
    
	public static void main(String[] args) 
	{
		int[] num_list = {1, 2, 3, 4, 5};
		int n = 3;
		int result = solution(num_list, n);
		System.out.println(result);
	}
}
