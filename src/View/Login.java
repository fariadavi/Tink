package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

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
	
	private JButton botaoLogin;
	private JLabel labelTink;
	private JLabel resetPassword;
	private JLabel cadastrar;
	private JPasswordField password;
	private JRadioButton radioAluno;
	private JRadioButton radioProfessor;
	private ButtonGroup tipoLogin;
	private JTextField user;

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
		resetPassword = new JLabel();
		cadastrar = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Tink!");
		setMinimumSize(new Dimension(440, 210));
		setPreferredSize(new Dimension(440, 210));
		setSize(new Dimension(440, 210));
		setResizable(false);

		botaoLogin.setText("Login");

		tipoLogin.add(radioAluno);
		radioAluno.setText("Aluno");

		tipoLogin.add(radioProfessor);
		radioProfessor.setText("Professor");

		labelTink.setLabelFor(this);
		labelTink.setFont(new Font("Tahoma", 0, 36));
		labelTink.setText("Tink!");
		
		resetPassword.setText("esqueceu a senha?");
		resetPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		resetPassword.setForeground(Color.BLUE);
		cadastrar.setText("cadastre-se");
		cadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cadastrar.setForeground(Color.BLUE);

		GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addGap(39, 39, 39)
                        .addComponent(resetPassword))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(user, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTink)
                        .addComponent(password, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(radioProfessor)
                    .addComponent(botaoLogin, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioAluno))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioAluno)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioProfessor)
                        .addGap(33, 33, 33)
                        .addComponent(botaoLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTink, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(resetPassword))
                .addGap(14, 14, 14))
        );

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
	
	public void addCadastroListener(MouseListener listenCadastro) {
		cadastrar.addMouseListener(listenCadastro);
	}
	
	public void displayErrorMessage(String errorMsg) {
		JOptionPane.showMessageDialog(this, errorMsg);
	}
}
