package Vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import Modelo.Contenido;

public class VentanaContenido extends JFrame {
	
	private JFrame frame;
	public JMenuBar menuBar;
	
	public VentanaContenido() {
		//Menu
		JPanel panelBarra = new JPanel();
		panelBarra.setBackground(new Color(25, 25, 112));
		getContentPane().add(panelBarra, BorderLayout.NORTH);
		GridBagLayout gbl_panel2 = new GridBagLayout();
		gbl_panel2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel2.rowHeights = new int[]{0, 0};
		gbl_panel2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel2.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panelBarra.setLayout(gbl_panel2);
		
		menuBar = new JMenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.gridwidth = 12;
		gbc_menuBar.insets = new Insets(0, 0, 0, 5);
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		panelBarra.add(menuBar, gbc_menuBar);
		
		JMenu mnNewMenu = new JMenu("Men\u00FA Chingon");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Modificar Contenido");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Añadir Contenido");
		mnNewMenu.add(mntmNewMenuItem_1);
				
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(0, 0, 51));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_2 = new JLabel("Titulo");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha estreno");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 10;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("G\u00E9neros");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 10;
		gbc_lblNewLabel_4.gridy = 2;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		//new ImageIcon(this.contenido.getImagenes())
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 3;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Premios");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 10;
		gbc_lblNewLabel_5.gridy = 3;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Recaudaci\u00F3n");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 10;
		gbc_lblNewLabel_6.gridy = 4;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("BSO");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 10;
		gbc_lblNewLabel_7.gridy = 5;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_3 = new JLabel("Sinopsis");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.gridwidth = 3;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 6;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblCompositor = new JLabel("Compositor");
		lblCompositor.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblCompositor = new GridBagConstraints();
		gbc_lblCompositor.insets = new Insets(0, 0, 5, 5);
		gbc_lblCompositor.gridx = 10;
		gbc_lblCompositor.gridy = 6;
		panel.add(lblCompositor, gbc_lblCompositor);
		
		JLabel lblNewLabel_8 = new JLabel("Plataforma");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 10;
		gbc_lblNewLabel_8.gridy = 7;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Ficha De Doblaje");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 10;
		gbc_lblNewLabel_9.gridy = 8;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Productoras");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 10;
		gbc_lblNewLabel_10.gridy = 9;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Trailer Link");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_11.gridx = 10;
		gbc_lblNewLabel_11.gridy = 10;
		panel.add(lblNewLabel_11, gbc_lblNewLabel_11);
	}

}
