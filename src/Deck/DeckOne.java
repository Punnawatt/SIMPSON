package Deck;

import java.util.ArrayList;

import Cards.Card;
import Cards.LevelOne;

public class DeckOne extends Deck{
	private ArrayList<LevelOne> deck;
	private LevelOne drawnCard;
	
	public DeckOne() {
		super(1);
		deck = new ArrayList<LevelOne>();
	}

	public ArrayList<LevelOne> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<LevelOne> deck) {
		this.deck = deck;
	}
	
	public int getDeckSize() {
		return this.deck.size();
	}
	
	public LevelOne getDrawnCard() {
		return drawnCard;
	}

	public void setDrawnCard(LevelOne drawnCard) {
		this.drawnCard = drawnCard;
	}

	@Override
	public void addCard(Card card) {
		LevelOne cardOne = new LevelOne(card.getPoints(), card.getBonus(), card.getPrice());
		deck.add(cardOne);
	}
	
	@Override
	public void draw() {
		if (getDeckSize() > 0) {
			int index = (int)(Math.random() * this.getDeckSize());
			LevelOne drawnCard = this.getDeck().get(index);
			setDrawnCard(drawnCard);
			this.deck.remove(index);
		}
	}
}
