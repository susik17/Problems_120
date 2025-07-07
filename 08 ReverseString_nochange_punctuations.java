class Main {
    // optimized -  rather checking for special characters just check with the alphanumeric O(n)
    static boolean isAlphaNumeric(char ch) {
        return (ch >= 'A' && ch <= 'Z') ||
               (ch >= 'a' && ch <= 'z') ||
               (ch >= '0' && ch <= '9');
    }

    static String reverse_no_specialchar_change(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length() - 1;

        while (i < j) {
            char left = sb.charAt(i);
            char right = sb.charAt(j);

            if (!isAlphaNumeric(left)) {
                i++;
            } else if (!isAlphaNumeric(right)) {
                j--;
            } else {
                // Swap only alphanumeric
                sb.setCharAt(i, right);
                sb.setCharAt(j, left);
                i++;
                j--;
            }
        }

        return sb.toString();
    }/* 
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
    */
    public static void main(String[] args) {
        String s = "house no : 123@ cbe";
        reverse_nochange_punctuation(s);
    }
}