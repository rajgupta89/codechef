import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class missing_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList <Integer> li=new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            li.add(in.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            if(!li.contains(i)){
                System.out.println("Missing number : "+i);
            }
        }
    }
}
