// public class PowerExpo {
//     public static void main(String[] args) {
//         System.out.printf("%.4f",myPow(2,2));
//     }
//     public static double myPow(int x,int n)
//     {
//         int ans=1;
//         if(n==0 || x==1)
//             return 1;

//         long n1=n;
//         if(n<0){
//         n1= -1L*n;
//         x=1/x;
//         }

//         for(int i=1;i<=n1;i++)
//         {
//             ans*=x;
//         }
//         return ans;
//     }
    
// }



// public class PowerExpo {
//     public static void main(String[] args) {
//         System.out.printf("%.4f",myPow(2,21));
//     }
//     public static double myPow(int x,int n)
//     {
//        int ans=1;
//        while(n>0)
//        {
//           if(n%2==1)
//           {
//             ans=ans*x;
//             n=n-1;
//           }
//           else
//           {
//             x=x*x;
//             n=n/2;
//           }
//        }
//    if(n<0)
//   return 1/ans;
//        return ans;
//     }
    
    
// }






// public class PowerExpo {
//     public static void main(String[] args) {
//         int x=2;
//         int n=2;
//         if(n<0)
//         System.out.printf("%.4f",1.0/myPow(2,2));
//         else
//         System.out.printf("%.4f",myPow(2,2));

        
//     }
//     public static double myPow(int x,int n)
//     {
//          if(n==0)
//             return 1.0;

   

//         if(n%2==1)
//             return x*myPow(x, n-1);
//         else
//             return myPow(x*x, n/2);
//     }
    
// }


