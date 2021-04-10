/*
Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
*/
int deleteDigit(int n) {
ArrayList<Integer>g=new ArrayList<>();
String s=String.valueOf(n);
int i,j;
for(i=0;i<s.length();i++)
{ 
    String r="";
    for(j=0;j<s.length();j++)
    {
        if(i!=j)
        {
            r=r+s.charAt(j);
        }
    }
    int x=Integer.valueOf(r);
    g.add(x);
}
Collections.sort(g);
int max=g.get(g.size()-1);
return max;
}
