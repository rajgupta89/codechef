// Attendance
import java.util.*;
public class pers3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> li=new ArrayList<Integer>();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            li.add(a[i]);
        }
        Collections.sort(li);
        int diff=li.get(0);
        for (int i = 0; i < n; i++) {
            if(! li.contains(diff)){
                System.out.print(diff+" ");
            }
            diff++;
        }
    }
}
