package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import ventanas.modelo.Paises;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;

public class Actividad2_1 {

	private JFrame frame;
	private JTextField TextoCodigo;
	private JTextField TextoNombre;
	private JTextField TextoLocalidad;
	private ButtonGroup btnGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad2_1 window = new Actividad2_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Actividad2_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 870, 721);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(160, 50, 600, 350);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel DatosDepartamento = new JLabel("Datos de departamento");
		DatosDepartamento.setBounds(125, 11, 300, 50);
		DatosDepartamento.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(DatosDepartamento);
		
		JLabel CodigoDepartamento = new JLabel("Codigo Departamento");
		CodigoDepartamento.setBounds(22, 75, 150, 14);
		panel.add(CodigoDepartamento);
		
		TextoCodigo = new JTextField();
		TextoCodigo.setBounds(171, 75, 80, 20);
		TextoCodigo.setBackground(Color.GRAY);
		TextoCodigo.setForeground(new Color(0, 0, 0));
		panel.add(TextoCodigo);
		TextoCodigo.setColumns(10);
		
		JLabel NombreDepartamento = new JLabel("Nombre Departamento");
		NombreDepartamento.setBounds(22, 125, 150, 14);
		panel.add(NombreDepartamento);
		
		JLabel LocalidadDepartamento = new JLabel("Localidad Departamento");
		LocalidadDepartamento.setBounds(22, 175, 150, 14);
		panel.add(LocalidadDepartamento);
		
		TextoNombre = new JTextField();
		TextoNombre.setBounds(171, 125, 160, 20);
		TextoNombre.setColumns(10);
		panel.add(TextoNombre);
		
		TextoLocalidad = new JTextField();
		TextoLocalidad.setBounds(171, 175, 160, 20);
		TextoLocalidad.setColumns(10);
		panel.add(TextoLocalidad);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(15, 60, 460, 220);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbPais = new JLabel("Selecciona al pais");
		lbPais.setBounds(10, 160, 120, 14);
		lbPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_1.add(lbPais);
		
		JComboBox cmbPaises = new JComboBox();
		cmbPaises.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String comando = e.getActionCommand();
				
				System.out.println(comando + " "+ cmbPaises.getSelectedItem());
			}
		});
		cmbPaises.setBackground(new Color(255, 255, 255));
		cmbPaises.setBounds(157, 160, 150, 22);
		cmbPaises.setModel(new DefaultComboBoxModel(Paises.values()));
		panel_1.add(cmbPaises);
		
		JButton InsertarDatos = new JButton("Insertar Datos");
		InsertarDatos.setBounds(47, 293, 200, 40);
		InsertarDatos.setBackground(new Color(255, 255, 255));
		InsertarDatos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				System.out.println("Código: "+ TextoCodigo.getText() + "\nNombre: "+ TextoNombre.getText() +
						"\nLocalidad: "+TextoLocalidad.getText()+ "\nPais: "+cmbPaises.getSelectedItem());
			}
		});
		panel.add(InsertarDatos);
		
		JButton LimpiarDatos = new JButton("Limpiar Datos");
		LimpiarDatos.setBounds(257, 293, 200, 40);
		LimpiarDatos.setBackground(Color.WHITE);
		LimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TextoCodigo.setText("");
				TextoNombre.setText(""); 
				TextoLocalidad.setText("");
			}
		});
		panel.add(LimpiarDatos);
		
		JRadioButton gestion = new JRadioButton("Gestion");
		gestion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gestion.setBounds(481, 30, 109, 23);
		panel.add(gestion);
		
		JRadioButton rdbtnPersonal = new JRadioButton("Personal");
		rdbtnPersonal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnPersonal.setBounds(481, 50, 109, 23);
		panel.add(rdbtnPersonal);
		
		JRadioButton rdbtnApoyo = new JRadioButton("Apoyo");
		rdbtnApoyo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnApoyo.setBounds(481, 70, 109, 23);
		panel.add(rdbtnApoyo);
		
		JRadioButton rdbtnTegnologico = new JRadioButton("Tegnologico");
		rdbtnTegnologico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnTegnologico.setBounds(481, 90, 109, 23);
		panel.add(rdbtnTegnologico);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(160, 425, 600, 250);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
