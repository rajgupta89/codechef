import java.util.Scanner;

class newpiece {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0) {
            int a,b,x,y,p,q,count=0;
            a=in.nextInt();
            b=in.nextInt();
            p=in.nextInt();
            q=in.nextInt();
            x=a+b;
            y=p+q;
            if (a==p&&b==q) {
                count=0;
            }
             else if ((x%2==0 && y%2==0)||(x%2!=0 && y%2!=0)) {
                count++;
                count++;
            }
            else if ((x%2!=0 && y%2==0)||(x%2==0 && y%2!=0)) {
                count++;
            }
            else{
                count=0;
            }        
            System.out.println(count);
    }
}
}
