//01



// import java.util.Scanner;

// public class SelectionSort {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for(int i=0;i<=n-2;i++)
//         {
//             int min=i;
//             for(int j=i;j<=n-1;j++)
//             {
//                 if(arr[j]<arr[min])
//                 {
//                     min=j;
//                 }
//                 swap(arr, i, min);
//             }
//         }
     

//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void swap(int[] arr, int i, int min) {
//         int temp = arr[min];
//         arr[min] = arr[i];
//         arr[i] = temp;
//     }
// }
