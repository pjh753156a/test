package programmers2;

/*
 * 다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 
 * 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
 * 지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 
 * 지뢰가 없는 지역 0만 존재합니다.
 * 지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 
 * 안전한 지역의 칸 수를 return
 * 하도록 solution 함수를 완성해주세요.
 */

public class Solution140 
{
	public static int solution(int[][] board) 
	{
		int answer = 0;
		int n = board.length;
        int safeArea = 0;

        for (int i = 0; i < n * n; i++) 
        {
            int row = i / n;
            int col = i % n;

            if (board[row][col] == 0 && isSafe(board, row, col)) 
            {
                safeArea++;
            }
        }

        answer=safeArea;
    
    	return answer;
    }

    // 현재 위치 주변에 지뢰가 있는지 확인하는 함수
    public static boolean isSafe(int[][] board, int x, int y) 
    {
        int n = board.length;

        for (int dx = -1; dx <= 1; dx++) 
        {
            for (int dy = -1; dy <= 1; dy++) 
            {
                int nx = x + dx;
                int ny = y + dy;
                if (0 <= nx && nx < n && 0 <= ny && ny < n && board[nx][ny] == 1) 
                {
                    return false;
                }
            }
        }

        return true;
    }

	public static void main(String[] args) 
	{
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
		int result = solution(board);
		System.out.println(result);
	}
}
