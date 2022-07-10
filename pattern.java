import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();   //n=6
        for (char i = 65; i < 65+n ; i++) {   //65-69
            for (int j = i; j < 65+n-1; j++) {
                System.out.print(" ");
            }
                System.out.print(i+" ");
        }
    }
}
