package Iv0000;

/*
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 
 * return 하도록 solution 함수를 작성해주세요.
 */

public class Solution189 
{
    public static int solution(int n) 
    {
        int answer = 0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                answer=answer+i;
            }
        }
        return answer;
    }

    public static void main(String[] args) 
    {
        int n = 10;
        int result = solution(n);
        System.out.println(result);
    }
}
