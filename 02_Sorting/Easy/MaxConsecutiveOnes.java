

import java.util.Scanner;

public class  MaxConsecutiveOnes  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxConsecutiveOnes(arr);
        
    }
    public static void maxConsecutiveOnes(int[] arr)
    {
        int maxi=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
              cnt++;
              maxi=Math.max(maxi, cnt);
            }
            else
            cnt=0;
        }
        System.out.println(maxi);
    }

}
