/*Given an array of integers, replace all the occurrences of elemToReplace with substitutionElem.*/
int[] arrayReplace(int[] a, int elemToReplace, int substitutionElem) {
int i;
for(i=0;i<a.length;i++)
{
    if(a[i]==elemToReplace)
    a[i]=substitutionElem;
}
return a;
}
