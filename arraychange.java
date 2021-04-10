/*You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

Example

For inputArray = [1, 1, 1], the output should be
arrayChange(inputArray) = 3.*/

int arrayChange(int[] a) {
int c=0,i;
for(i=1;i<a.length;i++)
{
    if(a[i-1]>=a[i])
    {
     int d=Math.abs(a[i-1]-a[i])+1;
     a[i]=a[i]+d;
     c=c+d;
    }  
}
return c;
}
