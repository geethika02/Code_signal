/*Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar*/

boolean areSimilar(int[] a, int[] b) {
    int co=0,i;
    int c[]=a.clone();
    int d[]=b.clone();
  Arrays.sort(c);
 Arrays.sort(d);
 if(!Arrays.equals(c,d))
 return false;
for(i=0;i<a.length;i++)
{
    if(a[i]!=b[i])
    co++;
}
if(co==2 || co==0)
return true;
else 
return false;
}
