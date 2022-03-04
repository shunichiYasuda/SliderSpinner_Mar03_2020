package com.GenSci.tools.sliderspinner;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;

public class PrimaryController {
	@FXML
	TextArea log;
	@FXML
	Canvas canvas;
	@FXML
	private Spinner<Integer> sp;
	@FXML
	private Button quitBtn;
	@FXML
	public void quitAction() {
		System.exit(0);
	}
	//
	SpinnerValueFactory<Integer> svf;
   
	@FXML
	protected void initialize() {
		System.out.println("in initialize()");
		log.appendText("in initialize()\n");
		
	}
}
