package View;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;

public class ItemMenu extends JPanel {

    private static final long serialVersionUID = -2472558405518314999L;
	
	private JButton botaoOpcao;
    private JSeparator separador;
	
    public ItemMenu() {
        initComponents();
    }
                          
    private void initComponents() {

        setBotaoOpcao(new JButton());
        separador = new JSeparator();

        setMaximumSize(new Dimension(200, 40));
        setMinimumSize(new Dimension(200, 40));
        
        setPreferredSize(new Dimension(200, 40));

        getBotaoOpcao().setHorizontalAlignment(SwingConstants.LEFT);
        getBotaoOpcao().setFont(new Font("Tahoma", 0, 18));
        getBotaoOpcao().setCursor(new Cursor(Cursor.HAND_CURSOR));
        getBotaoOpcao().setMargin(new Insets(12, 10, 12, 10));
        getBotaoOpcao().setBorderPainted(false);
        getBotaoOpcao().setOpaque(false);
        getBotaoOpcao().setBackground(Color.WHITE);
        getBotaoOpcao().setText("Lorem Ipsum");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(getBotaoOpcao())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(separador, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(getBotaoOpcao())))
        );
    }                    
    
    public void setBotaoOpcaoText(String botaoText) {
		this.getBotaoOpcao().setText(botaoText);
	}
    
    public void setBotaoOpcaoName(String botaoName) {
    	this.getBotaoOpcao().setName(botaoName);
    }

	public JButton getBotaoOpcao() {
		return botaoOpcao;
	}

	public void setBotaoOpcao(JButton botaoOpcao) {
		this.botaoOpcao = botaoOpcao;
	}
}
