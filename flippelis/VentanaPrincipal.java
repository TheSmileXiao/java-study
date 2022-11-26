package Vista;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class VentanaPrincipal extends JFrame {

	private JFrame frame;
	public VentanaPrincipal home;
	private JTextField textField;
	
	public VentanaPrincipal() {
		
		initialize();
		setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 540, 397);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setResizable(false);
		
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
		
		JTextField textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 0;
		panelBarra.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JMenuBar menuBarBarra = new JMenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.insets = new Insets(0, 0, 0, 5);
		gbc_menuBar.gridx = 11;
		gbc_menuBar.gridy = 0;
		panelBarra.add(menuBarBarra, gbc_menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBarBarra.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Registrarse");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Iniciar Sesi\u00F3n");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cerra Sesi\u00F3n");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Modificar Perfil");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(new Color(0, 0, 51));
		getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Ultimas Series");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 51));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 1;
		gbc_panel_3.gridy = 2;
		panel_1.add(panel_3, gbc_panel_3);
		
		JMenuBar menuBar_1 = new JMenuBar();
		panel_3.add(menuBar_1);
		
		JButton btnNewButton_4 = new JButton(new ImageIcon()); //falta la ruta y establecer el tamaño
		menuBar_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("S2");
		menuBar_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("S3");
		menuBar_1.add(btnNewButton_6);
		
		JLabel lblNewLabel_2 = new JLabel("Ultimas Peliculas");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 5;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 51));
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 6;
		panel_1.add(panel_2, gbc_panel_2);
		
		JMenuBar menuBar = new JMenuBar();
		panel_2.add(menuBar);
		
		JButton btnNewButton_7 = new JButton("P1");
		menuBar.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("P2");
		menuBar.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("P3");
		menuBar.add(btnNewButton_9);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}