package tpsit;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class esercizio extends Application {
	TextField tConvertire=new TextField();
	TextField tBase=new TextField();
	
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
	public void calcola() {
		int valore=Integer.parseInt(tConvertire.getText());
		int base=Integer.parseInt(tBase.getText());
		int resto=0;
		int i=0;
		String s="";
		for(i=1;valore<0;i++) {
			resto=valore;
			valore=valore/base;
			resto=resto-(valore*base);
			s=resto+s;
		}
		lRis.setText(s);
		
		
	}
	public static void main(String []args) {
		launch(args);
	}
}

