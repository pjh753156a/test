package lv0;

/*
 * 1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 
 * 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
	네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
	세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 
	나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
	주사위가 두 개씩 같은 값이 나오고, 
	나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
	어느 두 주사위에서 나온 숫자가 p로 같고 나머지 
	두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
	네 주사위에 적힌 숫자가 모두 다르다면 
	나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
	네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 
	얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 */

import java.util.Arrays;

public class Solution5
{
    public static int solution(int a, int b, int c, int d) 
    {
        // 네 주사위의 결과를 배열에 저장하고 정렬합니다.
    	int answer=0;
        int[] diceResults = {a, b, c, d};
        Arrays.sort(diceResults);

        // 주사위 결과에 따른 점수를 계산합니다.
        int score = 0;

        if (diceResults[0] == diceResults[3]) 
        {
            // Case 1: 네 주사위의 결과가 모두 같은 경우
            score = diceResults[0] * 1111;
        } 
        else if (diceResults[0] == diceResults[2] && diceResults[3] != diceResults[0]) 
        {
            // Case 2: 세 주사위의 결과가 같고 나머지 하나가 다른 경우
            int p = diceResults[0];
            int q = diceResults[3];
            score = (10 * p + q) * (10 * p + q);
        }
        else if (diceResults[1] == diceResults[3] && diceResults[0] != diceResults[3])
        {
        	int p = diceResults[1];
            int q = diceResults[0];
            score = (10 * p + q) * (10 * p + q);
        }
        else if (diceResults[0] == diceResults[1] && diceResults[2] == diceResults[3])
        {
            // Case 3: 두 쌍의 주사위의 결과가 같은 경우
            int p = diceResults[0];
            int q = diceResults[2];
            score = (p + q) * Math.abs(p - q);
        } 
        else if (diceResults[0] == diceResults[1] && diceResults[2] != diceResults[3]) 
        {
            // Case 4: 두 쌍의 주사위가 서로 다른 경우
          
            int q = diceResults[2];
            int r = diceResults[3];
            score = q * r;
        } 
        else if (diceResults[1] == diceResults[2] && diceResults[0] != diceResults[3]) 
        {
            // Case 4: 두 쌍의 주사위가 서로 다른 경우
           
            int q = diceResults[0];
            int r = diceResults[3];
            score = q * r;
        } 
        else if (diceResults[2] == diceResults[3] && diceResults[0] != diceResults[1]) 
        {
            // Case 4: 두 쌍의 주사위가 서로 다른 경우
           
            int q = diceResults[0];
            int r = diceResults[1];
            score = q * r;
        } 
        else
        {
            // Case 5: 모든 주사위의 결과가 다른 경우
            score = diceResults[0];
        }
        answer = score;
        return answer;
    }

    public static void main(String[] args) 
    {
        int a = 1, b = 2, c = 3, d = 4;
        System.out.println("Score: " + solution(a, b, c, d)); // 예시 입력에 대한 점수 출력
    }
}
