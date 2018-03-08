package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import sample.org.fx.com.home.controller.HomeController;

public class Controller {

    //    名称必须和fx:id保持一至，类型也必须一至
    @FXML
    private TextField account;
    @FXML
    private PasswordField password;
    @FXML
    private Text error;

    @FXML
    private void indexReset(ActionEvent event) {
        account.setText(null);
        password.setText(null);
        error.setText(null);
    }

    @FXML
    private void indexLogin(ActionEvent event) {
        String account = this.account.getText();
        String password = this.password.getText();
        if (account == null || password == null) {
//            Util.display("错误", "账户密码不能为空");
            error.setText("账户密码不能为空");
        } else {
            boolean b = account.equals("admin");
            boolean b1 = password.equals("admin");
            if (b && b1) {
                try {
                    HomeController homeController = new HomeController();
                    homeController.init();
                } catch (Exception e) {
//                    Util.display("错误", "跳转异常");
                    error.setText("跳转异常");
                }
            } else
//                Util.display("错误", "账户密码错误");
                error.setText("账户密码错误");
        }
    }

}
