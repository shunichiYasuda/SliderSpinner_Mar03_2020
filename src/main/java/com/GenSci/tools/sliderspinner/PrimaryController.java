package com.GenSci.tools.sliderspinner;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;

public class PrimaryController {
	@FXML
	private Spinner<Integer> sp;
	@FXML
	private Button quitBtn;
	@FXML
	public void quitAction() {
		System.exit(0);
	}
   
}