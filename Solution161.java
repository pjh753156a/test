package Iv000;

import java.util.Arrays;

/*
 * 정수가 담긴 배열 numbers와 문자열 direction가 
 * 매개변수로 주어집니다. 
 * 배열 numbers의 원소를 direction방향으로 
 * 한 칸씩 회전시킨 배열을 return 하도록 
 * solution 함수를 완성해주세요.
 */

public class Solution161 
{
    public static int[] solution(int[] numbers, String direction) 
    {
        int[] answer = {};
        answer = new int[numbers.length];

        if(direction.equals("right"))
        {
            for(int i=0;i<numbers.length;i++)
            {
                if(i==0)
                {
                    answer[i]=numbers[numbers.length-1];
                }
                else  
                {
                    answer[i]=numbers[i-1];
                }
            }
        }
        else if(direction.equals("left"))
        {
            for(int i=0;i<numbers.length;i++)
            {
                if(i==numbers.length-1)
                {
                    answer[i]=numbers[0];
                }
                else  
                {
                    answer[i]=numbers[i+1];
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) 
    {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        String direction = "left";
        int[] result = solution(numbers, direction);
        System.out.println(Arrays.toString(result));
    }
}
