import java.util.Scanner;

class prime {
       public static void main(String[] args) {
           Scanner in=new Scanner(System.in);
           int n=in.nextInt();
           int count1=0;
        //    while (n>1) {
               int a[]=new int[n];
               for (int i = 0; i < n; i++) {
                   a[i]=in.nextInt();
               }
               int count=0;
               for (int i = 1; i < n; i++) {
                   int j=2;
                   int p=1;
                   while (j<a[i]) {
                       if(a[i]%j==0){
                           p=0;
                           break;
                       }
                       j++;
                   }
                   if(p==1){
                       count++;
                   }
               }
               System.out.println(count);
        //        n=n-count;
        //        count1++;
        //    }
        //    System.out.println(count1);
       }  
}
