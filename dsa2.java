import java.util.*;

class dsa2 {
   public static String raj(int n){
        if(n<=0){
        return null;
        }
        String s="1";
        int i=1;
        while (i<n) {
            StringBuilder li=new StringBuilder();
            int count=1;
            for (int j = 1; j < s.length(); j++) {
                if(s.charAt(j)==s.charAt(j-1)){
                    count++;
                }
                else{
                    li.append(count);
                    li.append(s.charAt(j-1));
                    count=1;
                }
            }
            li.append(count);
            li.append(s.charAt(s.length()-1));
            s=li.toString();
            i++;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(raj(n));
    }
}
