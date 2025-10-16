
import java.util.Scanner;

public class NumberHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[12];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int num = sc.nextInt();
            System.out.println(hash[num]);

        }

    }
}
