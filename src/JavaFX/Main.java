package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * Created by makarov.s on 22.03.2017.
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);

        Pane root = new Pane();
        Button button = new Button("Button");
        button.setTranslateX(100);
        button.setTranslateY(100);
        button.setOnAction(event ->{
            System.out.println();
        });


        Scene scene = new Scene(root);

        root.getChildren().addAll(button);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
