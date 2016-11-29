package view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class TelaCadastro extends JDialog {

	private static final long serialVersionUID = -2688557653962458076L;
	
    private JLabel labelTink;    
    private JLabel labelMail;
    private JLabel labelUser;
    private JLabel labelPswd;
    private JLabel labelConfirmPswd;
    private JLabel labelTipoAcesso;
    private JTextField fieldMail;
    private JTextField fieldUser;
    private JPasswordField fieldPswd;
    private JPasswordField fieldConfirmPswd;
    private JRadioButton isAluno;
    private JRadioButton isProfessor;
    private ButtonGroup tipoAcesso;
    private JButton botaoCancelar;
    private JButton botaoLimpar;
    private JButton botaoEnviar;

    public TelaCadastro(JFrame owner, boolean modal) {
    	super(owner, modal);
        initComponents();
    }

    private void initComponents() {
    	

        labelTink = new JLabel();
        labelMail = new JLabel();
        fieldMail = new JTextField();
        labelUser = new JLabel();
        fieldUser = new JTextField();
        labelPswd = new JLabel();
        fieldPswd = new JPasswordField();
        labelConfirmPswd = new JLabel();
        fieldConfirmPswd = new JPasswordField();
        labelTipoAcesso = new JLabel();
        isAluno = new JRadioButton();
        isProfessor = new JRadioButton();
        tipoAcesso = new ButtonGroup();
        botaoCancelar = new JButton();
        botaoLimpar = new JButton();
        botaoEnviar = new JButton();

        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        labelTink.setFont(new Font("Tahoma", 0, 36));
        labelTink.setLabelFor(this);
        labelTink.setText("Cadastro Tink!");       

        labelMail.setText("E-mail:");
        labelMail.setLabelFor(fieldMail);
        
        labelUser.setText("Nome de usuário:");
        labelUser.setLabelFor(fieldUser);
        
        labelPswd.setText("Senha:");
        labelPswd.setLabelFor(fieldPswd);
        
        labelConfirmPswd.setText("Confirmar Senha:");
        labelConfirmPswd.setLabelFor(fieldConfirmPswd);

        labelTipoAcesso.setText("Tipo Acesso:");
        isAluno.setText("Aluno");
        isProfessor.setText("Professor");
        tipoAcesso.add(isAluno);
        tipoAcesso.add(isProfessor);
        
        botaoCancelar.setText("Cancelar");
        botaoLimpar.setText("Limpar");
        botaoEnviar.setText("Enviar");
        botaoCancelar.setFont(new Font("Tahoma", 0, 10));
        botaoEnviar.setFont(new Font("Tahoma", 0, 10));
        botaoLimpar.setFont(new Font("Tahoma", 0, 10));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(labelConfirmPswd)
                    .addComponent(fieldConfirmPswd, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMail)
                    .addComponent(fieldMail, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelUser)
                    .addComponent(fieldUser, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPswd)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoCancelar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(botaoLimpar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(botaoEnviar, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldPswd, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                            .addComponent(labelTipoAcesso)
                            .addGap(18, 18, 18)
                            .addComponent(isAluno)
                            .addGap(18, 18, 18)
                            .addComponent(isProfessor)))
                .addGap(62, 62, 62))
            
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(labelTink)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTink, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMail)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldMail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelUser)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelPswd)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPswd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelConfirmPswd)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldConfirmPswd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isAluno)
                    .addComponent(isProfessor)
                    .addComponent(labelTipoAcesso))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCancelar)
                    .addComponent(botaoEnviar)
                    .addComponent(botaoLimpar))
                .addGap(30, 30, 30))
        );

        pack();
    }
	
    public void limpaCadastro() {
		fieldMail.setText("");
		fieldUser.setText("");
		fieldPswd.setText("");
		fieldConfirmPswd.setText("");
		tipoAcesso.clearSelection();
	}
    
    public boolean cadastroPreenchido() {
    	return !getMail().isEmpty() && !getUser().isEmpty() && !getPswd().isEmpty() && !getConfPswd().isEmpty() && (isProfessor() || isAluno());
    }
    
    public void addCadastroListener(ActionListener listenCad) {
    	botaoCancelar.addActionListener(listenCad);
    	botaoLimpar.addActionListener(listenCad);
    	botaoEnviar.addActionListener(listenCad);
    }
    
    public void displayMessage(String msg) {
    	JOptionPane.showMessageDialog(this, msg);
    }
    
	public String getMail() {
		return fieldMail.getText().trim();
	}
	
	public String getUser() {
		return fieldUser.getText().trim();
	}
	
	public String getPswd() {
		return new String(fieldPswd.getPassword()).trim();
	}
	
	public String getConfPswd() {
		return new String(fieldConfirmPswd.getPassword()).trim();
	}
	
	public boolean isProfessor() {
		return isProfessor.isSelected();
	}

	public boolean isAluno() {
		return isAluno.isSelected();
	}
}
