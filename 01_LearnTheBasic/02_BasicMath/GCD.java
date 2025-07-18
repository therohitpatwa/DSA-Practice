import java.util.Scanner;

class GCD
{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        GCD(x,y);
    }
    public static void GCD(int x,int y)
    {
        int smallNum=Math.min(x,y);
        for(int i=smallNum;i>=1;i--)
        {
            if(x%i==0 && y%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}