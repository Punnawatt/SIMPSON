package Gem;

public class Gem {
	private String color;
	private int amount;

	public Gem(String color, int amount) {
		setColor(color);
		setAmount(amount);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
