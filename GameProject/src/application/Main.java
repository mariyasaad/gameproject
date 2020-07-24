package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;

public class Main extends Application {
	Group root = new Group();
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Image image = new Image(getClass().getResourceAsStream("Zombie-Age-2.png"));
			Paint value = new ImagePattern(image);

			Scene scene = new Scene(root, 400, 400);
			scene.setFill(value);
			Button btStart = new Button("	Start		");
			Button btInst = new Button(" instruction     ");

			Button btExist = new Button("	Exist		");
			
			btInst.setLayoutX(150);
			btInst.setLayoutY(330);
			btStart.setLayoutX(150);
			btStart.setLayoutY(300);
			
			StartClick stclick = new StartClick(primaryStage);
			ExistClick exclick = new ExistClick(primaryStage);

			btStart.setOnAction(stclick);
			btExist.setOnAction(exclick);
			btExist.setLayoutY(360);
			btExist.setLayoutX(150);
			root.getChildren().addAll(btStart, btExist, btInst);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("KILLING");

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
