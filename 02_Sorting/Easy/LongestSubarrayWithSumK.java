
public class LongestSubarrayWithSumK {

    public static void main(String[] args) {

        System.out.println(fun(new int[]{2,0,0,3}, 3));
    }

    public static int fun(int arr[], int k) {

        int left = 0;
        int right = 0;
        int sum = 0;
        int maxlen = 0;
        while (right < 4) {
            if (right < 4) {
                sum += arr[right];
                while (sum > k) {
                    sum -= arr[left];
                    left++;
                }
                if (sum == k) {
                    maxlen = Math.max(maxlen, right - left + 1);
                }
                right++;
            }

        }
        return maxlen;
    }
}
