class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int hol = 0;
        int jjak = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                hol++;
            }
            else {
                jjak++;
            }
        }
        
        answer[0] = hol;
        answer[1] = jjak;
        return answer;
    }
}