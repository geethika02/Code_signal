/*
You have deposited a specific amount of money into your bank account. Each year your balance increases at the same growth rate. With the assumption that you don't make any additional deposits, find out how long it would take for your balance to pass a specific threshold.
*/
int depositProfit(int deposit, int rate, int threshold) {
int c=0;
double r=deposit;
while(r<threshold)
{
   r=r+(r*rate)/100;
    c++;
}
return c;
}
