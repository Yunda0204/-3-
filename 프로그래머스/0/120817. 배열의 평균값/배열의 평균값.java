class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        
        for (int number : numbers) {
            sum += number;
        }
        
        double answer = sum / numbers.length;
        
        return answer;
    }
}

        // return Arrays.stream(numbers).average().orElse(0);
        // 스트림 기본문법이라 함
