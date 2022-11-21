class Solution {
    public int addDigits(int num) {
        if(num<10)
            return num;
        while(num>9){
            int s=0;
            while(num>0){
                int d=num%10;
                s+=d;
                num/=10;
            }
            num=s;
            if(s<=9)
                return s;
        }
        return 1;
    }
}