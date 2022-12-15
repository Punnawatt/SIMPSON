package Cards;

import java.util.ArrayList;

import Gem.Gem;
import Player.Player;
import Token.Token;

public class LevelOne extends Card implements Purchasable {
	public LevelOne(int points, Gem bonus, ArrayList<Token> price) {
		super(points, 1, bonus, price);
	}
	
	@Override
	public boolean canPurchased(Player player) {
		int count = 0;
		for (Token x : getPrice()) {
			for (Gem  y : player.getAllMoney()) {
				if (x.getColor().equals(y.getColor())) {
					if (y.getAmount() >= x.getAmount()) {
						count += 1;
						break;
					} else {
						return false;
					}
				}
			}
		}
		if (count == getPrice().size()) {
			return true;
		}
		return false;
	}
	
	@Override
	public ArrayList<Token> purchase(Player player) {
		if (canPurchased(player)) {
			for (Token priceEachToken : getPrice()) {
				int cost = 0;
				for (Gem gemRightColor : player.getGemsInHand()) {
					if (gemRightColor.getColor().equals(priceEachToken.getColor())) {
						cost = Math.max(0, priceEachToken.getAmount() - gemRightColor.getAmount());
					}
				}
				for (Token token : player.getTokensInHand()) {
					if (token.getColor().equals(priceEachToken.getColor())) {
						token.setAmount(token.getAmount() - cost);
					}
				}
			}
			player.addCardandGem(this);
		}
		return getPrice();
	}
}
