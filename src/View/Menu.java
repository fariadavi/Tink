package View;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class Menu extends JFrame {

	private static final long serialVersionUID = -4712299935918727950L;
	
    private ItemMenu MenuOp1;
    private ItemMenu MenuOp2;
    private ItemMenu MenuOp3;
    private ItemMenu MenuOp4;
    private JLabel labelMenu;    
    
    public Menu() {
        initComponents();
    }

    private void initComponents() {

        labelMenu = new JLabel();
        MenuOp1 = new ItemMenu();
        MenuOp2 = new ItemMenu();
        MenuOp3 = new ItemMenu();
        MenuOp4 = new ItemMenu();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelMenu.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        labelMenu.setText("Menu");

        MenuOp1.setMaximumSize(new Dimension(200, 40));
        MenuOp1.setMinimumSize(new Dimension(200, 40));

        MenuOp2.setMaximumSize(new Dimension(200, 40));
        MenuOp2.setMinimumSize(new Dimension(200, 40));

        MenuOp3.setMaximumSize(new Dimension(200, 40));
        MenuOp3.setMinimumSize(new Dimension(200, 40));

        MenuOp4.setMaximumSize(new Dimension(200, 40));
        MenuOp4.setMinimumSize(new Dimension(200, 40));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(MenuOp4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(labelMenu))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(MenuOp1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(MenuOp3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MenuOp2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
    			.addGap(20, 20, 20)
                .addComponent(labelMenu)
                .addGap(35, 35, 35)
                .addComponent(MenuOp1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuOp2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuOp3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MenuOp4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }
}
