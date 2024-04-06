package Iv0000;

import java.util.Arrays;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 각 원소에 두배한 원소를 가진 배열을 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution187 
{
    public static int[] solution(int[] numbers) 
    {
        int[] answer = {};
        answer = new int[numbers.length];

        for(int i=0; i<answer.length ;i++)
        {
            answer[i]=numbers[i]*2;
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 100, -99, 1, 2, 3};
        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    }
}
