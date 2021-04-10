/*Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.*/
int digitDegree(int n) {
    int c=0,r=0,s=0;
    if(n<=9)
    return 0;  
    else
    {
        while(n>9){
          c++;
          s=0;
          while(n>0){
              r=n%10;
            s=s+r;
            n=n/10;
          }
          n=s;
        }
    }
 return c;
}
