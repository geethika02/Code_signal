/*Given two strings, find the number of common characters between them.*/

int commonCharacterCount(String s1, String s2) {
    int c=0;
    ArrayList<Character>g=new ArrayList<>(); 
    ArrayList<Character>g1=new ArrayList<>();
    
    for(int i=0;i<s1.length();i++) 
        g.add(s1.charAt(i));    
    
    for(int i=0;i<s2.length();i++) 
        g1.add(s2.charAt(i));
    
    for(int i=0;i<g.size();i++){        
        for(int j=0;j<g1.size();j++){
            if(g.get(i)==g1.get(j)){
                c++;                        
                g1.remove(j);  
                 break; 
            }
        }
    }
    return c; 
} 
