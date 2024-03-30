package Iv000;

/*
 * 문자열 before와 after가 매개변수로 주어질 때, 
 * before의 순서를 바꾸어 after를 만들 수 있으면 1을, 
 * 만들 수 없으면 0을 
 * return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution131 
{
    public static int solution(String before, String after) 
    {
        int answer = 0;
        int sum1=0;
        int sum2=0;
  
        for(int i=0;i<before.length();i++)
        {
            sum1=sum1+before.charAt(i);
        }
        
        for(int i=0;i<after.length();i++)
        {
            sum2=sum2+after.charAt(i);
        }

        if(sum1==sum2)
        {
            answer=1;
        }
       
        return answer;
    }

    public static void main(String[] args) 
    {
        String before = "allpe";
        String after = "apple";

        int result = solution(before, after);
        System.out.println(result);
    }
}
