class Solution {
    public boolean isPowerOfFour(int n) {
       int power = 0;
        return check(n , power); 
    }
    private boolean check(int n, int power){
        if(n == Math.pow(4,power)) return true;

        if(n < Math.pow(4,power)) return false;

        return check(n , power +1);
    }
}