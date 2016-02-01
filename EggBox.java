public class EggBox {
	private int egg_amount;
	private int egg_remainder;
	private int box_amount;

	public EggBox(int egg_amount) {
		this.egg_amount = egg_amount;
	}

	//Methods to calculate the number of box needed per dozen of egg and the remainder egg from the amount of egg entered.
	public void calculateBoxAndEggs() {
		this.box_amount = this.egg_amount / 12;
		this.egg_remainder = this.egg_amount % 12;
	}

	//Method that return the number of boxes needed.
	public int getBoxAmount() {
		return this.box_amount;
	}

	//Method that return the number of egg remaining.
	public int getEggAmount() {
		return this.egg_remainder;
	}
}