package Player;

import java.util.ArrayList;


import Cards.Card;
import Token.Token;
import Gem.Gem;

public class Player {
	private ArrayList<Token> tokensInHand;
	private ArrayList<Card> cardsInHand;
	private int points;
	private String name;
	private ArrayList<Gem> gemsInHand;
	
	public Player(String name) {
		setName(name);
		setTokensInHand();
		setCardsInHand(new ArrayList<Card>());
		setPoints(0);
		setGemsInHand();
	}

	public ArrayList<Card> getCardsInHand() {
		return cardsInHand;
	}

	public void setCardsInHand(ArrayList<Card> cardsInHand) {
		this.cardsInHand = cardsInHand;
	}
	
	public void addCardandGem(Card card) {
		cardsInHand.add(card);
		setPoints(getPoints() + card.getPoints());
		for (Gem x : gemsInHand) {
			if (card.getBonus().getColor().equals(x.getColor())) {
				x.setAmount(x.getAmount() + 1);
				return;
			}
		}
	}

	public int getPoints() {
		return points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Token> getTokensInHand() {
		return tokensInHand;
	}

	public void setTokensInHand() {
		tokensInHand = new ArrayList<Token>();
		Token blue = new Token("blue", 0);
		Token green = new Token("green", 0);
		Token white = new Token("white", 0);
		Token black = new Token("black", 0);
		Token red = new Token("red", 0);
		tokensInHand.add(blue);
		tokensInHand.add(green);
		tokensInHand.add(white);
		tokensInHand.add(black);
		tokensInHand.add(red);
	}
	
	public void addToken(Token token) {
		for (Token x : tokensInHand) {
			if (x.getColor().equals(token.getColor())) {
				x.setAmount(x.getAmount() + token.getAmount());
				return;
			}
		}
		tokensInHand.add(token);
	}
	
	public ArrayList<Gem> getGemsInHand() {
		return gemsInHand;
	}
	
	public ArrayList<Gem> getAllMoney() {
		ArrayList<Gem> allMoney = new ArrayList<Gem>();
        Gem blue = new Gem("blue", 0);
        Gem green = new Gem("green", 0);
        Gem white = new Gem("white", 0);
        Gem black = new Gem("black", 0);
        Gem red = new Gem("red", 0);
        allMoney.add(blue); allMoney.add(green); allMoney.add(white); allMoney.add(black); allMoney.add(red);
        for (Gem x : allMoney) {
            for (Token y : tokensInHand) {
                if (x.getColor().equals(y.getColor())) {
                    x.setAmount(y.getAmount() + x.getAmount());
                    break;
                }
            }
            for (Gem y : gemsInHand) {
                if (x.getColor().equals(y.getColor())) {
                    x.setAmount(y.getAmount() + x.getAmount());
                    break;
                }
            }
        }
        return allMoney;
	}
	
	public void setGemsInHand() {
		gemsInHand = new ArrayList<Gem>();
		Gem blue = new Gem("blue", 0);
		Gem green = new Gem("green", 0);
		Gem white = new Gem("white", 0);
		Gem black = new Gem("black", 0);
		Gem red = new Gem("red", 0);
		gemsInHand.add(blue);
		gemsInHand.add(green);
		gemsInHand.add(white);
		gemsInHand.add(black);
		gemsInHand.add(red);
	}
	
	public int getGemCount(String color) {
		for (Gem x : getGemsInHand()) {
			if (x.getColor().equals(color)) {
				return x.getAmount();
			}
		}
		return 0;
	}
	
	public int getTokenCount(String color) {
		for (Token x : getTokensInHand()) {
			if (x.getColor().equals(color)) {
				return x.getAmount();
			}
		}
		return 0;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean isWin() {
		if (points >= 15) {
			return true;
		} else {
			return false;
		}
	}
}
