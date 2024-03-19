package tpsit;

import javafx.application.Application;
import java.util.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class convertitore extends Application {
	TextField tConvertire=new TextField();
	TextField tBase=new TextField();
	
	Hashtable<Integer, String> my_dict= new Hashtable<Integer,String>();
	
	Label lTitolo= new Label ("Convertitore");
	Label lConvertire=new Label("Numero da convertire");
	Label lBase=new Label("Base");
	Label lConvertito=new Label("Numero convertito");
	Label lRis=new Label("");

	public void start(Stage finestra) {
		Button bCalcola=new Button("Converti");
		GridPane griglia=new GridPane();
		
		griglia.add(lTitolo, 0,0);
		griglia.add(lConvertire,0,1);
		griglia.add(tConvertire,1, 1);
		griglia.add(lBase, 0,2);
		griglia.add(tBase, 1, 2);
		griglia.add(lConvertito,0,3);
		griglia.add(lRis, 1, 3);
		griglia.add(bCalcola, 0, 4,2,2);
		bCalcola.setPadding(new Insets(17,17,17,17));
		griglia.setHgap(25);
		griglia.setVgap(25);
		griglia.setAlignment(Pos.CENTER);
		
		Scene scena=new Scene(griglia,500,500);
		finestra.show();
		finestra.setTitle("Convertitore");
		finestra.setScene(scena);
		
		bCalcola.setOnAction(e->calcola());
		
	}
	private void calcola() {
		int val = Integer.parseInt(tConvertire.getText());
		int base = Integer.parseInt(tBase.getText());
		int resto = 0;
		String s = "";
		
		my_dict.put(10, "A");
		my_dict.put(11, "B");
		my_dict.put(12, "C");
		my_dict.put(13, "D");
		my_dict.put(14, "E");
		my_dict.put(15, "F");
		
		if (base == 16) {
			while (val > 0) {
				resto = val;
				val = val / base;
				resto = resto - (val * base);
				if (resto < 10) {
					s = resto + s;
				}
				if (resto == 10) {
					my_dict.get(10);
				}
				if (resto == 11) {
					my_dict.get(11);
				}
				if (resto == 12) {
					my_dict.get(12);
				}
				if (resto == 13) {
					my_dict.get(13);
				}
				if (resto == 14) {
					my_dict.get(14);
				}
				if (resto == 15) {
					my_dict.get(15);	
		}
		}
		} else {
			while (val > 0) {
				resto = val;
				val = val / base;
				resto = resto - (val * base);
				s = resto + s;
			}
		}
		lRis.setText(s);
	}
	public static void main(String []args) {
		launch(args);
	}
}