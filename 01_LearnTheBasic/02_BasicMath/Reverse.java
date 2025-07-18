import java.util.Scanner;

public class Reverse {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseNumber(n);
    }
    public static void reverseNumber(int n)
    {
        int revNum=0;
        while(n!=0)
        {
            int lastDigit=n%10;
            revNum=revNum*10+lastDigit;
            n=n/10;
        }
        System.out.println(revNum);
    }
}
