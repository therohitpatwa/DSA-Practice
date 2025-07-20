
import java.util.Scanner;

// public class PrimeFactor {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=2;i*i<=n;i++)
//         {  
//             if(n%i==0){
//             if(prime(i))
//             {
//                System.out.println(i);
//             }
//             if(n/i!=i)
//             {
//                 if(prime(n/i))
//                 System.out.println(n/i);
//             }
//          }
//         }
//     }
//     public static  boolean prime(int n)
//     {
    
//         for(int i=2;i*i<=n;i++)
//         {
//             if(n%i==0)
//             return false;
//         }
//         return true;
//     }
// }



class PrimeFactor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                while(n%i==0)
                n=n/i;
            }
        }
    }
}