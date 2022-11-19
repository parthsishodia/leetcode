class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> hey=new ArrayList<>();
        for(int i=left;i<=right;i++)
            if(isgreat(i))
                hey.add(i);
        return hey;
    }
    public static boolean isgreat(int n){
        int num=n;
        while(n>0){
            int digit=n%10;
            if(digit==0 || num%digit!=0)
                return false;
            n=n/10;  
        }
        return true;
    }
}