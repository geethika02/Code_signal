/*Given the string, check if it is a palindrome.*/

boolean checkPalindrome(String s) {
// int i,j;
// i=0;
// j=s.length()-1;
// while(i<j){
//     if(s.charAt(i)!=s.charAt(j))
//     {
//        return false;
//     }
//     i++;
//     j--;
// }
// return true;
// }
//or
StringBuilder si = new StringBuilder(s);
si.reverse();
String g=si.toString();
if(s.equals(g))
return true;
else
return false;
}
