/*
Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.
*/
String rreverse(String in)
{
      StringBuilder op=new StringBuilder(in);
      op.reverse();
      return op.toString();   
}
String buildPalindrome(String st) {
      if(rreverse(st).equals(st)) return st;
      
   char c[]=st.toCharArray();
   String sg = "", out = "";
	    for(int i=0;i<c.length;i++) { 
            sg=sg+c[i];
	        out = st+rreverse(sg);   
	        if(out.equals(rreverse(out))) break;
	    }
	    return out;
	}
