/*Find the leftmost digit that occurs in a given string.*/
char firstDigit(String s) {
    char t='0';
    int i;
for(i=0;i<s.length();i++){
    if(s.charAt(i)>='0' && s.charAt(i)<='9' ){
        t=s.charAt(i);
        break;
    }
}
return t;
}
