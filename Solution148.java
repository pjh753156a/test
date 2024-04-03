package Iv000;

import java.math.BigInteger;

/*
 * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 
 * 구슬은 모두 다르게 생겼습니다. 
 * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 
 * share이 매개변수로 주어질 때, 
 * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 
 * return 하는 solution 함수를 완성해주세요.
 */

public class Solution148 
{
    public static int solution(int balls, int share) 
    {
        int answer = 0;
        BigInteger ballscount = BigInteger.valueOf(1); 
        BigInteger sharecount = BigInteger.valueOf(1); 
        BigInteger ballscountmsharecount = BigInteger.valueOf(1); 
        int i;
    

        for(i = balls; i>=1; i--)
        {
            ballscount= ballscount.multiply(BigInteger.valueOf(i));
        }


        for(i = balls-share; i>=1; i--)
        {
            ballscountmsharecount=ballscountmsharecount.multiply(BigInteger.valueOf(i));
        }



        for(i = share; i>=1; i--)
        {
            sharecount=sharecount.multiply(BigInteger.valueOf(i));
        }

        answer = ballscount.divide(ballscountmsharecount.multiply(sharecount)).intValue();
        


        return answer;
    }

    public static void main(String[] args) 
    {
        int balls = 3;
        int share = 2;
        int result = solution(balls, share);
        System.out.println(result);
    }
}
