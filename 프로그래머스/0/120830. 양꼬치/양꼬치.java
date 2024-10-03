class Solution {
    public int solution(int n, int k) {
        
        int lamb = n * 12000;
        
        int freeDrink = n / 10;
        
        int TenDrink = k - freeDrink;
        
        if(TenDrink < 0){
            TenDrink = 0;
        }
        
        int drink = TenDrink * 2000;
        
        int answer = lamb + drink;
        
        return answer;
    }
}