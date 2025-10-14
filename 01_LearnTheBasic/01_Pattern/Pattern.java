
import java.util.Scanner;

class Pattern {

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {

        for (int i = 0; i < n; i++) {

            //space
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            //space
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {

        for (int i = n - 1; i >= 0; i--) {

            //space
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            //space
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 0; i < n; i++) {

            //space
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            //space
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {

            //space
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            //star
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            //space
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {

                for (int j = 0; j < 2 * n - 1 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static void pattern11(int n) {
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }

            for (int j = 0; j < i + 1; j++) {
                System.out.print(start);
                start = 1 - start;

            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        int space = 2 * (n - 1);
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < j + 1; i++) {
                System.out.print(i + 1);
            }
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            for (int i = j + 1; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            space = space - 2;
        }

    }

    public static void pattern13(int n) {
          int k=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j< i+1; j++) {
                System.out.print(k+++" ");
            }
            System.out.println();
            
        }

    }
      public static void pattern14(int n) {
        for(int i=0;i<n;i++)
        {
           for(char ch='A';ch<='A'+i;ch++)
           {
               System.out.print(ch);
           }
           System.out.println();
        }
      
    }
       public static void pattern15(int n) {
        for(int i=n-1;i>=0;i--)
        {
           for(char ch='A';ch<='A'+i;ch++)
           {
               System.out.print(ch);
           }
           System.out.println();
        }
      
    }
      public static void pattern16(int n) {
        char ch='A';
        for(int i=0;i<n;i++)
        {
          
           for(int j=0;j<i+1;j++)
           {
               
               System.out.print(ch);
           }
           System.out.println();
            ch=(char)(ch+1);
        }
      
    }

       public static void pattern17(int n) {

        for(int i=0;i<n;i++)
        {
            int breakpoint= i;
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            char ch='A';
           for(int j=0;j<2*i+1;j++)
            {
               
               System.out.print(ch);
               if(j<breakpoint)
               {
                  ch++;
               }
               else
               ch--;
            }
            for (int s = 0; s < n - i - 1; s++) {
                System.out.print(" ");
            }
            System.out.println();


        }
      
    }
     public static void pattern18(int n) {
         for(int i=0;i<n;i++)
         {
            char ch=(char) ('A'+ (char)(n-i-1));
            for(int j=0;j<i+1;j++)
            {
                System.out.print(ch++);
            }
            System.out.println();
         }
       
    }
        public static void pattern19(int n) {
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n-i;j++)
            {
               System.out.print("*");
            }
            for(int j=0;j<2*i;j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<n-i;j++)
            {
                 System.out.print("*");
            }
            System.out.println();
         } 
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<i+1;j++)
            {
               System.out.print("*");
            }
            for(int j=0;j<2*n-2*(i+1);j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<i+1;j++)
            {
                 System.out.print("*");
            }
            System.out.println();
         }
       
    }

    public static void pattern20(int n) {
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<i+1;j++)
            {
               System.out.print("*");
            }
            for(int j=0;j<2*n-2*(i+1);j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<i+1;j++)
            {
                 System.out.print("*");
            }
            System.out.println();
         } 
         for(int i=0;i<n-1;i++)
         {
            for(int j=0;j<n-i-1;j++)
            {
               System.out.print("*");
            }
            for(int j=0;j<2*(i+1);j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<n-i-1;j++)
            {
                 System.out.print("*");
            }
            System.out.println();
         }
       
    }
         public static void pattern21(int n) {
         for(int i=0;i<n;i++)
         {
             if(i==0 || i==n-1)
             {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
             }
             else
             {
                System.out.print("*");
                for(int j=0;j<n-2;j++)
                {
                    System.out.print(" ");
                }
                System.err.print("*");
             }
             System.err.println(" ");
         }
       
    }

      public static void pattern22(int n) {
         for(int i=0;i<2*n-1;i++)
         {
             for(int j=0;j<2*n-1;j++)
             {
                int top=i;
                int bottom=(2*n-2)-i;
                int left=j;
                int right=(2*n-2)-j;


                System.out.print(n-Math.min(Math.min(top, bottom),Math.min(left, right))+" ");

             }
             System.err.println(" ");
         }
       
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern22(n);
        sc.close();

    }
}
