package ejemploTienda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.border.LineBorder;


import ejemplosliistener.modelo.Persona;
import ejemploTienda.modelo.Cliente;
import ejemploTienda.modelo.Tienda;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppTienda {

   private JFrame frame;
   private JTextField txtNombreTienda;
   private JTextField txtDireccionTienda;
   private JTextField txtDni;
   private JTextField txtNombreCliente;
   private JTextField txtApellidosCliente;
   private JComboBox cmbClientes;
   private JButton btnModificarTienda;
   private JButton btnModificarCliente;
   
   private boolean esInsertado=false;
   private Cliente clienteInsertado=null;
   private Tienda t1;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
           public void run() {
               try {
                   AppTienda window = new AppTienda();
                   window.frame.setVisible(true);
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }
       });
   }
   
   

   public boolean isEsInsertado() {
       return esInsertado;
   }



   public void setEsInsertado(boolean esInsertado) {
       this.esInsertado = esInsertado;
   }



   public Cliente getClienteInsertado() {
       return clienteInsertado;
   }



   public void setClienteInsertado(Cliente clienteInsertado) {
       this.clienteInsertado = clienteInsertado;
   }



   /**
    * Create the application.
    */
   public AppTienda() {
       initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
       frame = new JFrame();
       frame.setBounds(100, 100, 1442, 823);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setLayout(null);

       JPanel panelTienda = new JPanel();
       panelTienda.setBorder(new LineBorder(new Color(0, 0, 0)));
       panelTienda.setBounds(107, 118, 612, 428);
       frame.getContentPane().add(panelTienda);
       panelTienda.setLayout(null);

       JLabel lblNombreTienda = new JLabel("Nombre de tienda:");
       lblNombreTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lblNombreTienda.setBounds(111, 54, 143, 22);
       panelTienda.add(lblNombreTienda);

       txtNombreTienda = new JTextField();
       txtNombreTienda.setFont(new Font("Tahoma", Font.PLAIN, 12));
       txtNombreTienda.setBounds(264, 54, 300, 28);
       panelTienda.add(txtNombreTienda);
       txtNombreTienda.setColumns(10);

       JLabel lblDireccionTienda = new JLabel("Direccion de tienda:");
       lblDireccionTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lblDireccionTienda.setBounds(111, 110, 143, 22);
       panelTienda.add(lblDireccionTienda);

       txtDireccionTienda = new JTextField();
       txtDireccionTienda.setFont(new Font("Tahoma", Font.PLAIN, 12));
       txtDireccionTienda.setColumns(10);
       txtDireccionTienda.setBounds(264, 110, 300, 28);
       panelTienda.add(txtDireccionTienda);

       btnModificarTienda = new JButton("Modificar");
       btnModificarTienda.setFont(new Font("Tahoma", Font.PLAIN, 14));
       btnModificarTienda.setBounds(364, 276, 150, 66);
       panelTienda.add(btnModificarTienda);

       JLabel lblClientes = new JLabel("Clientes: ");
       lblClientes.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lblClientes.setBounds(111, 160, 98, 22);
       panelTienda.add(lblClientes);

       cmbClientes = new JComboBox();
       cmbClientes.setBounds(327, 163, 187, 19);
       panelTienda.add(cmbClientes);

       JLabel lblAplicacionTienda = new JLabel("Aplicación Tienda");
       lblAplicacionTienda.setFont(new Font("Tahoma", Font.PLAIN, 22));
       lblAplicacionTienda.setBounds(552, 20, 264, 27);
       frame.getContentPane().add(lblAplicacionTienda);

       JLabel lblTienda = new JLabel("Tienda");
       lblTienda.setFont(new Font("Tahoma", Font.PLAIN, 18));
       lblTienda.setBounds(386, 72, 133, 27);
       frame.getContentPane().add(lblTienda);

       JLabel lblNewLabel = new JLabel("Cliente");
       lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
       lblNewLabel.setBounds(1080, 88, 113, 17);
       frame.getContentPane().add(lblNewLabel);

       JPanel panelCliente = new JPanel();
       panelCliente.setBorder(new LineBorder(new Color(0, 0, 0)));
       panelCliente.setBounds(806, 121, 573, 425);
       frame.getContentPane().add(panelCliente);
       panelCliente.setLayout(null);

       JLabel lblDni = new JLabel("Dni:");
       lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lblDni.setBounds(78, 38, 128, 30);
       panelCliente.add(lblDni);

       txtDni = new JTextField();
       txtDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
       txtDni.setBounds(302, 46, 205, 22);
       panelCliente.add(txtDni);
       txtDni.setColumns(10);

       JLabel lblNombreCliente = new JLabel("Nombre del cliente:");
       lblNombreCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lblNombreCliente.setBounds(78, 99, 165, 30);
       panelCliente.add(lblNombreCliente);

       txtNombreCliente = new JTextField();
       txtNombreCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
       txtNombreCliente.setColumns(10);
       txtNombreCliente.setBounds(302, 107, 205, 22);
       panelCliente.add(txtNombreCliente);

       JLabel lblApellidosCliente = new JLabel("Apellidos del cliente:");
       lblApellidosCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
       lblApellidosCliente.setBounds(78, 157, 165, 30);
       panelCliente.add(lblApellidosCliente);

       txtApellidosCliente = new JTextField();
       txtApellidosCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
       txtApellidosCliente.setColumns(10);
       txtApellidosCliente.setBounds(302, 165, 205, 22);
       panelCliente.add(txtApellidosCliente);

       btnModificarCliente = new JButton("Modificar");
       btnModificarCliente.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               
               if (cmbClientes.getSelectedItem() instanceof Cliente) {
                   
                   
                   Cliente cl = (Cliente) cmbClientes.getSelectedItem();
                   
                   cl.setDni(txtDni.getText());
                   cl.setNombre(txtNombreCliente.getText());
                   cl.setApellidos(txtApellidosCliente.getText());
                   panelTienda.updateUI();
                   
                   
               }
               
               
           }
       });
       btnModificarCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
       btnModificarCliente.setBounds(199, 295, 145, 47);
       panelCliente.add(btnModificarCliente);
       
       JButton btnInsertarCliente = new JButton("Insertar");
       btnInsertarCliente.addActionListener(
               
               (e) -> {                
               
               InsertarCliente dialog = new InsertarCliente();
               dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
               dialog.setAppTienda(this);
               dialog.setModal(true);
               dialog.setVisible(true);
               
               Cliente cliente;
               
               if (this.esInsertado) {
               
                   
                   t1.addCliente(this.clienteInsertado);
                   panelTienda.updateUI();
                   
                   cmbClientes.setModel(new DefaultComboBoxModel<Cliente>(t1.getClientes()));
                   
               
               }
               
           }
       );
       btnInsertarCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
       btnInsertarCliente.setBounds(44, 295, 145, 47);
       panelCliente.add(btnInsertarCliente);

       bootStrap();
   }

   private void bootStrap() {

       Cliente c1 = new Cliente("Jesus", "Soto", "444444");
       Cliente c2 = new Cliente("Pablo", "Martínez", "5555555");

       t1 = new Tienda("Software J&P", "C. San Vicente Paul, 32, 23740 Andújar, Jaén");

       t1.addCliente(c1);
       t1.addCliente(c2);

       txtNombreTienda.setText(t1.getNombre());
       txtDireccionTienda.setText(t1.getDireccion());

       cmbClientes.setModel(new DefaultComboBoxModel<Cliente>(t1.getClientes()));

       defineCombo();
       
       txtDni.setText(t1.getClientes()[0].getDni());        
       txtNombreCliente.setText(t1.getClientes()[0].getNombre());
       txtApellidosCliente.setText(t1.getClientes()[0].getApellidos());
       
       

   }

   private void defineCombo() {

       cmbClientes.setRenderer(new DefaultListCellRenderer() {
           @Override
           public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
                   boolean cellHasFocus) {
               super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
               if (value instanceof Cliente) {
                   Cliente client = (Cliente) value;
                   setText(client.getNombre() + " " + client.getApellidos());
               }
               return this;
           }
       });

       cmbClientes.addItemListener(new ItemListener() {

           @Override
           public void itemStateChanged(ItemEvent e) {
               if (e.getStateChange() == ItemEvent.SELECTED) {
                   Object item = e.getItem();

                   if (item instanceof Cliente) {

                       Cliente cl = (Cliente) item;
                       txtDni.setText(cl.getDni());
                       txtNombreCliente.setText(cl.getNombre());
                       txtApellidosCliente.setText(cl.getApellidos());

                   }
                   // do something with object

                   
               }

           }

       });

       

   }

}
