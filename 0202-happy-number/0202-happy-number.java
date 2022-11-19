class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> st=new HashSet<>();
        while(n!=1)
        {
            int current=n;
            int sum=0;
            while(current!=0)
            {
                sum=sum+(current%10)*(current%10);
                current=current/10;
                
            }
            if(st.contains(sum))
            {
                return false;
            }
            st.add(sum);
            n=sum;
            
        }
        return true;
    }
}