package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Font;

public class TelaNovaPergunta extends JFrame {

	private JPanel contentPane;
	private JTextField TituloPergunta;
	private JTextField textField;
	private JTextField DescricaoPergunta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovaPergunta frame = new TelaNovaPergunta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaNovaPergunta() {
		setTitle("Criar Nova Pergunta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 394, 287);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox DisciplinaPergunta = new JComboBox();
		DisciplinaPergunta.setBounds(55, 32, 61, 20);
		contentPane.add(DisciplinaPergunta);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setBounds(10, 35, 46, 14);
		contentPane.add(lblDisciplina);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 60, 46, 14);
		contentPane.add(lblTitulo);
		
		TituloPergunta = new JTextField();
		TituloPergunta.setBounds(10, 85, 355, 20);
		contentPane.add(TituloPergunta);
		TituloPergunta.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 115, 46, 14);
		contentPane.add(lblDescrio);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(276, 215, 89, 23);
		contentPane.add(btnEnviar);
		
		textField = new JTextField();
		textField.setBounds(21, 140, 228, -27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		DescricaoPergunta = new JTextField();
		DescricaoPergunta.setBounds(10, 133, 355, 71);
		contentPane.add(DescricaoPergunta);
		DescricaoPergunta.setColumns(10);
		
		JLabel lblCriarNovaPergunta = new JLabel("Criar Nova Pergunta");
		lblCriarNovaPergunta.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCriarNovaPergunta.setBounds(10, 1, 249, 23);
		contentPane.add(lblCriarNovaPergunta);
	}
}
