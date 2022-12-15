package Deck;

import java.util.ArrayList;

import Cards.LevelTwo;
import Cards.Card;

public class DeckTwo extends Deck{
	private ArrayList<LevelTwo> deck;
	private LevelTwo drawnCard;
	
	public DeckTwo() {
		super(2);
		deck = new ArrayList<LevelTwo>();
	}

	public ArrayList<LevelTwo> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<LevelTwo> deck) {
		this.deck = deck;
	}

	public int getDeckSize() {
		return this.deck.size();
	}
	
	public LevelTwo getDrawnCard() {
		return drawnCard;
	}

	public void setDrawnCard(LevelTwo drawnCard) {
		this.drawnCard = drawnCard;
	}
	
	@Override
	public void addCard(Card card) {
		LevelTwo cardTwo = new LevelTwo(card.getPoints(), card.getBonus(), card.getPrice());
		deck.add(cardTwo);
	}
	
	@Override
	public void draw() {
		if (getDeckSize() > 0) {
			int index = (int)(Math.random() * this.getDeckSize());
			LevelTwo drawnCard = this.getDeck().get(index);
			setDrawnCard(drawnCard);
			this.deck.remove(index);
		}
	}
}
