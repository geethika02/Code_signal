/*Define a word as a sequence of consecutive English letters. Find the longest word from the given string.*/
String longestWord(String text) {
String rg="";
int i,max=0;
for(i=0;i<text.length();i++)
{   String r="";
    while(i<text.length() && ((text.charAt(i)>='a' && text.charAt(i)<='z')||(text.charAt(i)>='A' && text.charAt(i)<='Z')))
    {
        r=r+text.charAt(i);
        i++;
    }
    if(max<r.length())
    {
        max=r.length();
        rg=r;
    }

}
return rg;

}
