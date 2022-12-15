package Token;

public class Token {
	private String color;
	private int amount;
	
	public Token(String color, int amount) {
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
