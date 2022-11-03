class Solution {
    public boolean isValid(String s) {
        	 char[] charec= s.toCharArray();
	 Stack<Character> stack =new Stack<>();
	 for(char element : charec)
	 {
	     if(element=='('||element=='['||element=='{')
	     {
	         stack.push(element);
	         continue;
	     }
	     else if(stack.empty())
	     {
	         return false;
	     }
	     char top= stack.pop();
	     if(top=='(' && element!=')')
	     {
	     return false;
	 }
	 if(top=='{' && element!='}')
	 {
	     return false;
	 }
	 if(top=='[' && element!=']')
	 {
	     return false;
	 }
	}
	return stack.empty();
}
}