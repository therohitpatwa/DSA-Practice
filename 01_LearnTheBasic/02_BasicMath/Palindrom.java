import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseNumber(n);
    }
    public static void reverseNumber(int n)
    {
        int originalNum=n;
        int revNum=0;
        while(n!=0)
        {
            int lastDigit=n%10;
            revNum=revNum*10+lastDigit;
            n=n/10;
        }
        if(revNum==originalNum)
        {
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
