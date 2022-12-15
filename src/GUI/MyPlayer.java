package GUI;

import Cards.Card;

import Deck.*;

import java.util.ArrayList;

import Cards.*;
import Player.Player;
import Token.Token;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyPlayer extends HBox {
	private Player player;
	private final String blueURL;
	private final String greenURL;
	private final String whiteURL;
	private final String blackURL;
	private final String redURL;
	private final String blueTokenURL;
	private final String greenTokenURL;
	private final String whiteTokenURL;
	private final String blackTokenURL;
	private final String redTokenURL;
	private Label points;
	private HBox blueGem;
	private HBox greenGem;
	private HBox whiteGem;
	private HBox blackGem;
	private HBox redGem;
	private HBox blueToken;
	private HBox greenToken;
	private HBox whiteToken;
	private HBox blackToken;
	private HBox redToken;
	
		
	public MyPlayer(Player player) {
		setPlayer(player);
		blueURL = "blueNoBg.png";
		greenURL = "greenNoBg.png";
		whiteURL = "whiteNoBg.png";
		blackURL = "blackNoBg.png";
		redURL = "redNoBg.png";
		blueTokenURL = "blueTokenNoBg.png";
		greenTokenURL = "greenTokenNoBg.png";
		whiteTokenURL = "whiteTokenNoBg.png";
		blackTokenURL = "blackTokenNoBg.png";
		redTokenURL = "redTokenNoBg.png";
		initializePoints();
		initializeBlueGem();
		initializeGreenGem();
		initializeWhiteGem();
		initializeBlackGem();
		initializeRedGem();
		VBox gems = new VBox();
		gems.getChildren().add(blueGem);
		gems.getChildren().add(greenGem);
		gems.getChildren().add(whiteGem);
		gems.getChildren().add(blackGem);
		gems.getChildren().add(redGem);
		gems.setSpacing(5);
		gems.setAlignment(Pos.CENTER);
		gems.setPrefHeight(120);
		gems.setPrefWidth(80);
		gems.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		initializeBlueToken();
		initializeGreenToken();
		initializeWhiteToken();
		initializeBlackToken();
		initializeRedToken();
		VBox tokens = new VBox();
		tokens.getChildren().add(blueToken);
		tokens.getChildren().add(greenToken);
		tokens.getChildren().add(whiteToken);
		tokens.getChildren().add(blackToken);
		tokens.getChildren().add(redToken);
		tokens.setSpacing(5);
		tokens.setAlignment(Pos.CENTER);
		tokens.setPrefHeight(120);
		tokens.setPrefWidth(80);
		tokens.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		this.getChildren().add(points);
		this.getChildren().add(gems);
		this.getChildren().add(tokens);
		this.getChildren().add(setUpButton());
		this.setAlignment(Pos.CENTER);
		this.setSpacing(10);
	}
	
	public void initializePoints() {
		points = new Label(Integer.toString(player.getPoints()));
		points.setAlignment(Pos.CENTER);
		points.setPrefHeight(20);
		points.setPrefWidth(20);
		points.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
	}
	
	public void updatePoints(int point) {
		points.setText(Integer.toString(point));
	}
	
	public void initializeBlueGem() {
		blueGem = new HBox();
		Image b = new Image(blueURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		
		blueGem.getChildren().add(blueImg);
		blueGem.getChildren().add(new Text(Integer.toString(player.getGemsInHand().get(0).getAmount())));
		blueGem.setSpacing(20);
		blueGem.setAlignment(Pos.CENTER);
	}
	
	public void updateBlueGem(int amount) {
		Node point = blueGem.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeGreenGem() {
		greenGem = new HBox();
		Image g = new Image(greenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		
		greenGem.getChildren().add(greenImg);
		greenGem.getChildren().add(new Text(Integer.toString(player.getGemsInHand().get(1).getAmount())));
		greenGem.setSpacing(20);
		greenGem.setAlignment(Pos.CENTER);
	}
	
	public void updateGreenGem(int amount) {
		Node point = greenGem.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeWhiteGem() {
		whiteGem = new HBox();
		Image w = new Image(whiteURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		
		whiteGem.getChildren().add(whiteImg);
		whiteGem.getChildren().add(new Text(Integer.toString(player.getGemsInHand().get(2).getAmount())));
		whiteGem.setSpacing(20);
		whiteGem.setAlignment(Pos.CENTER);
	}
	
	public void updateWhiteGem(int amount) {
		Node point = whiteGem.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeBlackGem() {
		blackGem = new HBox();
		Image b = new Image(blackURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		
		blackGem.getChildren().add(blackImg);
		blackGem.getChildren().add(new Text(Integer.toString(player.getGemsInHand().get(3).getAmount())));
		blackGem.setSpacing(20);
		blackGem.setAlignment(Pos.CENTER);
	}
	
	public void updateBlackGem(int amount) {
		Node point = blackGem.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeRedGem() {
		redGem = new HBox();
		Image r = new Image(redURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		
		redGem.getChildren().add(redImg);
		redGem.getChildren().add(new Text(Integer.toString(player.getGemsInHand().get(4).getAmount())));
		redGem.setSpacing(20);
		redGem.setAlignment(Pos.CENTER);
	}
	
	public void updateRedGem(int amount) {
		Node point = redGem.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
		
	private void initializeBlueToken() {
		Image b = new Image(blueTokenURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		blueToken = new HBox();
		
		blueToken.getChildren().add(blueImg);
		blueToken.getChildren().add(new Text(Integer.toString(player.getTokensInHand().get(0).getAmount())));
		blueToken.setSpacing(20);
		blueToken.setAlignment(Pos.CENTER);
	}
	
	public void updateBlueToken(int amounts) {
		Node amount = blueToken.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeGreenToken() {
		Image g = new Image(greenTokenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		greenToken = new HBox();
		
		greenToken.getChildren().add(greenImg);
		greenToken.getChildren().add(new Text(Integer.toString(player.getTokensInHand().get(1).getAmount())));
		greenToken.setSpacing(20);
		greenToken.setAlignment(Pos.CENTER);
	}
	
	public void updateGreenToken(int amounts) {
		Node amount = greenToken.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeWhiteToken() {
		Image w = new Image(whiteTokenURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		whiteToken = new HBox();
		
		whiteToken.getChildren().add(whiteImg);
		whiteToken.getChildren().add(new Text(Integer.toString(player.getTokensInHand().get(2).getAmount())));
		whiteToken.setSpacing(20);
		whiteToken.setAlignment(Pos.CENTER);
	}
	
	public void updateWhiteToken(int amounts) {
		Node amount = whiteToken.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeBlackToken() {
		Image b = new Image(blackTokenURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		blackToken = new HBox();
		
		blackToken.getChildren().add(blackImg);
		blackToken.getChildren().add(new Text(Integer.toString(player.getTokensInHand().get(3).getAmount())));
		blackToken.setSpacing(20);
		blackToken.setAlignment(Pos.CENTER);
	}
	
	public void updateBlackToken(int amounts) {
		Node amount = blackToken.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeRedToken() {
		Image r = new Image(redTokenURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		redToken = new HBox();
		
		redToken.getChildren().add(redImg);
		redToken.getChildren().add(new Text(Integer.toString(player.getTokensInHand().get(4).getAmount())));
		redToken.setSpacing(20);
		redToken.setAlignment(Pos.CENTER);
	}
	
	public void updateRedToken(int amounts) {
		Node amount = redToken.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	public VBox setUpButton() {
		VBox box = new VBox();
		Button purchase = new Button("Purchase Card");
		Button token2 = new Button("Take 2 Tokens");
		Button token3 = new Button("Take 3 Tokens");
		
		purchase.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				VBox deck = new VBox();
				HBox box1 = new HBox();
				HBox box2 = new HBox();
				HBox box3 = new HBox();
				ArrayList<Card> drawnCard1 = DeckAndCardOnBoard.getCardsOnBoard1();
				ArrayList<Card> drawnCard2 = DeckAndCardOnBoard.getCardsOnBoard2();
				ArrayList<Card> drawnCard3 = DeckAndCardOnBoard.getCardsOnBoard3();
				Stage stage = new Stage();
				for (int i = 0; i < drawnCard1.size(); i++) {
					Card card1 = drawnCard1.get(i);
					VBox cardOnBoard1 = DeckAndCardOnBoard.makeCard(card1);
					cardOnBoard1.setPrefHeight(170);
					Button button1 = new Button("purchase");
					cardOnBoard1.getChildren().add(button1);
					button1.setPrefHeight(20);
					button1.setPrefWidth(80);
					int no1 = i;
					button1.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {
							if (((LevelOne) card1).canPurchased(player)) {
								ArrayList<Token> price = ((LevelOne) card1).purchase(player);
								for (Token token: price) {
									if (token.getColor().equals("blue") && card1.getBonus().getColor().equals("blue")) {
										TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("blue")) + 1);
									} else if (token.getColor().equals("green") && card1.getBonus().getColor().equals("green")) {
										TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("green")) + 1);
									} else if (token.getColor().equals("white") && card1.getBonus().getColor().equals("white")) {
										TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("white")) + 1);
									} else if (token.getColor().equals("black") && card1.getBonus().getColor().equals("black")) {
										TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("black")) + 1);
									} else if (token.getColor().equals("red") && card1.getBonus().getColor().equals("red")) {
										TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("red")) + 1);
									} else if (token.getColor().equals("blue")) {
										TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("blue")));
									} else if (token.getColor().equals("green")) {
										TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("green")));
									} else if (token.getColor().equals("white")) {
										TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("white")));
									} else if (token.getColor().equals("black")) {
										TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("black")));
									} else if (token.getColor().equals("red")) {
										TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("red")));
									}
								}
								DeckAndCardOnBoard.getDeckOne().draw();
								Card drawn1 = DeckAndCardOnBoard.getDeckOne().getDrawnCard();
								if (no1 == 0) {
									DeckAndCardOnBoard.updateCard11(drawn1);
									drawnCard1.remove(0);
									drawnCard1.add(0, drawn1);
								} else if (no1 == 1) {
									DeckAndCardOnBoard.updateCard12(drawn1);
									drawnCard1.remove(1);
									drawnCard1.add(1, drawn1);
								} else if (no1 == 2) {
									DeckAndCardOnBoard.updateCard13(drawn1);
									drawnCard1.remove(2);
									drawnCard1.add(2, drawn1);
								} else if (no1 == 3) {
									DeckAndCardOnBoard.updateCard14(drawn1);
									drawnCard1.remove(3);
									drawnCard1.add(3, drawn1);
								}
								if (player.isWin()) {
									Alert alert = new Alert(AlertType.INFORMATION,player.getName() + " Win!",ButtonType.OK);
									alert.setHeaderText(null);
									alert.setTitle("Congratulations");
									alert.showAndWait();
									if (alert.getResult() == ButtonType.OK) {
										Platform.exit();
									}
								} else {
									Player current = player;
									Player next = NextPlayer.getNextPlayer().get(0);
									setPlayer(next);
									updatePoints(next.getPoints());
									updateBlueGem(next.getGemsInHand().get(0).getAmount());
									updateGreenGem(next.getGemsInHand().get(1).getAmount());
									updateWhiteGem(next.getGemsInHand().get(2).getAmount());
									updateBlackGem(next.getGemsInHand().get(3).getAmount());
									updateRedGem(next.getGemsInHand().get(4).getAmount());
									updateBlueToken(next.getTokensInHand().get(0).getAmount());
									updateGreenToken(next.getTokensInHand().get(1).getAmount());
									updateWhiteToken(next.getTokensInHand().get(2).getAmount());
									updateBlackToken(next.getTokensInHand().get(3).getAmount());
									updateRedToken(next.getTokensInHand().get(4).getAmount());
									NextPlayer.getNextPlayer().remove(next);
									NextPlayer.getNextPlayer().add(current);
									NextPlayer.updateNextPlayer1(NextPlayer.getNextPlayer().get(0));
									NextPlayer.updateNextPlayer2(NextPlayer.getNextPlayer().get(1));
									NextPlayer.updateNextPlayer3(NextPlayer.getNextPlayer().get(2));
									TokenOnBoard.updateBlueBox(TokenOnBoard.getTokensOnBoard().get(0).getAmount());
									TokenOnBoard.updateGreenBox(TokenOnBoard.getTokensOnBoard().get(1).getAmount());
									TokenOnBoard.updateWhiteBox(TokenOnBoard.getTokensOnBoard().get(2).getAmount());
									TokenOnBoard.updateBlackBox(TokenOnBoard.getTokensOnBoard().get(3).getAmount());
									TokenOnBoard.updateRedBox(TokenOnBoard.getTokensOnBoard().get(4).getAmount());
								}
								stage.close();
							}
						}
					});
					box1.getChildren().add(cardOnBoard1);
				}
				box1.setSpacing(20);
				box1.setAlignment(Pos.CENTER);
				
				for (int i = 0; i < drawnCard2.size(); i++) {
					Card card2 = drawnCard2.get(i);
					VBox cardOnBoard2 = DeckAndCardOnBoard.makeCard(card2);
					cardOnBoard2.setPrefHeight(170);
					Button button2 = new Button("purchase");
					cardOnBoard2.getChildren().add(button2);
					button2.setPrefHeight(20);
					button2.setPrefWidth(80);
					int no2 = i;
					button2.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {
							if (((LevelTwo) card2).canPurchased(player)) {
								ArrayList<Token> price = ((LevelTwo) card2).purchase(player);
								for (Token token: price) {
									if (token.getColor().equals("blue") && card2.getBonus().getColor().equals("blue")) {
										TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("blue") + 1));
									} else if (token.getColor().equals("green") && card2.getBonus().getColor().equals("green")) {
										TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("green") + 1));
									} else if (token.getColor().equals("white") && card2.getBonus().getColor().equals("white")) {
										TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("white") + 1));
									} else if (token.getColor().equals("black") && card2.getBonus().getColor().equals("black")) {
										TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("black") + 1));
									} else if (token.getColor().equals("red") && card2.getBonus().getColor().equals("red")) {
										TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("red") + 1));
									} else if (token.getColor().equals("blue")) {
										TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("blue")));
									} else if (token.getColor().equals("green")) {
										TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("green")));
									} else if (token.getColor().equals("white")) {
										TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("white")));
									} else if (token.getColor().equals("black")) {
										TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("black")));
									} else if (token.getColor().equals("red")) {
										TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("red")));
									}
								}
								DeckAndCardOnBoard.getDeckTwo().draw();
								Card drawn2 = DeckAndCardOnBoard.getDeckTwo().getDrawnCard();
								if (no2 == 0) {
									DeckAndCardOnBoard.updateCard21(drawn2);
									drawnCard2.remove(0);
									drawnCard2.add(0, drawn2);
								} else if (no2 == 1) {
									DeckAndCardOnBoard.updateCard22(drawn2);
									drawnCard2.remove(1);
									drawnCard2.add(1, drawn2);
								} else if (no2 == 2) {
									DeckAndCardOnBoard.updateCard23(drawn2);
									drawnCard2.remove(2);
									drawnCard2.add(2, drawn2);
								} else if (no2 == 3) {
									DeckAndCardOnBoard.updateCard24(drawn2);
									drawnCard2.remove(3);
									drawnCard2.add(3, drawn2);
								}
								if (player.isWin()) {
									Alert alert = new Alert(AlertType.INFORMATION,player.getName() + " Win!",ButtonType.OK);
									alert.setHeaderText(null);
									alert.setTitle("Congratulations");
									alert.showAndWait();
									if (alert.getResult() == ButtonType.OK) {
										Platform.exit();
									}
								} else {
									Player current = player;
									Player next = NextPlayer.getNextPlayer().get(0);
									setPlayer(next);
									updatePoints(next.getPoints());
									updateBlueGem(next.getGemsInHand().get(0).getAmount());
									updateGreenGem(next.getGemsInHand().get(1).getAmount());
									updateWhiteGem(next.getGemsInHand().get(2).getAmount());
									updateBlackGem(next.getGemsInHand().get(3).getAmount());
									updateRedGem(next.getGemsInHand().get(4).getAmount());
									updateBlueToken(next.getTokensInHand().get(0).getAmount());
									updateGreenToken(next.getTokensInHand().get(1).getAmount());
									updateWhiteToken(next.getTokensInHand().get(2).getAmount());
									updateBlackToken(next.getTokensInHand().get(3).getAmount());
									updateRedToken(next.getTokensInHand().get(4).getAmount());
									NextPlayer.getNextPlayer().remove(next);
									NextPlayer.getNextPlayer().add(current);
									NextPlayer.updateNextPlayer1(NextPlayer.getNextPlayer().get(0));
									NextPlayer.updateNextPlayer2(NextPlayer.getNextPlayer().get(1));
									NextPlayer.updateNextPlayer3(NextPlayer.getNextPlayer().get(2));
									TokenOnBoard.updateBlueBox(TokenOnBoard.getTokensOnBoard().get(0).getAmount());
									TokenOnBoard.updateGreenBox(TokenOnBoard.getTokensOnBoard().get(1).getAmount());
									TokenOnBoard.updateWhiteBox(TokenOnBoard.getTokensOnBoard().get(2).getAmount());
									TokenOnBoard.updateBlackBox(TokenOnBoard.getTokensOnBoard().get(3).getAmount());
									TokenOnBoard.updateRedBox(TokenOnBoard.getTokensOnBoard().get(4).getAmount());
								}
								stage.close();
							}
						}
					});
					box2.getChildren().add(cardOnBoard2);
				}
				box2.setSpacing(20);
				box2.setAlignment(Pos.CENTER);
				
				for (int i = 0; i < drawnCard3.size(); i++) {
					Card card3 = drawnCard3.get(i);
					VBox cardOnBoard3 = DeckAndCardOnBoard.makeCard(card3);
					cardOnBoard3.setPrefHeight(170);
					Button button3 = new Button("purchase");
					cardOnBoard3.getChildren().add(button3);
					button3.setPrefHeight(20);
					button3.setPrefWidth(80);
					int no3 = i;
					button3.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {
							if (((LevelThree) card3).canPurchased(player)) {
								ArrayList<Token> price = ((LevelThree) card3).purchase(player);
								for (Token token: price) {
									if (token.getColor().equals("blue") && card3.getBonus().getColor().equals("blue")) {
										TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("blue")) + 1);
									} else if (token.getColor().equals("green") && card3.getBonus().getColor().equals("green")) {
										TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("green")) + 1);
									} else if (token.getColor().equals("white") && card3.getBonus().getColor().equals("white")) {
										TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("white")) + 1);
									} else if (token.getColor().equals("black") && card3.getBonus().getColor().equals("black")) {
										TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("black")) + 1);
									} else if (token.getColor().equals("red") && card3.getBonus().getColor().equals("red")) {
										TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("red")) + 1);
									} else if (token.getColor().equals("blue")) {
										TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("blue")));
									} else if (token.getColor().equals("green")) {
										TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("green")));
									} else if (token.getColor().equals("white")) {
										TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("white")));
									} else if (token.getColor().equals("black")) {
										TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("black")));
									} else if (token.getColor().equals("red")) {
										TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() + Math.max(0, token.getAmount() - player.getGemCount("red")));
									}
								}
								DeckAndCardOnBoard.getDeckThree().draw();
								Card drawn3 = DeckAndCardOnBoard.getDeckThree().getDrawnCard();
								if (no3 == 0) {
									DeckAndCardOnBoard.updateCard31(drawn3);
									drawnCard3.remove(0);
									drawnCard3.add(0, drawn3);
								} else if (no3 == 1) {
									DeckAndCardOnBoard.updateCard32(drawn3);
									drawnCard3.remove(1);
									drawnCard3.add(1, drawn3);
								} else if (no3 == 2) {
									DeckAndCardOnBoard.updateCard33(drawn3);
									drawnCard3.remove(2);
									drawnCard3.add(2, drawn3);
								} else if (no3 == 3) {
									DeckAndCardOnBoard.updateCard34(drawn3);
									drawnCard3.remove(3);
									drawnCard3.add(3, drawn3);
								}
								if (player.isWin()) {
									Alert alert = new Alert(AlertType.INFORMATION,player.getName() + " Win!",ButtonType.OK);
									alert.setHeaderText(null);
									alert.setTitle("Congratulations");
									alert.showAndWait();
									if (alert.getResult() == ButtonType.OK) {
										Platform.exit();
									}
								} else {
									Player current = player;
									Player next = NextPlayer.getNextPlayer().get(0);
									Player next2 = NextPlayer.getNextPlayer().get(1);
									Player next3 = NextPlayer.getNextPlayer().get(2);
									updatePoints(next.getPoints());
									updateBlueGem(next.getGemsInHand().get(0).getAmount());
									updateGreenGem(next.getGemsInHand().get(1).getAmount());
									updateWhiteGem(next.getGemsInHand().get(2).getAmount());
									updateBlackGem(next.getGemsInHand().get(3).getAmount());
									updateRedGem(next.getGemsInHand().get(4).getAmount());
									updateBlueToken(next.getTokensInHand().get(0).getAmount());
									updateGreenToken(next.getTokensInHand().get(1).getAmount());
									updateWhiteToken(next.getTokensInHand().get(2).getAmount());
									updateBlackToken(next.getTokensInHand().get(3).getAmount());
									updateRedToken(next.getTokensInHand().get(4).getAmount());
									NextPlayer.updateNextPlayer1(next2);
									NextPlayer.updateNextPlayer2(next3);
									NextPlayer.updateNextPlayer3(current);
									NextPlayer.getNextPlayer().remove(next);
									NextPlayer.getNextPlayer().add(current);
									setPlayer(next);
									TokenOnBoard.updateBlueBox(TokenOnBoard.getTokensOnBoard().get(0).getAmount());
									TokenOnBoard.updateGreenBox(TokenOnBoard.getTokensOnBoard().get(1).getAmount());
									TokenOnBoard.updateWhiteBox(TokenOnBoard.getTokensOnBoard().get(2).getAmount());
									TokenOnBoard.updateBlackBox(TokenOnBoard.getTokensOnBoard().get(3).getAmount());
									TokenOnBoard.updateRedBox(TokenOnBoard.getTokensOnBoard().get(4).getAmount());
								}
								stage.close();
							}
						}
					});
					box3.getChildren().add(cardOnBoard3);
				}
				box3.setSpacing(20);
				box3.setAlignment(Pos.CENTER);

				deck.getChildren().add(box3);
				deck.getChildren().add(box2);
				deck.getChildren().add(box1);
				deck.setSpacing(20);
				deck.setAlignment(Pos.CENTER);
				Scene scene = new Scene(deck);
				stage.setScene(scene);
				stage.setTitle("Purchase");
				stage.show();
			}
		});
		
		token2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				HBox box = new HBox();
				Stage stage = new Stage();
				for (int i = 0; i < TokenOnBoard.getTokensOnBoard().size(); i++) {
					VBox token = new VBox();
					Token tokens = TokenOnBoard.getTokensOnBoard().get(i);
					token.getChildren().add(TokenOnBoard.makeToken(tokens));
					Button button = new Button("Take 2");
					token.getChildren().add(button);
					token.setSpacing(20);
					token.setAlignment(Pos.CENTER);
					button.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent e) {
							if (tokens.getAmount() >= 4) {
								if (tokens.getColor().equals(TokenOnBoard.getTokensOnBoard().get(0).getColor())) {
									TokenOnBoard.getTokensOnBoard().get(0).setAmount(TokenOnBoard.getTokensOnBoard().get(0).getAmount() - 2);
								} else if (tokens.getColor().equals(TokenOnBoard.getTokensOnBoard().get(1).getColor())) {
									TokenOnBoard.getTokensOnBoard().get(1).setAmount(TokenOnBoard.getTokensOnBoard().get(1).getAmount() - 2);
								} else if (tokens.getColor().equals(TokenOnBoard.getTokensOnBoard().get(2).getColor())) {
									TokenOnBoard.getTokensOnBoard().get(2).setAmount(TokenOnBoard.getTokensOnBoard().get(2).getAmount() - 2);
								} else if (tokens.getColor().equals(TokenOnBoard.getTokensOnBoard().get(3).getColor())) {
									TokenOnBoard.getTokensOnBoard().get(3).setAmount(TokenOnBoard.getTokensOnBoard().get(3).getAmount() - 2);
								} else if (tokens.getColor().equals(TokenOnBoard.getTokensOnBoard().get(4).getColor())) {
									TokenOnBoard.getTokensOnBoard().get(4).setAmount(TokenOnBoard.getTokensOnBoard().get(4).getAmount() - 2);
								}
								if (tokens.getColor().equals(player.getTokensInHand().get(0).getColor())) {
									player.getTokensInHand().get(0).setAmount(player.getTokensInHand().get(0).getAmount() + 2);
								} else if (tokens.getColor().equals(player.getTokensInHand().get(1).getColor())) {
									player.getTokensInHand().get(1).setAmount(player.getTokensInHand().get(1).getAmount() + 2);
								} else if (tokens.getColor().equals(player.getTokensInHand().get(2).getColor())) {
									player.getTokensInHand().get(2).setAmount(player.getTokensInHand().get(2).getAmount() + 2);
								} else if (tokens.getColor().equals(player.getTokensInHand().get(3).getColor())) {
									player.getTokensInHand().get(3).setAmount(player.getTokensInHand().get(3).getAmount() + 2);
								} else if (tokens.getColor().equals(player.getTokensInHand().get(4).getColor())) {
									player.getTokensInHand().get(4).setAmount(player.getTokensInHand().get(4).getAmount() + 2);
								}
								TokenOnBoard.updateBlueBox(TokenOnBoard.getTokensOnBoard().get(0).getAmount());
								TokenOnBoard.updateGreenBox(TokenOnBoard.getTokensOnBoard().get(1).getAmount());
								TokenOnBoard.updateWhiteBox(TokenOnBoard.getTokensOnBoard().get(2).getAmount());
								TokenOnBoard.updateBlackBox(TokenOnBoard.getTokensOnBoard().get(3).getAmount());
								TokenOnBoard.updateRedBox(TokenOnBoard.getTokensOnBoard().get(4).getAmount());
								updatePoints(player.getPoints());
								updateBlueToken(player.getTokensInHand().get(0).getAmount());
								updateGreenToken(player.getTokensInHand().get(1).getAmount());
								updateWhiteToken(player.getTokensInHand().get(2).getAmount());
								updateBlackToken(player.getTokensInHand().get(3).getAmount());
								updateRedToken(player.getTokensInHand().get(4).getAmount());
								if (player.isWin()) {
									Alert alert = new Alert(AlertType.INFORMATION,player.getName() + " Win!",ButtonType.OK);
									alert.setHeaderText(null);
									alert.setTitle("Congratulations");
									alert.showAndWait();
									if (alert.getResult() == ButtonType.OK) {
										Platform.exit();
									}
								} else {
									Player current = player;
									Player next = NextPlayer.getNextPlayer().get(0);
									setPlayer(next);
									NextPlayer.getNextPlayer().remove(next);
									NextPlayer.getNextPlayer().add(current);
									updatePoints(next.getPoints());
									updateBlueGem(next.getGemsInHand().get(0).getAmount());
									updateGreenGem(next.getGemsInHand().get(1).getAmount());
									updateWhiteGem(next.getGemsInHand().get(2).getAmount());
									updateBlackGem(next.getGemsInHand().get(3).getAmount());
									updateRedGem(next.getGemsInHand().get(4).getAmount());
									updateBlueToken(next.getTokensInHand().get(0).getAmount());
									updateGreenToken(next.getTokensInHand().get(1).getAmount());
									updateWhiteToken(next.getTokensInHand().get(2).getAmount());
									updateBlackToken(next.getTokensInHand().get(3).getAmount());
									updateRedToken(next.getTokensInHand().get(4).getAmount());
									NextPlayer.updateNextPlayer1(NextPlayer.getNextPlayer().get(0));
									NextPlayer.updateNextPlayer2(NextPlayer.getNextPlayer().get(1));
									NextPlayer.updateNextPlayer3(NextPlayer.getNextPlayer().get(2));
								}
								stage.close();
							}
						}
					});
					box.getChildren().add(token);
				}
				box.setSpacing(20);
				box.setAlignment(Pos.CENTER);
				Scene scene = new Scene(box);
				stage.setTitle("Take 2 tokens");
				stage.setScene(scene);
				stage.show();
			}
		});
		
		token3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Stage stage = new Stage();
				VBox box = setToken3();
				Scene scene = new Scene(box);
				box.setSpacing(20);
				box.setAlignment(Pos.CENTER);
				Button button = new Button("OK");
				box.getChildren().add(button);
				Node node = box.getChildren().get(0);
				((HBox) node).getChildren().get(0);
				button.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent e) {
						int count = 0;
						ArrayList<Integer> selected = new ArrayList<Integer>();
						for (int i = 0; i < 5; i++) {
							Node node1 = ((HBox) node).getChildren().get(i);
							Node check = ((VBox) node1).getChildren().get(1);
							Node tokenAndPoint = ((VBox) node1).getChildren().get(0);
							Node point = ((HBox) tokenAndPoint).getChildren().get(1);
							if (((CheckBox) check).isSelected() && Double.parseDouble(((Text) point).getText()) > 0) {
								selected.add(i);
								count += 1;
							}
						}
						if (count <= 3) {
							for (int i = 0; i < selected.size(); i++) {
								Token token = TokenOnBoard.getTokensOnBoard().get(selected.get(i));
								Token playerToken = player.getTokensInHand().get(selected.get(i));
								playerToken.setAmount(playerToken.getAmount() + 1);
								token.setAmount(token.getAmount() - 1);
								if (token.getColor().equals("blue")) {
									TokenOnBoard.updateBlueBox(token.getAmount());
									updateBlueToken(playerToken.getAmount());
								} else if (token.getColor().equals("green")) {
									TokenOnBoard.updateGreenBox(token.getAmount());
									updateGreenToken(playerToken.getAmount());
								} else if (token.getColor().equals("white")) {
									TokenOnBoard.updateWhiteBox(token.getAmount());
									updateWhiteToken(playerToken.getAmount());
								} else if (token.getColor().equals("black")) {
									TokenOnBoard.updateBlackBox(token.getAmount());
									updateBlackToken(playerToken.getAmount());
								} else if (token.getColor().equals("red")) {
									TokenOnBoard.updateRedBox(token.getAmount());
									updateRedToken(playerToken.getAmount());
								}
							}
							updatePoints(player.getPoints());
							if (player.isWin()) {
								Alert alert = new Alert(AlertType.INFORMATION,player.getName() + " Win!",ButtonType.OK);
								alert.setHeaderText(null);
								alert.setTitle("Congratulations");
								alert.showAndWait();
								if (alert.getResult() == ButtonType.OK) {
									Platform.exit();
								}
							} else {
								Player current = player;
								Player next = NextPlayer.getNextPlayer().get(0);
								setPlayer(next);
								NextPlayer.getNextPlayer().remove(next);
								NextPlayer.getNextPlayer().add(current);
								updatePoints(next.getPoints());
								updateBlueGem(next.getGemsInHand().get(0).getAmount());
								updateGreenGem(next.getGemsInHand().get(1).getAmount());
								updateWhiteGem(next.getGemsInHand().get(2).getAmount());
								updateBlackGem(next.getGemsInHand().get(3).getAmount());
								updateRedGem(next.getGemsInHand().get(4).getAmount());
								updateBlueToken(next.getTokensInHand().get(0).getAmount());
								updateGreenToken(next.getTokensInHand().get(1).getAmount());
								updateWhiteToken(next.getTokensInHand().get(2).getAmount());
								updateBlackToken(next.getTokensInHand().get(3).getAmount());
								updateRedToken(next.getTokensInHand().get(4).getAmount());
								NextPlayer.updateNextPlayer1(NextPlayer.getNextPlayer().get(0));
								NextPlayer.updateNextPlayer2(NextPlayer.getNextPlayer().get(1));
								NextPlayer.updateNextPlayer3(NextPlayer.getNextPlayer().get(2));
							}
							stage.close();
						}
					}
				});
				stage.setScene(scene);
				stage.setTitle("Take 3 Tokens");
				stage.show();
			}
		});
		
		box.getChildren().add(purchase);
		box.getChildren().add(token2);
		box.getChildren().add(token3);
		box.setSpacing(10);
		return box;
	}
	
	public HBox setPurchaseCard(Deck deck) {
		HBox box = new HBox();
		ArrayList<Card> drawnCard = new ArrayList<Card>();
		if (deck instanceof DeckOne) {
			drawnCard = DeckAndCardOnBoard.getCardsOnBoard1();
		} else if (deck instanceof DeckTwo) {
			drawnCard = DeckAndCardOnBoard.getCardsOnBoard2();
		} else if (deck instanceof DeckThree) {
			drawnCard = DeckAndCardOnBoard.getCardsOnBoard3();
		}
		for (int i = 0; i < drawnCard.size(); i++) {
			VBox card = DeckAndCardOnBoard.makeCard(drawnCard.get(i));
			card.setPrefHeight(170);
			Button button = new Button("purchase");
			card.getChildren().add(button);
			button.setPrefHeight(20);
			button.setPrefWidth(80);
			setUpPurchaseButton(button, drawnCard.get(i));
			box.getChildren().add(card);
		}
		box.setSpacing(20);
		box.setAlignment(Pos.CENTER);
		return box;
	}
	
	public void setUpPurchaseButton(Button button, Card card) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (card instanceof LevelOne) {
					if (((LevelOne) card).canPurchased(player)) {
						((LevelOne) card).purchase(player);
					}
				} else if (card instanceof LevelTwo) {
					if (((LevelTwo) card).canPurchased(player)) {
						((LevelTwo) card).purchase(player);
					}
				} else if (card instanceof LevelThree) {
					if (((LevelThree) card).canPurchased(player)) {
						((LevelThree) card).purchase(player);
					}
				}
			}
		});
	}
	
	public VBox setToken3() {
		VBox box = new VBox();
		HBox box1 = new HBox();
		for (int i = 0; i < TokenOnBoard.getTokensOnBoard().size(); i++) {
			VBox token = new VBox();
			token.getChildren().add(TokenOnBoard.makeToken(TokenOnBoard.getTokensOnBoard().get(i)));
			CheckBox button = new CheckBox("Take 1");
			token.getChildren().add(button);
			token.setSpacing(20);
			token.setAlignment(Pos.CENTER);
			box1.getChildren().add(token);
		}
		box1.setSpacing(20);
		box1.setAlignment(Pos.CENTER);
		box.getChildren().add(box1);
		box.setSpacing(20);
		box.setAlignment(Pos.CENTER);
		return box;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
}
