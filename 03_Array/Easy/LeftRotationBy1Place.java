import java.util.*;
public class LeftRotationBy1Place {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leftRotation(arr);
           for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void leftRotation(int[] arr)
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
