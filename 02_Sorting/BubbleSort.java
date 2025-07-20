import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
     
        for(int i=n-1;i>=1;i--)
        {
            int didSwap=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    didSwap=1;
                }
            }
            if(didSwap==0)
            break;
        }
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
