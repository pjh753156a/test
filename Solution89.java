package lv00;

public class Solution89
{
    public static int[][] solution(int n) 
    {
        int[][] answer = new int[n][n];

        int value = 1; // 배열에 채워 넣을 값
        int row = 0; // 현재 행 인덱스
        int col = 0; // 현재 열 인덱스
        int direction = 0; // 이동 방향 (0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위)

        for (int i = 0; i < n * n; i++) 
        {
            answer[row][col] = value++;

            // 다음 위치 계산
            if (direction == 0) 
            {
                if (col + 1 >= n || answer[row][col + 1] != 0) 
                {
                    direction = 1;
                    row++;
                } 
                else 
                {
                    col++;
                }
            } 
            else if (direction == 1)
            {
                if (row + 1 >= n || answer[row + 1][col] != 0) 
                {
                    direction = 2;
                    col--;
                } 
                else 
                {
                    row++;
                }
            } 
            else if (direction == 2) 
            {
                if (col - 1 < 0 || answer[row][col - 1] != 0) 
                {
                    direction = 3;
                    row--;
                } 
                else 
                {
                    col--;
                }
            } 
            else if (direction == 3) 
            {
                if (row - 1 < 0 || answer[row - 1][col] != 0) 
                {
                    direction = 0;
                    col++;
                } 
                else 
                {
                    row--;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        int n = 4;
        int[][] result1 = solution(n);

        // 결과 출력
        System.out.println("n = " + n);
        for (int[] row : result1) 
        {
            for (int num : row) 
            {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }
}
