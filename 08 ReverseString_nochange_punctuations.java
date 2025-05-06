class Main {
    //3.two pointers
    static void reverseByBuilding(String s) {
    String p = "@,.:?";
    int i = 0, j = s.length() - 1;
    StringBuilder result = new StringBuilder();

    while (i < s.length()) {
        char c = s.charAt(i);
        if (c == ' ' || p.indexOf(c) != -1) {
            result.append(c);
        } else {
            // move j to find next normal char
            while (j >= 0 && (s.charAt(j) == ' ' || p.indexOf(s.charAt(j)) != -1)) {
                j--;
            }
            result.append(s.charAt(j));
            j--;
        }
        i++;
    }
    System.out.println(result.toString());
}

    /*
    //2.Using stack
    static void reverseUsingStack(String s) {
    String p = "@,.:?";
    Stack<Character> stack = new Stack<>();

    // Push only normal characters (not space/punctuation)
    for (char c : s.toCharArray()) {
        if (c != ' ' && p.indexOf(c) == -1) {
            stack.push(c);
        }
    }

    StringBuilder result = new StringBuilder();
    for (char c : s.toCharArray()) {
        if (c == ' ' || p.indexOf(c) != -1) {
            result.append(c);  // keep punctuation/space as is
        } else {
            result.append(stack.pop());  // reverse letters/numbers
        }
    }
    System.out.println(result.toString());
}

    1.Brute - mine
    static void reverse_nochange_punctuation(String s){
        String p = "@,.:?";
        int n = s.length();
        int i = 0,j = n-1;
        char Space_char = ' ';
        char ch[] = s.toCharArray();
        //StringBuilder sb = new StringBuilder(s);
        while(i<=j){
            if(s.charAt(i)==Space_char|| s.charAt(j)==Space_char){
                if(s.charAt(i)==Space_char){
                    i++;
                 }
                else{ j--;}
            }
            else if(p.indexOf(s.charAt(i))!=-1||p.indexOf(s.charAt(j))!=-1 ){
                if(p.indexOf(s.charAt(i))!=-1){
                    i++;
                   }
                else{ j--;}
            }
            else{
                //swap
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
                // swap using StringBuilder's setCharAt
               //char temp = sb.charAt(i);
               //sb.setCharAt(i, sb.charAt(j));
               //sb.setCharAt(j, temp);
            }
        }
        System.out.println(new String(ch));
        
    }
    */
    public static void main(String[] args) {
        String s = "house no : 123@ cbe";
        reverse_nochange_punctuation(s);
    }
}