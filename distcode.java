/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class distcode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
        while (t-->0) {
            String s=in.next();
            String ans="";
            ArrayList<String> li=new ArrayList<String>();
            for (int i = 0; i < s.length()-1; i++) {
               char a=s.charAt(i);
                char b=s.charAt(i+1);
                ans=ans+a+b;
                if (!li.contains(ans)) {
                    li.add(ans);
                }
                ans="";
            }
            int size=li.size();
            System.out.println(size);
        }
	}
}
