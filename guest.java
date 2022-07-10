/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class guest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
			int n=in.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for (int i=0;i<n;i++) {
                a[i]=in.nextInt();
            }
            for (int i=0;i<n;i++) {
                b[i]=in.nextInt();
            }
            for (int i : b) {
                System.out.println(i);
            }
		}
	}
}