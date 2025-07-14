
class Main {
    //optimal - using hashset
       static boolean panagramCheck(String s) {
        HashSet<Character> letters = new HashSet<>();
        s = s.toLowerCase(); 
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
                if (letters.size() == 26) return true; 
            }
        }

        return false; 
     }
    /*
    //optimal using boolean array - SC -O(1)
    static boolean panagramCheck(String s){
        if(s.length()<26){return false;}
        s = s.toLowerCase();
        boolean visited[] = new boolean[26];
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                int indx = s.charAt(i) - 'a';
                if(!visited[indx]){
                    visited[indx] = true;
                    count++;
                }
                if(count == 26){return true;}
                
              }
         }
        return false;
     }
    //TC - O(n) SC - O(n)
    static boolean panagramCheck(String s){
        String str = s.replace(" ","").toLowerCase();
        int n = s.length();
        if(n<26){return false;}
        String check = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<check.length();i++){
            //check if any char misssing
            if(!str.contains(""+check.charAt(i))){
                return false;
          }
        }
        return true;
   }
   */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean ans = panagramCheck(s);
        System.out.println(ans);
    }
}
/*
ip:abc  defg HIJK lmno pqrstuvW XY
op:false
ip:ip:abc  defg HIJK lmno pqrstuvW XYZ
op:true
*/