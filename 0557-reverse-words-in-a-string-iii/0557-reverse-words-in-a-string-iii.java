class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        for(int i = 0; i<strings.length; i++){
            strings[i] = reverse(strings[i]);
        }    
 
        String res = "";
    
     
        for(int i = 0; i < strings.length; i++){
            res+=strings[i] + " ";
        }
 
        return res.trim();
    }
    public String reverse(String s){    
        return new StringBuilder(s).reverse().toString();
    }
}
