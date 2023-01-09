class Solution {
    public int balancedStringSplit(String s) {
      int lcounter=0;
        int rcounter=0;
        int counter=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            rcounter++;
            else
                lcounter++;
            if(rcounter==lcounter)
                counter++;
        }
        return counter;
    }
}