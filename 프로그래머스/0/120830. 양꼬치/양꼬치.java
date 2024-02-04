class Solution {
    public int solution(int n, int k) {
        int answer = 0;
    
        answer = n * 12000 + (int)(k - n/10) * 2000;
        return answer;
    }
}