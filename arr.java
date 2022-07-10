import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double[] a=new double[n];
        double sum=0;
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        double avg= sum/n;
        System.out.println(avg);
    }
}