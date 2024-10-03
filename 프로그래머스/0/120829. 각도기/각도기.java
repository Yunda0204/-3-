class Solution {
    public int solution(int angle) {
        
        int a;
        
        if (angle > 0 && angle < 90) {
            a = 1;  
        } else if (angle == 90) {
            a = 2;  
        } else if (angle > 90 && angle < 180) {
            a = 3; 
        } else if (angle == 180) {
            a = 4;  
        } else {
            return -1; 
        }
        
        switch (a) {
            case 1:
                return 1;  
            case 2:
                return 2;  
            case 3:
                return 3;  
            case 4:
                return 4;  
            default:
                return -1; 
        }
    }
}
