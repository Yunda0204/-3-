class Solution {
    public int solution(int price) {
        
        price = (price >= 500000) ? price * 80 / 100 :
                (price >= 300000) ? price * 90 / 100 :
                (price >= 100000) ? price * 95 / 100 : price;
        
        return price;
    }
}