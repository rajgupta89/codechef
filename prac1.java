import java.util.*;

public class prac1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        ArrayList <Integer> even=new ArrayList<Integer>();
        ArrayList <Integer> odd=new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            if(a[i]%2==0){
                even.add(a[i]);
            }
            else{
                odd.add(a[i]);
            }
        }
        int x=Math.abs(-1);
    }
}
