class Solution {
    public String restoreString(String s, int[] indices) {
        int n= s.length();
        char arr1[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr1[indices[i]]=s.charAt(i);
        }
        return new String(arr1);
    }
}