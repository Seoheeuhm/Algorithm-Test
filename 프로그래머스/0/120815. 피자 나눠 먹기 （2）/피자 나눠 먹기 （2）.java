class Solution {
    public int solution(int n) {
        int k = 0; //최대공약수
        for(int i=1;i<=6;i++) {
            if(n%i==0 && 6%i==0) { //n으로도 나눠지고 6으로도 나눠짐
                k = i;
            }
        }
        int answer = n/k;
        return answer;
    }
}