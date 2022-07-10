/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class S02E10
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int N,X,K,count=0;
		    N=in.nextInt();
            X=in.nextInt();
            K=in.nextInt();
		    int[] A=new int[N];
		    int[] B=new int[N];
		    for(int i=0;i<N;i++){
		        A[i]=in.nextInt();
		    }
		    for(int i=0;i<N;i++){
		        B[i]=in.nextInt();
		    }
		    for(int i=0;i<N;i++){
                s=Math.abs(A[i]-B[i]);
		        if(s<=K){
		            count++;
		        }
		    }
		    if(count==X){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
