package programmers2;

/*
 * 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 
 * 분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다. 
 * 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
 * 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
 * 두 정수 a와 b가 매개변수로 주어질 때, 
 * a/b가 유한소수이면 1을, 무한소수라면 2를 
 * return 하도록 solution 함수를 완성해주세요.
 */

public class Solution137 
{
    public static int solution(int a, int b) 
    {
    	// 분자와 분모의 최대공약수 계산
        int gcd = getGCD(a, b);
        
        // 기약분수로 약분
        a = a / gcd;
        b = b / gcd;

        // 분모의 소인수가 2와 5만 있는지 확인
        while (b % 2 == 0)
        {
        	b = b /2;
        }
        while (b % 5 == 0)
        {
        	b = b / 5;
        }

        // 분모가 1이면 유한소수, 아니면 무한소수
        return (b == 1) ? 1 : 2;
    }

    // 최대공약수 계산하는 함수
    public static int getGCD(int a, int b) 
    {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }

    public static void main(String[] args) 
    {
        int a = 12;
        int b = 21;
        int result = solution(a, b);
        System.out.println(result); // 결과 출력
    }
}

