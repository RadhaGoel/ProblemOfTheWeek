import java.util.*;

public class PrimeWithMultipleOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int more[] = occurences(arr);

        int prime[] = primes(more, more.length);

        if(more.length == 0){
            System.out.println("-1");
        }

        else {
            for (int i : prime) {
                if (i != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    private static int[] occurences(int arr[]){
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int num : arr){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        int more[] = new int [result.size()];

        for(int i = 0; i < more.length; i++){
            more[i] = result.get(i);
        }

        return more;

    }

    private static int[] primes(int more[], int n){
        int ans[] = new int[n];
        int a = 2;
        int i = 0;

        for(int ele : more){
            if(ele % a != 0){
                a++;
            }
            else{
                continue;
            }
            ans[i++] = ele;
        }
        return ans;
    }
}
