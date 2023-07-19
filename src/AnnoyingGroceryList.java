//Broken

import java.util.Scanner;
public class AnnoyingGroceryList
{
    public static void main (String[]args)
    {

        Scanner sc = new Scanner (System.in);
        double[] itemPrices = new double[5];
        double[] itemPounds = new double[5];
        String[] items = new String[5];
        int itemDelete = -1;
        int x = -1;

        items[0] = "bananas";
        items[1] = "apples";
        items[2] = "cucumbers";
        items[3] = "carrots";
        items[4] = "oranges";

        itemPrices[0] = 0.44;
        itemPrices[1] = 0.99;
        itemPrices[2] = 1.19;
        itemPrices[3] = 0.89;
        itemPrices[4] = 0.79;

        System.out.println ("Chose your product");
        System.out.println ("1. Bananas?");
        System.out.println ("2. Apples?");
        System.out.println ("3. Cucumbers?");
        System.out.println ("4. Carrots?");
        System.out.println ("5. Oranges?");
        System.out.println ("6. Delete");
        System.out.println ("7. Checkout");

        String option;
        do
        {
            option = sc.nextLine ();

            switch (option)
            {
                case "Bananas":
                    System.out.println ("Bananas weight:");
                    itemPounds[0] = sc.nextFloat ();
                    System.out.println ("Choose another option...");
                    break;
                case "Apples":System.out.println ("Apples weight:");
                    itemPounds[1] = sc.nextFloat ();
                    System.out.println ("Choose another option...");
                    break;
                case "Cucumbers":System.out.println ("Cucumbers weight:");
                    itemPounds[2] = sc.nextFloat ();
                    System.out.println ("Choose another option...");
                    break;
                case "Carrots":System.out.println ("Carrots weight:");
                    itemPounds[3] = sc.nextFloat ();
                    System.out.println ("Choose another option...");
                    break;
                case "Oranges":System.out.println ("Oranges weight:");
                    itemPounds[4] = sc.nextFloat ();
                    System.out.println ("Choose another option...");
                    break;
                case "Delete":System.out.
                        println ("What product do you want to change the weight for?");
                    String itemToDelete = sc.nextLine ();
                    for (int i = 0; i < items.length; i++)
                    {
                        x = i;
                        if (itemToDelete.equals (items[i]))
                        {
                            itemDelete = x;
                        }
                    }
                    if (itemDelete >= 0)
                    {
                        System.out.println ("Chose item " + items[x]);
                        System.out.println ("Enter the new weight for " + items[x] + ": ");
                        itemPounds[x] = sc.nextFloat ();
                    }
                    else
                    {
                        System.out.println ("Product not found...");
                    }
                    sc.nextLine ();
                    System.out.println ("Choose another option...");
                    break;
                case "Checkout":
                    double price =
                            ((itemPounds[0] * itemPrices[0]) +
                                    (itemPounds[1] * itemPrices[1]) +
                                    (itemPounds[2] * itemPrices[2]) +
                                    (itemPounds[3] * itemPrices[3]) +
                                    (itemPounds[4] * itemPrices[4]));
                    double cost = Math.round (price * 100.0) / 100.0;
                    System.out.println ("Total cost: $" + cost);
                default:
                    break;
            }
        }
        while (!option.equals ("Checkout"));
    }
}
