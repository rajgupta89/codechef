import java.util.Scanner;

public class dsa {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1="ABACD",s2="CDABA";
        s1=s1.concat(s1);
        System.out.println(s1);
        if (s1.indexOf(s2)!=-1) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
