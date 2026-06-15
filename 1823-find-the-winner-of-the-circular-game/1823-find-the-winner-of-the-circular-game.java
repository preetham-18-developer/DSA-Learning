class Solution {

    public int findTheWinner(int n, int k) {
        return check(n, k) + 1;
    }

    private int check(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (check(n - 1, k) + k) % n;
    }
}