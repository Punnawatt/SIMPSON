package Cards;

import Gem.Gem;
import java.util.ArrayList;
import Token.Token;

public class Card {
	private int points;
	private int level;
	private Gem bonus;
	private ArrayList<Token> price;
	
	public Card(int points, int level, Gem bonus, ArrayList<Token> price) {
		setPoints(points);
		setLevel(level);
		setBonus(bonus);
		setPrice(price);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Gem getBonus() {
		return bonus;
	}

	public void setBonus(Gem bonus) {
		this.bonus = bonus;
	}

	public ArrayList<Token> getPrice() {
		return price;
	}

	public void setPrice(ArrayList<Token> price) {
		this.price = price;
	}
	
}
