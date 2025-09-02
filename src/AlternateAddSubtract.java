import java.util.Scanner;

public class AlternateAddSubtract {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int sum = num[0];

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                sum -= num[i];
            } else {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}
