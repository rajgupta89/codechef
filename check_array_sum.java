import java.util.*;

public class check_array_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = in.nextInt();
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            li.add(in.nextInt());
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (li.get(i) + li.get(j) == num) {
                        count++;
                    }
                }
            }
        }
        if (count > 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}