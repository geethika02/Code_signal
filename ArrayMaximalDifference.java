/*Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.*/
int arrayMaximalAdjacentDifference(int[] a) {
    int max=Math.abs(a[0]-a[1]);
    int diff=0,i;
for(i=1;i<a.length-1;i++)
{
    diff=Math.abs(a[i]-a[i+1]);
    if(diff>max)
    {
        max=diff;
    }
}
return max;
}
