import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        armstrong(n);

    }
    public static void armstrong(int n)
    {
        int cntDigit= (int)Math.log10(n)+1;
        int originalNum=n;
        int sum=0;
        while(n!=0)
        {
            int lastDigit=n%10;
            sum=sum+(int)Math.pow(lastDigit, cntDigit);
            n=n/10;
        }
        if(sum==originalNum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
