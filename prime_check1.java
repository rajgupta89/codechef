import java.util.*;

public class prime_check1 {
      public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
             int n=in.nextInt();
             int count=0;
             for (int i = 1; i <= n; i++) {
                     if(n%i==0)
                     count++;                     
                 }
             if(count==2)
             System.out.println(n +" is a Prime Number");
             else
             System.out.println(n +" is not a Prime Number");
      }    
}