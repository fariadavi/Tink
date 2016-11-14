package View;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class ItemMenu extends JPanel {

    private static final long serialVersionUID = -2472558405518314999L;
	
	private JLabel labelOpcao;
    private JSeparator separador;
	
    public ItemMenu() {
        initComponents();
    }
                          
    private void initComponents() {

        labelOpcao = new JLabel();
        separador = new JSeparator();

        setMaximumSize(new Dimension(200, 40));
        setMinimumSize(new Dimension(200, 40));
        
        setPreferredSize(new Dimension(200, 40));

        labelOpcao.setText("Text");
        labelOpcao.setFont(new Font("Tahoma", 0, 18));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(separador, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 82, Short.MAX_VALUE)
                    .addComponent(labelOpcao)
                    .addGap(0, 83, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(separador, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(labelOpcao)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }                    
    
    public JLabel getLabelOpcao() {
		return labelOpcao;
	}
    
    public void setLabelOpcao(JLabel labelOpcao) {
		this.labelOpcao = labelOpcao;
	}
    
    public void setLabelOpcaoText(String labelOpcaoText) {
		this.labelOpcao.setText(labelOpcaoText);
	}
}
