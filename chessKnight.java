/*
Given a position of a knight on the standard chessboard, find the number of different moves the knight can perform.

The knight can move to a square that is two squares horizontally and one square vertically, or two squares vertically and one square horizontally away from it. The complete move therefore looks like the letter L. Check out the image below to see all valid moves for a knight piece that is placed on one of the central squares.
*/
boolean safe(int x,int y)
{
    return(x>=0 && x<8 && y>=0 && y<8);
}
int chessKnight(String cell) {
int x=cell.charAt(0)-'a';
int y=(cell.charAt(1)-'0')-1;
int out=0;
if(safe(x-1,y+2)) out++;
if(safe(x-1,y-2)) out++;
if(safe(x-2,y+1)) out++;
if(safe(x-2,y-1)) out++;
if(safe(x+1,y+2)) out++;
if(safe(x+1,y-2)) out++;
if(safe(x+2,y+1)) out++;
if(safe(x+2,y-1)) out++;
return out;
}
