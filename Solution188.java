package Iv0000;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소의 평균값을 return 
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution188 
{
    public static double solution(int[] numbers) 
    {
        double answer = 0;
        double sum = 0;

        for(int i=0; i<numbers.length;i++)
        {
            sum = sum + numbers[i];
        }
        
        answer = sum/numbers.length;

        return answer;
    }

    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = solution(numbers);
        System.out.println(result);
    }
}
