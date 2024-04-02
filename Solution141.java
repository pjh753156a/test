package Iv000;

import java.util.Arrays;

/*
 * 첫 번째 분수의 분자와 분모를 뜻하는 
 * numer1, denom1, 
 * 두 번째 분수의 분자와 분모를 뜻하는 
 * numer2, denom2가 매개변수로 주어집니다. 
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 
 * 분자와 분모를 순서대로 담은 배열을 
 * return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution141 
{
    // 최대공약수를 구하는 메서드
    public static int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 두 분수를 더하여 기약 분수로 만드는 메서드
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) 
    {
        int lcm = denom1 * denom2 / gcd(denom1, denom2); // 최소공배수 계산
        int numer = numer1 * (lcm / denom1) + numer2 * (lcm / denom2); // 분자 계산
        int gcd = gcd(numer, lcm); // 최대공약수 계산
        int[] answer = {numer / gcd, lcm / gcd}; // 기약 분수로 변환
        return answer;
    }

    public static void main(String[] args) 
    {
        int numer1=1;
        int denom1=2;
        int numer2=3;
        int denom2=4;
        int[] result = solution(numer1, denom1, numer2, denom2);
        System.out.println(Arrays.toString(result));
    }
}
