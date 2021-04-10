/*Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.*/

int adjacentElementsProduct(int[] a) {
    int i,r;
    int max=a[0]*a[1];
    for(i=1;i<a.length-1;i++)
    {
        r=a[i]*a[i+1];
        if(max<r)
        max=r;
    }
return max;
}
