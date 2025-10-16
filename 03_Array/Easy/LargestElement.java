

import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largestElement(arr);
    }
    public static void largestElement(int [] arr)
    {
        int largestElement=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largestElement)
            {
               largestElement=arr[i];
            }
        }
     System.out.println(largestElement);   
    }
}
