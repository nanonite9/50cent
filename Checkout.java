/* 
 * Filename: Checkout.java
 * Author: nanonite9
 * Date: November 27, 2017 
 * Description: This program maintains a list of SweetTreats's (originally Item) as it prints a receipt for the user.
 */

import java.util.ArrayList;

public class Checkout extends SweetShop {
    int numberOfItems;
    int beforeTax;
    int tax;
    ArrayList<SweetTreat> cashRegister = new ArrayList<SweetTreat>(50);

    public void enterItem(SweetTreat item) {
    	// enter items into the cash register
        cashRegister.add(item);

    }

    public void clear() {
    	// clear the cash register
        cashRegister.clear();
    }

    public int numberOfItems() {
    	// get the number of items
        return cashRegister.size();
    }

    public int totalCost() {
    	// subtotal (before tax)
        beforeTax = 0;

        for(int i = 0; i < cashRegister.size(); i++) {
        	// adds prices for items together
            beforeTax += (cashRegister.get(i)).getCost();
        }

        return beforeTax;
    }

    public int totalTax() {
    	// total tax for the items
        tax = (int) (beforeTax * TAX_RATE/100); // 6.5%
        return tax;
    }

    public String toString() {
    	// print top title and list of items and costs
        String receipt = "";
        System.out.println(SweetShop.STORE_NAME);
        System.out.println("-------------------------------\nNumber of Items:           " + cashRegister.size());
        System.out.println("");

        for (int i = 0; i < cashRegister.size(); i++) {
        	// lists the items and costs
            int reciptCost = (cashRegister.get(i)).getCost();
            System.out.printf("%-25s%s%n", cashRegister.get(i), SweetShop.cents2dollarsAndCents(reciptCost));
        }
        // print calculations
        System.out.printf("%-11s = ", "\nSUBTOTAL");
        System.out.println(SweetShop.cents2dollarsAndCents(totalCost()));
        System.out.printf("%-11s = ", "TAX");
        System.out.println(SweetShop.cents2dollarsAndCents(totalTax()));
        System.out.println("-------------------------------");
        System.out.printf("%-11s = $", "TOTAL", SweetShop.cents2dollarsAndCents(totalCost() + totalTax()));
        System.out.println(SweetShop.cents2dollarsAndCents(totalCost() + totalTax()));
        System.out.println("-------------------------------");

        return receipt;
    }
}