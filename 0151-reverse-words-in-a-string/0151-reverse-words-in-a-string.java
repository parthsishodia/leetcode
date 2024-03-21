class Solution {
    public String reverseWords(String s) {
        String s2="";
        int len=s.length()-1;
        while(len>=0)
        {
        while(len>=0 && s.charAt(len) == ' ')
            len--;
            int j=len;
            if(len<0)
                break;
            while(len>=0 && s.charAt(len)!= ' ')
                len--;
            
                if(s2.isEmpty())
                {
                    s2=s2.concat(s.substring(len+1,j+1));
                }
            else
            {
                s2=s2.concat(" "+s.substring(len+1,j+1));
            }
            
        }
        return s2;
        
        
    }
}