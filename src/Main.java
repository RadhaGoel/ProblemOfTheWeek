import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();

        HashSet<Character> seen = new HashSet<>();

        for(char c : s.toCharArray()){
            if(seen.contains(c)) {
                System.out.println(c);
                break;
            }
            seen.add(c);
        }
    }
}