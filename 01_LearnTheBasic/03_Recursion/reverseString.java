
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left = 0;
        int right = s.length() - 1;
       System.out.println( fun(s, left, right));


    }

    public static boolean fun(String s, int left, int right) {
        if (left < right) {
            char l = s.charAt(left), r = s.charAt(right);
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } else if (!Character.isLetterOrDigit(r)) {
                right--;
            } else if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            } else {
                left++;
                right--;

            }
          
        }
      return true;
  }

}
