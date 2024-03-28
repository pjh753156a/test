package Iv000;

/*
 * 정수 num과 k가 매개변수로 주어질 때, 
 * num을 이루는 숫자 중에 k가 있으면 
 * num의 그 숫자가 있는 자리 수를 return하고 
 * 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 */

public class Solution115 
{
    public static int solution(int num, int k) 
    {
        int answer = 0;
        String strnum = Integer.toString(num);
        for(int i=0;i<strnum.length();i++)
        {
            answer++;
            if(Character.getNumericValue(strnum.charAt(i))==k)
            {
                return answer;
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        int num = 123456;
        int k = 7;
        int result = solution(num, k);
        System.out.println(result);
    }
}
