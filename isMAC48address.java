/*A media access control address (MAC address) is a unique identifier assigned to network interfaces for communications on the physical network segment.

The standard (IEEE 802) format for printing MAC-48 addresses in human-friendly form is six groups of two hexadecimal digits (0 to 9 or A to F), separated by hyphens (e.g. 01-23-45-67-89-AB).

Your task is to check by given string inputString whether it corresponds to MAC-48 address or not.
*/
boolean isMAC48Address(String s) {
return s.matches("[0-9A-F]{2}(-[0-9A-F]{2})*");
/*int i,c=0;
for(i=0;i<s.length();i++)
{
    if(s.charAt(i)=='-')
    c++;
}
if(c!=5)
return false;
 for(i=0;i<s.length();i++){
     String r="";
     while(i<s.length() && s.charAt(i)!='-')
     {
         if(!(s.charAt(i)>='0' && s.charAt(i)<='9')&&!(s.charAt(i)>='A' && s.charAt(i)<='F'))
         return false;
         r=r+s.charAt(i);
         i++;
     }
     if(r.length()!=2)
     return false;
 }
 return true;
}*/
}
