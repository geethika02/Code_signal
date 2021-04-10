/*
You found two items in a treasure chest! The first item weighs weight1 and is worth value1, and the second item weighs weight2 and is worth value2. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is maxW and you can't come back for the items later?
*/
int knapsackLight(int v1, int w1, int v2, int w2, int max) {
if(max>=w1+w2)
return(v1+v2);
else if(max>=w1 && max>=w2)
{
    if(v1>v2)
    return v1;
    else
    return v2;
}
else if(max<w1 && max<w2)
return 0;
else if(max<w1 && max>=w2) 
return(v2);
else
return v1;
}
