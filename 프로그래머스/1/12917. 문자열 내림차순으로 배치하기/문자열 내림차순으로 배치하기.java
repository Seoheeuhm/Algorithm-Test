import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray(); // 문자열을 문자 배열로 변환하여 arr 변수에 저장
        Arrays.sort(arr); // 문자 배열을 오름차순으로 정렬
        
        StringBuffer sb = new StringBuffer(new String(arr)); // 정렬된 문자 배열을 문자열로 변환한 후 StringBuffer에 저장
        String answer = sb.reverse().toString(); // StringBuffer를 뒤집고, 다시 문자열로 변환하여 answer 변수에 저장
        
        return answer;
    }
}
