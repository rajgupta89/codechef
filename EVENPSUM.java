import java.util.Scanner;

public class EVENPSUM {
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while (t-->0) {
           int count=0;
           int A=in.nextInt();
           int B=in.nextInt();
           for (int i = 1; i <= A; i++) {
               for (int j = 1; j <= B; j++) {
                   if ((i+j)%2==0) {
                       count++;
                   }
               }
           }
           System.out.println(count);
           
       }
   }
}