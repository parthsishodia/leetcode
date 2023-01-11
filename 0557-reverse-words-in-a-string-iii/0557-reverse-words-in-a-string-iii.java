class Solution {
    public String reverseWords(String s) {
        final int len=s.length();
        if(len==1)
        {
            return s;
        }
        int firstindex;
        int lastindex;
        char ch[]=s.toCharArray();
        char temp;
        for(int index=0;index<len;index++)
        {
            firstindex=index;
            while(++index<len && ch[index]!=' ');
                lastindex=index-1; 
            while(firstindex<lastindex)
            {
                temp=ch[firstindex];
                ch[firstindex++]=ch[lastindex];
                ch[lastindex--]=temp;
                
            }
        }
        return new String(ch);
    }
}