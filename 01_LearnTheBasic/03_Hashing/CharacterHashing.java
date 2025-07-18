
// import java.util.Scanner;

// public class CharacterHashing {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         int hash[]=new int[26];
//         //prestoring
//         for(int i=0;i<s.length();i++)
//         {
//             hash[s.charAt(i)-'a']+=1;
//         }
//         int q=sc.nextInt();
//         //fetching
//         for(int i=1;i<=q;i++)
//         {
//             char c=sc.next().charAt(0);
//             System.out.println(hash[c-'a']);
//         }
        

//     }
// }







// import java.util.Scanner;

// public class CharacterHashing {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String s=sc.next();
//         int hash[]=new int[26];
//         //prestoring
//         for(int i=0;i<s.length();i++)
//         {
//             hash[s.charAt(i)-'A']+=1;
//         }
//         int q=sc.nextInt();
//         //fetching
//         for(int i=1;i<=q;i++)
//         {
//             char c=sc.next().charAt(0);
//             System.out.println(hash[c-'A']);
//         }
        

//     }
// }






import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int hash[]=new int[256];
        //prestoring
        for(int i=0;i<s.length();i++)
        {
            hash[s.charAt(i)]+=1;
        }
        int q=sc.nextInt();
        //fetching
        for(int i=1;i<=q;i++)
        {
            char c=sc.next().charAt(0);
            System.out.println(hash[c]);
        }
        

    }
}