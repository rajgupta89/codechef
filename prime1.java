import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 1; i <= n; i++) { // print prime numbers from 2 to n
            int count=0;
            for (int j = 1; j <= n; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if (count==2) {
                System.out.println(i+" ");
            }
        }
    }
}
