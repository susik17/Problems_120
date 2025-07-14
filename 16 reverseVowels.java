import java.util.Scanner;
class Main {
    //optimal - same complexity but slightly better 1.use hashset for O(1) - search 2.use char Array instead of Stringbuilder for faster
    static String reverseVowels(String str){
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O','U');
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while(i < j) {
            while(i < j && !vowels.contains(arr[i])) i++;
            while(i < j && !vowels.contains(arr[j])) j--;
            if(i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(arr);
    }
    /*
    //Brute - TC:O(n) sc- O(n)
    static String reverseVowels(String str){
        int n = str.length();
        int i = 0,j = n-1;
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder(str);
        while(i<=j){
            if(vowels.indexOf(sb.charAt(i))!=-1 && vowels.indexOf(sb.charAt(j))!=-1)             {
                
                char tmp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,tmp);
                i++;
                j--;
            }
            else if(vowels.indexOf(sb.charAt(i))!=-1){
                j--;                               
               }
            else if(vowels.indexOf(sb.charAt(j))!=-1){
                i++;                               
               }
            else{
                i++;
                j--;
             }
         }
        return sb.toString();
        
    }
    */
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(reverseVowels(str));
    }
}
/*
ip:abcdef
op:ebcdaf
*/