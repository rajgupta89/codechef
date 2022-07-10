import java.util.*;

public class per {
    public static int cost(int budget, int[] itemPrices){
        int itemsPurchased = 0;

	Array.Sort(itemPrices);

	foreach(var itemPrice in itemPrices)
	{
		budget -= itemPrice;

		if (budget < 0)
			break;

		itemsPurchased++;
	}

	return itemsPurchased;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int budget=in.nextInt();
        int[] itemPrices=new int[n];
        // int sum=0;
    for (int i = 0; i < n; i++) {    
               itemPrices[i]=in.nextInt();
    }
    System.out.println(cost(budget, itemPrices));

    }
}
