package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class StartClick extends Application implements EventHandler<ActionEvent> {
	Stage stage;

	public StartClick(Stage primaryStage) {
		stage = primaryStage;

	}

	public void handle(ActionEvent event) {
		try {
			start(stage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Button btnok = new Button("Ok");
		Label name = new Label("enter your name ");
		TextField txtname = new TextField();
		Label pass = new Label("enter password");
		TextField txtpass = new TextField();
		btnok.setLayoutX(150);
		btnok.setLayoutY(180);
		name.setLayoutX(50);
		name.setLayoutY(50);
		txtname.setLayoutX(50);
		txtname.setLayoutY(80);
		pass.setLayoutY(110);
		pass.setLayoutX(50);
		txtpass.setLayoutX(50);
		txtpass.setLayoutY(140);
		root.getChildren().addAll(name, pass, txtname, txtpass, btnok);
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		String palyername = txtname.getText();

		primaryStage.show();

	}
}