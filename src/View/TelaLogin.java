package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
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
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = -2841703890339998351L;
	
	private JButton botaoLogin;
	private JButton cadastrar;
	private JButton resetPassword;
	private JLabel labelTink;
	private JPasswordField password;
	private JRadioButton radioAluno;
	private JRadioButton radioProfessor;
	private ButtonGroup tipoLogin;
	private JTextField user;

	public TelaLogin() {
		initComponents();
	}

	private void initComponents() {

		tipoLogin = new ButtonGroup();
		botaoLogin = new JButton();
		cadastrar = new JButton();
		resetPassword = new JButton();
		radioAluno = new JRadioButton();
		radioProfessor = new JRadioButton();
		password = new JPasswordField();
		user = new JTextField();
		labelTink = new JLabel();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Tink!");
		setMinimumSize(new Dimension(440, 210));
		setPreferredSize(new Dimension(440, 210));
		setSize(new Dimension(440, 210));
		setResizable(false);

		botaoLogin.setText("Login");
		botaoLogin.setName("LOGIN");

		tipoLogin.add(radioAluno);
		radioAluno.setText("Aluno");

		tipoLogin.add(radioProfessor);
		radioProfessor.setText("Professor");

		labelTink.setLabelFor(this);
		labelTink.setFont(new Font("Tahoma", 0, 36));
		labelTink.setText("Tink!");
		
		resetPassword.setText("esqueceu a senha?");
		resetPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
		resetPassword.setForeground(Color.BLUE);
		resetPassword.setHorizontalAlignment(SwingConstants.LEFT);
		resetPassword.setMargin(new Insets(0, 0, 0, 0));
		resetPassword.setBorderPainted(false);
		resetPassword.setOpaque(false);
		resetPassword.setBackground(Color.WHITE);
		resetPassword.setName("RESET");
		
		cadastrar.setText("cadastre-se");
		cadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		cadastrar.setForeground(Color.BLUE);
		cadastrar.setHorizontalAlignment(SwingConstants.LEFT);
		cadastrar.setMargin(new Insets(0, 0, 0, 0));
		cadastrar.setBorderPainted(false);
		cadastrar.setOpaque(false);
		cadastrar.setBackground(Color.WHITE);
		cadastrar.setName("CAD");

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
                        .addComponent(user, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelTink)
                        .addComponent(password, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))
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
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(resetPassword))
                .addGap(14, 14, 14))
        );

		pack();
	}

	public String getUser() {
		return user.getText().trim();
	}
	
	public String getPassword() {
		return new String(password.getPassword()).trim();
	}
	
	public boolean isAluno() {
		return radioAluno.isSelected();
	}

	public boolean isProfessor() {
		return radioProfessor.isSelected();
	}
	
	public void addLoginListener(ActionListener listenLogin) {
		botaoLogin.addActionListener(listenLogin);
		cadastrar.addActionListener(listenLogin);
	}
	
	public void displayMessage(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
}
