package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaLogin extends JFrame {

	private JFrame frame;
	public VentanaPrincipal home;
	public JPasswordField passwordField;
	public JTextField tfUserName;
	public JButton validateBtn;
	
	public VentanaLogin() {
		getContentPane().setBackground(new Color(51, 51, 51));
		
		initialize();
		setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(100, 100, 375, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lbUserName = new JLabel("Nombre de Usuario:");
		lbUserName.setForeground(new Color(255, 255, 255));
		lbUserName.setBounds(49, 37, 114, 16);
		getContentPane().add(lbUserName);
		
		JLabel lbPassword = new JLabel("Contraseña:");
		lbPassword.setForeground(new Color(255, 255, 255));
		lbPassword.setBounds(49, 82, 78, 16);
		getContentPane().add(lbPassword);
		
		tfUserName = new JTextField();
		tfUserName.setBounds(192, 35, 114, 20);
		getContentPane().add(tfUserName);
		tfUserName.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 80, 113, 20);
		getContentPane().add(passwordField);
		
		validateBtn = new JButton("Iniciar Sesion");
		validateBtn.setBounds(107, 121, 130, 26);
		getContentPane().add(validateBtn);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		
	}
}
