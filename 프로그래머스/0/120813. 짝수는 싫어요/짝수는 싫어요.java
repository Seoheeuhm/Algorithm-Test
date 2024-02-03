import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>(); // ArrayList 인스턴스 생성
        for(int i=1; i <= n;i++){ // 1~n 까지 반복
            if(i%2 == 1){ // 홀수인수는 조건을 통과해서
                answer.add(i); // answer 배열에추가
            }
        } 
        return answer.stream().mapToInt(x -> x).toArray(); // ArrayList 를 Array로 변경해서 return
    }
}