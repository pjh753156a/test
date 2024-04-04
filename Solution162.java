package Iv0000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
 * return하도록 solution 함수를 완성해주세요.
 */

public class Solution162 
{
    public static int solution(int[] numbers) 
    {
        int answer = 0;
        int max = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length;j++)
            {
                if(j!=i)
                {
                    list.add(numbers[i]*numbers[j]);
                }
            }
        }

        answer=Collections.max(list);
        
        return answer;
    }

    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, -3, 4, -5};
        int result = solution(numbers);
        System.out.println(result);
    }
}
