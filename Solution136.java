package Iv000;

/*
 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
 * 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
 * 정수가 담긴 배열 numlist와 정수 n이 주어질 때 
 * numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 
 * return하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;

public class Solution136
{
    public int[] solution(int[] numlist, int n) 
    {
         int[] distances = new int[numlist.length];

         // 각 원소와 n 사이의 거리 계산
         for (int i = 0; i < numlist.length; i++) 
         {
             distances[i] = Math.abs(numlist[i] - n);
         }

         // 거리에 따라 정렬
         for (int i = 0; i < numlist.length - 1; i++) 
         {
             for (int j = i + 1; j < numlist.length; j++) 
             {
                 if (distances[i] > distances[j] || (distances[i] == distances[j] && numlist[i] < numlist[j])) 
                 {
                     // 거리가 다르거나 거리가 같은 경우에는 더 큰 수가 앞에 오도록 정렬
                     int temp = numlist[i];
                     numlist[i] = numlist[j];
                     numlist[j] = temp;

                     // 거리 정보도 함께 위치를 변경
                     temp = distances[i];
                     distances[i] = distances[j];
                     distances[j] = temp;
                 }
             }
         }
         return numlist;
     }

     public static void main(String[] args) 
     {
         Solution136 solution = new Solution136();

         // Test Case 1
         int[] numlist1 = {1, 2, 3, 4, 5, 6};
         int n1 = 4;
         int[] result1 = solution.solution(numlist1, n1);
         System.out.println(Arrays.toString(result1)); // [4, 5, 3, 6, 2, 1]
     }
}
