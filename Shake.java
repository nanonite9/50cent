/* 
 * Filename: Shake.java
 * Author: nanonite9
 * Date: November 27, 2017
 * Description: This program is derived from the Gelato class as it determines the price of a Shake.
 */

public class Shake extends Gelato {
	// derived from Gelato class
	private String topping;
	private double toppingCost;
	String name;

	public Shake(String name, int cost, String topping, int toppingCost) {

		super(name, cost);
		this.topping = topping;
		this.toppingCost = toppingCost;
	}

	@Override
	public int getCost() {
		// cost of ice cream plus cost of the topping
		return ((int)(super.getCost() + this.toppingCost));
	}
}