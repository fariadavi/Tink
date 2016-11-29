package view;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class TelaRanking extends JFrame {

	private static final long serialVersionUID = -4936899944612582070L;

	private static final int DEFAULT_NUM_OPCOES = 10;
	
	private ItemMenu[] posicoesRanking;
    private JLabel labelMenu;
	private JButton returnToMainMenu;    
    
    public TelaRanking() {
        initComponents();
    }

    private void initComponents() {
    	
    	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	setResizable(false);
    	
        labelMenu = new JLabel();
        posicoesRanking = new ItemMenu[DEFAULT_NUM_OPCOES];
        returnToMainMenu = new JButton();
        
        for (int i = 0; i < posicoesRanking.length; i++) {
        	posicoesRanking[i] = new ItemMenu();
        	posicoesRanking[i].getBotaoOpcao().setEnabled(false);
        }

        labelMenu.setFont(new Font("Tahoma", 0, 24));
        labelMenu.setText("Ranking");

        returnToMainMenu.setText("Voltar");
        
        GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		
		ParallelGroup horizontalGroup = layout.createParallelGroup(GroupLayout.Alignment.LEADING);

		SequentialGroup verticalGroup = layout.createSequentialGroup().addGap(30, 30, 30)
				.addComponent(labelMenu).addGap(20, 20, 20);

		for (int i = 0; i < posicoesRanking.length; i++) {
			horizontalGroup.addComponent(posicoesRanking[i], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE);

			verticalGroup.addComponent(posicoesRanking[i], GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE);
		}

		layout.setHorizontalGroup(layout.createSequentialGroup().addGap(52, 52, 52)
				.addGroup(horizontalGroup.addComponent(returnToMainMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(25, 25, 25).addComponent(labelMenu))))
				.addContainerGap(52, Short.MAX_VALUE));

		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(GroupLayout.Alignment.TRAILING, verticalGroup.addGap(20, 20, 20)
						.addComponent(returnToMainMenu, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addContainerGap(35, Short.MAX_VALUE)));

		pack();
    }

	public void addRankingListener(ActionListener rankingListener) {
		returnToMainMenu.addActionListener(rankingListener);
	}
}
