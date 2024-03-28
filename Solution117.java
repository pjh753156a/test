package Iv000;
import java.util.Arrays;

/*
 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
 * 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 
 * solution 함수를 완성해주세요.
 */

public class Solution117 
{
    public static int solution(String my_string) 
    {
        int answer = 0;
        String[] threenum = my_string.split(" ");
        System.out.println(Arrays.toString(threenum));

        answer=Integer.parseInt(threenum[0].trim());
        for(int i=0; i<threenum.length-1;i=i+2)
        {
            switch (threenum[i+1].trim()) 
            {
                case "+":
                    answer = answer + Integer.parseInt(threenum[i+2].trim());
                    break;
            
                case "-":
                    answer = answer - Integer.parseInt(threenum[i+2].trim());
                    break;
            }
        }

        return answer;
    }
    public static void main(String[] args) 
    {
        String my_String = "3 - 4 + 8 - 7";
        int result = solution(my_String);
        System.out.println(result);
    }
}
