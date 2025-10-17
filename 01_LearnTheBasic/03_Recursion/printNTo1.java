import java.util.Scanner;

public class printNTo1 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        fun(n);
    }
    public static void fun(int n)
    {
        if(n==0)
        return ;
        System.out.println(n);
        fun(n-1);
       
    }
}
