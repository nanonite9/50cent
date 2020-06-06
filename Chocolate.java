/* 
 * Filename: Chocolate.java
 * Author: nanonite9
 * Date: November 27, 2017
 * Description: This program is a subclass of the SweetTreat (originally Item) class, it has a cost determined per pound and rounded.
 */

public class Chocolate extends SweetTreat {
	// derived from SweetTreat class
	private double weight;
	private double pricePerPound; // price is determined by pound
	String name;

	public Chocolate(String name, double weight, double pricePerPound) {
		
		this.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}

	@Override
	public int getCost() {
		// cost rounded to nearest cent
		return ((int)Math.round(weight * pricePerPound));
	}
}