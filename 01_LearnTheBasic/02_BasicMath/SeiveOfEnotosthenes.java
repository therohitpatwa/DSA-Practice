// public class SeiveOfEnotosthenes {
//     public static void main(String[] args) {
//         int N=13;
//         sieve(N);
//     }
//     public static void sieve(int N)
//     {
//         int prime[]=new int[N+1];
//         for(int i=0;i<N+1;i++)
//         {
//            prime[i]=1;
//         }
//         for(int i=2;i<N;i++)
//         {
//             if(prime[i]==1)
//             {
//                 for(int j=2*i;j<=N;j+=i)
//                 {
//                      prime[j]=0;
//                 }
//             }
//         }
//         for(int i=2;i<N;i++)
//         {
//             if(prime[i]==1)
//             {
//                 System.out.println(i);
//             }
//         }
//     }
// }



//TC-Nlog(logN)