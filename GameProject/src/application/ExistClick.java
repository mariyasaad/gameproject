package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class ExistClick extends Application implements EventHandler<ActionEvent> {
	Stage stage = new Stage();

	public ExistClick(Stage primaryStage) {
		stage = primaryStage;
	}

	public void handle(ActionEvent event) {
		try {
			start(stage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.close();
	}

}
