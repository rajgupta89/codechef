/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class laddo
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int k=in.nextInt();
		while(k-->0){
		    int n=in.nextInt();
		    int[] a=new int[n];
		    for (int i=0;i<n ;i++ ){
		        a[i]=in.nextInt();
		    } 
            Arrays.sort(a);
		    // int min=a[0];
		    // int max=a[0];
		    // for(int i=0;i<n;i++){
		    //     if(a[i]>max)
		    //         max=a[i];
		    //     if(a[i]<min)
		    //         min=a[i];
		    // }
		    System.out.println(a[n-1]-a[0]);
		    }
		}
	}
