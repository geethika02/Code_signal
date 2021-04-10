/*
Given a string, return its encoding defined as follows:

First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
for example, "aabbbc" is divided into ["aa", "bbb", "c"]
Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
for example, substring "bbb" is replaced by "3b"
Finally, all the new strings are concatenated together in the same order and a new string is returned.
*/
String lineEncoding(String s) {
    int i,c=0;
    String g="";
    for(i=0;i<s.length();i++)
    {
        c=1;
        while(i<s.length()-1 && (s.charAt(i)==s.charAt(i+1)))
        {
            c++;
            i++;
        }
        if(c!=1)
        g=g+c;
        
        g=g+s.charAt(i);
        
    }
    return g;
}
     
