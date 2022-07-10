// Sanjay and qualities
import java.util.*;

public class persi2 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int d=in.nextInt();
    int[] a=new int[n];
    int sum=0;
    for (int i = 0; i < n; i++) {    
               a[i]=in.nextInt();
    }
    Arrays.sort(a);
    int count=0;
    if (n>=1 && n<=1e9) {
        if (d>=1 && d<=1e18) {
            
            while (sum<=d) {
                for (int i = 0; i < n; i++) {
                    sum=sum+a[i];
                    if (sum<=d) {     
                        count++;                 
                    }
                }
            }
            System.out.println(count);
        }    
    }
}
}
    