/*
Check if all digits of the given integer are even.
*/
boolean evenDigitsOnly(int n) {
//String s=String.valueOf(n);
int r;
while(n!=0)
{
    r=n%10;
    if(r%2!=0)
    {
        return false;
    }
    n=n/10;   
}
return true;
}
