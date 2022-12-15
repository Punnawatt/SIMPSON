package GUI;

import java.util.ArrayList;


import Cards.*;
import Deck.*;
import Gem.Gem;
import Token.Token;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class DeckAndCardOnBoard extends VBox{
	private Deck deck;
	private static DeckOne deckOne;
	private static DeckTwo deckTwo;
	private static DeckThree deckThree;
	private static ArrayList<Card> cardsOnBoard3;
	private static ArrayList<Card> cardsOnBoard2;
	private static ArrayList<Card> cardsOnBoard1;
	private static final String blueURL = "blueNoBg.png";
	private static final String greenURL = "greenNoBg.png";
	private final static String blackURL = "blackNoBg.png";
	private final static String whiteURL = "whiteNoBg.png";
	private final static String redURL = "redNoBg.png";
	private final static String blueTokenURL = "blueTokenNoBg.png";
	private final static String greenTokenURL = "greenTokenNoBg.png";
	private final static String blackTokenURL = "blackTokenNoBg.png";
	private final static String whiteTokenURL = "whiteTokenNoBg.png";
	private final static String redTokenURL = "redTokenNoBg.png";
	private Pane deck1;
	private Pane deck2;
	private Pane deck3;
	private static VBox card31;
	private static VBox card32;
	private static VBox card33;
	private static VBox card34;
	private static VBox card21;
	private static VBox card22;
	private static VBox card23;
	private static VBox card24;
	private static VBox card11;
	private static VBox card12;
	private static VBox card13;
	private static VBox card14;
	private static HBox gemAndPoints31;
	private static HBox gemAndPoints32;
	private static HBox gemAndPoints33;
	private static HBox gemAndPoints34;
	private static HBox gemAndPoints21;
	private static HBox gemAndPoints22;
	private static HBox gemAndPoints23;
	private static HBox gemAndPoints24;
	private static HBox gemAndPoints11;
	private static HBox gemAndPoints12;
	private static HBox gemAndPoints13;
	private static HBox gemAndPoints14;
	private static VBox tokenAndPrice11;
	private static VBox tokenAndPrice12;
	private static VBox tokenAndPrice13;
	private static VBox tokenAndPrice14;
	private static VBox tokenAndPrice21;
	private static VBox tokenAndPrice22;
	private static VBox tokenAndPrice23;
	private static VBox tokenAndPrice24;
	private static VBox tokenAndPrice31;
	private static VBox tokenAndPrice32;
	private static VBox tokenAndPrice33;
	private static VBox tokenAndPrice34;


	public DeckAndCardOnBoard() {
		setCardsOnBoard3(new ArrayList<Card>());
		setCardsOnBoard2(new ArrayList<Card>());
		setCardsOnBoard1(new ArrayList<Card>());
		deckOne = new DeckOne();
		deckTwo = new DeckTwo();
		deckThree = new DeckThree();
		setUpDeckOne();
		setUpDeckTwo();
		setUpDeckThree();
		HBox Deck3 = new HBox();
		HBox Deck2 = new HBox();
		HBox Deck1 = new HBox();
		initializeDeck1();
		initializeDeck2();
		initializeDeck3();
		Deck3.getChildren().add(deck3);
		Deck2.getChildren().add(deck2);
		Deck1.getChildren().add(deck1);
		drawCard(deckOne);
		drawCard(deckTwo);
		drawCard(deckThree);
		initializeCard11();
		initializeCard12();
		initializeCard13();
		initializeCard14();
		initializeCard21();
		initializeCard22();
		initializeCard23();
		initializeCard24();
		initializeCard31();
		initializeCard32();
		initializeCard33();
		initializeCard34();
		Deck1.getChildren().add(card11);
		Deck1.getChildren().add(card12);
		Deck1.getChildren().add(card13);
		Deck1.getChildren().add(card14);
		Deck2.getChildren().add(card21);
		Deck2.getChildren().add(card22);
		Deck2.getChildren().add(card23);
		Deck2.getChildren().add(card24);
		Deck3.getChildren().add(card31);
		Deck3.getChildren().add(card32);
		Deck3.getChildren().add(card33);
		Deck3.getChildren().add(card34);
		Deck1.setSpacing(20);
		Deck2.setSpacing(20);
		Deck3.setSpacing(20);
		this.getChildren().add(Deck3);
		this.getChildren().add(Deck2);
		this.getChildren().add(Deck1);
		this.setSpacing(20);
		this.setAlignment(Pos.CENTER);
	}
	
	public void initializeDeck1() {
		deck1 = new Pane();
		deck1.setPrefHeight(130);
		deck1.setPrefWidth(100);
		deck1.setMinHeight(130);
		deck1.setMinWidth(100);
		BackgroundFill fill = new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY);
		deck1.setBackground(new Background(fill));
	}
	
	public void initializeDeck2() {
		deck2 = new Pane();
		deck2.setPrefHeight(130);
		deck2.setPrefWidth(100);
		deck2.setMinHeight(130);
		deck2.setMinWidth(100);
		BackgroundFill fill = new BackgroundFill(Color.GOLDENROD, CornerRadii.EMPTY, Insets.EMPTY);
		deck2.setBackground(new Background(fill));
	}
	
	public void initializeDeck3() {
		deck3 = new Pane();
		deck3.setPrefHeight(130);
		deck3.setPrefWidth(100);
		deck3.setMinHeight(130);
		deck3.setMinWidth(100);
		BackgroundFill fill = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
		deck3.setBackground(new Background(fill));
	}
	
	public void initializeGemAndPoints11() {
		gemAndPoints11 = new HBox();
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
		
		gemAndPoints11.setPrefWidth(80);
		gemAndPoints11.setMaxWidth(80);
		
		gemAndPoints11.getChildren().add(new Text(Integer.toString(cardsOnBoard1.get(0).getPoints())));
		if (cardsOnBoard1.get(0).getBonus().getColor().equals("blue")) {
			gemAndPoints11.getChildren().add(blueImg);
		} else if (cardsOnBoard1.get(0).getBonus().getColor().equals("green")) {
			gemAndPoints11.getChildren().add(greenImg);
		} else if (cardsOnBoard1.get(0).getBonus().getColor().equals("white")) {
			gemAndPoints11.getChildren().add(whiteImg);
		} else if (cardsOnBoard1.get(0).getBonus().getColor().equals("black")) {
			gemAndPoints11.getChildren().add(blackImg);
		} else if (cardsOnBoard1.get(0).getBonus().getColor().equals("red")) {
			gemAndPoints11.getChildren().add(redImg);
		}
		gemAndPoints11.setSpacing(20);
		gemAndPoints11.setAlignment(Pos.CENTER);
		gemAndPoints11.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints11(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints11.getChildren().get(0);
		Node gem = gemAndPoints11.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints12() {
		gemAndPoints12 = new HBox();
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
		
		gemAndPoints12.setPrefWidth(80);
		gemAndPoints12.setMaxWidth(80);
		
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
		
		gemAndPoints12.getChildren().add(new Text(Integer.toString(cardsOnBoard1.get(1).getPoints())));
		if (cardsOnBoard1.get(1).getBonus().getColor().equals("blue")) {
			gemAndPoints12.getChildren().add(blueImg);
		} else if (cardsOnBoard1.get(1).getBonus().getColor().equals("green")) {
			gemAndPoints12.getChildren().add(greenImg);
		} else if (cardsOnBoard1.get(1).getBonus().getColor().equals("white")) {
			gemAndPoints12.getChildren().add(whiteImg);
		} else if (cardsOnBoard1.get(1).getBonus().getColor().equals("black")) {
			gemAndPoints12.getChildren().add(blackImg);
		} else if (cardsOnBoard1.get(1).getBonus().getColor().equals("red")) {
			gemAndPoints12.getChildren().add(redImg);
		}
		gemAndPoints12.setSpacing(20);
		gemAndPoints12.setAlignment(Pos.CENTER);
		gemAndPoints12.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints12(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints12.getChildren().get(0);
		Node gem = gemAndPoints12.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints13() {
		gemAndPoints13 = new HBox();
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
		
		gemAndPoints13.setPrefWidth(80);
		gemAndPoints13.setMaxWidth(80);
		
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
		
		gemAndPoints13.getChildren().add(new Text(Integer.toString(cardsOnBoard1.get(2).getPoints())));
		if (cardsOnBoard1.get(2).getBonus().getColor().equals("blue")) {
			gemAndPoints13.getChildren().add(blueImg);
		} else if (cardsOnBoard1.get(2).getBonus().getColor().equals("green")) {
			gemAndPoints13.getChildren().add(greenImg);
		} else if (cardsOnBoard1.get(2).getBonus().getColor().equals("white")) {
			gemAndPoints13.getChildren().add(whiteImg);
		} else if (cardsOnBoard1.get(2).getBonus().getColor().equals("black")) {
			gemAndPoints13.getChildren().add(blackImg);
		} else if (cardsOnBoard1.get(2).getBonus().getColor().equals("red")) {
			gemAndPoints13.getChildren().add(redImg);
		}
		gemAndPoints13.setSpacing(20);
		gemAndPoints13.setAlignment(Pos.CENTER);
		gemAndPoints13.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints13(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints13.getChildren().get(0);
		Node gem = gemAndPoints13.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints14() {
		gemAndPoints14 = new HBox();
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
		
		gemAndPoints14.setPrefWidth(80);
		gemAndPoints14.setMaxWidth(80);
		
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
		
		gemAndPoints14.getChildren().add(new Text(Integer.toString(cardsOnBoard1.get(3).getPoints())));
		if (cardsOnBoard1.get(3).getBonus().getColor().equals("blue")) {
			gemAndPoints14.getChildren().add(blueImg);
		} else if (cardsOnBoard1.get(3).getBonus().getColor().equals("green")) {
			gemAndPoints14.getChildren().add(greenImg);
		} else if (cardsOnBoard1.get(3).getBonus().getColor().equals("white")) {
			gemAndPoints14.getChildren().add(whiteImg);
		} else if (cardsOnBoard1.get(3).getBonus().getColor().equals("black")) {
			gemAndPoints14.getChildren().add(blackImg);
		} else if (cardsOnBoard1.get(3).getBonus().getColor().equals("red")) {
			gemAndPoints14.getChildren().add(redImg);
		}
		gemAndPoints14.setSpacing(20);
		gemAndPoints14.setAlignment(Pos.CENTER);
		gemAndPoints14.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints14(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints14.getChildren().get(0);
		Node gem = gemAndPoints14.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints21() {
		gemAndPoints21 = new HBox();
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
		
		gemAndPoints21.setPrefWidth(80);
		gemAndPoints21.setMaxWidth(80);
		
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
		
		gemAndPoints21.getChildren().add(new Text(Integer.toString(cardsOnBoard2.get(0).getPoints())));
		if (cardsOnBoard2.get(0).getBonus().getColor().equals("blue")) {
			gemAndPoints21.getChildren().add(blueImg);
		} else if (cardsOnBoard2.get(0).getBonus().getColor().equals("green")) {
			gemAndPoints21.getChildren().add(greenImg);
		} else if (cardsOnBoard2.get(0).getBonus().getColor().equals("white")) {
			gemAndPoints21.getChildren().add(whiteImg);
		} else if (cardsOnBoard2.get(0).getBonus().getColor().equals("black")) {
			gemAndPoints21.getChildren().add(blackImg);
		} else if (cardsOnBoard2.get(0).getBonus().getColor().equals("red")) {
			gemAndPoints21.getChildren().add(redImg);
		}
		gemAndPoints21.setSpacing(20);
		gemAndPoints21.setAlignment(Pos.CENTER);
		gemAndPoints21.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints21(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints21.getChildren().get(0);
		Node gem = gemAndPoints21.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints22() {
		gemAndPoints22 = new HBox();
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
		
		gemAndPoints22.setPrefWidth(80);
		gemAndPoints22.setMaxWidth(80);
		
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
		
		gemAndPoints22.getChildren().add(new Text(Integer.toString(cardsOnBoard2.get(1).getPoints())));
		if (cardsOnBoard2.get(1).getBonus().getColor().equals("blue")) {
			gemAndPoints22.getChildren().add(blueImg);
		} else if (cardsOnBoard2.get(1).getBonus().getColor().equals("green")) {
			gemAndPoints22.getChildren().add(greenImg);
		} else if (cardsOnBoard2.get(1).getBonus().getColor().equals("white")) {
			gemAndPoints22.getChildren().add(whiteImg);
		} else if (cardsOnBoard2.get(1).getBonus().getColor().equals("black")) {
			gemAndPoints22.getChildren().add(blackImg);
		} else if (cardsOnBoard2.get(1).getBonus().getColor().equals("red")) {
			gemAndPoints22.getChildren().add(redImg);
		}
		gemAndPoints22.setSpacing(20);
		gemAndPoints22.setAlignment(Pos.CENTER);
		gemAndPoints22.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints22(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints22.getChildren().get(0);
		Node gem = gemAndPoints22.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints23() {
		gemAndPoints23 = new HBox();
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
		
		gemAndPoints23.setPrefWidth(80);
		gemAndPoints23.setMaxWidth(80);
		
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
		
		gemAndPoints23.getChildren().add(new Text(Integer.toString(cardsOnBoard2.get(2).getPoints())));
		if (cardsOnBoard2.get(2).getBonus().getColor().equals("blue")) {
			gemAndPoints23.getChildren().add(blueImg);
		} else if (cardsOnBoard2.get(2).getBonus().getColor().equals("green")) {
			gemAndPoints23.getChildren().add(greenImg);
		} else if (cardsOnBoard2.get(2).getBonus().getColor().equals("white")) {
			gemAndPoints23.getChildren().add(whiteImg);
		} else if (cardsOnBoard2.get(2).getBonus().getColor().equals("black")) {
			gemAndPoints23.getChildren().add(blackImg);
		} else if (cardsOnBoard2.get(2).getBonus().getColor().equals("red")) {
			gemAndPoints23.getChildren().add(redImg);
		}
		gemAndPoints23.setSpacing(20);
		gemAndPoints23.setAlignment(Pos.CENTER);
		gemAndPoints23.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints23(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints23.getChildren().get(0);
		Node gem = gemAndPoints23.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints24() {
		gemAndPoints24 = new HBox();
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
		
		gemAndPoints24.setPrefWidth(80);
		gemAndPoints24.setMaxWidth(80);
		
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
		
		gemAndPoints24.getChildren().add(new Text(Integer.toString(cardsOnBoard2.get(3).getPoints())));
		if (cardsOnBoard2.get(3).getBonus().getColor().equals("blue")) {
			gemAndPoints24.getChildren().add(blueImg);
		} else if (cardsOnBoard2.get(3).getBonus().getColor().equals("green")) {
			gemAndPoints24.getChildren().add(greenImg);
		} else if (cardsOnBoard2.get(3).getBonus().getColor().equals("white")) {
			gemAndPoints24.getChildren().add(whiteImg);
		} else if (cardsOnBoard2.get(3).getBonus().getColor().equals("black")) {
			gemAndPoints24.getChildren().add(blackImg);
		} else if (cardsOnBoard2.get(3).getBonus().getColor().equals("red")) {
			gemAndPoints24.getChildren().add(redImg);
		}
		gemAndPoints24.setSpacing(20);
		gemAndPoints24.setAlignment(Pos.CENTER);
		gemAndPoints24.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints24(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints24.getChildren().get(0);
		Node gem = gemAndPoints24.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints31() {
		gemAndPoints31 = new HBox();
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
		
		gemAndPoints31.setPrefWidth(80);
		gemAndPoints31.setMaxWidth(80);
		
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
		
		gemAndPoints31.getChildren().add(new Text(Integer.toString(cardsOnBoard3.get(0).getPoints())));
		if (cardsOnBoard3.get(0).getBonus().getColor().equals("blue")) {
			gemAndPoints31.getChildren().add(blueImg);
		} else if (cardsOnBoard3.get(0).getBonus().getColor().equals("green")) {
			gemAndPoints31.getChildren().add(greenImg);
		} else if (cardsOnBoard3.get(0).getBonus().getColor().equals("white")) {
			gemAndPoints31.getChildren().add(whiteImg);
		} else if (cardsOnBoard3.get(0).getBonus().getColor().equals("black")) {
			gemAndPoints31.getChildren().add(blackImg);
		} else if (cardsOnBoard3.get(0).getBonus().getColor().equals("red")) {
			gemAndPoints31.getChildren().add(redImg);
		}
		gemAndPoints31.setSpacing(20);
		gemAndPoints31.setAlignment(Pos.CENTER);
		gemAndPoints31.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints31(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints31.getChildren().get(0);
		Node gem = gemAndPoints31.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints32() {
		gemAndPoints32 = new HBox();
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
		
		gemAndPoints32.setPrefWidth(80);
		gemAndPoints32.setMaxWidth(80);
		
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
		
		gemAndPoints32.getChildren().add(new Text(Integer.toString(cardsOnBoard3.get(1).getPoints())));
		if (cardsOnBoard3.get(1).getBonus().getColor().equals("blue")) {
			gemAndPoints32.getChildren().add(blueImg);
		} else if (cardsOnBoard3.get(1).getBonus().getColor().equals("green")) {
			gemAndPoints32.getChildren().add(greenImg);
		} else if (cardsOnBoard3.get(1).getBonus().getColor().equals("white")) {
			gemAndPoints32.getChildren().add(whiteImg);
		} else if (cardsOnBoard3.get(1).getBonus().getColor().equals("black")) {
			gemAndPoints32.getChildren().add(blackImg);
		} else if (cardsOnBoard3.get(1).getBonus().getColor().equals("red")) {
			gemAndPoints32.getChildren().add(redImg);
		}
		gemAndPoints32.setSpacing(20);
		gemAndPoints32.setAlignment(Pos.CENTER);
		gemAndPoints32.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints32(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints32.getChildren().get(0);
		Node gem = gemAndPoints32.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints33() {
		gemAndPoints33 = new HBox();
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
		
		gemAndPoints33.setPrefWidth(80);
		gemAndPoints33.setMaxWidth(80);
		
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
		
		gemAndPoints33.getChildren().add(new Text(Integer.toString(cardsOnBoard3.get(2).getPoints())));
		if (cardsOnBoard3.get(2).getBonus().getColor().equals("blue")) {
			gemAndPoints33.getChildren().add(blueImg);
		} else if (cardsOnBoard3.get(2).getBonus().getColor().equals("green")) {
			gemAndPoints33.getChildren().add(greenImg);
		} else if (cardsOnBoard3.get(2).getBonus().getColor().equals("white")) {
			gemAndPoints33.getChildren().add(whiteImg);
		} else if (cardsOnBoard3.get(2).getBonus().getColor().equals("black")) {
			gemAndPoints33.getChildren().add(blackImg);
		} else if (cardsOnBoard3.get(2).getBonus().getColor().equals("red")) {
			gemAndPoints33.getChildren().add(redImg);
		}
		gemAndPoints33.setSpacing(20);
		gemAndPoints33.setAlignment(Pos.CENTER);
		gemAndPoints33.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints33(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints33.getChildren().get(0);
		Node gem = gemAndPoints33.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeGemAndPoints34() {
		gemAndPoints34 = new HBox();
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
		
		gemAndPoints34.setPrefWidth(80);
		gemAndPoints34.setMaxWidth(80);
		
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
		
		gemAndPoints34.getChildren().add(new Text(Integer.toString(cardsOnBoard3.get(3).getPoints())));
		if (cardsOnBoard3.get(3).getBonus().getColor().equals("blue")) {
			gemAndPoints34.getChildren().add(blueImg);
		} else if (cardsOnBoard3.get(3).getBonus().getColor().equals("green")) {
			gemAndPoints34.getChildren().add(greenImg);
		} else if (cardsOnBoard3.get(3).getBonus().getColor().equals("white")) {
			gemAndPoints34.getChildren().add(whiteImg);
		} else if (cardsOnBoard3.get(3).getBonus().getColor().equals("black")) {
			gemAndPoints34.getChildren().add(blackImg);
		} else if (cardsOnBoard3.get(3).getBonus().getColor().equals("red")) {
			gemAndPoints34.getChildren().add(redImg);
		}
		gemAndPoints34.setSpacing(20);
		gemAndPoints34.setAlignment(Pos.CENTER);
		gemAndPoints34.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	
	public static void updateGemAndPoints34(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		
		Node points = gemAndPoints34.getChildren().get(0);
		Node gem = gemAndPoints34.getChildren().get(1);
		((Text) points).setText(Integer.toString(card.getPoints()));
		if (card.getBonus().getColor().equals("blue")) {
			((ImageView) gem).setImage(blue);
		} else if (card.getBonus().getColor().equals("green")) {
			((ImageView) gem).setImage(green);
		} else if (card.getBonus().getColor().equals("white")) {
			((ImageView) gem).setImage(white);
		} else if (card.getBonus().getColor().equals("black")) {
			((ImageView) gem).setImage(black);
		} else if (card.getBonus().getColor().equals("red")) {
			((ImageView) gem).setImage(red);
		}
	}
	
	public void initializeTokenAndPrice11() {
		tokenAndPrice11 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard1.get(0);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice11.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice11(Card card) {
		tokenAndPrice11.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice11.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice12() {
		tokenAndPrice12 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard1.get(1);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice12.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice12(Card card) {
		tokenAndPrice12.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice12.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice13() {
		tokenAndPrice13 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard1.get(2);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice13.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice13(Card card) {
		tokenAndPrice13.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice13.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice14() {
		tokenAndPrice14 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard1.get(3);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice14.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice14(Card card) {
		tokenAndPrice14.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice14.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice21() {
		tokenAndPrice21 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard2.get(0);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice21.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice21(Card card) {
		tokenAndPrice21.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice21.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice22() {
		tokenAndPrice22 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard2.get(1);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice22.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice22(Card card) {
		tokenAndPrice22.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice22.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice23() {
		tokenAndPrice23 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard2.get(2);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice23.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice23(Card card) {
		tokenAndPrice23.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice23.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice24() {
		tokenAndPrice24 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard2.get(3);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice24.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice24(Card card) {
		tokenAndPrice24.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice24.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice31() {
		tokenAndPrice31 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard3.get(0);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice31.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice31(Card card) {
		tokenAndPrice31.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice31.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice32() {
		tokenAndPrice32 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard3.get(1);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice32.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice32(Card card) {
		tokenAndPrice32.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice32.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice33() {
		tokenAndPrice33 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard3.get(2);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice33.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice33(Card card) {
		tokenAndPrice33.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice33.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeTokenAndPrice34() {
		tokenAndPrice34 = new VBox();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		Card card = cardsOnBoard3.get(3);
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice34.getChildren().add(tokenAndPrice);
		}
	}
	
	public static void updateTokenAndPrice34(Card card) {
		tokenAndPrice34.getChildren().clear();
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			tokenAndPrice34.getChildren().add(tokenAndPrice);
		}
	}
	
	public void initializeCard31() {
		card31 = new VBox();
		initializeGemAndPoints31();
		initializeTokenAndPrice31();
		card31.getChildren().add(gemAndPoints31);
		card31.getChildren().add(tokenAndPrice31);
		card31.setMinHeight(130);
		card31.setMinWidth(100);
		card31.setPrefHeight(130);
		card31.setPrefWidth(100);
		card31.setSpacing(5);
		card31.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card31.setAlignment(Pos.CENTER);
		card31.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard31(Card card) {
		updateGemAndPoints31(card);
		updateTokenAndPrice31(card);
	}

	public void initializeCard32() {
		card32 = new VBox();
		initializeGemAndPoints32();
		initializeTokenAndPrice32();
		card32.getChildren().add(gemAndPoints32);
		card32.getChildren().add(tokenAndPrice32);
		card32.setMinHeight(130);
		card32.setMinWidth(100);
		card32.setPrefHeight(130);
		card32.setPrefWidth(100);
		card32.setSpacing(5);
		card32.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card32.setAlignment(Pos.CENTER);
		card32.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard32(Card card) {
		updateGemAndPoints32(card);
		updateTokenAndPrice32(card);
	}
	
	public void initializeCard33() {
		card33 = new VBox();
		initializeGemAndPoints33();
		initializeTokenAndPrice33();
		card33.getChildren().add(gemAndPoints33);
		card33.getChildren().add(tokenAndPrice33);
		card33.setMinHeight(130);
		card33.setMinWidth(100);
		card33.setPrefHeight(130);
		card33.setPrefWidth(100);
		card33.setSpacing(5);
		card33.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card33.setAlignment(Pos.CENTER);
		card33.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard33(Card card) {
		updateGemAndPoints33(card);
		updateTokenAndPrice33(card);
	}
	
	public void initializeCard34() {
		card34 = new VBox();
		initializeGemAndPoints34();
		initializeTokenAndPrice34();
		card34.getChildren().add(gemAndPoints34);
		card34.getChildren().add(tokenAndPrice34);
		card34.setMinHeight(130);
		card34.setMinWidth(100);
		card34.setPrefHeight(130);
		card34.setPrefWidth(100);
		card34.setSpacing(5);
		card34.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card34.setAlignment(Pos.CENTER);
		card34.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard34(Card card) {
		updateGemAndPoints34(card);
		updateTokenAndPrice34(card);
	}
	
	public void initializeCard21() {
		card21 = new VBox();
		initializeGemAndPoints21();
		initializeTokenAndPrice21();
		card21.getChildren().add(gemAndPoints21);
		card21.getChildren().add(tokenAndPrice21);
		card21.setMinHeight(130);
		card21.setMinWidth(100);
		card21.setPrefHeight(130);
		card21.setPrefWidth(100);
		card21.setSpacing(5);
		card21.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card21.setAlignment(Pos.CENTER);
		card21.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard21(Card card) {
		updateGemAndPoints21(card);
		updateTokenAndPrice21(card);
	}
	
	public void initializeCard22() {
		card22 = new VBox();
		initializeGemAndPoints22();
		initializeTokenAndPrice22();
		card22.getChildren().add(gemAndPoints22);
		card22.getChildren().add(tokenAndPrice22);
		card22.setMinHeight(130);
		card22.setMinWidth(100);
		card22.setPrefHeight(130);
		card22.setPrefWidth(100);
		card22.setSpacing(5);
		card22.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card22.setAlignment(Pos.CENTER);
		card22.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard22(Card card) {
		updateGemAndPoints22(card);
		updateTokenAndPrice22(card);
	}
	
	public void initializeCard23() {
		card23 = new VBox();
		initializeGemAndPoints23();
		initializeTokenAndPrice23();
		card23.getChildren().add(gemAndPoints23);
		card23.getChildren().add(tokenAndPrice23);
		card23.setMinHeight(130);
		card23.setMinWidth(100);
		card23.setPrefHeight(130);
		card23.setPrefWidth(100);
		card23.setSpacing(5);
		card23.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card23.setAlignment(Pos.CENTER);
		card23.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard23(Card card) {
		updateGemAndPoints23(card);
		updateTokenAndPrice23(card);
	}
	
	public void initializeCard24() {
		card24 = new VBox();
		initializeGemAndPoints24();
		initializeTokenAndPrice24();
		card24.getChildren().add(gemAndPoints24);
		card24.getChildren().add(tokenAndPrice24);
		card24.setMinHeight(130);
		card24.setMinWidth(100);
		card24.setPrefHeight(130);
		card24.setPrefWidth(100);
		card24.setSpacing(5);
		card24.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card24.setAlignment(Pos.CENTER);
		card24.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard24(Card card) {
		updateGemAndPoints24(card);
		updateTokenAndPrice24(card);
	}
	
	public void initializeCard11() {
		card11 = new VBox();
		initializeGemAndPoints11();
		initializeTokenAndPrice11();
		card11.getChildren().add(gemAndPoints11);
		card11.getChildren().add(tokenAndPrice11);
		card11.setMinHeight(130);
		card11.setMinWidth(100);
		card11.setPrefHeight(130);
		card11.setPrefWidth(100);
		card11.setSpacing(5);
		card11.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card11.setAlignment(Pos.CENTER);
		card11.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard11(Card card) {
		updateGemAndPoints11(card);
		updateTokenAndPrice11(card);
	}
	
	public void initializeCard12() {
		card12 = new VBox();
		initializeGemAndPoints12();
		initializeTokenAndPrice12();
		card12.getChildren().add(gemAndPoints12);
		card12.getChildren().add(tokenAndPrice12);
		card12.setMinHeight(130);
		card12.setMinWidth(100);
		card12.setPrefHeight(130);
		card12.setPrefWidth(100);
		card12.setSpacing(5);
		card12.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card12.setAlignment(Pos.CENTER);
		card12.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard12(Card card) {
		updateGemAndPoints12(card);
		updateTokenAndPrice12(card);
	}
	
	public void initializeCard13() {
		card13 = new VBox();
		initializeGemAndPoints13();
		initializeTokenAndPrice13();
		card13.getChildren().add(gemAndPoints13);
		card13.getChildren().add(tokenAndPrice13);
		card13.setMinHeight(130);
		card13.setMinWidth(100);
		card13.setPrefHeight(130);
		card13.setPrefWidth(100);
		card13.setSpacing(5);
		card13.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card13.setAlignment(Pos.CENTER);
		card13.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
	}
	
	public static void updateCard13(Card card) {
		updateGemAndPoints13(card);
		updateTokenAndPrice13(card);
	}
	
	public void initializeCard14() {
		card14 = new VBox();
		initializeGemAndPoints14();
		initializeTokenAndPrice14();
		card14.getChildren().add(gemAndPoints14);
		card14.getChildren().add(tokenAndPrice14);
		card14.setMinHeight(130);
		card14.setMinWidth(100);
		card14.setPrefHeight(130);
		card14.setPrefWidth(100);
		card14.setSpacing(5);
		card14.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		card14.setAlignment(Pos.CENTER);
		card14.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		}
	
	public static void updateCard14(Card card) {
		updateGemAndPoints14(card);
		updateTokenAndPrice14(card);
	}
	
	public Pane makeDeck(Deck deck) {
		Pane pane = new Pane();
		pane.setPrefHeight(130);
		pane.setPrefWidth(100);
		pane.setMinHeight(130);
		pane.setMinWidth(100);
		if (deck instanceof DeckOne) {
			BackgroundFill fill = new BackgroundFill(Color.DARKGREEN, CornerRadii.EMPTY, Insets.EMPTY);
			pane.setBackground(new Background(fill));
		} else if (deck instanceof DeckTwo) {
			BackgroundFill fill = new BackgroundFill(Color.GOLDENROD, CornerRadii.EMPTY, Insets.EMPTY);
			pane.setBackground(new Background(fill));
		} else if (deck instanceof DeckThree) {
			BackgroundFill fill = new BackgroundFill(Color.DARKBLUE, CornerRadii.EMPTY, Insets.EMPTY);
			pane.setBackground(new Background(fill));
		}
		return pane;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	
	public static DeckOne getDeckOne() {
		return deckOne;
	}

	public void setDeckOne(DeckOne deckOne) {
		DeckAndCardOnBoard.deckOne = deckOne;
	}

	public static DeckTwo getDeckTwo() {
		return deckTwo;
	}

	public void setDeckTwo(DeckTwo deckTwo) {
		DeckAndCardOnBoard.deckTwo = deckTwo;
	}

	public static DeckThree getDeckThree() {
		return deckThree;
	}

	public void setDeckThree(DeckThree deckThree) {
		DeckAndCardOnBoard.deckThree = deckThree;
	}

	public static ArrayList<Card> getCardsOnBoard3() {
		return cardsOnBoard3;
	}

	public void setCardsOnBoard3(ArrayList<Card> cardsOnBoard3) {
		DeckAndCardOnBoard.cardsOnBoard3 = cardsOnBoard3;
	}

	public static ArrayList<Card> getCardsOnBoard2() {
		return cardsOnBoard2;
	}

	public void setCardsOnBoard2(ArrayList<Card> cardsOnBoard2) {
		DeckAndCardOnBoard.cardsOnBoard2 = cardsOnBoard2;
	}

	public static ArrayList<Card> getCardsOnBoard1() {
		return cardsOnBoard1;
	}

	public void setCardsOnBoard1(ArrayList<Card> cardsOnBoard1) {
		DeckAndCardOnBoard.cardsOnBoard1 = cardsOnBoard1;
	}

	public void drawCard(Deck deck) {
		for (int i = 0 ; i < 4 ; i++) {
			deck.draw();
			if (deck instanceof DeckOne) {
				LevelOne card = ((DeckOne) deck).getDrawnCard();
				cardsOnBoard1.add((Card) card);
			} else if (deck instanceof DeckTwo) {
				LevelTwo card = ((DeckTwo) deck).getDrawnCard();
				cardsOnBoard2.add((Card) card);
			} else if (deck instanceof DeckThree) {
				LevelThree card = ((DeckThree) deck).getDrawnCard();
				cardsOnBoard3.add((Card) card);
			}
		}
	}
	
	public static VBox makeCard(Card card) {
		Image blue = new Image(blueURL);
		Image green = new Image(greenURL);
		Image white = new Image(whiteURL);
		Image black = new Image(blackURL);
		Image red = new Image(redURL);
		Image blueToken = new Image(blueTokenURL);
		Image greenToken = new Image(greenTokenURL);
		Image whiteToken = new Image(whiteTokenURL);
		Image blackToken = new Image(blackTokenURL);
		Image redToken = new Image(redTokenURL);
		
		ImageView blueImg = new ImageView(blue);
		ImageView greenImg = new ImageView(green);
		ImageView whiteImg = new ImageView(white);
		ImageView blackImg = new ImageView(black);
		ImageView redImg = new ImageView(red);
		ImageView blueTokenImg = new ImageView(blueToken);
		ImageView greenTokenImg = new ImageView(greenToken);
		ImageView whiteTokenImg = new ImageView(whiteToken);
		ImageView blackTokenImg = new ImageView(blackToken);
		ImageView redTokenImg = new ImageView(redToken);
		
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
		blueTokenImg.setFitHeight(20);
		blueTokenImg.setFitWidth(20);
		greenTokenImg.setFitHeight(20);
		greenTokenImg.setFitWidth(20);
		whiteTokenImg.setFitHeight(20);
		whiteTokenImg.setFitWidth(20);
		blackTokenImg.setFitHeight(20);
		blackTokenImg.setFitWidth(20);
		redTokenImg.setFitHeight(20);
		redTokenImg.setFitWidth(20);
		
		VBox box = new VBox();
		box.setMinHeight(130);
		box.setMinWidth(100);
		box.setPrefHeight(130);
		box.setPrefWidth(100);
		HBox gemAndPoints = new HBox();
		gemAndPoints.getChildren().add(new Text(Integer.toString(card.getPoints())));
		gemAndPoints.setPrefWidth(80);
		gemAndPoints.setMaxWidth(80);
		if (card.getBonus().getColor().equals("blue")) {
			gemAndPoints.getChildren().add(blueImg);
		} else if (card.getBonus().getColor().equals("green")) {
			gemAndPoints.getChildren().add(greenImg);
		} else if (card.getBonus().getColor().equals("white")) {
			gemAndPoints.getChildren().add(whiteImg);
		} else if (card.getBonus().getColor().equals("black")) {
			gemAndPoints.getChildren().add(blackImg);
		} else if (card.getBonus().getColor().equals("red")) {
			gemAndPoints.getChildren().add(redImg);
		}
		gemAndPoints.setSpacing(20);
		gemAndPoints.setAlignment(Pos.CENTER);
		gemAndPoints.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		box.getChildren().add(gemAndPoints);
		
		for (int i = 0 ; i < card.getPrice().size(); i++) {
			HBox tokenAndPrice = new HBox();
			Token token = card.getPrice().get(i);
			if (token.getColor().equals("blue")) {
				tokenAndPrice.getChildren().add(blueTokenImg);
			} else if (token.getColor().equals("green")) {
				tokenAndPrice.getChildren().add(greenTokenImg);
			} else if (token.getColor().equals("white")) {
				tokenAndPrice.getChildren().add(whiteTokenImg);
			} else if (token.getColor().equals("black")) {
				tokenAndPrice.getChildren().add(blackTokenImg);
			} else if (token.getColor().equals("red")) {
				tokenAndPrice.getChildren().add(redTokenImg);
			}
			tokenAndPrice.getChildren().add(new Text(Integer.toString(token.getAmount())));
			tokenAndPrice.setSpacing(20);
			tokenAndPrice.setAlignment(Pos.CENTER);
			
			box.getChildren().add(tokenAndPrice);
		}
		box.setSpacing(5);
		box.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		box.setAlignment(Pos.CENTER);
		box.setBackground(new Background(new BackgroundFill(Color.FLORALWHITE, CornerRadii.EMPTY, Insets.EMPTY)));
		return box;
	}
	
	public void setUpDeckOne() {
		Gem gemBlack = new Gem("black", 1);
		Gem gemBlue = new Gem("blue", 1);
		Gem gemWhite = new Gem("white", 1);
		Gem gemGreen = new Gem("green", 1);
		Gem gemRed = new Gem("red", 1);
		Token tokenBlueOne = new Token("blue", 1);
		Token tokenGreenOne = new Token("green", 1);
		Token tokenWhiteOne = new Token("white", 1);
		Token tokenBlackOne = new Token("black", 1);
		Token tokenRedOne = new Token("red", 1);
		Token tokenBlueTwo = new Token("blue", 2);
		Token tokenGreenTwo = new Token("green", 2);
		Token tokenWhiteTwo = new Token("white", 2);
		Token tokenBlackTwo = new Token("black", 2);
		Token tokenRedTwo = new Token("red", 2);
		Token tokenBlueThree = new Token("blue", 3);
		Token tokenGreenThree = new Token("green", 3);
		Token tokenWhiteThree = new Token("white", 3);
		Token tokenBlackThree = new Token("black", 3);
		Token tokenRedThree = new Token("red", 3);
		Token tokenBlueFour = new Token("blue", 4);
		Token tokenGreenFour = new Token("green", 4);
		Token tokenWhiteFour = new Token("white", 4);
		Token tokenBlackFour = new Token("black", 4);
		Token tokenRedFour = new Token("red", 4);
		
		ArrayList<Token> listOne1 = new ArrayList<Token>();
		listOne1.add(tokenBlueOne);
		listOne1.add(tokenGreenOne);
		listOne1.add(tokenWhiteOne);
		listOne1.add(tokenRedOne);
		Card one1 = new Card(0, 1, gemBlack, listOne1);
		
		ArrayList<Token> listOne2 = new ArrayList<Token>();
		listOne2.add(tokenGreenOne);
		listOne2.add(tokenWhiteOne);
		listOne2.add(tokenBlackOne);
		listOne2.add(tokenRedOne);
		Card one2 = new Card(0, 1, gemBlue, listOne2);
		
		ArrayList<Token> listOne3 = new ArrayList<Token>();
		listOne3.add(tokenBlueOne);
		listOne3.add(tokenGreenOne);
		listOne3.add(tokenBlackOne);
		listOne3.add(tokenRedOne);
		Card one3 = new Card(0, 1, gemWhite, listOne3);
		
		ArrayList<Token> listOne4 = new ArrayList<Token>();
		listOne4.add(tokenBlueOne);
		listOne4.add(tokenWhiteOne);
		listOne4.add(tokenBlackOne);
		listOne4.add(tokenRedOne);
		Card one4 = new Card(0, 1, gemGreen, listOne4);
		
		ArrayList<Token> listOne5 = new ArrayList<Token>();
		listOne5.add(tokenBlueOne);
		listOne5.add(tokenGreenOne);
		listOne5.add(tokenWhiteOne);
		listOne5.add(tokenBlackOne);
		Card one5 = new Card(0, 1, gemRed, listOne5);
		
		ArrayList<Token> listOne6 = new ArrayList<Token>();
		listOne6.add(tokenBlueTwo);
		listOne6.add(tokenGreenOne);
		listOne6.add(tokenWhiteOne);
		listOne6.add(tokenRedOne);
		Card one6 = new Card(0, 1, gemBlack, listOne6);
		
		ArrayList<Token> listOne7 = new ArrayList<Token>();
		listOne7.add(tokenRedTwo);
		listOne7.add(tokenGreenOne);
		listOne7.add(tokenWhiteOne);
		listOne7.add(tokenBlackOne);
		Card one7 = new Card(0, 1, gemBlue, listOne7);
		
		ArrayList<Token> listOne8 = new ArrayList<Token>();
		listOne8.add(tokenGreenTwo);
		listOne8.add(tokenBlueOne);
		listOne8.add(tokenBlackOne);
		listOne8.add(tokenRedOne);
		Card one8 = new Card(0, 1, gemWhite, listOne8);
		
		ArrayList<Token> listOne9 = new ArrayList<Token>();
		listOne9.add(tokenBlackTwo);
		listOne9.add(tokenBlueOne);
		listOne9.add(tokenWhiteOne);
		listOne9.add(tokenRedOne);
		Card one9 = new Card(0, 1, gemGreen, listOne9);
		
		ArrayList<Token> listOne10 = new ArrayList<Token>();
		listOne10.add(tokenWhiteTwo);
		listOne10.add(tokenBlueOne);
		listOne10.add(tokenGreenOne);
		listOne10.add(tokenBlackOne);
		Card one10 = new Card(0, 1, gemRed, listOne10);
		
		ArrayList<Token> listOne11 = new ArrayList<Token>();
		listOne11.add(tokenBlueTwo);
		listOne11.add(tokenWhiteTwo);
		listOne11.add(tokenRedOne);
		Card one11 = new Card(0, 1, gemBlack, listOne11);
		
		ArrayList<Token> listOne12 = new ArrayList<Token>();
		listOne12.add(tokenGreenTwo);
		listOne12.add(tokenRedTwo);
		listOne12.add(tokenWhiteOne);
		Card one12 = new Card(0, 1, gemBlue, listOne12);
		
		ArrayList<Token> listOne13 = new ArrayList<Token>();
		listOne13.add(tokenBlueTwo);
		listOne13.add(tokenGreenTwo);
		listOne13.add(tokenBlackOne);
		Card one13 = new Card(0, 1, gemWhite, listOne13);
		
		ArrayList<Token> listOne14 = new ArrayList<Token>();
		listOne14.add(tokenBlackTwo);
		listOne14.add(tokenRedTwo);
		listOne14.add(tokenBlueOne);
		Card one14 = new Card(0, 1, gemGreen, listOne14);
		
		ArrayList<Token> listOne15 = new ArrayList<Token>();
		listOne15.add(tokenWhiteTwo);
		listOne15.add(tokenBlackTwo);
		listOne15.add(tokenGreenOne);
		Card one15 = new Card(0, 1, gemRed, listOne15);
		
		ArrayList<Token> listOne16 = new ArrayList<Token>();
		listOne16.add(tokenRedThree);
		listOne16.add(tokenGreenOne);
		listOne16.add(tokenBlackOne);
		Card one16 = new Card(0, 1, gemBlack, listOne16);
		
		ArrayList<Token> listOne17 = new ArrayList<Token>();
		listOne17.add(tokenGreenThree);
		listOne17.add(tokenBlueOne);
		listOne17.add(tokenRedOne);
		Card one17 = new Card(0, 1, gemBlue, listOne17);
		
		ArrayList<Token> listOne18 = new ArrayList<Token>();
		listOne18.add(tokenWhiteThree);
		listOne18.add(tokenBlueOne);
		listOne18.add(tokenBlackOne);
		Card one18 = new Card(0, 1, gemWhite, listOne18);
		
		ArrayList<Token> listOne19 = new ArrayList<Token>();
		listOne19.add(tokenBlueThree);
		listOne19.add(tokenGreenOne);
		listOne19.add(tokenWhiteOne);
		Card one19 = new Card(0, 1, gemGreen, listOne19);
		
		ArrayList<Token> listOne20 = new ArrayList<Token>();
		listOne20.add(tokenBlackThree);
		listOne20.add(tokenWhiteOne);
		listOne20.add(tokenRedOne);
		Card one20 = new Card(0, 1, gemRed, listOne20);
		
		ArrayList<Token> listOne21 = new ArrayList<Token>();
		listOne21.add(tokenGreenTwo);
		listOne21.add(tokenRedOne);
		Card one21 = new Card(0, 1, gemBlack, listOne21);
		
		ArrayList<Token> listOne22 = new ArrayList<Token>();
		listOne22.add(tokenBlackTwo);
		listOne22.add(tokenWhiteOne);
		Card one22 = new Card(0, 1, gemBlue, listOne22);
		
		ArrayList<Token> listOne23 = new ArrayList<Token>();
		listOne23.add(tokenRedTwo);
		listOne23.add(tokenBlackOne);
		Card one23 = new Card(0, 1, gemWhite, listOne23);
		
		ArrayList<Token> listOne24 = new ArrayList<Token>();
		listOne24.add(tokenWhiteTwo);
		listOne24.add(tokenBlueOne);
		Card one24 = new Card(0, 1, gemGreen, listOne24);
		
		ArrayList<Token> listOne25 = new ArrayList<Token>();
		listOne25.add(tokenBlueTwo);
		listOne25.add(tokenGreenOne);
		Card one25 = new Card(0, 1, gemRed, listOne25);
		
		ArrayList<Token> listOne26 = new ArrayList<Token>();
		listOne26.add(tokenGreenTwo);
		listOne26.add(tokenWhiteTwo);
		Card one26 = new Card(0, 1, gemBlack, listOne26);
		
		ArrayList<Token> listOne27 = new ArrayList<Token>();
		listOne27.add(tokenBlackTwo);
		listOne27.add(tokenGreenTwo);
		Card one27 = new Card(0, 1, gemBlue, listOne27);
		
		ArrayList<Token> listOne28 = new ArrayList<Token>();
		listOne28.add(tokenBlueTwo);
		listOne28.add(tokenBlackTwo);
		Card one28 = new Card(0, 1, gemWhite, listOne28);
		
		ArrayList<Token> listOne29 = new ArrayList<Token>();
		listOne29.add(tokenBlueTwo);
		listOne29.add(tokenRedTwo);
		Card one29 = new Card(0, 1, gemGreen, listOne29);
		
		ArrayList<Token> listOne30 = new ArrayList<Token>();
		listOne30.add(tokenWhiteTwo);
		listOne30.add(tokenRedTwo);
		Card one30 = new Card(0, 1, gemRed, listOne30);
		
		ArrayList<Token> listOne31 = new ArrayList<Token>();
		listOne31.add(tokenGreenThree);
		Card one31 = new Card(0, 1, gemBlack, listOne31);
		
		ArrayList<Token> listOne32 = new ArrayList<Token>();
		listOne32.add(tokenBlackThree);
		Card one32 = new Card(0, 1, gemBlue, listOne32);
		
		ArrayList<Token> listOne33 = new ArrayList<Token>();
		listOne33.add(tokenBlueThree);
		Card one33 = new Card(0, 1, gemWhite, listOne33);
		
		ArrayList<Token> listOne34 = new ArrayList<Token>();
		listOne34.add(tokenRedThree);
		Card one34 = new Card(0, 1, gemGreen, listOne34);
		
		ArrayList<Token> listOne35 = new ArrayList<Token>();
		listOne35.add(tokenWhiteThree);
		Card one35 = new Card(0, 1, gemRed, listOne35);
		
		ArrayList<Token> listOne36 = new ArrayList<Token>();
		listOne36.add(tokenBlueFour);
		Card one36 = new Card(1, 1, gemBlack, listOne36);
		
		ArrayList<Token> listOne37 = new ArrayList<Token>();
		listOne37.add(tokenRedFour);
		Card one37 = new Card(1, 1, gemBlue, listOne37);
		
		ArrayList<Token> listOne38 = new ArrayList<Token>();
		listOne38.add(tokenGreenFour);
		Card one38 = new Card(1, 1, gemWhite, listOne38);
		
		ArrayList<Token> listOne39 = new ArrayList<Token>();
		listOne39.add(tokenBlackFour);
		Card one39 = new Card(1, 1, gemGreen, listOne39);
		
		ArrayList<Token> listOne40 = new ArrayList<Token>();
		listOne40.add(tokenWhiteFour);
		Card one40 = new Card(1, 1, gemRed, listOne40);
		
		deckOne.addCard(one1);
		deckOne.addCard(one2);
		deckOne.addCard(one3);
		deckOne.addCard(one4);
		deckOne.addCard(one5);
		deckOne.addCard(one6);
		deckOne.addCard(one7);
		deckOne.addCard(one8);
		deckOne.addCard(one9);
		deckOne.addCard(one10);
		deckOne.addCard(one11);
		deckOne.addCard(one12);
		deckOne.addCard(one13);
		deckOne.addCard(one14);
		deckOne.addCard(one15);
		deckOne.addCard(one16);
		deckOne.addCard(one17);
		deckOne.addCard(one18);
		deckOne.addCard(one19);
		deckOne.addCard(one20);
		deckOne.addCard(one21);
		deckOne.addCard(one22);
		deckOne.addCard(one23);
		deckOne.addCard(one24);
		deckOne.addCard(one25);
		deckOne.addCard(one26);
		deckOne.addCard(one27);
		deckOne.addCard(one28);
		deckOne.addCard(one29);
		deckOne.addCard(one30);
		deckOne.addCard(one31);
		deckOne.addCard(one32);
		deckOne.addCard(one33);
		deckOne.addCard(one34);
		deckOne.addCard(one35);
		deckOne.addCard(one36);
		deckOne.addCard(one37);
		deckOne.addCard(one38);
		deckOne.addCard(one39);
		deckOne.addCard(one40);
	}
	
	public void setUpDeckTwo() {
		Gem gemBlack = new Gem("black", 1);
		Gem gemBlue = new Gem("blue", 1);
		Gem gemWhite = new Gem("white", 1);
		Gem gemGreen = new Gem("green", 1);
		Gem gemRed = new Gem("red", 1);
		Token tokenBlueOne = new Token("blue", 1);
		Token tokenGreenOne = new Token("green", 1);
		Token tokenWhiteOne = new Token("white", 1);
		Token tokenBlackOne = new Token("black", 1);
		Token tokenRedOne = new Token("red", 1);
		Token tokenBlueTwo = new Token("blue", 2);
		Token tokenGreenTwo = new Token("green", 2);
		Token tokenWhiteTwo = new Token("white", 2);
		Token tokenBlackTwo = new Token("black", 2);
		Token tokenRedTwo = new Token("red", 2);
		Token tokenBlueThree = new Token("blue", 3);
		Token tokenGreenThree = new Token("green", 3);
		Token tokenWhiteThree = new Token("white", 3);
		Token tokenBlackThree = new Token("black", 3);
		Token tokenRedThree = new Token("red", 3);
		Token tokenBlueFour = new Token("blue", 4);
		Token tokenGreenFour = new Token("green", 4);
		Token tokenWhiteFour = new Token("white", 4);
		Token tokenBlackFour = new Token("black", 4);
		Token tokenRedFour = new Token("red", 4);
		Token tokenBlueFive = new Token("blue", 5);
		Token tokenGreenFive = new Token("green", 5);
		Token tokenWhiteFive = new Token("white", 5);
		Token tokenBlackFive = new Token("black", 5);
		Token tokenRedFive = new Token("red", 5);
		Token tokenBlueSix = new Token("blue", 6);
		Token tokenGreenSix = new Token("green", 6);
		Token tokenWhiteSix = new Token("white", 6);
		Token tokenBlackSix = new Token("black", 6);
		Token tokenRedSix = new Token("red", 6);
		
		ArrayList<Token> listTwo1 = new ArrayList<Token>();
		listTwo1.add(tokenWhiteThree);
		listTwo1.add(tokenBlueTwo);
		listTwo1.add(tokenGreenTwo);
		Card two1 = new Card(1, 2, gemBlack, listTwo1);
		
		ArrayList<Token> listTwo2 = new ArrayList<Token>();
		listTwo2.add(tokenRedThree);
		listTwo2.add(tokenBlueTwo);
		listTwo2.add(tokenGreenTwo);
		Card two2 = new Card(1, 2, gemBlue, listTwo2);
		
		ArrayList<Token> listTwo3 = new ArrayList<Token>();
		listTwo3.add(tokenGreenThree);
		listTwo3.add(tokenBlackTwo);
		listTwo3.add(tokenRedTwo);
		Card two3 = new Card(1, 2, gemWhite, listTwo3);
		
		ArrayList<Token> listTwo4 = new ArrayList<Token>();
		listTwo4.add(tokenBlueThree);
		listTwo4.add(tokenWhiteTwo);
		listTwo4.add(tokenBlackTwo);
		Card two4 = new Card(1, 2, gemGreen, listTwo4);
		
		ArrayList<Token> listTwo5 = new ArrayList<Token>();
		listTwo5.add(tokenBlackThree);
		listTwo5.add(tokenWhiteTwo);
		listTwo5.add(tokenRedTwo);
		Card two5 = new Card(1, 2, gemRed, listTwo5);
		
		ArrayList<Token> listTwo6 = new ArrayList<Token>();
		listTwo6.add(tokenGreenThree);
		listTwo6.add(tokenWhiteThree);
		listTwo6.add(tokenBlackTwo);
		Card two6 = new Card(1, 2, gemBlack, listTwo6);
		
		ArrayList<Token> listTwo7 = new ArrayList<Token>();
		listTwo7.add(tokenGreenThree);
		listTwo7.add(tokenBlackThree);
		listTwo7.add(tokenBlueTwo);
		Card two7 = new Card(1, 2, gemBlue, listTwo7);
		
		ArrayList<Token> listTwo8 = new ArrayList<Token>();
		listTwo8.add(tokenBlueThree);
		listTwo8.add(tokenRedThree);
		listTwo8.add(tokenWhiteTwo);
		Card two8 = new Card(1, 2, gemWhite, listTwo8);
		
		ArrayList<Token> listTwo9 = new ArrayList<Token>();
		listTwo9.add(tokenWhiteThree);
		listTwo9.add(tokenRedThree);
		listTwo9.add(tokenGreenTwo);
		Card two9 = new Card(1, 2, gemGreen, listTwo9);
		
		ArrayList<Token> listTwo10 = new ArrayList<Token>();
		listTwo10.add(tokenBlueThree);
		listTwo10.add(tokenBlackThree);
		listTwo10.add(tokenRedTwo);
		Card two10 = new Card(1, 2, gemRed, listTwo10);
		
		ArrayList<Token> listTwo11 = new ArrayList<Token>();
		listTwo11.add(tokenGreenFour);
		listTwo11.add(tokenRedTwo);
		listTwo11.add(tokenBlueOne);
		Card two11 = new Card(2, 2, gemBlack, listTwo11);
		
		ArrayList<Token> listTwo12 = new ArrayList<Token>();
		listTwo12.add(tokenBlackFour);
		listTwo12.add(tokenWhiteTwo);
		listTwo12.add(tokenRedOne);
		Card two12 = new Card(2, 2, gemBlue, listTwo12);
		
		ArrayList<Token> listTwo13 = new ArrayList<Token>();
		listTwo13.add(tokenRedFour);
		listTwo13.add(tokenBlackTwo);
		listTwo13.add(tokenGreenOne);
		Card two13 = new Card(2, 2, gemWhite, listTwo13);
		
		ArrayList<Token> listTwo14 = new ArrayList<Token>();
		listTwo14.add(tokenWhiteFour);
		listTwo14.add(tokenBlueTwo);
		listTwo14.add(tokenBlackOne);
		Card two14 = new Card(2, 2, gemGreen, listTwo14);
		
		ArrayList<Token> listTwo15 = new ArrayList<Token>();
		listTwo15.add(tokenBlueFour);
		listTwo15.add(tokenGreenTwo);
		listTwo15.add(tokenWhiteOne);
		Card two15 = new Card(2, 2, gemRed, listTwo15);
		
		ArrayList<Token> listTwo16 = new ArrayList<Token>();
		listTwo16.add(tokenGreenFive);
		listTwo16.add(tokenRedThree);
		Card two16 = new Card(2, 2, gemBlack, listTwo16);
		
		ArrayList<Token> listTwo17 = new ArrayList<Token>();
		listTwo17.add(tokenWhiteFive);
		listTwo17.add(tokenBlueThree);
		Card two17 = new Card(2, 2, gemBlue, listTwo17);
		
		ArrayList<Token> listTwo18 = new ArrayList<Token>();
		listTwo18.add(tokenRedFive);
		listTwo18.add(tokenBlackThree);
		Card two18 = new Card(2, 2, gemWhite, listTwo18);
		
		ArrayList<Token> listTwo19 = new ArrayList<Token>();
		listTwo19.add(tokenBlueFive);
		listTwo19.add(tokenGreenThree);
		Card two19 = new Card(2, 2, gemGreen, listTwo19);
		
		ArrayList<Token> listTwo20 = new ArrayList<Token>();
		listTwo20.add(tokenBlackFive);
		listTwo20.add(tokenWhiteThree);
		Card two20 = new Card(2, 2, gemRed, listTwo20);
		
		ArrayList<Token> listTwo21 = new ArrayList<Token>();
		listTwo21.add(tokenWhiteFive);
		Card two21 = new Card(2, 2, gemBlack, listTwo21);
		
		ArrayList<Token> listTwo22 = new ArrayList<Token>();
		listTwo22.add(tokenBlueFive);
		Card two22 = new Card(2, 2, gemBlue, listTwo22);
		
		ArrayList<Token> listTwo23 = new ArrayList<Token>();
		listTwo23.add(tokenRedFive);
		Card two23 = new Card(2, 2, gemWhite, listTwo23);
		
		ArrayList<Token> listTwo24 = new ArrayList<Token>();
		listTwo24.add(tokenGreenFive);
		Card two24 = new Card(2, 2, gemGreen, listTwo24);
		
		ArrayList<Token> listTwo25 = new ArrayList<Token>();
		listTwo25.add(tokenBlackFive);
		Card two25 = new Card(2, 2, gemRed, listTwo25);
		
		ArrayList<Token> listTwo26 = new ArrayList<Token>();
		listTwo26.add(tokenBlackSix);
		Card two26 = new Card(3, 2, gemBlack, listTwo26);
		
		ArrayList<Token> listTwo27 = new ArrayList<Token>();
		listTwo27.add(tokenBlueSix);
		Card two27 = new Card(3, 2, gemBlue, listTwo27);
		
		ArrayList<Token> listTwo28 = new ArrayList<Token>();
		listTwo28.add(tokenWhiteSix);
		Card two28 = new Card(3, 2, gemWhite, listTwo28);
		
		ArrayList<Token> listTwo29 = new ArrayList<Token>();
		listTwo29.add(tokenGreenSix);
		Card two29 = new Card(3, 2, gemGreen, listTwo29);
		
		ArrayList<Token> listTwo30 = new ArrayList<Token>();
		listTwo30.add(tokenRedSix);
		Card two30 = new Card(3, 2, gemRed, listTwo30);
		
		deckTwo.addCard(two1);
		deckTwo.addCard(two2);
		deckTwo.addCard(two3);
		deckTwo.addCard(two4);
		deckTwo.addCard(two5);
		deckTwo.addCard(two6);
		deckTwo.addCard(two7);
		deckTwo.addCard(two8);
		deckTwo.addCard(two9);
		deckTwo.addCard(two10);
		deckTwo.addCard(two11);
		deckTwo.addCard(two12);
		deckTwo.addCard(two13);
		deckTwo.addCard(two14);
		deckTwo.addCard(two15);
		deckTwo.addCard(two16);
		deckTwo.addCard(two17);
		deckTwo.addCard(two18);
		deckTwo.addCard(two19);
		deckTwo.addCard(two20);
		deckTwo.addCard(two21);
		deckTwo.addCard(two22);
		deckTwo.addCard(two23);
		deckTwo.addCard(two24);
		deckTwo.addCard(two25);
		deckTwo.addCard(two26);
		deckTwo.addCard(two27);
		deckTwo.addCard(two28);
		deckTwo.addCard(two29);
		deckTwo.addCard(two30);
	}
	
	public void setUpDeckThree() {
		Gem gemBlack = new Gem("black", 1);
		Gem gemBlue = new Gem("blue", 1);
		Gem gemWhite = new Gem("white", 1);
		Gem gemGreen = new Gem("green", 1);
		Gem gemRed = new Gem("red", 1);
		Token tokenBlueThree = new Token("blue", 3);
		Token tokenGreenThree = new Token("green", 3);
		Token tokenWhiteThree = new Token("white", 3);
		Token tokenBlackThree = new Token("black", 3);
		Token tokenRedThree = new Token("red", 3);
		Token tokenBlueFive = new Token("blue", 5);
		Token tokenGreenFive = new Token("green", 5);
		Token tokenWhiteFive = new Token("white", 5);
		Token tokenBlackFive = new Token("black", 5);
		Token tokenRedFive = new Token("red", 5);
		Token tokenBlueSix = new Token("blue", 6);
		Token tokenGreenSix = new Token("green", 6);
		Token tokenWhiteSix = new Token("white", 6);
		Token tokenBlackSix = new Token("black", 6);
		Token tokenRedSix = new Token("red", 6);
		Token tokenBlueSeven = new Token("blue", 7);
		Token tokenGreenSeven = new Token("green", 7);
		Token tokenWhiteSeven = new Token("white", 7);
		Token tokenBlackSeven = new Token("black", 7);
		Token tokenRedSeven = new Token("red", 7);
		
		ArrayList<Token> listThree1 = new ArrayList<Token>();
		listThree1.add(tokenGreenFive);
		listThree1.add(tokenBlueThree);
		listThree1.add(tokenWhiteThree);
		listThree1.add(tokenRedThree);
		Card three1 = new Card(3, 3, gemBlack, listThree1);
		
		ArrayList<Token> listThree2 = new ArrayList<Token>();
		listThree2.add(tokenBlackFive);
		listThree2.add(tokenGreenThree);
		listThree2.add(tokenWhiteThree);
		listThree2.add(tokenRedThree);
		Card three2 = new Card(3, 3, gemBlue, listThree2);
		
		ArrayList<Token> listThree3 = new ArrayList<Token>();
		listThree3.add(tokenRedFive);
		listThree3.add(tokenBlueThree);
		listThree3.add(tokenGreenThree);
		listThree3.add(tokenBlackThree);
		Card three3 = new Card(3, 3, gemWhite, listThree3);
		
		ArrayList<Token> listThree4 = new ArrayList<Token>();
		listThree4.add(tokenWhiteFive);
		listThree4.add(tokenBlueThree);
		listThree4.add(tokenBlackThree);
		listThree4.add(tokenRedThree);
		Card three4 = new Card(3, 3, gemGreen, listThree4);
		
		ArrayList<Token> listThree5 = new ArrayList<Token>();
		listThree5.add(tokenBlueFive);
		listThree5.add(tokenGreenThree);
		listThree5.add(tokenWhiteThree);
		listThree5.add(tokenBlackThree);
		Card three5 = new Card(3, 3, gemRed, listThree5);
		
		ArrayList<Token> listThree6 = new ArrayList<Token>();
		listThree6.add(tokenRedSeven);
		Card three6 = new Card(4, 3, gemBlack, listThree6);
		
		ArrayList<Token> listThree7 = new ArrayList<Token>();
		listThree7.add(tokenWhiteSeven);
		Card three7 = new Card(4, 3, gemBlue, listThree7);
		
		ArrayList<Token> listThree8 = new ArrayList<Token>();
		listThree8.add(tokenBlackSeven);
		Card three8 = new Card(4, 3, gemWhite, listThree8);
		
		ArrayList<Token> listThree9 = new ArrayList<Token>();
		listThree9.add(tokenBlueSeven);
		Card three9 = new Card(4, 3, gemGreen, listThree9);
		
		ArrayList<Token> listThree10 = new ArrayList<Token>();
		listThree10.add(tokenGreenSeven);
		Card three10 = new Card(4, 3, gemRed, listThree10);
		
		ArrayList<Token> listThree11 = new ArrayList<Token>();
		listThree11.add(tokenRedSix);
		listThree11.add(tokenGreenThree);
		listThree11.add(tokenBlackThree);
		Card three11 = new Card(4, 3, gemBlack, listThree11);
		
		ArrayList<Token> listThree12 = new ArrayList<Token>();
		listThree12.add(tokenWhiteSix);
		listThree12.add(tokenBlueThree);
		listThree12.add(tokenBlackThree);
		Card three12 = new Card(4, 3, gemBlue, listThree12);
		
		ArrayList<Token> listThree13 = new ArrayList<Token>();
		listThree13.add(tokenBlackSix);
		listThree13.add(tokenWhiteThree);
		listThree13.add(tokenRedThree);
		Card three13 = new Card(4, 3, gemWhite, listThree13);
		
		ArrayList<Token> listThree14 = new ArrayList<Token>();
		listThree14.add(tokenBlueSix);
		listThree14.add(tokenGreenThree);
		listThree14.add(tokenWhiteThree);
		Card three14 = new Card(4, 3, gemGreen, listThree14);
		
		ArrayList<Token> listThree15 = new ArrayList<Token>();
		listThree15.add(tokenGreenSix);
		listThree15.add(tokenBlueThree);
		listThree15.add(tokenRedThree);
		Card three15 = new Card(4, 3, gemRed, listThree15);
		
		ArrayList<Token> listThree16 = new ArrayList<Token>();
		listThree16.add(tokenRedSeven);
		listThree16.add(tokenBlackThree);
		Card three16 = new Card(5, 3, gemBlack, listThree16);
		
		ArrayList<Token> listThree17 = new ArrayList<Token>();
		listThree17.add(tokenWhiteSeven);
		listThree17.add(tokenBlueThree);
		Card three17 = new Card(5, 3, gemBlue, listThree17);
		
		ArrayList<Token> listThree18 = new ArrayList<Token>();
		listThree18.add(tokenBlackSeven);
		listThree18.add(tokenWhiteThree);
		Card three18 = new Card(5, 3, gemWhite, listThree18);
		
		ArrayList<Token> listThree19 = new ArrayList<Token>();
		listThree19.add(tokenBlueSeven);
		listThree19.add(tokenGreenThree);
		Card three19 = new Card(5, 3, gemGreen, listThree19);
		
		ArrayList<Token> listThree20 = new ArrayList<Token>();
		listThree20.add(tokenGreenSeven);
		listThree20.add(tokenRedThree);
		Card three20 = new Card(5, 3, gemRed, listThree20);
		
		deckThree.addCard(three1);
		deckThree.addCard(three2);
		deckThree.addCard(three3);
		deckThree.addCard(three4);
		deckThree.addCard(three5);
		deckThree.addCard(three6);
		deckThree.addCard(three7);
		deckThree.addCard(three8);
		deckThree.addCard(three9);
		deckThree.addCard(three10);
		deckThree.addCard(three11);
		deckThree.addCard(three12);
		deckThree.addCard(three13);
		deckThree.addCard(three14);
		deckThree.addCard(three15);
		deckThree.addCard(three16);
		deckThree.addCard(three17);
		deckThree.addCard(three18);
		deckThree.addCard(three19);
		deckThree.addCard(three20);
	}
}
