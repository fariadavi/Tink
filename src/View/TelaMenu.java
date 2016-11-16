package View;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class TelaMenu extends JFrame {

	private static final long serialVersionUID = -4712299935918727950L;
	
    private static final int DEFAULT_NUM_OPCOES = 5;
	
	private ItemMenu[] opcoes;
    private JLabel labelMenu;    
    
    public TelaMenu() {
        initComponents();
    }

    private void initComponents() {
    	
    	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	setResizable(false);
    	
        labelMenu = new JLabel();
        setOpcoes(new ItemMenu[DEFAULT_NUM_OPCOES]);
        
        for (int i = 0; i < getOpcoes().length; i++)
        	getOpcoes()[i] = new ItemMenu();

        labelMenu.setFont(new Font("Tahoma", 0, 24));
        labelMenu.setText("Menu");

        opcoes[0].setBotaoOpcaoText("Criar Pergunta");
        opcoes[0].setBotaoOpcaoName("CRIAR_PERG");
        opcoes[2].setBotaoOpcaoText("Pesquisar Pergunta");
        opcoes[2].setBotaoOpcaoName("PESQ_PERG");
        opcoes[3].setBotaoOpcaoText("Ranking");
        opcoes[3].setBotaoOpcaoName("RANKING");
        opcoes[4].setBotaoOpcaoText("Sair");
        opcoes[4].setBotaoOpcaoName("SAIR");
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        		layout.createSequentialGroup()
					.addGap(52, 52, 52)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			        		.addComponent(getOpcoes()[3], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			        		.addComponent(getOpcoes()[0], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                .addComponent(getOpcoes()[2], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			                .addComponent(getOpcoes()[1], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			            	.addComponent(getOpcoes()[4], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			            	.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			            			.addGroup(layout.createSequentialGroup()
			        				.addGap(25, 25, 25)
			        				.addComponent(labelMenu))))
					.addContainerGap(52, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    			.addGap(30, 30, 30)
                .addComponent(labelMenu)
                .addGap(20, 20, 20)
                .addComponent(getOpcoes()[0], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getOpcoes()[1], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getOpcoes()[2], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getOpcoes()[3], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getOpcoes()[4], GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        

        pack();
    }

	public void hideItem() {
		getOpcoes()[0].setVisible(false);
	}

	public void addMenuListener(ActionListener menuListener) {
		for (ItemMenu itemMenu : getOpcoes()) {
			itemMenu.getBotaoOpcao().addActionListener(menuListener);
		}
	}

	public ItemMenu[] getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(ItemMenu[] opcoes) {
		this.opcoes = opcoes;
	}
}
