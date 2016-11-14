import Controller.LoginController;
import Model.LoginModel;
import View.Login;

public class Tink {
	
    public static void main(String args[]) {
    	Login view = new Login();
    	LoginModel model = new LoginModel();
    	
    	@SuppressWarnings("unused")
		LoginController controller = new LoginController(view, model);
    	
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                view.setVisible(true);
            }
        });
    }
}
