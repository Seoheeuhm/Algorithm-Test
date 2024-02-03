class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int index = 0;
        answer = new int[num_list.length];
        
        for(int i = num_list.length-1;i>=0;i--) { //입력된 배열 역순 순회
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
}