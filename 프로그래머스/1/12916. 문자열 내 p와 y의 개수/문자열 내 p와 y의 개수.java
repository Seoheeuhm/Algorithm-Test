class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int count = 0;
        
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'p')
                count++;
            if(s.charAt(i) == 'y') 
                count--;
        }
        if(count == 0)
            return true;
        else
            return false;
            
    }
}