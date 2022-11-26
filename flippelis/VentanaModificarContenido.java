package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;

import Modelo.Contenido;
import javax.swing.JTextField;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaModificarContenido extends JFrame{
	
	private JFrame frame;
	public JTextField textField;
	public JTextField tf_genero;
	public JTextField tf_premios;
	public JTextField tf_recaudacion;
	public JTextField tf_BSO;
	public JTextField tf_compositor;
	public JTextField tf_plataforma;
	public JTextField tf_FDoblaje;
	public JTextField tf_productoras;
	public JTextField tf_trailerLink;
	public JTextField tf_sinopsis;
	public JTextField tf_titulo;
	public JTextField tf_fecha;
	
public VentanaModificarContenido() {

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(0, 0, 51));
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 9;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tf_fecha = new JTextField();
		GridBagConstraints gbc_tf_fecha = new GridBagConstraints();
		gbc_tf_fecha.insets = new Insets(0, 0, 5, 5);
		gbc_tf_fecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_fecha.gridx = 10;
		gbc_tf_fecha.gridy = 1;
		panel.add(tf_fecha, gbc_tf_fecha);
		tf_fecha.setColumns(10);
		
		tf_titulo = new JTextField();
		GridBagConstraints gbc_tf_titulo = new GridBagConstraints();
		gbc_tf_titulo.insets = new Insets(0, 0, 5, 5);
		gbc_tf_titulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_titulo.gridx = 3;
		gbc_tf_titulo.gridy = 2;
		panel.add(tf_titulo, gbc_tf_titulo);
		tf_titulo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("G\u00E9neros");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 9;
		gbc_lblNewLabel_4.gridy = 2;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		tf_genero = new JTextField();
		GridBagConstraints gbc_tf_genero = new GridBagConstraints();
		gbc_tf_genero.insets = new Insets(0, 0, 5, 5);
		gbc_tf_genero.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_genero.gridx = 10;
		gbc_tf_genero.gridy = 2;
		panel.add(tf_genero, gbc_tf_genero);
		tf_genero.setColumns(10);
		
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
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 9;
		gbc_lblNewLabel_5.gridy = 3;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		tf_premios = new JTextField();
		GridBagConstraints gbc_tf_premios = new GridBagConstraints();
		gbc_tf_premios.insets = new Insets(0, 0, 5, 5);
		gbc_tf_premios.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_premios.gridx = 10;
		gbc_tf_premios.gridy = 3;
		panel.add(tf_premios, gbc_tf_premios);
		tf_premios.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Car\u00E1tula");
		lblNewLabel_12.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 3;
		gbc_lblNewLabel_12.gridy = 4;
		panel.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		JLabel lblNewLabel_6 = new JLabel("Recaudaci\u00F3n");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 9;
		gbc_lblNewLabel_6.gridy = 4;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		tf_recaudacion = new JTextField();
		GridBagConstraints gbc_tf_recaudacion = new GridBagConstraints();
		gbc_tf_recaudacion.insets = new Insets(0, 0, 5, 5);
		gbc_tf_recaudacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_recaudacion.gridx = 10;
		gbc_tf_recaudacion.gridy = 4;
		panel.add(tf_recaudacion, gbc_tf_recaudacion);
		tf_recaudacion.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("BSO");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 9;
		gbc_lblNewLabel_7.gridy = 5;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		tf_BSO = new JTextField();
		GridBagConstraints gbc_tf_BSO = new GridBagConstraints();
		gbc_tf_BSO.insets = new Insets(0, 0, 5, 5);
		gbc_tf_BSO.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_BSO.gridx = 10;
		gbc_tf_BSO.gridy = 5;
		panel.add(tf_BSO, gbc_tf_BSO);
		tf_BSO.setColumns(10);
		
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
		gbc_lblCompositor.anchor = GridBagConstraints.EAST;
		gbc_lblCompositor.insets = new Insets(0, 0, 5, 5);
		gbc_lblCompositor.gridx = 9;
		gbc_lblCompositor.gridy = 6;
		panel.add(lblCompositor, gbc_lblCompositor);
		
		tf_compositor = new JTextField();
		GridBagConstraints gbc_tf_compositor = new GridBagConstraints();
		gbc_tf_compositor.insets = new Insets(0, 0, 5, 5);
		gbc_tf_compositor.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_compositor.gridx = 10;
		gbc_tf_compositor.gridy = 6;
		panel.add(tf_compositor, gbc_tf_compositor);
		tf_compositor.setColumns(10);
		
		tf_sinopsis = new JTextField();
		GridBagConstraints gbc_tf_sinopsis = new GridBagConstraints();
		gbc_tf_sinopsis.insets = new Insets(0, 0, 5, 5);
		gbc_tf_sinopsis.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_sinopsis.gridx = 3;
		gbc_tf_sinopsis.gridy = 7;
		panel.add(tf_sinopsis, gbc_tf_sinopsis);
		tf_sinopsis.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Plataforma");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 9;
		gbc_lblNewLabel_8.gridy = 7;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		tf_plataforma = new JTextField();
		GridBagConstraints gbc_tf_plataforma = new GridBagConstraints();
		gbc_tf_plataforma.insets = new Insets(0, 0, 5, 5);
		gbc_tf_plataforma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_plataforma.gridx = 10;
		gbc_tf_plataforma.gridy = 7;
		panel.add(tf_plataforma, gbc_tf_plataforma);
		tf_plataforma.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Ficha De Doblaje");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 9;
		gbc_lblNewLabel_9.gridy = 8;
		panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		tf_FDoblaje = new JTextField();
		GridBagConstraints gbc_tf_FDoblaje = new GridBagConstraints();
		gbc_tf_FDoblaje.insets = new Insets(0, 0, 5, 5);
		gbc_tf_FDoblaje.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_FDoblaje.gridx = 10;
		gbc_tf_FDoblaje.gridy = 8;
		panel.add(tf_FDoblaje, gbc_tf_FDoblaje);
		tf_FDoblaje.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Productoras");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 9;
		gbc_lblNewLabel_10.gridy = 9;
		panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		tf_productoras = new JTextField();
		GridBagConstraints gbc_tf_productoras = new GridBagConstraints();
		gbc_tf_productoras.insets = new Insets(0, 0, 5, 5);
		gbc_tf_productoras.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_productoras.gridx = 10;
		gbc_tf_productoras.gridy = 9;
		panel.add(tf_productoras, gbc_tf_productoras);
		tf_productoras.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Trailer Link");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 9;
		gbc_lblNewLabel_11.gridy = 10;
		panel.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		tf_trailerLink = new JTextField();
		GridBagConstraints gbc_tf_trailerLink = new GridBagConstraints();
		gbc_tf_trailerLink.insets = new Insets(0, 0, 5, 5);
		gbc_tf_trailerLink.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_trailerLink.gridx = 10;
		gbc_tf_trailerLink.gridy = 10;
		panel.add(tf_trailerLink, gbc_tf_trailerLink);
		tf_trailerLink.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar Cambios");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 3;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 11;
		panel.add(btnNewButton, gbc_btnNewButton);
	}
}
