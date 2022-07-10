Magic Array
import java.util.*;
public class persis1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        ArrayList<Integer> li=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        double n1=(double)n/2;
        double n2=Math.ceil(n1);
        for (int i = 0; i < n2; i++) {
            int maxx=Math.max(a[i],a[n-1-i]);
            int minn=Math.min(a[i],a[n-1-i]);
            if(! li.contains(maxx))
            li.add(maxx);
            if(! li.contains(minn))
            li.add(minn);
        }
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
        // System.out.println(n2);
    }
}
