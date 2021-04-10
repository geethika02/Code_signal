/*An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.*/
boolean isIPv4Address(String s) { 
    int dot=0,i;
    for(i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='.')
            dot++;
    }
    if(dot!=3)
        return false;
   
    for(i=0;i<s.length();i++)
    {
         String g="";
        while(i<s.length()&&s.charAt(i)!='.')
        {
            boolean x=Character.isDigit(s.charAt(i));
            if(!x)
                return false;
            g=g+s.charAt(i);
            i++;
        } 
    
     if(g.isEmpty() || g.length()>3 || Integer.valueOf(g)<0 || Integer.valueOf(g)>255 || (g.length()>1 && g.charAt(0)=='0'))
            return false;
    }
    return true;
}
