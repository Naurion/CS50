package Fifteen;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MemoryManagerMXBean;
import java.util.HashMap;

public class Visual extends Application {
    static int mMax = 0;
    static int counter = 0;
    double mX, mY;
    HashMap<Integer,Button> buttons = new HashMap<Integer, Button>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Fefteen");
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(root));

        for (int i = 0; i < mMax*mMax; i++) {
            buttons.put(i, new Button());
            buttons.get(i).setText("" + i);
            buttons.get(i).setId("" + i);
            buttons.get(i).setPrefSize(40, 40);
        }

        for (int i = 0; i < buttons.size(); i++) {
            String mButtonId = buttons.get(i).getId();
            buttons.get(i).setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
//                    VisualMove.mVisualMove(root);
                    int mRow0 = GridPane.getRowIndex(buttons.get(0));
                    int mColumn0 = GridPane.getColumnIndex(buttons.get(0));
                    int mRow = GridPane.getRowIndex(buttons.get(Integer.parseInt(mButtonId)));
                    int mColumn = GridPane.getColumnIndex(buttons.get(Integer.parseInt(mButtonId)));
                    if(mRow == mRow0++ || mRow == mRow0-- || mColumn == mColumn0++ || mColumn == mColumn0--)
                    {
                        System.out.println(mRow0+" "+mColumn0);
                        System.out.println(root.getChildren());
//                        GridPane.setConstraints(buttons.get(0), mColumn, mRow);
//                        GridPane.setConstraints(buttons.get(Integer.parseInt(mButtonId)),mColumn0, mRow0);
                    }
                 }
            });
        }

        buttons.get(0).setVisible(true);

        counter = mMax*mMax-1;
        for (int i = 0; i < mMax; i++) {
            for (int j = 0; j < mMax; j++) {
                root.add(buttons.get(counter--), j, i);
            }
        }
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        mMax = Integer.parseInt(reader.readLine());
        launch(args);
    }

}
