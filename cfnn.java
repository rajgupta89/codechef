import java.util.ArrayList;
import java.util.Scanner;

public class cfnn {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int n=in.nextInt();
            String s="";
            for (int i = 0; i < n; i++) {
                s=s+in.next();
            }
            int c=0,o=0,d=0,e=0,h=0,f=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='c')
                  c++;
                  else if(s.charAt(i)=='o')
                  o++;
                  else if(s.charAt(i)=='d')
                  d++;
                  else if(s.charAt(i)=='e')
                  e++;
                  else if(s.charAt(i)=='h')
                  h++;
                  else if(s.charAt(i)=='f')
                  f++;                  
            }
            c=c/2;
            e=e/2;
            ArrayList<Integer> li=new ArrayList<Integer>();
            li.add(c);
            li.add(o);
            li.add(d);
            li.add(e);
            li.add(h);
            li.add(f);
            int min=li.size();
            // int min=(int)(Math.min(c, (Math.min(o, (Math.min(d, (Math.min(e, (Math.min(h,f))))))))));
            for (int i = 0; i < li.size(); i++) {
                min=(int)(Math.min(li.get(i), li.size()));
            }
            System.out.println(min);
        }
    }
}
