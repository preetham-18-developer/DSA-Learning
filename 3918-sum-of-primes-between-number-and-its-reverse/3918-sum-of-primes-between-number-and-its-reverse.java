class Solution {
    public int sumOfPrimesInRange(int n) {
        int num =0;
        int temp =n;
        while(temp > 0){
            num = num * 10 +(temp % 10);
            temp/=10;
        }

        int start = Math.min(n,num);
        int end = Math.max(n,num);
        int sum =0;

        for(int no = start;no<= end ;no++){
        if(no < 2) continue;
boolean prime = true;
        for(int  i=2 ;i<= Math.sqrt(no);i++){
            if(no % i == 0) {
                prime = false;
               break;
        }
        }
            if(prime){
                sum += no;
            }
        }
        return sum;
    }
}