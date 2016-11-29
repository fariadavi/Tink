package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class ItemMenu extends JPanel {

	private static final int WIDTH = 200;
    private static final int HEIGHT = 40;

	private static final long serialVersionUID = -2472558405518314999L;
	
	private JButton botaoOpcao;
    private JSeparator separador;
	
    public ItemMenu() {
        initComponents();
    }
                          
    private void initComponents() {

    	botaoOpcao = new JButton();
        separador = new JSeparator();

        setMaximumSize(new Dimension(WIDTH, HEIGHT));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        botaoOpcao.setFont(new Font("Tahoma", 0, 18));
        botaoOpcao.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botaoOpcao.setBorderPainted(false);
        botaoOpcao.setOpaque(false);
        botaoOpcao.setBackground(Color.WHITE);
        botaoOpcao.setText("Lorem Ipsum");
        botaoOpcao.setVerticalTextPosition(SwingConstants.CENTER);
        botaoOpcao.setHorizontalAlignment(SwingConstants.LEFT);
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        	.addComponent(botaoOpcao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(separador, GroupLayout.PREFERRED_SIZE,  GroupLayout. PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(botaoOpcao, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
        );
    }
    
    public void setBotaoOpcaoText(String botaoText) {
		this.botaoOpcao.setText(botaoText);
	}
    
    public void setBotaoOpcaoName(String botaoName) {
    	this.botaoOpcao.setName(botaoName);
    }

	public JButton getBotaoOpcao() {
		return botaoOpcao;
	}

	public void setBotaoOpcao(JButton botaoOpcao) {
		this.botaoOpcao = botaoOpcao;
	}
}
