import java.util.Scanner;

public class palindrome_conversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=1;
        while (temp>0) {
            int a=n;
            String str1=String.valueOf(a);
            str1=new StringBuilder(str1).reverse().toString();
            a=Integer.valueOf(str1);
            n=n+a;
            int b=n;
            String str2=String.valueOf(b);
            str2=new StringBuilder(str2).reverse().toString();
            b=Integer.valueOf(str2);
            if (n==b) {
                temp=0;
                System.out.println(n);
            }
        }
    }
}
