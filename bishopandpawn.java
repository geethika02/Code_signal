/*Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

The bishop has no restrictions in distance for each move, but is limited to diagonal movement. */
boolean bishopAndPawn(String bishop, String pawn) {
 int x1=bishop.charAt(0)-'a';
 int x2=bishop.charAt(1)-'0';
 int y1=pawn.charAt(0)-'a';
 int y2=pawn.charAt(1)-'0';
 return(Math.abs(x1-y1)==Math.abs(x2-y2));
 
}
