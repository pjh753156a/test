package Iv000;

/*
 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
 * n명이 주문한 피자를 남기지 않고 
 * 모두 같은 수의 피자 조각을 먹어야 한다면 
 * 최소 몇 판을 시켜야 하는지를 
 * return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution159 
{
    public static int solution(int n) 
    {
        int answer = 0;
        int pizza_count=1;
        int pizza_num=6;

        while(true)
        {
            if(pizza_num%n==0)
            {
                break;
            }
            pizza_count++;
            pizza_num=pizza_num+6;
        }

        answer=pizza_count;

        return answer;
    }
 
    public static void main(String[] args) 
    {
        int n = 4;
        int result = solution(n);
        System.out.println(result);
    }
}
 