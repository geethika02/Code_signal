/*Given a string, output its longest prefix which contains only digits.*/
String longestDigitsPrefix(String s) {
    char c[]=s.toCharArray();
    int i,j=0,l=0;
    for(i=0;i<c.length;i++){
        if((c[i]>='0' && c[i]<='9'))
        l++;
        else
        break;
    }
    char g[]=new char[l];
    for(i=0;i<c.length;i++){
        if((c[i]>='0' && c[i]<='9'))
        {
            g[j]=c[i];
            j++;
        } 
        else
        break;
    }
String f=new String(g);
return f;
}
