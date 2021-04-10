/*CodeMaster has just returned from shopping. He scanned the check of the items he bought and gave the resulting string to Ratiorg to figure out the total number of purchased items. Since Ratiorg is a bot he is definitely going to automate it, so he needs a program that sums up all the numbers which appear in the given input.

Help Ratiorg by writing a function that returns the sum of numbers that appear in the given inputString.
*/
int sumUpNumbers(String s) {
   int sum=0,i;
    ArrayList<Integer> g=new ArrayList<>();
    for(i=0;i<s.length();i++){
        int x=0;
        while(i<s.length() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
        {
            x=(x*10)+(s.charAt(i)-'0');
            i++;
        }
        g.add(x);
    }
    for(i=0;i<g.size();i++)
    sum=sum+g.get(i);
    return sum;

}
