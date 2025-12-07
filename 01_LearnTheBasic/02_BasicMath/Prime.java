import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkPrime(n);
    }
    public static void checkPrime(int n)
    {
        int cnt=0;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0){
            cnt++;
            break;
            }
        }
        if(cnt!=0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}
