
import java.util.*;
class Solution {
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int left=0;
        int right=arr.length-1;
        fun(arr, left, right);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
    public static void  fun(int []arr,int left,int right)
    {
          if(left<right)
          {
              int temp=arr[left];
              arr[left]=arr[right];
              arr[right]=temp;
              fun(arr, left+1, right-1);

          }
   }

}

