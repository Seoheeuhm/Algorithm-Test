class Solution {
    public String solution(int n) {
        String answer = "";

        // "수박" 패턴을 만들기 위해 n번 반복
        for (int i = 0; i < n; i++) {
            // 짝수 인덱스일 때 "수"를 추가, 홀수 인덱스일 때 "박"을 추가
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }

        
        return answer;
    }
}
