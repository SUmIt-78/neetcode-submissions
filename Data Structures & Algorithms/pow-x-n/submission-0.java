class Solution {

 public double myPow1(double x, int n) {
        int pow=Math.abs(n);
        if(n==0)return 1.0;
        double half=myPow1(x,n/2);
        if(n%2==0){
            return half*half;
        }
            return half*half*x;

    }

    public double myPow(double x, int n) {
    double res=myPow1(x,n);
    if(n<0){
        return 1.0/res;
    }
    return res;
    }
}
