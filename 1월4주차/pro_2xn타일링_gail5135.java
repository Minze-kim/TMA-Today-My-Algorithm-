class Solution {
    public int solution(int n) {
        int x = 1;
        int y = 2;
        int answer = 0;

        if (n == 1) {
            answer = x;
        } else if (n == 2) {
            answer = y;
        } else {
            for(int i = 3; i <= n; i++) {
                answer = x + y;

                x = y % 1000000007;
                y = answer % 1000000007;
            }
        }

        return (answer % 1000000007);
    }
}