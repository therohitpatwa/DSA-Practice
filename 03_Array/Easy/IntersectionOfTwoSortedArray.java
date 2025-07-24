
import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int j = 0; j < n2; j++) {
            arr2[j] = sc.nextInt();
        }
        intersection(arr1, arr2);
        
    }
    public static void intersection(int[] arr1,int[] arr2)
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int[] vis=new int[(int)Math.min(n1, n2)];
        ArrayList<Integer> intersection=new ArrayList<>();
        int k=0;
        for(int i=0;i<(int)Math.max(n1, n2);i++)
        {
            for(int j=0;j<(int)Math.min(n1,n2);j++)
            {
                if(arr1[i]==arr2[j] && vis[j]==0)
                {
                    vis[j]=1;
                    intersection.add(arr2[j]);
                    break;
                }
                if(arr2[j]>arr1[i])
                break;
            }
        
        }
       for(int i=0;i<intersection.size();i++)
       {
         System.out.print(intersection.get(i)+" ");
       }

    } 
}
