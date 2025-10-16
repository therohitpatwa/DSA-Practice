
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        singleNumber(arr);
    }
    public static void singleNumber(int[] arr){
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            xor^=arr[i];
        }
        System.out.println(xor);
    }
}
