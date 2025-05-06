
class Solution {
    //2.memoization 
    static boolean fn(int i,int j,String s,String p,Boolean[][] dp){
         //Base Cases 
         //1.process complete entire s&p
         if(i==0){
             if(j==0){
                 return true;
             }
             if(p.charAt(j) == '*'){
                 return fn(i,j-1,s,p,dp);
             }
             return false;
         }
         //2.pattern completed still string exists
         if(j==0){
             return false;
         }
         
         //Main Cases 
         if(dp[i][j]!=null){ 
             return dp[i][j];
             
         }
         //Case 1:matching or pattern contains '?'
         if(s.charAt(i)== p.charAt(j)||p.charAt(j) == '?'){
             return dp[i][j] = fn(i-1,j-1,s,p,dp);
         }
         //Case 2:pattern contains '*'
         if(p.charAt(j) == '*'){
             boolean a = fn(i,j-1,s,p,dp);
             boolean b =fn(i-1,j,s,p,dp);
             return dp[i][j] = a||b;
         }
         //case 3:not matching 
         return dp[i][j] = false;
     }
    /*
    //1.Using Recursion
     static boolean fn(int i,int j,String s,String p){
         //Base Cases 
         //1.process complete entire s&p
         if(i<0){
             if(j<0){
                 return true;
             }
             if(p.charAt(j) == '*'){
                 return fn(i,j-1,s,p);
             }
             return false;
         }
         //2.pattern completed still string exists
         if(j<0){
             return false;
         }
         
         //Main Cases 
         //Case 1:matching or pattern contains '?'
         if(s.charAt(i)== p.charAt(j)||p.charAt(j) == '?'){
             return fn(i-1,j-1,s,p);
         }
         //Case 2:pattern contains '*'
         if(p.charAt(j) == '*'){
             boolean a = fn(i,j-1,s,p);
             boolean b =fn(i-1,j,s,p);
             return a||b;
         }
         //case 3:not matching 
         return false;
     }
    //3.Using Tabulation
    public static boolean wildCardMatching(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];

        // Base case: empty string matches empty pattern
        dp[0][0] = true;

        // Initialize first row for patterns starting with '*'
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[m][n];
    }
    //4.Using TAbulation with Space optimization
    public static boolean wildCardMatching(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[] prev = new boolean[n + 1];
        boolean[] curr = new boolean[n + 1];

        // Base case: empty string matches empty pattern
        prev[0] = true;

        // Initialize first row for patterns starting with '*'
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                prev[j] = prev[j - 1];
            }
        }

        // Process the string and pattern
        for (int i = 1; i <= m; i++) {
            curr[0] = false; // Empty pattern cannot match a non-empty string
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    curr[j] = prev[j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    curr[j] = prev[j] || curr[j - 1];
                } else {
                    curr[j] = false;
                }
            }
            System.arraycopy(curr, 0, prev, 0, n + 1); // Move current row to previous row
        }

        return curr[n];
    }
     */
    
     public static boolean wildCardMatching(String s, String p) {
        // Write your code here... 
        int m = s.length();
        int n = p.length();
        Boolean[][] dp = new Boolean[m][n];
        return fn(m-1,n-1,s,p,dp);
        
    }
}
