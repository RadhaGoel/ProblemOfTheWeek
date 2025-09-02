import java.util.Scanner;

public class ReverseWithDelimiters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with delimiters");
        String s = sc.nextLine().toLowerCase();
        String reverse = "";
        String word = "";

        for(int i = s.length() - 1; i >= 0; i--){
             char ch = s.charAt(i);
             if(ch >= 97 && ch <= 122) {
                 word += ch;
             }
             else{
                 String r = reverseWord(word);
                 reverse += (r+ch);
                 word = "";
             }
        }
        System.out.println(reverse + reverseWord(word));
    }
    private static String reverseWord(String s){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
