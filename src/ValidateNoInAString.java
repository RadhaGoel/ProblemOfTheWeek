import java.util.Scanner;

public class ValidateNoInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeric string");
        String s = sc.next().trim();

        try{
            long num = Long.parseLong(s);
            System.out.println(true);
        }
        catch(NumberFormatException e){
            System.out.println(false);
        }
    }
}
