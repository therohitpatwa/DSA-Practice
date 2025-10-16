
import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) { 
            arr[i] = sc.nextInt();
        }
        missingNumber(arr);
    }
    public static void missingNumber(int[] arr)
    {
        int n=arr.length;
        int N=n+1;
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=N;i++)
        {
            xor1^=i;
        }
        for(int i=0;i<n;i++)
        {
            xor2^=arr[i];
        }
        System.out.println(xor1^xor2);
    }
}
