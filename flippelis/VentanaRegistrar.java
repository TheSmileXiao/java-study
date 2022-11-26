package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Color;

//aaaa
public class VentanaRegistrar extends JFrame {

	public JFrame frame;
	private VentanaPrincipal home;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField tfUserName;
	private JButton validateBtn;
	private JTextField tfEmail;
	private JPasswordField passwordField_2;
	
	public VentanaRegistrar() {
		getContentPane().setBackground(new Color(51, 51, 51));
/*	    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    int height = screenSize.height;
	    int width = screenSize.width;
	    frame.pack();
	    frame.setSize(width/2, height/2);
		frame.setLocationRelativeTo(null);*/
		
		initialize();
		setVisible(true);
	}

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
        lbPassword.setBounds(49, 102, 78, 16);
        getContentPane().add(lbPassword);

        tfUserName = new JTextField();
        tfUserName.setBounds(191, 35, 114, 20);
        getContentPane().add(tfUserName);
        tfUserName.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(192, 100, 113, 20);
        getContentPane().add(passwordField);

        validateBtn = new JButton("Registrar");
        validateBtn.setBounds(106, 174, 130, 26);
        getContentPane().add(validateBtn);
        
        JLabel lbEmail = new JLabel("e-mail:");
        lbEmail.setForeground(new Color(255, 255, 255));
        lbEmail.setBounds(49, 72, 46, 14);
        getContentPane().add(lbEmail);
        
        JLabel lblConfirmPass = new JLabel("Confirmar contrase\u00F1a:");
        lblConfirmPass.setForeground(new Color(255, 255, 255));
        lblConfirmPass.setBounds(49, 134, 114, 14);
        getContentPane().add(lblConfirmPass);
        
        tfEmail = new JTextField();
        tfEmail.setBounds(191, 69, 114, 20);
        getContentPane().add(tfEmail);
        tfEmail.setColumns(10);
        
        passwordField_2 = new JPasswordField();
        passwordField_2.setBounds(191, 131, 114, 20);
        getContentPane().add(passwordField_2);
		
	}
}
