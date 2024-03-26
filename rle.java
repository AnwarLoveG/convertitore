package tpsit;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class rle extends Application{
	
	Hashtable<String, Integer> my_dict= new Hashtable<String,Integer>();

	TextField tPeso = new TextField();
	Label lPesoImm = new Label("Peso immagine ");
	Label lCompressionRate = new Label("Compression rate ");
	
	String matrice[][];

	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Button bComprimi = new Button("Comprimi");

		griglia.add(tPeso, 0, 0);
		griglia.add(bComprimi, 0, 1);
		griglia.add(lPesoImm, 0, 2);
		griglia.add(lCompressionRate, 0, 3);

		Scene scena = new Scene(griglia,500,500);
		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		finestra.show();

		bComprimi.setOnAction(e -> sopprimi());
		griglia.setHgap(15);
		griglia.setVgap(15);
		griglia.setAlignment(Pos.CENTER);

	}

	public void sopprimi() {

	}

	public static void main(String[] args) {
		launch(args);
	}

}




