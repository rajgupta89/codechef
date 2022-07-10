import java.util.ArrayList;
import java.util.Scanner;

public class sub_sequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        ArrayList<Integer> li=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            if(! li.contains(a[i])){
                li.add(a[i]);
            }
        }
        System.out.println(li.size());
    }
}
