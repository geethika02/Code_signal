/*Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.*/

boolean isLucky(int n) {
String s=String.valueOf(n);
int i,j,sum=0,p=0,l;
l=s.length();
for(i=0;i<l/2;i++)
{
   sum=sum+(s.charAt(i)-'\0'); 
}
for(j=l/2;j<l;j++)
{
   p=p+(s.charAt(j)-'\0'); 
}

if(p==sum)
return true;
else
return false;
}
