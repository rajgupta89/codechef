/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            long[] p = new long[n];
            ArrayList<Long> li = new ArrayList<Long>();
            ArrayList<Long> li1 = new ArrayList<Long>();
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
                li.add(p[i]);
            }
            Collections.sort(li);
            long count;
            for (int i = 0; i < n; i++) {
                if (p[i] != li.get(i)) {
                    count = li.indexOf(p[i]);
                    li1.add(count - i);
                }
            }
            Collections.sort(li1, Collections.reverseOrder());
            System.out.println(li1.get(0));
        }

    }
}
