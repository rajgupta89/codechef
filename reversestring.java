import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        String s="timetopractice", p="toc";

        // using StringBuilder method
        
        // StringBuilder li=new StringBuilder(s);
        // StringBuilder li1=new StringBuilder(p);
        // System.out.println(li.reverse());
        // System.out.println(li1.reverse());
        

        // Another Method

        
        String s1="";
        for (int i = s.length()-1; i >=0; i--) {
            s1+=s.charAt(i);
        }
        System.out.println(s1);
    }
}
