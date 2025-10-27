public class MaximumSubarraySum {
   public static void main(String[] args) {
      System.out.println(fun(new int[]{-2,-3,4,-1,-2,1,5,-3}));
   } 
   public static int fun(int arr[])
   {
       int maxi=Integer.MIN_VALUE;
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
          sum+=arr[i];
          if(sum>maxi)
          {
            maxi=sum;
          }
          if(sum<0)
          {
            sum=0;
          }
       }
       return maxi;
   }
}
