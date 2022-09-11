package com.diploma.diagnosingsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.stage.StageStyle;

public class Application extends javafx.application.Application {
	double x, y = 0;
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("fxml/startScene.fxml"));
		Parent root = fxmlLoader.load();
		Scene scene = new Scene(root);

		root.setOnMousePressed(e -> {
			x = e.getSceneX();
			y = e.getSceneY();
		});
		root.setOnMouseDragged(e -> {
			stage.setX(e.getScreenX() - x);
			stage.setY(e.getScreenY() - y);
		});

		stage.initStyle(StageStyle.UNDECORATED);
		stage.setTitle("Hello!");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}