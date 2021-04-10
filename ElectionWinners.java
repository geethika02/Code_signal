/*
Elections are in progress!

Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.

The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.
*/
int electionsWinners(int[] votes, int k) {
    int a[]=votes.clone();
    Arrays.sort(a);
    int c=0,i;
if(k==0){
    for(i=0;i<votes.length;i++)
    {
        if(votes[i]==a[a.length-1])
        c++;
    }
    if(c>=2)
    return 0;
    else 
    return c;
}
else{
    for(i=0;i<votes.length;i++)
    {
        if((votes[i]+k)>a[a.length-1])
        c++;
    }
    return c;
}
}
