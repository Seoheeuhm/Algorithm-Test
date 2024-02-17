class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        // 배열의 길이만큼 반복하여 각 요소를 곱한 값을 더함
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}
