
import java.util.*;
public class UnionOfTwoSortedArray {
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
        union(arr1, arr2);
   } 
   public static void union(int[] arr1,int[] arr2)
   {
       int n1=arr1.length;
       int n2=arr2.length;
       ArrayList<Integer> union=new ArrayList<>();
       int i=0;
       int j=0;
       while(i<n1 && j<n2)
       {
         if(arr1[i]<=arr2[j])
         {
             if(union.size()==0 || union.get(union.size()-1)!=arr1[i])
             {
                union.add(arr1[i]);
             }
             i++;
         }
         else
         {
            if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
             {
                union.add(arr2[j]);
             }
             j++;
         }
       }
       while(i<n1)
       {
            if(union.size()==0 || union.get(union.size()-1)!=arr1[i])
             {
                union.add(arr1[i]);
             }
             i++;
       }
       while(j<n2)
       {
            if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
             {
                union.add(arr2[j]);
             }
             j++;
       }
       for(int k=0;k<union.size();k++)
       {
        System.out.print(union.get(k)+" ");
       }

   }
}
