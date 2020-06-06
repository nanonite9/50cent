/* 
 * Filename: Macaron.java
 * Author: nanonite9
 * Date: November 27, 2017
 * Description: This program is a subclass of the SweetTreat (originally Item) class, it has a cost determined per dozen and rounded.
 */

public class Macaron extends SweetTreat {
	// derived from SweetTreat class
	private double number;
	private double pricePerDozen; // price is determined by dozen
	String name;

	public Macaron(String name, double number, double pricePerDozen) {

		this.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}

	@Override
	public int getCost() {
		// cost rounded to nearest cent
		return ((int)Math.round(number * pricePerDozen / 12)); 
	}
}