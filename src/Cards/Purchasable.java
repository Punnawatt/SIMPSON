package Cards;

import java.util.ArrayList;

import Player.Player;
import Token.Token;

public interface Purchasable {
	
	public boolean canPurchased(Player player);
	
	public ArrayList<Token> purchase(Player player);
}
