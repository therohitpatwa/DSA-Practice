import java.util.*;
public class LeftRotateBydPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int d = sc.nextInt();
        // rotateArray(arr, d);
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, n-1);
        reverseArray(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
      


    }
    public static void rotateArray(int[] arr,int d)
    {
           int[] temp=new int[d];
           for(int i=0;i<d;i++)
           {
              temp[i]=arr[i];
           }
           for(int i=d;i<arr.length;i++)
           {
              arr[i-d]=arr[i];
           }
           int j=0;
           for(int i=arr.length-d;i<arr.length;i++)
           {
             arr[i]=temp[j++];
           }
    }
    public static void reverseArray(int[] arr,int left,int right)
    {
           while(left<=right)
           {
              int temp=arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
              left++;
              right--;
           }
    }
  
}