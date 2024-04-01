package programmers2;

/*
 * 선분 3개가 평행하게 놓여 있습니다. 
 * 세 선분의 시작과 끝 좌표가 [[start, end], [start, end], [start, end]] 
 * 형태로 들어있는 2차원 배열 lines가 매개변수로 주어질 때, 
 * 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 
 * solution 함수를 완성해보세요.
 * lines가 [[0, 2], [-3, -1], [-2, 1]]일 때 
 * 그림으로 나타내면 다음과 같습니다.
 * 선분이 두 개 이상 겹친 곳은 
 * [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
 */

public class Solution138
{
    public int solution(int[][] lines) 
    {
        // 각 좌표에 대한 출현 횟수를 기록할 배열 생성
        int[] counts = new int[201]; // 좌표 범위: -100부터 100까지이므로 총 201개의 가능한 좌표
        
        // 각 선분의 시작과 끝점에 해당하는 좌표에 대해 출현 횟수 기록
        for (int[] line : lines)
        {
            for (int i = line[0] + 100; i < line[1] + 100; i++) 
            {
                counts[i]++;
            }
        }
        
        // 겹치는 부분의 길이 계산
        int overlapLength = 0;
        for (int count : counts) 
        {
            if (count >= 2) 
            { // 출현 횟수가 2 이상인 좌표는 겹치는 부분
                overlapLength++;
            }
        }
        
        return overlapLength;
    }

    public static void main(String[] args) 
    {
        Solution138 solution = new Solution138();
        int[][] lines1 = {{0, 1}, {2, 5}, {3, 9}};
        
        System.out.println(solution.solution(lines1)); // 예상 출력: 2
    }
}
