
import java.util.*;
public class RemoveDuplicateInPlaceFromSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        removeDupilicate(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void removeDupilicate(int [] arr)
    {
        int j=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]!=arr[i])
            {
                arr[j]=arr[i];
                j++;
            }
        }
    }
}
