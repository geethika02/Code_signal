/*
Given two cells on the standard chess board, determine whether they have the same color or not.
*/
boolean chessBoardCellColor(String s, String r) {
int x1=s.charAt(0)-'A';
int x2=s.charAt(1)-'\0';
int y1=r.charAt(0)-'A';
int y2=r.charAt(1)-'\0';
return((x1+x2)%2 == (y1+y2)%2);
}
