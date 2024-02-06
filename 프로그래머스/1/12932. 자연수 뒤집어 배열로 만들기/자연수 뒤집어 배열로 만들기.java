import java.util.Arrays;
class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n); // long 타입의 숫자를 문자열로 변환
        
        int[] answer = new int[s.length()];
        
        for(int i=0;i<answer.length;i++) {
            // 문자열의 끝에서부터 시작하여 각 자릿수를 정수로 변환하여 배열에 저장
            //s.substring(answer.length-1-i,answer.length-i) :문자열의 끝에서부터 역순으로 각 자릿수를 추출
            answer[i] = Integer.parseInt(s.substring(answer.length-1-i,answer.length-i)); 
        }
        
        return answer;
    }
}