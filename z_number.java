import java.util.*;

public class z_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<Integer>();
        int n = in.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            if (i >= 0 && i <= 10) {
                count++;
            } 
            else if(i>=11 && i<=99){
                int a = i;
                while (a != 0) {
                    int rem = a % 10;
                    a /= 10;
                    li.add(rem);
                }
                if (li.get(0) != li.get(1)) {
                    count++;
                }
            }            
            // else {
            //     int a = i;
            //     while (a != 0) {
            //         int rem = a % 10;
            //         a /= 10;
            //         li.add(rem);
            //     }
            //     Collections.reverse(li);
            //     // System.out.println(li);
            //     ArrayList <Integer> li1 = new ArrayList<Integer>();
            //     for (int j = 0; j < li.size() - 1; j++) {
            //         if (li.get(j) > li.get(j + 1))
            //             li1.add(1);
            //         else {
            //             li1.add(0);
            //         }
            //     }
            // }
        }
        System.out.println(count);
    }
}