
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            if(hash.containsKey(key)){
            int freq=hash.get(key);
            hash.put(key, freq+1);
            }
            else{
                hash.put(key, 1);
            }
        }
       int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number;
            number = sc.nextInt();
            // fetch:
            if (hash.containsKey(number)) System.out.println(hash.get(number));
            else System.out.println(0);
        }

    }
}
