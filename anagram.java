import java.util.ArrayList;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char ch;
        ArrayList<Character> li=new ArrayList<Character>();
        // ArrayList<Integer> li=new ArrayList<Integer>();
        ArrayList<Integer> li1=new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
            int count=0;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j))
                    count++;
                }
                li.add(s.charAt(i));
            if(! li.contains(s.charAt(i)))
            li1.add(count);
        }
        System.out.println(li);
        System.out.println(li1);
    }
}
