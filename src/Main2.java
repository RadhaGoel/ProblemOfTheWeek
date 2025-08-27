import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int n = sc.nextInt();
        System.out.println("Enter an ascending array");
        int arr[] = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter target element");
        int target = sc.nextInt();

        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = getMid(start, end);
            if(arr[mid] == target){
                System.out.println("True");
                return;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("False");
    }
    public static int getMid(int low, int high){
        int count = 0;
        int sum = low + high;
        int mid = 0;

        while((mid + mid) < sum){
            mid ++;
        }
        return mid;
    }
}
