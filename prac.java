import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        int count=1;
        int count1=1;
        for (int i = 1; i < n-1; i++) {
            if(s.charAt(i)=='1'){
                 if (s.charAt(i)==s.charAt(i+1)) {
                     count++;
                 }
            }
           else if(s.charAt(i)=='0'){
                if (s.charAt(i)==s.charAt(i+1)) {
                    count1++;
                }
            }
        }
        int maxx=Math.max(count, count1);
        System.out.println(maxx);
    }
}
