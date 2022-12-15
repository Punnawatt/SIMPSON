package Deck;

import Cards.Card;

public abstract class Deck {
	private int level;
	
	public Deck(int level) {
		setLevel(level);
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public abstract void addCard(Card card);
	
	public abstract void draw();
	
}
