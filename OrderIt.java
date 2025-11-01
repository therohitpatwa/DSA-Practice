import java.util.*;

public class OrderIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        sc.nextLine(); 
        List<String> s = new ArrayList<>();
        for (int i = 0; i < N; i++) s.add(sc.nextLine());
        sc.nextLine(); 
        List<String> o = new ArrayList<>();
        for (int i = 0; i < N; i++) o.add(sc.nextLine());

        if (s.equals(o)) {
            System.out.println(0);
            return;
        }


        for (int l = 0; l < N; l++) {
            for (int r = l; r < N; r++) {
                List<String> cut = new ArrayList<>(s.subList(l, r + 1));
                List<String> remain = new ArrayList<>();
                for (int i = 0; i < l; i++) remain.add(s.get(i));
                for (int i = r + 1; i < N; i++) remain.add(s.get(i));
                for (int k = 0; k <= remain.size(); k++) {
                    List<String> temp = new ArrayList<>(remain);
                    temp.addAll(k, cut);
                    if (temp.equals(o)) {
                        System.out.println(1);
                        return;
                    }
                }
            }
        }

        System.out.println(2);
    }
}