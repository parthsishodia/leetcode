class Solution {
    public int arrangeCoins(int n) {
        long left=0;
        long right=n;
        while(left<=right)
        {
            long mid=left+(right-left)/2;
            if(n>=(mid*(mid+1)/2))
                left=mid+1;
            else
                right=mid-1;
        }
        return (int)left-1;
    }
}