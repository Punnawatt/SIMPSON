package GUI;

import java.util.ArrayList;


import Token.Token;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class TokenOnBoard extends VBox{
	private static ArrayList<Token> tokensOnBoard;
	private Token blue;
	private Token green;
	private Token white;
	private Token black;
	private Token red;
	private final static String blueTokenURL = "blueTokenNoBg.png";
	private final static String greenTokenURL = "greenTokenNoBg.png";
	private final static String blackTokenURL = "blackTokenNoBg.png";
	private final static String whiteTokenURL = "whiteTokenNoBg.png";
	private final static String redTokenURL = "redTokenNoBg.png";
	private static HBox blueBox;
	private static HBox greenBox;
	private static HBox whiteBox;
	private static HBox blackBox;
	private static HBox redBox;

	public TokenOnBoard() {
		setTokensOnBoard(new ArrayList<Token>());
		setUpToken();
		initializeBlueBox();
		initializeGreenBox();
		initializeWhiteBox();
		initializeBlackBox();
		initializeRedBox();
		this.getChildren().add(blueBox);
		this.getChildren().add(greenBox);
		this.getChildren().add(whiteBox);
		this.getChildren().add(blackBox);
		this.getChildren().add(redBox);
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER);
	}
	
	public static ArrayList<Token> getTokensOnBoard() {
		return tokensOnBoard;
	}

	public void setTokensOnBoard(ArrayList<Token> tokensOnBoard) {
		TokenOnBoard.tokensOnBoard = tokensOnBoard;
	}
	
	public void setUpToken() {
		blue = new Token("blue", 7);
		green = new Token("green", 7);
		white = new Token("white", 7);
		black = new Token("black", 7);
		red = new Token("red", 7);
		tokensOnBoard.add(blue);
		tokensOnBoard.add(green);
		tokensOnBoard.add(white);
		tokensOnBoard.add(black);
		tokensOnBoard.add(red);
	}
	
	private void initializeBlueBox() {
		Image b = new Image(blueTokenURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(30);
		blueImg.setFitWidth(30);
		blueBox = new HBox();
		
		blueBox.getChildren().add(blueImg);
		blueBox.getChildren().add(new Text(Integer.toString(blue.getAmount())));
	}
	
	public static void updateBlueBox(int point) {
		Node points = blueBox.getChildren().get(1);
		((Text) points).setText(Integer.toString(point));
	}
	
	private void initializeGreenBox() {
		Image g = new Image(greenTokenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(30);
		greenImg.setFitWidth(30);
		greenBox = new HBox();
		
		greenBox.getChildren().add(greenImg);
		greenBox.getChildren().add(new Text(Integer.toString(green.getAmount())));
	}
	
	public static void updateGreenBox(int point) {
		Node points = greenBox.getChildren().get(1);
		((Text) points).setText(Integer.toString(point));
	}
	
	private void initializeWhiteBox() {
		Image w = new Image(whiteTokenURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(30);
		whiteImg.setFitWidth(30);
		whiteBox = new HBox();
		
		whiteBox.getChildren().add(whiteImg);
		whiteBox.getChildren().add(new Text(Integer.toString(white.getAmount())));
	}
	
	public static void updateWhiteBox(int point) {
		Node points = whiteBox.getChildren().get(1);
		((Text) points).setText(Integer.toString(point));
	}
	
	private void initializeBlackBox() {
		Image b = new Image(blackTokenURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(30);
		blackImg.setFitWidth(30);
		blackBox = new HBox();
		
		blackBox.getChildren().add(blackImg);
		blackBox.getChildren().add(new Text(Integer.toString(black.getAmount())));
	}
	
	public static void updateBlackBox(int point) {
		Node points = blackBox.getChildren().get(1);
		((Text) points).setText(Integer.toString(point));
	}
	
	private void initializeRedBox() {
		Image r = new Image(redTokenURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(30);
		redImg.setFitWidth(30);
		redBox = new HBox();
		
		redBox.getChildren().add(redImg);
		redBox.getChildren().add(new Text(Integer.toString(red.getAmount())));
	}
	
	public static void updateRedBox(int point) {
		Node points = redBox.getChildren().get(1);
		((Text) points).setText(Integer.toString(point));
	}
	
	public static HBox makeToken(Token token) {
		Image blue = new Image(blueTokenURL);
		Image green = new Image(greenTokenURL);
		Image white = new Image(whiteTokenURL);
		Image black = new Image(blackTokenURL);
		Image red = new Image(redTokenURL);
		
		ImageView blueImg = new ImageView(blue);
		ImageView greenImg = new ImageView(green);
		ImageView whiteImg = new ImageView(white);
		ImageView blackImg = new ImageView(black);
		ImageView redImg = new ImageView(red);
		
		blueImg.setFitHeight(30);
		blueImg.setFitWidth(30);
		greenImg.setFitHeight(30);
		greenImg.setFitWidth(30);
		whiteImg.setFitHeight(30);
		whiteImg.setFitWidth(30);
		blackImg.setFitHeight(30);
		blackImg.setFitWidth(30);
		redImg.setFitHeight(30);
		redImg.setFitWidth(30);
		
		HBox box = new HBox();
		String color = token.getColor();
		if (color.equals("blue")) {
			box.getChildren().add(blueImg);
		} else if (color.equals("green")) {
			box.getChildren().add(greenImg);
		} else if (color.equals("white")) {
			box.getChildren().add(whiteImg);
		} else if (color.equals("black")) {
			box.getChildren().add(blackImg);
		} else if (color.equals("red")) {
			box.getChildren().add(redImg);
		}
		Text text = new Text(Integer.toString(token.getAmount()));
		text.setFont(Font.font(15));
		box.getChildren().add(text);
		box.setPrefHeight(30);
		box.setPrefWidth(40);
		box.setAlignment(Pos.CENTER);
		box.setSpacing(10);
		return box;
	}
	
}
