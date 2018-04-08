package sample.org.fx.com.home.controller;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.org.fx.com.grzl.controller.GrzlController;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class HomeController {

    @FXML
    private Pane bodys;

    public void init() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/home.fxml"));
//        获取stage
        ObservableList<Stage> stages = FXRobotHelper.getStages();
//        设置为新的内容窗口
        Stage primaryStage = stages.get(0);
        primaryStage.setTitle("欢迎来到后台管理");
        Scene scene = new Scene(root, primaryStage.getScene().getWidth(), primaryStage.getScene().getHeight());
        scene.getStylesheets().add(getClass().getResource("../css/home.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    private void logout() {
        //        获取stage
        ObservableList<Stage> stages = FXRobotHelper.getStages();
        stages.get(0).close();
    }

    @FXML
    private void grzl() {
        GrzlController.grzl(bodys);
    }
}
