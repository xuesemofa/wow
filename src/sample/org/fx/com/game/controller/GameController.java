package sample.org.fx.com.game.controller;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.animation.TranslateTransition;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class GameController {

    @FXML
    private Button rw;

    public void init() throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("../fxmls/game.fxml"));
//        获取stage
//        ObservableList<Stage> stages = FXRobotHelper.getStages();
////        设置为新的内容窗口
//        Stage primaryStage = stages.get(0);
//        primaryStage.setTitle("已开始游戏");
//        Scene scene = new Scene(root, 1024, 768);
//        scene.getStylesheets().add(getClass().getResource("../css/game.css").toExternalForm());
//        primaryStage.setScene(scene);
//        primaryStage.show();

//                获取stage
        ObservableList<Stage> stages = FXRobotHelper.getStages();
//        设置为新的内容窗口
        Stage stage = stages.get(0);
        Group root = new Group();
        Scene scene = new Scene(root, 1024, 768, Color.BLACK);

//        添加节点
        Rectangle r = new Rectangle(25, 25, 25, 25);
        r.setFill(Color.BLUE);
        root.getChildren().add(r);

        stage.setTitle("JavaFX Scene Graph Demo");
        stage.setScene(scene);
    }

    @FXML
    private void rw_yd(KeyEvent event) {
        if (event.getCode() == KeyCode.W) {
            System.out.println("向上移动");
        } else if (event.getCode() == KeyCode.S) {
            System.out.println("向下移动");
            rw.setStyle("GridPane.columnIndex=\"2\"");
        } else if (event.getCode() == KeyCode.A) {
            System.out.println("向左移动");
        } else if (event.getCode() == KeyCode.D) {
            System.out.println("向右移动");
        } else {
            System.out.println("不是移动键");
        }
    }

}
