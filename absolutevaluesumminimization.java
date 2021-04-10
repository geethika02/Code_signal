/*
Given a sorted array of integers a, your task is to determine which element of a is closest to all other values of a. In other words, find the element x in a, which minimizes the following sum:
*/
int absoluteValuesSumMinimization(int[] a) {
   int i,j,x=a[0],min=0,sum=0,g=a[0]; 
for(i=0;i<a.length;i++)
{
    min=min+Math.abs(a[0]-a[i]);
}
for(i=1;i<a.length;i++)
{
    sum=0;
    x=a[i];
    for(j=0;j<a.length;j++)
    {
        sum=sum+Math.abs(a[i]-a[j]);
    }
  if(min>sum)
  {
      min=sum;
      g=x;
  }  
}
return g;
}
