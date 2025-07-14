import java.util.Scanner;
class Main {
    //optimal - using Hash map  TC:O(n+m) sc:O(n)
    static String firstOccurancesSubstring(String str1,String str2){
        Map<Character,Integer> m =new HashMap<>();
        int min = -1;
        int max = -1 ;
        //store str1 characters position
        for(int i =0;i < str1.length();i++){
            if(!m.containsKey(str1.charAt(i))){
                m.put(str1.charAt(i),i);
            }
        }
        for(int j =0;j<str2.length();j++){
            if(!m.containsKey(str2.charAt(j))) continue;
            int indx = m.get(str2.charAt(j));
            if(min == -1 || indx < min) min = indx;
            max = Math.max(max,indx); 
           
         }
        System.out.println(min+" "+max);
        if(min == -1) return "";
        return str1.substring(min,max+1);
    }
    
    
    //Brute force - TC:O(n*m) sc:O(1); n - str1.length() m - str2.length()
    /*
    static String firstOccurancesSubstring(String str1,String str2){
        int min = -1;
        int max = -1 ;
        for(int j = 0;j<str2.length();j++){
            int indx = str1.indexOf(str2.charAt(j));
            if(indx == -1) continue;
            if(min == -1 || indx <  min) min = indx;
            max = Math.max(max,indx);   
          
        }
        if(min == -1) return "";
        return str1.substring(min,max+1);
        
        
    }
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(firstOccurancesSubstring(str1,str2));
    }
}
/*
ip:abcdef
op:ebcdaf
*/
