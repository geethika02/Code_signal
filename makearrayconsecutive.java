/*Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.*/

int makeArrayConsecutive2(int[] a) {
    Arrays.sort(a);
  int p=a.length;
  int r=a[p-1]-a[0]+1;
//   int y=p-r;
//   if(y<0)
//   return(y*-1);
//   else
//   return y;
    return Math.abs(p-r);
    }

