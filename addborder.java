/*Given a rectangular matrix of characters, add a border of asterisks(*) to it.*/

String[] addBorder(String[] s) {
    int i;
    int l=s.length;
String r[]=new String[l+2];
int y=s[0].length();
r[0]="*";
r[l+1]="*";
for(i=0;i<y+1;i++)
{
   
    r[0]=r[0]+"*";
    r[l+1]=r[l+1]+"*";
}
for(i=0;i<s.length;i++)
{
   r[i+1]="*"+s[i]+"*";
}
return r;
}
