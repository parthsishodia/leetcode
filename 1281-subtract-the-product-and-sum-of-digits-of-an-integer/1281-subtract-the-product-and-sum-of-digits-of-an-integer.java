class Solution {
    public int subtractProductAndSum(int n) {
        int num1=0;
        int sum=0;
        int prdct=1;
        while(n!=0)
        {
            num1=n%10;
            n=n/10;
            
            sum=sum+num1;
            prdct=prdct*num1;
            
            
        }
        return prdct-sum;
    }
}