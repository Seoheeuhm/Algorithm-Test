class Solution {
    public long solution(int price, int money, int count) {
        // 놀이기구를 count번 탔을 때의 총 이용료 계산
        long totalCost = (long) price * count * (count + 1) / 2;
        
        // 모자란 금액 계산
        long shortage = totalCost - money;
        
        // 모자란 금액이 음수면 0을 반환, 아니면 모자란 금액을 반환
        if (shortage > 0) {
            return shortage;
        } else {
            return 0;
        }
    }
}
