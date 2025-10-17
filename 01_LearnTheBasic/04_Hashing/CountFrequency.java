
import java.util.*;

public class CountFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        countFrequency(arr);
    }

    public static void countFrequency(int arr[]) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mpp.containsKey(arr[i])) {
                int freq = mpp.get(arr[i]);
                mpp.put(arr[i], freq + 1);
            } else {
                mpp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
