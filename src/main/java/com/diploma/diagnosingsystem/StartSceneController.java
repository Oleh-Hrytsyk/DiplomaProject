package com.diploma.diagnosingsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartSceneController {

	@FXML
	private ImageView closeBtn;

	@FXML
	private VBox logIn;

	@FXML
	private VBox regScene;

	@FXML
	private Label regLink;

	@FXML
	private Label logLink;

	@FXML
	private ToggleGroup sex;

	@FXML
	private ToggleGroup sex1;

	@FXML
	private StackPane userScene;

	@FXML
	void closeApplication(MouseEvent event) {
		Stage stage = (Stage) closeBtn.getScene().getWindow();
		stage.close();
	}

	@FXML
	void switchToRegistration(MouseEvent event) {
		userScene.getChildren().get(1).setVisible(false);
	}

	@FXML
	void switchToLogIn(MouseEvent event) {
		userScene.getChildren().get(1).setVisible(true);
	}

}