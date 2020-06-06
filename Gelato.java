/* 
 * Filename: Gelato.java
 * Author: nanonite9
 * Date: November 27, 2017
 * Description: This program is a subclass of the SweetTreat (originally Item) class, it has a cost.
 */

public class Gelato extends SweetTreat {
	// derived from SweetTreat class
	private double cost;
	String name;

	public Gelato(String name, double cost) {

		this.name = name;
		this.cost = cost;
	}

	@Override
	public int getCost() {
		// simply has a cost
		return ((int)cost);
	}
}