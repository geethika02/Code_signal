/*Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).
*/
String alphabeticShift(String s) {
    int i;
    char c[]=s.toCharArray();
    for(i=0;i<c.length;i++)
    {
        if(c[i]=='z')
        c[i]='a';
        else
        c[i]++;
    }
    String a=new String(c);
    return a;
}
    
