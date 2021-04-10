/*
An email address such as "John.Smith@example.com" is made up of a local part ("John.Smith"), an "@" symbol, then a domain part ("example.com").

The domain name part of an email address may only consist of letters, digits, hyphens and dots. The local part, however, also allows a lot of different special characters. Here you can look at several examples of correct and incorrect email addresses.

Given a valid email address, find its domain part.
*/
String findEmailDomain(String s) {
   // int x=address.indexOf('@');
   int x=0,i;
   for(i=0;i<s.length();i++)
   {
       if(s.charAt(i)=='@')
       {
           x=i;
           
       }
   }
   String r="";
    for(i=x+1;i<s.length();i++)
    {
        r=r+s.charAt(i);
      
    }
    return r;
}
