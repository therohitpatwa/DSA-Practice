
import java.util.Scanner;
public class fibbonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(fun(n));
    }
    public static int  fun(int n)
    {
       if(n<=1)
       return n;

       return fun(n-1)+fun(n-2);
    }
}
