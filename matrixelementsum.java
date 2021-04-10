/*After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).*/

int matrixElementsSum(int[][] a) {
    int i,j,s=0;
for(i=0;i<a.length;i++)
{
    for(j=0;j<a[i].length;j++)
    {
        if(i+1<a.length &&a[i][j]==0)
        a[i+1][j]=0;
        
        if(a[i][j]!=0)
       s=s+a[i][j]; 
    }
}

return s;
}
