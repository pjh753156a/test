package programmers2;

/*
 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 
 * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 
 * dots가 매개변수로 주어질 때, 
 * 직사각형의 넓이를 return 하도록 
 * solution 함수를 완성해보세요.
 */

public class Solution145 
{
	public static int solution(int[][] dots) 
	{
		int answer = 0;
		int bottom = 0;
		int height = 0;
		for(int i=0;i<dots.length-1;i++)
		{
			if(dots[i][0]!=dots[i+1][0])
			{
				bottom = Math.abs(dots[i+1][0]-dots[i][0]);
			}
		}
		
		for(int i=0;i<dots.length-1;i++)
		{
			if(dots[i][1]!=dots[i+1][1])
			{
				height = Math.abs(dots[i+1][1]-(dots[i][1]));
			}
		}
		answer = bottom*height;
	    return answer;
	}

	public static void main(String[] args) 
	{
		int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
		int result = solution(dots);
		System.out.println(result);
	}
}
