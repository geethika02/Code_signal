/*Given array of integers, remove each kth element from it.*/
int[] extractEachKth(int[] a, int k){
    int i;
ArrayList <Integer> g=new ArrayList<Integer>();
for(i=0;i<a.length;i++)
{
    if((i+1)%k!=0)
    {
        g.add(a[i]);
    }
}
int r[]=new int[g.size()];
for(i=0;i<g.size();i++){
    r[i]=g.get(i);
}
return r;
}
/* int i,c=0,j=0;
for(i=0;i<a.length;i++)
{
    if((i+1)%k!=0)
    c++; 
}
int g[]=new int[c];
for(i=0;i<a.length;i++)
{
    if((i+1)%k!=0){
        g[j]=a[i];
        j++;
    }
}
return g;

}*/
