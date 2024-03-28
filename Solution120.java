package Iv000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 정수 n이 매개변수로 주어질 때, 
 * n의 약수를 오름차순으로 담은 배열을 return하도록
 * solution 함수를 완성해주세요.
 */

public class Solution120 {
    public static int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 24;
        int[] result = solution(n);
        System.out.println(Arrays.toString(result));
    }
}
