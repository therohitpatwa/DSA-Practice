import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       System.out.println(fun(new int[]{2,6,5,8,11},14)); 
    }
    public static boolean  fun(int[] arr,int target)
    {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        int sum=0;
        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                return true;
            }
            else if(sum<target)
            {
                left++;
            }
            else if(sum>target)
            {
                right--;
            }
        }
         return false;
    }
}
