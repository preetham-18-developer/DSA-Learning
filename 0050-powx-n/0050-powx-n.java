class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if(exp < 0){
            x = 1/x;
            exp = -exp;
        }
       
        return pro(x , exp , 1);
    }
    private double pro(double num , long power ,double ans){
        if(power == 0) return ans;
        if(power % 2 !=0 ){
            ans *= num;
        }

        return pro(num * num, power/2 ,ans);

    }
}