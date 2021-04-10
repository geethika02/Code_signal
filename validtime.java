/*
Check if the given string is a correct time representation of the 24-hour clock.
*/
boolean validTime(String s) {
    String r="";
    int i;
    for(i=0;i<2;i++)
    r=r+s.charAt(i);
    int y=Integer.valueOf(r);
    String g="";
    for(i=3;i<5;i++)
    g=g+s.charAt(i);
    int x=Integer.valueOf(g);
    if((y>=0 && y<=23)&&(x>=0 && x<60))
    return true;
    else 
    return false;
}
