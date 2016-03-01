package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeView;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        setUserAgentStylesheet(STYLESHEET_CASPIAN);

        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("/main/resources/StartPage.fxml").openStream());
        primaryStage.setTitle("Iron-gate!");
        primaryStage.setScene(new Scene(root, 990, 700));
        Scene scene = primaryStage.getScene(); // we get the scene from above
        scene.getStylesheets().clear(); // clear any styles

        Controller controller = loader.getController();

        controller.initializeSceneEvents();

//        scene.getStylesheets().add("/main/resources/mainStyle.css"); // absolute path
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
