/*
Correct variable names consist only of English letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.
*/
boolean variableName(String s) {
    int i;
     //return s.matches("[a-zA-Z_]+[a-zA-Z_0-9]*");
     char c[]=s.toCharArray();
     char g=c[0];
     if(g!='_' && !(g>=65 && g<=90) && !(g>=97 && g<=122))
     return false;
     for(i=1;i<c.length;i++)
     {
         g=c[i];
         if(g!='_' && !(g>=65 && g<=90) && !(g>=97 && g<=122) && !(g>=48 && g<=57))
         return false;
         
     }
     return true;
         }
