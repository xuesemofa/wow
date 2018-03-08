package sample.org.fx.com.home.controller;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class HomeController {

    public void init() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/home.fxml"));
//        获取stage
        ObservableList<Stage> stages = FXRobotHelper.getStages();
//        设置为新的内容窗口
        Stage primaryStage = stages.get(0);
        primaryStage.setTitle("欢迎来到WOW");
        Scene scene = new Scene(root, 1024, 768);
        scene.getStylesheets().add(getClass().getResource("../css/home.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
