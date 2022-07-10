import java.util.Scanner;

public class subtask {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int A=in.nextInt();
        while (A-->0) {
            int N,M,K,Sc=0,count=0;
            N=in.nextInt();
            M=in.nextInt();
            K=in.nextInt();
            int[] arr=new int[N];
            for (int i = 0; i < N; i++) {
                arr[i]=in.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (arr[i]==0) {
                    if (i<M) {
                        Sc=0;
                        break;
                    }
                else {
                    Sc=K;
                    break;
                }
            }
            else{
                count++;
                continue;
            }

        }
        if (count==N) {
            System.out.println("100");
        } else {
            System.out.println(Sc);
        }
    }
}
}
