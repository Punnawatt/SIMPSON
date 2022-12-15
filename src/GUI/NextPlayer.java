package GUI;

import java.util.ArrayList;

import Player.Player;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class NextPlayer extends HBox {
	private static ArrayList<Player> nextPlayer;
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
	private static Label name1;
	private static Label points1;
	private static HBox blueGem1;
	private static HBox greenGem1;
	private static HBox whiteGem1;
	private static HBox blackGem1;
	private static HBox redGem1;
	private static HBox blueToken1;
	private static HBox greenToken1;
	private static HBox whiteToken1;
	private static HBox blackToken1;
	private static HBox redToken1;
	private static Label name2;
	private static Label points2;
	private static HBox blueGem2;
	private static HBox greenGem2;
	private static HBox whiteGem2;
	private static HBox blackGem2;
	private static HBox redGem2;
	private static HBox blueToken2;
	private static HBox greenToken2;
	private static HBox whiteToken2;
	private static HBox blackToken2;
	private static HBox redToken2;
	private static Label name3;
	private static Label points3;
	private static HBox blueGem3;
	private static HBox greenGem3;
	private static HBox whiteGem3;
	private static HBox blackGem3;
	private static HBox redGem3;
	private static HBox blueToken3;
	private static HBox greenToken3;
	private static HBox whiteToken3;
	private static HBox blackToken3;
	private static HBox redToken3;
	private static HBox info1;
	private static HBox info2;
	private static HBox info3;
	private static VBox nextPlayer1;
	private static VBox nextPlayer2;
	private static VBox nextPlayer3;
	
	public NextPlayer(ArrayList<Player> nextPlayer) {
		setNextPlayer(nextPlayer);
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
		
		initializeNextPlayer1();
		initializeNextPlayer2();
		initializeNextPlayer3();
		this.getChildren().add(nextPlayer1);
		this.getChildren().add(nextPlayer2);
		this.getChildren().add(nextPlayer3);
		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		this.setPrefHeight(160);
		this.setPrefWidth(300);
		this.setMinHeight(160);
		this.setMinWidth(300);
	}

	public static ArrayList<Player> getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(ArrayList<Player> allPlayer) {
		NextPlayer.nextPlayer = allPlayer;
	}
	
	public int getNextPlayerCount() {
		return NextPlayer.nextPlayer.size();
	}
	
	public void initializeName1() {
		name1 = new Label(nextPlayer.get(0).getName());
		name1.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		name1.setPrefHeight(20);
		name1.setPrefWidth(80);
		name1.setAlignment(Pos.CENTER);
		name1.setFont(Font.font(15));
	}
	
	public static void updateName1(String name) {
		name1.setText(name);
	}
	
	public void initializePoints1() {
		points1 = new Label(Integer.toString(nextPlayer.get(0).getPoints()));
		points1.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		points1.setPrefHeight(20);
		points1.setPrefWidth(20);
		points1.setAlignment(Pos.CENTER);
		points1.setFont(Font.font(15));
	}
	
	public static void updatePoints1(int point) {
		points1.setText(Integer.toString(point));
	}
	
	public void initializeBlueGem1() {
		blueGem1 = new HBox();
		Image b = new Image(blueURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		
		blueGem1.getChildren().add(blueImg);
		blueGem1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getGemsInHand().get(0).getAmount())));
		blueGem1.setSpacing(20);
		blueGem1.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlueGem1(int amount) {
		Node point = blueGem1.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeGreenGem1() {
		greenGem1 = new HBox();
		Image g = new Image(greenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		
		greenGem1.getChildren().add(greenImg);
		greenGem1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getGemsInHand().get(1).getAmount())));
		greenGem1.setSpacing(20);
		greenGem1.setAlignment(Pos.CENTER);
	}
	
	public static void updateGreenGem1(int amount) {
		Node point = greenGem1.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeWhiteGem1() {
		whiteGem1 = new HBox();
		Image w = new Image(whiteURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		
		whiteGem1.getChildren().add(whiteImg);
		whiteGem1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getGemsInHand().get(2).getAmount())));
		whiteGem1.setSpacing(20);
		whiteGem1.setAlignment(Pos.CENTER);
	}
	
	public static void updateWhiteGem1(int amount) {
		Node point = whiteGem1.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeBlackGem1() {
		blackGem1 = new HBox();
		Image b = new Image(blackURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		
		blackGem1.getChildren().add(blackImg);
		blackGem1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getGemsInHand().get(3).getAmount())));
		blackGem1.setSpacing(20);
		blackGem1.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlackGem1(int amount) {
		Node point = blackGem1.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeRedGem1() {
		redGem1 = new HBox();
		Image r = new Image(redURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		
		redGem1.getChildren().add(redImg);
		redGem1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getGemsInHand().get(4).getAmount())));
		redGem1.setSpacing(20);
		redGem1.setAlignment(Pos.CENTER);
	}
	
	public static void updateRedGem1(int amount) {
		Node point = redGem1.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
		
	private void initializeBlueToken1() {
		Image b = new Image(blueTokenURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		blueToken1 = new HBox();
		
		blueToken1.getChildren().add(blueImg);
		blueToken1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getTokensInHand().get(0).getAmount())));
		blueToken1.setSpacing(20);
		blueToken1.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlueToken1(int amounts) {
		Node amount = blueToken1.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeGreenToken1() {
		Image g = new Image(greenTokenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		greenToken1 = new HBox();
		
		greenToken1.getChildren().add(greenImg);
		greenToken1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getTokensInHand().get(1).getAmount())));
		greenToken1.setSpacing(20);
		greenToken1.setAlignment(Pos.CENTER);
	}
	
	public static void updateGreenToken1(int amounts) {
		Node amount = greenToken1.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeWhiteToken1() {
		Image w = new Image(whiteTokenURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		whiteToken1 = new HBox();
		
		whiteToken1.getChildren().add(whiteImg);
		whiteToken1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getTokensInHand().get(2).getAmount())));
		whiteToken1.setSpacing(20);
		whiteToken1.setAlignment(Pos.CENTER);
	}
	
	public static void updateWhiteToken1(int amounts) {
		Node amount = whiteToken1.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeBlackToken1() {
		Image b = new Image(blackTokenURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		blackToken1 = new HBox();
		
		blackToken1.getChildren().add(blackImg);
		blackToken1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getTokensInHand().get(3).getAmount())));
		blackToken1.setSpacing(20);
		blackToken1.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlackToken1(int amounts) {
		Node amount = blackToken1.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeRedToken1() {
		Image r = new Image(redTokenURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		redToken1 = new HBox();
		
		redToken1.getChildren().add(redImg);
		redToken1.getChildren().add(new Text(Integer.toString(nextPlayer.get(0).getTokensInHand().get(4).getAmount())));
		redToken1.setSpacing(20);
		redToken1.setAlignment(Pos.CENTER);
	}
	
	public static void updateRedToken1(int amounts) {
		Node amount = redToken1.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	public void initializeName2() {
		name2 = new Label(nextPlayer.get(1).getName());
		name2.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		name2.setPrefHeight(20);
		name2.setPrefWidth(80);
		name2.setAlignment(Pos.CENTER);
		name2.setFont(Font.font(15));
	}
	
	public static void updateName2(String name) {
		name2.setText(name);
	}
	
	public void initializePoints2() {
		points2 = new Label(Integer.toString(nextPlayer.get(1).getPoints()));
		points2.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		points2.setPrefHeight(20);
		points2.setPrefWidth(20);
		points2.setAlignment(Pos.CENTER);
		points2.setFont(Font.font(15));
	}
	
	public static void updatePoints2(int point) {
		points2.setText(Integer.toString(point));
	}
	
	public void initializeBlueGem2() {
		blueGem2 = new HBox();
		Image b = new Image(blueURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		
		blueGem2.getChildren().add(blueImg);
		blueGem2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getGemsInHand().get(0).getAmount())));
		blueGem2.setSpacing(20);
		blueGem2.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlueGem2(int amount) {
		Node point = blueGem2.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeGreenGem2() {
		greenGem2 = new HBox();
		Image g = new Image(greenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		
		greenGem2.getChildren().add(greenImg);
		greenGem2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getGemsInHand().get(1).getAmount())));
		greenGem2.setSpacing(20);
		greenGem2.setAlignment(Pos.CENTER);
	}
	
	public static void updateGreenGem2(int amount) {
		Node point = greenGem2.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeWhiteGem2() {
		whiteGem2 = new HBox();
		Image w = new Image(whiteURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		
		whiteGem2.getChildren().add(whiteImg);
		whiteGem2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getGemsInHand().get(2).getAmount())));
		whiteGem2.setSpacing(20);
		whiteGem2.setAlignment(Pos.CENTER);
	}
	
	public static void updateWhiteGem2(int amount) {
		Node point = whiteGem2.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeBlackGem2() {
		blackGem2 = new HBox();
		Image b = new Image(blackURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		
		blackGem2.getChildren().add(blackImg);
		blackGem2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getGemsInHand().get(3).getAmount())));
		blackGem2.setSpacing(20);
		blackGem2.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlackGem2(int amount) {
		Node point = blackGem2.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeRedGem2() {
		redGem2 = new HBox();
		Image r = new Image(redURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		
		redGem2.getChildren().add(redImg);
		redGem2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getGemsInHand().get(4).getAmount())));
		redGem2.setSpacing(20);
		redGem2.setAlignment(Pos.CENTER);
	}
	
	public static void updateRedGem2(int amount) {
		Node point = redGem2.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
		
	private void initializeBlueToken2() {
		Image b = new Image(blueTokenURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		blueToken2 = new HBox();
		
		blueToken2.getChildren().add(blueImg);
		blueToken2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getTokensInHand().get(0).getAmount())));
		blueToken2.setSpacing(20);
		blueToken2.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlueToken2(int amounts) {
		Node amount = blueToken2.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeGreenToken2() {
		Image g = new Image(greenTokenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		greenToken2 = new HBox();
		
		greenToken2.getChildren().add(greenImg);
		greenToken2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getTokensInHand().get(1).getAmount())));
		greenToken2.setSpacing(20);
		greenToken2.setAlignment(Pos.CENTER);
	}
	
	public static void updateGreenToken2(int amounts) {
		Node amount = greenToken2.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeWhiteToken2() {
		Image w = new Image(whiteTokenURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		whiteToken2 = new HBox();
		
		whiteToken2.getChildren().add(whiteImg);
		whiteToken2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getTokensInHand().get(2).getAmount())));
		whiteToken2.setSpacing(20);
		whiteToken2.setAlignment(Pos.CENTER);
	}
	
	public static void updateWhiteToken2(int amounts) {
		Node amount = whiteToken2.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeBlackToken2() {
		Image b = new Image(blackTokenURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		blackToken2 = new HBox();
		
		blackToken2.getChildren().add(blackImg);
		blackToken2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getTokensInHand().get(3).getAmount())));
		blackToken2.setSpacing(20);
		blackToken2.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlackToken2(int amounts) {
		Node amount = blackToken2.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeRedToken2() {
		Image r = new Image(redTokenURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		redToken2 = new HBox();
		
		redToken2.getChildren().add(redImg);
		redToken2.getChildren().add(new Text(Integer.toString(nextPlayer.get(1).getTokensInHand().get(4).getAmount())));
		redToken2.setSpacing(20);
		redToken2.setAlignment(Pos.CENTER);
	}
	
	public static void updateRedToken2(int amounts) {
		Node amount = redToken2.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	public void initializeName3() {
		name3 = new Label(nextPlayer.get(2).getName());
		name3.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		name3.setPrefHeight(20);
		name3.setPrefWidth(80);
		name3.setAlignment(Pos.CENTER);
		name3.setFont(Font.font(15));
	}
	
	public static void updateName3(String name) {
		name3.setText(name);
	}
	
	public void initializePoints3() {
		points3 = new Label(Integer.toString(nextPlayer.get(2).getPoints()));
		points3.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		points3.setPrefHeight(20);
		points3.setPrefWidth(20);
		points3.setAlignment(Pos.CENTER);
		points3.setFont(Font.font(15));
	}
	
	public static void updatePoints3(int point) {
		points3.setText(Integer.toString(point));
	}
	
	public void initializeBlueGem3() {
		blueGem3 = new HBox();
		Image b = new Image(blueURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		
		blueGem3.getChildren().add(blueImg);
		blueGem3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getGemsInHand().get(0).getAmount())));
		blueGem3.setSpacing(20);
		blueGem3.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlueGem3(int amount) {
		Node point = blueGem3.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeGreenGem3() {
		greenGem3 = new HBox();
		Image g = new Image(greenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		
		greenGem3.getChildren().add(greenImg);
		greenGem3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getGemsInHand().get(1).getAmount())));
		greenGem3.setSpacing(20);
		greenGem3.setAlignment(Pos.CENTER);
	}
	
	public static void updateGreenGem3(int amount) {
		Node point = greenGem3.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeWhiteGem3() {
		whiteGem3 = new HBox();
		Image w = new Image(whiteURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		
		whiteGem3.getChildren().add(whiteImg);
		whiteGem3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getGemsInHand().get(2).getAmount())));
		whiteGem3.setSpacing(20);
		whiteGem3.setAlignment(Pos.CENTER);
	}
	
	public static void updateWhiteGem3(int amount) {
		Node point = whiteGem3.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeBlackGem3() {
		blackGem3 = new HBox();
		Image b = new Image(blackURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		
		blackGem3.getChildren().add(blackImg);
		blackGem3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getGemsInHand().get(3).getAmount())));
		blackGem3.setSpacing(20);
		blackGem3.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlackGem3(int amount) {
		Node point = blackGem3.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
	
	public void initializeRedGem3() {
		redGem3 = new HBox();
		Image r = new Image(redURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		
		redGem3.getChildren().add(redImg);
		redGem3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getGemsInHand().get(4).getAmount())));
		redGem3.setSpacing(20);
		redGem3.setAlignment(Pos.CENTER);
	}
	
	public static void updateRedGem3(int amount) {
		Node point = redGem3.getChildren().get(1);
		((Text) point).setText(Integer.toString(amount));
	}
		
	private void initializeBlueToken3() {
		Image b = new Image(blueTokenURL);
		ImageView blueImg = new ImageView(b);
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		blueToken3 = new HBox();
		
		blueToken3.getChildren().add(blueImg);
		blueToken3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getTokensInHand().get(0).getAmount())));
		blueToken3.setSpacing(20);
		blueToken3.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlueToken3(int amounts) {
		Node amount = blueToken3.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeGreenToken3() {
		Image g = new Image(greenTokenURL);
		ImageView greenImg = new ImageView(g);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		greenToken3 = new HBox();
		
		greenToken3.getChildren().add(greenImg);
		greenToken3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getTokensInHand().get(1).getAmount())));
		greenToken3.setSpacing(20);
		greenToken3.setAlignment(Pos.CENTER);
	}
	
	public static void updateGreenToken3(int amounts) {
		Node amount = greenToken3.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeWhiteToken3() {
		Image w = new Image(whiteTokenURL);
		ImageView whiteImg = new ImageView(w);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		whiteToken3 = new HBox();
		
		whiteToken3.getChildren().add(whiteImg);
		whiteToken3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getTokensInHand().get(2).getAmount())));
		whiteToken3.setSpacing(20);
		whiteToken3.setAlignment(Pos.CENTER);
	}
	
	public static void updateWhiteToken3(int amounts) {
		Node amount = whiteToken3.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeBlackToken3() {
		Image b = new Image(blackTokenURL);
		ImageView blackImg = new ImageView(b);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		blackToken3 = new HBox();
		
		blackToken3.getChildren().add(blackImg);
		blackToken3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getTokensInHand().get(3).getAmount())));
		blackToken3.setSpacing(20);
		blackToken3.setAlignment(Pos.CENTER);
	}
	
	public static void updateBlackToken3(int amounts) {
		Node amount = blackToken3.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	private void initializeRedToken3() {
		Image r = new Image(redTokenURL);
		ImageView redImg = new ImageView(r);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		redToken3 = new HBox();
		
		redToken3.getChildren().add(redImg);
		redToken3.getChildren().add(new Text(Integer.toString(nextPlayer.get(2).getTokensInHand().get(4).getAmount())));
		redToken3.setSpacing(20);
		redToken3.setAlignment(Pos.CENTER);
	}
	
	public static void updateRedToken3(int amounts) {
		Node amount = redToken3.getChildren().get(1);
		((Text) amount).setText(Integer.toString(amounts));
	}
	
	public void initializeInfo1() {
		info1 = new HBox();
		initializePoints1();
		initializeBlueGem1();
		initializeGreenGem1();
		initializeWhiteGem1();
		initializeBlackGem1();
		initializeRedGem1();
		initializeBlueToken1();
		initializeGreenToken1();
		initializeWhiteToken1();
		initializeBlackToken1();
		initializeRedToken1();
		VBox gem = new VBox();
		gem.getChildren().add(blueGem1);
		gem.getChildren().add(greenGem1);
		gem.getChildren().add(whiteGem1);
		gem.getChildren().add(blackGem1);
		gem.getChildren().add(redGem1);
		VBox token = new VBox();
		token.getChildren().add(blueToken1);
		token.getChildren().add(greenToken1);
		token.getChildren().add(whiteToken1);
		token.getChildren().add(blackToken1);
		token.getChildren().add(redToken1);
		Insets insets = new Insets(5);
		gem.setSpacing(5);
		gem.setAlignment(Pos.CENTER);
		gem.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		gem.setPadding(insets);
		token.setSpacing(5);
		token.setAlignment(Pos.CENTER);
		token.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		token.setPadding(insets);
		info1.getChildren().add(points1);
		info1.getChildren().add(gem);
		info1.getChildren().add(token);
		info1.setSpacing(5);
		info1.setAlignment(Pos.CENTER);
		info1.setPrefWidth(200);
	}
	
	public static void updateInfo1(Player player) {
		updatePoints1(player.getPoints());
		updateBlueGem1(player.getGemsInHand().get(0).getAmount());
		updateGreenGem1(player.getGemsInHand().get(1).getAmount());
		updateWhiteGem1(player.getGemsInHand().get(2).getAmount());
		updateBlackGem1(player.getGemsInHand().get(3).getAmount());
		updateRedGem1(player.getGemsInHand().get(4).getAmount());
		updateBlueToken1(player.getTokensInHand().get(0).getAmount());
		updateGreenToken1(player.getTokensInHand().get(1).getAmount());
		updateWhiteToken1(player.getTokensInHand().get(2).getAmount());
		updateBlackToken1(player.getTokensInHand().get(3).getAmount());
		updateRedToken1(player.getTokensInHand().get(4).getAmount());
	}
	
	public void initializeInfo2() {
		info2 = new HBox();
		initializePoints2();
		initializeBlueGem2();
		initializeGreenGem2();
		initializeWhiteGem2();
		initializeBlackGem2();
		initializeRedGem2();
		initializeBlueToken2();
		initializeGreenToken2();
		initializeWhiteToken2();
		initializeBlackToken2();
		initializeRedToken2();
		VBox gem = new VBox();
		gem.getChildren().add(blueGem2);
		gem.getChildren().add(greenGem2);
		gem.getChildren().add(whiteGem2);
		gem.getChildren().add(blackGem2);
		gem.getChildren().add(redGem2);
		VBox token = new VBox();
		token.getChildren().add(blueToken2);
		token.getChildren().add(greenToken2);
		token.getChildren().add(whiteToken2);
		token.getChildren().add(blackToken2);
		token.getChildren().add(redToken2);
		Insets insets = new Insets(5);
		gem.setSpacing(5);
		gem.setAlignment(Pos.CENTER);
		gem.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		gem.setPadding(insets);
		token.setSpacing(5);
		token.setAlignment(Pos.CENTER);
		token.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		token.setPadding(insets);
		info2.getChildren().add(points2);
		info2.getChildren().add(gem);
		info2.getChildren().add(token);
		info2.setSpacing(5);
		info2.setAlignment(Pos.CENTER);
		info2.setPrefWidth(200);
	}
	
	public static void updateInfo2(Player player) {
		updatePoints2(player.getPoints());
		updateBlueGem2(player.getGemsInHand().get(0).getAmount());
		updateGreenGem2(player.getGemsInHand().get(1).getAmount());
		updateWhiteGem2(player.getGemsInHand().get(2).getAmount());
		updateBlackGem2(player.getGemsInHand().get(3).getAmount());
		updateRedGem2(player.getGemsInHand().get(4).getAmount());
		updateBlueToken2(player.getTokensInHand().get(0).getAmount());
		updateGreenToken2(player.getTokensInHand().get(1).getAmount());
		updateWhiteToken2(player.getTokensInHand().get(2).getAmount());
		updateBlackToken2(player.getTokensInHand().get(3).getAmount());
		updateRedToken2(player.getTokensInHand().get(4).getAmount());
	}
	
	public void initializeInfo3() {
		info3 = new HBox();
		initializePoints3();
		initializeBlueGem3();
		initializeGreenGem3();
		initializeWhiteGem3();
		initializeBlackGem3();
		initializeRedGem3();
		initializeBlueToken3();
		initializeGreenToken3();
		initializeWhiteToken3();
		initializeBlackToken3();
		initializeRedToken3();
		VBox gem = new VBox();
		gem.getChildren().add(blueGem3);
		gem.getChildren().add(greenGem3);
		gem.getChildren().add(whiteGem3);
		gem.getChildren().add(blackGem3);
		gem.getChildren().add(redGem3);
		VBox token = new VBox();
		token.getChildren().add(blueToken3);
		token.getChildren().add(greenToken3);
		token.getChildren().add(whiteToken3);
		token.getChildren().add(blackToken3);
		token.getChildren().add(redToken3);
		Insets insets = new Insets(5);
		gem.setSpacing(5);
		gem.setAlignment(Pos.CENTER);
		gem.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		gem.setPadding(insets);
		token.setSpacing(5);
		token.setAlignment(Pos.CENTER);
		token.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		token.setPadding(insets);
		info3.getChildren().add(points3);
		info3.getChildren().add(gem);
		info3.getChildren().add(token);
		info3.setSpacing(5);
		info3.setAlignment(Pos.CENTER);
		info3.setPrefWidth(200);
	}
	
	public static void updateInfo3(Player player) {
		updatePoints3(player.getPoints());
		updateBlueGem3(player.getGemsInHand().get(0).getAmount());
		updateGreenGem3(player.getGemsInHand().get(1).getAmount());
		updateWhiteGem3(player.getGemsInHand().get(2).getAmount());
		updateBlackGem3(player.getGemsInHand().get(3).getAmount());
		updateRedGem3(player.getGemsInHand().get(4).getAmount());
		updateBlueToken3(player.getTokensInHand().get(0).getAmount());
		updateGreenToken3(player.getTokensInHand().get(1).getAmount());
		updateWhiteToken3(player.getTokensInHand().get(2).getAmount());
		updateBlackToken3(player.getTokensInHand().get(3).getAmount());
		updateRedToken3(player.getTokensInHand().get(4).getAmount());
	}
	
	public void initializeNextPlayer1() {
		nextPlayer1 = new VBox();
		initializeName1();
		initializeInfo1();
		Insets insets = new Insets(5);
		nextPlayer1.getChildren().add(name1);
		nextPlayer1.getChildren().add(info1);
		nextPlayer1.setSpacing(5);
		nextPlayer1.setAlignment(Pos.CENTER);
		nextPlayer1.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		nextPlayer1.setPadding(insets);
		nextPlayer1.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateNextPlayer1(Player player) {
		updateName1(player.getName());
		updateInfo1(player);
	}
	
	public void initializeNextPlayer2() {
		nextPlayer2 = new VBox();
		initializeName2();
		initializeInfo2();
		Insets insets = new Insets(5);
		nextPlayer2.getChildren().add(name2);
		nextPlayer2.getChildren().add(info2);
		nextPlayer2.setSpacing(5);
		nextPlayer2.setAlignment(Pos.CENTER);
		nextPlayer2.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		nextPlayer2.setPadding(insets);
		nextPlayer2.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateNextPlayer2(Player player) {
		updateName2(player.getName());
		updateInfo2(player);
	}
	
	public void initializeNextPlayer3() {
		nextPlayer3 = new VBox();
		initializeName3();
		initializeInfo3();
		Insets insets = new Insets(5);
		nextPlayer3.getChildren().add(name3);
		nextPlayer3.getChildren().add(info3);
		nextPlayer3.setSpacing(5);
		nextPlayer3.setAlignment(Pos.CENTER);
		nextPlayer3.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		nextPlayer3.setPadding(insets);
		nextPlayer3.setBackground(new Background(new BackgroundFill(Color.SANDYBROWN, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateNextPlayer3(Player player) {
		updateName3(player.getName());
		updateInfo3(player);
	}
	
	public Label setNameInBox(Player player) {
		Label text = new Label(player.getName());
		text.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		text.setPrefHeight(20);
		text.setPrefWidth(80);
		text.setAlignment(Pos.CENTER);
		text.setFont(Font.font(15));
		return text;
	}
	
	public HBox setInfo(Label points, VBox gem, VBox token) {
		HBox box = new HBox();
		box.getChildren().add(points);
		box.getChildren().add(gem);
		box.getChildren().add(token);
		return box;
	}
	
	public Label setPointsInBox(Player player) {
		Label text = new Label(Integer.toString(player.getPoints()));
		text.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		text.setPrefHeight(20);
		text.setPrefWidth(20);
		text.setAlignment(Pos.CENTER);
		text.setFont(Font.font(15));
		return text;
	}
	
	public VBox setGemsInBox(Player player) {
		VBox box = new VBox();
		HBox blueGem = new HBox();
		HBox greenGem = new HBox();
		HBox whiteGem = new HBox();
		HBox blackGem = new HBox();
		HBox redGem = new HBox();
		
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		ImageView blueImg = new ImageView(blue);
		ImageView greenImg = new ImageView(green);
		ImageView whiteImg = new ImageView(white);
		ImageView blackImg = new ImageView(black);
		ImageView redImg = new ImageView(red);
		
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		
		Text blueText = new Text(Integer.toString(player.getGemCount("blue")));
		Text greenText= new Text(Integer.toString(player.getGemCount("green")));
		Text whiteText = new Text(Integer.toString(player.getGemCount("white")));
		Text blackText = new Text(Integer.toString(player.getGemCount("black")));
		Text redText = new Text(Integer.toString(player.getGemCount("red")));
		blueText.setFont(Font.font(15));
		greenText.setFont(Font.font(15));
		whiteText.setFont(Font.font(15));
		blackText.setFont(Font.font(15));
		redText.setFont(Font.font(15));

		blueGem.getChildren().add(blueImg);
		blueGem.getChildren().add(blueText);
		greenGem.getChildren().add(greenImg);
		greenGem.getChildren().add(greenText);
		whiteGem.getChildren().add(whiteImg);
		whiteGem.getChildren().add(whiteText);
		blackGem.getChildren().add(blackImg);
		blackGem.getChildren().add(blackText);
		redGem.getChildren().add(redImg);
		redGem.getChildren().add(redText);
		
		blueGem.setSpacing(20);
		greenGem.setSpacing(20);
		whiteGem.setSpacing(20);
		blackGem.setSpacing(20);
		redGem.setSpacing(20);
		
		box.getChildren().add(blueGem);
		box.getChildren().add(greenGem);
		box.getChildren().add(whiteGem);
		box.getChildren().add(blackGem);
		box.getChildren().add(redGem);
		
		box.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		box.setAlignment(Pos.CENTER);
		box.setSpacing(5);
		return box;
	}
	
	public VBox setTokensInBox(Player player) {
		VBox box = new VBox();
		HBox blueToken = new HBox();
		HBox greenToken = new HBox();
		HBox whiteToken = new HBox();
		HBox blackToken = new HBox();
		HBox redToken = new HBox();
		
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
		
		blueImg.setFitHeight(20);
		blueImg.setFitWidth(20);
		greenImg.setFitHeight(20);
		greenImg.setFitWidth(20);
		whiteImg.setFitHeight(20);
		whiteImg.setFitWidth(20);
		blackImg.setFitHeight(20);
		blackImg.setFitWidth(20);
		redImg.setFitHeight(20);
		redImg.setFitWidth(20);
		
		Text blueText = new Text(" " + Integer.toString(player.getTokenCount("blue")));
		Text greenText= new Text(" " + Integer.toString(player.getTokenCount("green")));
		Text whiteText = new Text(" " + Integer.toString(player.getTokenCount("white")));
		Text blackText = new Text(" " + Integer.toString(player.getTokenCount("black")));
		Text redText = new Text(" " + Integer.toString(player.getTokenCount("red")));
		blueText.setFont(Font.font(15));
		greenText.setFont(Font.font(15));
		whiteText.setFont(Font.font(15));
		blackText.setFont(Font.font(15));
		redText.setFont(Font.font(15));

		blueToken.getChildren().add(blueImg);
		blueToken.getChildren().add(blueText);
		greenToken.getChildren().add(greenImg);
		greenToken.getChildren().add(greenText);
		whiteToken.getChildren().add(whiteImg);
		whiteToken.getChildren().add(whiteText);
		blackToken.getChildren().add(blackImg);
		blackToken.getChildren().add(blackText);
		redToken.getChildren().add(redImg);
		redToken.getChildren().add(redText);
		
		blueToken.setSpacing(20);
		greenToken.setSpacing(20);
		whiteToken.setSpacing(20);
		blackToken.setSpacing(20);
		redToken.setSpacing(20);
		
		box.getChildren().add(blueToken);
		box.getChildren().add(greenToken);
		box.getChildren().add(whiteToken);
		box.getChildren().add(blackToken);
		box.getChildren().add(redToken);
		
		box.setBorder(new Border((new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT))));
		box.setAlignment(Pos.CENTER);
		box.setSpacing(5);
		return box;
	}

	public String getBlueURL() {
		return blueURL;
	}

	public String getGreenURL() {
		return greenURL;
	}

	public String getWhiteURL() {
		return whiteURL;
	}

	public String getBlackURL() {
		return blackURL;
	}

	public String getRedURL() {
		return redURL;
	}

	public String getBlueTokenURL() {
		return blueTokenURL;
	}

	public String getGreenTokenURL() {
		return greenTokenURL;
	}

	public String getWhiteTokenURL() {
		return whiteTokenURL;
	}

	public String getBlackTokenURL() {
		return blackTokenURL;
	}

	public String getRedTokenURL() {
		return redTokenURL;
	}

}
