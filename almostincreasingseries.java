/*Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.*/

boolean almostIncreasingSequence(int[] a) {
    int c=0,i,j;
    boolean x,y;
   int s=a.length;
for(i=0;i<s-1;i++)
{ 
    if(a[i]>=a[i+1]){
       c++;
       x=(i+2<s && a[i+2]<=a[i]);
       y=(i-1>=0 && a[i-1]>=a[i+1]);
    if(x&&y || c>=2)
    return false;
}}

return true;
}
