import java.util.Scanner;

public class Divisior {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        divisior(n);
    }
    public static void divisior(int n)
    {
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0)
            {
                System.out.print(i+" "+ n/i+" " );
            }
        }
    }
}
