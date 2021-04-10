/*
Given an integer n, return the largest number that contains exactly n digits.
*/
int largestNumber(int n) {
int c;
c=(int)Math.pow(10,n);
return c-1;
}
