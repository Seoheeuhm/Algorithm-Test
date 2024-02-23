import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        // 나누어 떨어지는 원소의 개수를 계산
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        // 나누어 떨어지는 원소가 없을 경우 -1을 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 나누어 떨어지는 원소를 저장할 배열 생성
        answer = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                answer[index++] = num;
            }
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(answer);

        return answer;
    }
}
