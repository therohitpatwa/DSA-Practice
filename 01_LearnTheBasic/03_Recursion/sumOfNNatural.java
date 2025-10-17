
import java.util.Scanner;



public class sumOfNNatural {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(fun(n));
    }
    public static int  fun(int n)
    {
        int s;
        if(n==0)
        return 0;

       s=n+fun(n-1);
       return s;
    }
}
