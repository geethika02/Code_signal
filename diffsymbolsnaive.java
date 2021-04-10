/*Given a string, find the number of different characters in it.*/
int differentSymbolsNaive(String s) {
char c[]=s.toCharArray();
int f=1,i;
Arrays.sort(c);
for(i=0;i<c.length-1;i++)
{
 if(c[i]!=c[i+1])
 f++;
}
return f;
}
