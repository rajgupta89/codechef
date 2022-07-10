import java.util.*;
class Prime
{
	public static void main(String arg[])	
	{
	int count=0, count2=1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();;
    while (n>1) {
        int count1=0;
	for(int i=1;i<=n;i++)
	{
	   if(n%i==0)
	        count++;
	}
	if(count==2)
	       count1++;
           n=n-count1;
           count2++;
	}
    System.out.println(count2);
}
}