class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int arrLength = absolutes.length;

        for(int i=0;i<arrLength;i++){
            //해당 인덱스 값이 true인 지 false인 지 확인
            if(signs[i]){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}