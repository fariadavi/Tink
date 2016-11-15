import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import Controller.LoginController;
import Model.LoginModel;
import View.Login;

public class Tink {

	public static void main(String args[]) {
		setUIFont(new FontUIResource("Tahoma", 0, 11));

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

	public static void setUIFont(FontUIResource f) {
		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value != null && value instanceof FontUIResource)
				UIManager.put(key, f);
		}
	}
}
