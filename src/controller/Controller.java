package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.TilePane;
import model.Battlefield;
import view.BattlefieldView;

public class Controller implements Initializable{	
	@FXML
	private TilePane tilepane;
	private Battlefield battlefield;
    private BattlefieldView battlefieldView;

    public void initialize(URL arg0, ResourceBundle arg1) {
    	battlefield = new Battlefield("battlefields/battlefield1.json");
    	battlefieldView = new BattlefieldView(battlefield, tilepane);
    	battlefieldView.createView();
    	battlefieldView.test();
    }

}
