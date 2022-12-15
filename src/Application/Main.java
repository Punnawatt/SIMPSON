package Application;

import java.util.ArrayList;

import GUI.DeckAndCardOnBoard;
import GUI.NextPlayer;
import GUI.TokenOnBoard;
import GUI.MyPlayer;
import Player.Player;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AudioClip music = new AudioClip(ClassLoader.getSystemResource("sound.mp3").toString());
		music.setVolume(0.02);
		music.setCycleCount(Timeline.INDEFINITE);
		music.play();
		BorderPane box = new BorderPane();
		Insets insets = new Insets(10);
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		Player player3 = new Player("Player 3");
		Player player4 = new Player("Player 4");
		ArrayList<Player> allPlayer = new ArrayList<Player>();
		allPlayer.add(player2);
		allPlayer.add(player3);
		allPlayer.add(player4);
		VBox blank = new VBox();
		NextPlayer test = new NextPlayer(allPlayer);
		box.setTop(test);
		DeckAndCardOnBoard deck = new DeckAndCardOnBoard();
		TokenOnBoard token = new TokenOnBoard();
		MyPlayer player = new MyPlayer(player1);
		VBox card = new VBox();
		card.setPrefHeight(100);
		card.setPrefWidth(100);
		card.getChildren().add(deck);
		card.setSpacing(10);
		BorderPane.setAlignment(token, Pos.CENTER);
		token.setPrefWidth(400);
		blank.setPrefWidth(400);
		box.setCenter(card);
		box.setLeft(blank);
		box.setRight(token);
		box.setBottom(player);
		card.setAlignment(Pos.CENTER);
		BorderPane.setMargin(test, insets);
		BorderPane.setMargin(card, insets);
		BorderPane.setMargin(token, insets);
		BorderPane.setMargin(player, insets);
		box.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
		Scene scene = new Scene(box);
		primaryStage.setTitle("Splendid");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

