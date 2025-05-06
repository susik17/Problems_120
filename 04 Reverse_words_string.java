class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        //Base case-Single word only
        if(!s.contains(" ")){
            return s;
        }
        int i = s.indexOf(" ");
        //skip extra sapaces
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
        String first_word = s.substring(0,s.indexOf(' '));
        String rest = s.substring(i);
        return reverseWords(rest)+" "+first_word;
    }
}
/*
 Given a string, change the order of words in the string (last string should come first).
Should use RECURSION
  
Sample:   one two three 
Output :  three two one 
 */