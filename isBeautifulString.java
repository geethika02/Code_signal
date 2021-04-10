/*
A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc. Note that letter a has no previous letter.

Given a string, check whether it is beautiful.
*/
boolean isBeautifulString(String s) {
  int a[]=new int[26];
  int i;
  for(i=0;i<s.length();i++)
  {
      a[s.charAt(i)-'a']++;
  }  
  for(i=0;i<25;i++)
  {
      if(a[i]<a[i+1])
      return false;
  }
  return true;
}
