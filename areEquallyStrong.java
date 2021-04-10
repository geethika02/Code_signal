/*Call two arms equally strong if the heaviest weights they each are able to lift are equal.

Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.

Given your and your friend's arms' lifting capabilities find out if you two are equally strong.*/

boolean areEquallyStrong(int yl, int yr, int fl, int fr) {
if(yl==fl && yr==fr || yl==fr && yr==fl)
return true;
else
return false;
}
