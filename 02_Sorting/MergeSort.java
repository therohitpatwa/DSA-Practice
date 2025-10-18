
import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n - 1;
        mergeSort(arr, low, high);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
       
    }

    public static void merge(int[] arr, int low,int mid,int high) {
        int left=low;
        int right=mid+1;
        int temp[]=new int[high-low+1];
        int i=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                 temp[i]=arr[left];   
                 left++; 
                 i++;             
            }
            else
            {
                temp[i]=arr[right];
                right++;
                i++;
            }

        }
        while(left<=mid)
        {
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high)
        {
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int j=0;j<temp.length;j++)
        {
            arr[low+j]=temp[j];
        }

    }
    
    
}
