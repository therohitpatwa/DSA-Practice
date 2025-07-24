import java.util.*;
public class LinearSearch {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        linearSearch(arr,x);
   }
   public static void linearSearch(int[] arr,int x)
   {
       int i=0;
       for( i=0;i<arr.length;i++)
       {
          if(arr[i]==x)
          {
            System.out.println("Yes");
            break;
          }
       }

       if(i==arr.length)
       System.out.println("No");
   } 
}
