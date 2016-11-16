import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import Controller.LoginController;
import View.TelaLogin;

public class Tink {

	public static void main(String args[]) {
		setUIFont(new FontUIResource("Tahoma", 0, 11));

		TelaLogin view = new TelaLogin();

		@SuppressWarnings("unused")
		LoginController controller = new LoginController(view);

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				view.setVisible(true);
				view.setLocationRelativeTo(null);
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
