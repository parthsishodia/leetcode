class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(words.length!=pattern.length())
            return false;
        HashMap<Character,String> st=new HashMap();
        for(int i=0;i<pattern.length();i++){
            char current_char=pattern.charAt(i);
            if(st.containsKey(current_char)) {
                if(!st.get(current_char).equals(words[i])){
                    return false;}
            }  else{
                    if(st.containsValue(words[i])){
                        return false; }
                    st.put(current_char,words[i]);  }
            }
        return true;
    }
}