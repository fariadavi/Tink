package view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class TelaMenu extends JFrame {

	private static final long serialVersionUID = -4712299935918727950L;

	private static final int DEFAULT_NUM_OPCOES = 4;

	private ItemMenu[] opcoes;
	private JLabel labelMenu;
	private JButton botaoLogout;
	private JButton botaoSair;

	public TelaMenu() {
		initComponents();
	}

	private void initComponents() {

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		
		labelMenu = new JLabel();
		botaoLogout = new JButton();		
		botaoSair = new JButton();
		
		opcoes = new ItemMenu[DEFAULT_NUM_OPCOES];

		for (int i = 0; i < opcoes.length; i++)
			opcoes[i] = new ItemMenu();

		labelMenu.setFont(new Font("Tahoma", 0, 24));
		labelMenu.setText("Menu");

		opcoes[0].setBotaoOpcaoText("Criar Pergunta");
		opcoes[0].setBotaoOpcaoName("CRIAR_PERG");
		opcoes[2].setBotaoOpcaoText("Pesquisar Pergunta");
		opcoes[2].setBotaoOpcaoName("PESQ_PERG");
		opcoes[3].setBotaoOpcaoText("Ranking");
		opcoes[3].setBotaoOpcaoName("RANKING");

		botaoLogout.setText("Logout");
		botaoLogout.setName("LOGOUT");

		botaoSair.setText("Sair");
		botaoSair.setName("SAIR");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		
		ParallelGroup horizontalGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);

		SequentialGroup verticalGroup = layout.createSequentialGroup().addGap(35, 35, 35).addComponent(labelMenu).addGap(20, 20, 20);

		for (int i = 0; i < opcoes.length; i++) {
			horizontalGroup.addComponent(opcoes[i], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);

			verticalGroup.addComponent(opcoes[i], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
		}

		layout.setHorizontalGroup(layout.createSequentialGroup().addGap(52, 52, 52)
				.addGroup(horizontalGroup
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
										.addGap(25, 25, 25).addComponent(labelMenu)))
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
								.addComponent(botaoSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(botaoLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
				.addContainerGap(52, Short.MAX_VALUE));

		layout.setVerticalGroup(verticalGroup.addGap(20, 20, 20)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(botaoLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(botaoSair, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						)
						.addContainerGap(35, Short.MAX_VALUE)
						);

		pack();
	}
	
	public void hideItem() {
		opcoes[0].setVisible(false);
	}

	public void unhideItem() {
		opcoes[0].setVisible(true);
	}

	public void addMenuListener(ActionListener menuListener) {
		for (ItemMenu itemMenu : opcoes)
			itemMenu.getBotaoOpcao().addActionListener(menuListener);
		botaoLogout.addActionListener(menuListener);
		botaoSair.addActionListener(menuListener);
	}

	public ItemMenu[] getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(ItemMenu[] opcoes) {
		this.opcoes = opcoes;
	}
}
