/*Last night you partied a little too hard. Now there's a black and white photo of you that's about to go viral! You can't let this ruin your reputation, so you want to apply the box blur algorithm to the photo to hide its content.

The pixels in the input image are represented as integers. The algorithm distorts the input image in the following way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3 square that has its center at x, including x itself. All the pixels on the border of x are then removed.

Return the blurred image as an integer, with the fractions rounded down.*/
int[][] boxBlur(int[][] a) {
    int r=a.length;
    int i,j;
    int c=a[0].length;
    int b[][]=new int[r-2][c-2];
    for(i=1;i<r-1;i++)
    {
        for(j=1;j<c-1;j++)
        {
            b[i-1][j-1]=avg(a,i,j);
        }
    }
    return b;
}
public int avg(int a[][],int i,int j)
{
    return(a[i-1][j-1] +a[i-1][j] +a[i-1][j+1]+ a[i][j-1]+ a[i][j]+ a[i][j+1]+ a[i+1][j-1] +a[i+1][j]+ a[i+1][j+1])/9;
}
