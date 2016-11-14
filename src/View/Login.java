package View;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class Login extends JFrame {

	private static final long serialVersionUID = -2841703890339998351L;
	
	private javax.swing.JButton botaoLogin;
	private javax.swing.JLabel labelTink;
	private javax.swing.JPasswordField password;
	private javax.swing.JRadioButton radioAluno;
	private javax.swing.JRadioButton radioProfessor;
	private javax.swing.ButtonGroup tipoLogin;
	private javax.swing.JTextField user;

	public Login() {
		initComponents();
	}

	private void initComponents() {

		tipoLogin = new ButtonGroup();
		botaoLogin = new JButton();
		radioAluno = new JRadioButton();
		radioProfessor = new JRadioButton();
		password = new JPasswordField();
		user = new JTextField();
		labelTink = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Tink!");
		setMinimumSize(new Dimension(400, 200));
		setPreferredSize(new Dimension(400, 200));
		setSize(new Dimension(400, 200));

		botaoLogin.setText("Login");

		tipoLogin.add(radioAluno);
		radioAluno.setText("Aluno");

		tipoLogin.add(radioProfessor);
		radioProfessor.setText("Professor");

		labelTink.setFont(new Font("Tahoma", 0, 36));
		labelTink.setText("Tink!");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(43, 43, 43)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(user).addComponent(password, GroupLayout.PREFERRED_SIZE, 150,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(labelTink))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(radioProfessor).addComponent(botaoLogin, GroupLayout.PREFERRED_SIZE,
								100, GroupLayout.PREFERRED_SIZE)
						.addComponent(radioAluno))
				.addGap(43, 43, 43)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(27, 27, 27)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(layout.createSequentialGroup().addComponent(radioAluno)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(radioProfessor).addGap(33, 33, 33).addComponent(botaoLogin))
						.addGroup(layout.createSequentialGroup()
								.addComponent(labelTink, GroupLayout.PREFERRED_SIZE, 44,
										GroupLayout.PREFERRED_SIZE)
								.addGap(26, 26, 26)
								.addComponent(user, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(password, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(14, Short.MAX_VALUE)));

		pack();
	}

	public String getUser() {
		return user.getText();
	}
	
	public String getPassword() {
		return new String(password.getPassword());
	}
	
	public void addLoginListener(ActionListener listenLogin) {
		botaoLogin.addActionListener(listenLogin);
	}
	
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this, errorMsg);
	}
}
