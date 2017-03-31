package md.leonis;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import test.PluggableModuleClass;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(5, 15, 5, 15));
        grid.setVgap(10);

        TextArea textArea = new TextArea(PluggableModuleClass.getText());
        textArea.setWrapText(true);

        Text caption = new Text("Jigsaw hello world! ;)");
        caption.setFont(Font.font("Tahoma", FontWeight.NORMAL, 18));

        grid.add(caption, 0, 0);
        grid.add(textArea, 0, 1);

        Scene scene = new Scene(grid, 320, 200);

        stage.setTitle("Java 9 + Maven");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
