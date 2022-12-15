package Deck;

import java.util.ArrayList;

import Cards.Card;
import Cards.LevelThree;

public class DeckThree extends Deck{
	private ArrayList<LevelThree> deck;
	private LevelThree drawnCard;
	
	public DeckThree() {
		super(3);
		deck = new ArrayList<LevelThree>();
	}

	public ArrayList<LevelThree> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<LevelThree> deck) {
		this.deck = deck;
	}
	
	public int getDeckSize() {
		return this.deck.size();
	}

	public LevelThree getDrawnCard() {
		return drawnCard;
	}

	public void setDrawnCard(LevelThree drawnCard) {
		this.drawnCard = drawnCard;
	}
	
	@Override
	public void addCard(Card card) {
		LevelThree cardThree = new LevelThree(card.getPoints(), card.getBonus(), card.getPrice());
		deck.add(cardThree);
	}
	
	@Override
	public void draw() {
		if (getDeckSize() > 0) { 
			int index = (int)(Math.random() * this.getDeckSize());
			LevelThree drawnCard = this.getDeck().get(index);
			setDrawnCard(drawnCard);
			this.deck.remove(index);
		}
	}
}
