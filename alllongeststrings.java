/*Given an array of strings, return another array containing all of its longest strings.*/

String[] allLongestStrings(String[] s) {
    if(s.length==1)
        return s;
    int u=s.length,c=0;
    int max=s[0].length();
for(int i=0;i<u;i++)
{
   int l=s[i].length();
   if(max==l)
    c++;
    if(l>max){
    max=l;
    c=1;
    }
}  
String n[]=new String[c];
for(int i=0,j=0;i<s.length;i++)
{
    if(s[i].length()==max){
    n[j]=s[i];
    j++;
    }
}
return n;
}
