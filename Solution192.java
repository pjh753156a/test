package Iv0000;

/*
 * 정수 num1, num2가 매개변수로 주어질 때, 
 * num1를 num2로 나눈 나머지를 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution192 
{
    public static int solution(int num1, int num2) 
    {
        int answer = -1;
        answer=num1%num2;
        return answer;
    }

    public static void main(String[] args) 
    {
        int num1 = 3;
        int num2 = 2;
        int result = solution(num1, num2);
        System.out.println(result);
    }
}
