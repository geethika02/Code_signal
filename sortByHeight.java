/*Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].*/

int[] sortByHeight(int[] a) {
    int b[]=a.clone();
    Arrays.sort(a);
    ArrayList<Integer>g=new ArrayList<>();
   for(int i:a)
   {if(i!=-1)
   {g.add(i);}}
   for(int i=0,j=0;i<b.length;i++)
   {
       if(b[i]!=-1){
           b[i]=g.get(j);
           j++;
       }
   }
   return b;
}
