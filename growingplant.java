/*
Caring for a plant can be hard work, but since you tend to it regularly, you have a plant that grows consistently. Each day, its height increases by a fixed amount represented by the integer upSpeed. But due to lack of sunlight, the plant decreases in height every night, by an amount represented by downSpeed.

Since you grew the plant from a seed, it started at height 0 initially. Given an integer desiredHeight, your task is to find how many days it'll take for the plant to reach this height.
*/
int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
int h=0,c=0;
while(h<=desiredHeight)
{
    h=h+upSpeed;
    c++;
    if(h>=desiredHeight)
    break;
    h=h-downSpeed;
}
return c;
}
