// import java.util.Scanner;

// class BinarySearch
// {

//    public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//      int arr[]=new int[n];
//      for(int i=0;i<n;i++)
//      {
//         arr[i]=sc.nextInt();
//      }
//      System.out.println(BS(arr, 14));
//    }
//    public static int BS(int[] arr,int target)
//    {
//        int left=0;
//        int right=arr.length-1;
    
//        while(left<=right)
//        {
//          int mid=(left+right)/2;
//          if(arr[mid]==target)
//          return mid;
//          else if(arr[mid]>target)
//          right=mid-1;
//          else
//          left=mid+1;
//        }
//        return -1;
//    }
    
// }






import java.util.Scanner;

class BinarySearch
{

   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();
     }
     System.out.println( BS(arr,0,arr.length-1, 14));
   }
   public static int BS(int[] arr,int start,int end,int target)
   {
       if(start>end)
       return -1;

    
       int mid = start + (end - start) / 2;


       if(arr[mid]==target)
       return mid;
       if(arr[mid]>target)
       return BS(arr, start, mid-1, target);
       else
       return BS(arr, mid+1, end, target);
      
   
   }
    
}