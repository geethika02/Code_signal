/*Given array of integers, find the maximal possible sum of some of its k consecutive elements.*/
int arrayMaxConsecutiveSum(int[] a, int k) {
    int sum=0,i,max=0,j;
for(i=0;i<=a.length-k;i++)
{sum=0;
for(j=i;j<k+i;j++){
    sum=sum+a[j];
}
    
    if(max<sum)
    {
        max=sum;
    }
}
return max;
}
