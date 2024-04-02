package Iv000;

import java.util.Arrays;

/*
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 
 * 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 */

public class Solution142 
{
    public static int solution(int[] array) 
    {
        int answer = 0;

        Arrays.sort(array); // 배열을 정렬
        
        int maxCount = 0; // 가장 많이 등장한 횟수
        int mode = -1; // 최빈값
        
        int count = 1; // 현재 숫자의 연속된 등장 횟수
        int prevNum = array[0]; // 이전 숫자
        
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] == prevNum) 
            {
                count++; // 같은 숫자가 연속해서 나오면 count 증가
            } 
            else 
            {
                // 현재 숫자가 이전 숫자와 다르면
                // 이전 숫자의 등장 횟수를 갱신하고 count 초기화
                if (count > maxCount) 
                {
                    maxCount = count;
                    mode = prevNum;
                } 
                else if (count == maxCount) 
                {
                    mode = -1; // 최빈값이 여러 개인 경우
                }
                count = 1;
                prevNum = array[i];
            }
        }
        
        // 마지막 원소 처리
        if (count > maxCount) 
        {
            mode = prevNum;
        } 
        else if (count == maxCount) 
        {
            mode = -1; // 최빈값이 여러 개인 경우
        }
        answer=mode;
        return answer;
    }

    public static void main(String[] args) 
    {
        int[] array = {1, 2, 3, 3, 3, 4};
        int result = solution(array);
        System.out.println(result);
    }
}
