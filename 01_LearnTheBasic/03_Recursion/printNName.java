
import java.util.Scanner;

public class printNName {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        fun(n);
    }
    public static void fun(int n)
    {
        if(n<=0)
        return;

        fun(n-1);
        System.out.println("Rohit");
    }
}
