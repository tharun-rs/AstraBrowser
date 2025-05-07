package org.astrabrowser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        webView.getEngine().load("https://google.com");

        Scene scene = new Scene(webView, 1200, 800);
        stage.setTitle("Astra Browser");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
