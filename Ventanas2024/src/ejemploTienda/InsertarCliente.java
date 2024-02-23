package ejemploTienda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejemploTienda.modelo.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertarCliente extends JDialog {

   private static final long serialVersionUID = 1L;
   private final JPanel contentPanel = new JPanel();
   private JTextField txtDniDialog;
   private JTextField txtNombreDialog;
   private JTextField txtApellidosDialog;
   private Cliente clienteInsertado;
   private AppTienda appTienda;



   /**
    * Launch the application.
    */
   public static void main(String[] args) {
       try {
           InsertarCliente dialog = new InsertarCliente();
           dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
           dialog.setVisible(true);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   
   
   

   public AppTienda getAppTienda() {
       return appTienda;
   }





   public void setAppTienda(AppTienda appTienda) {
       this.appTienda = appTienda;
   }





   /**
    * Create the dialog.
    */
   public InsertarCliente() {
       
       this.appTienda= appTienda;
       
       setBounds(100, 100, 855, 547);
       getContentPane().setLayout(new BorderLayout());
       contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
       getContentPane().add(contentPanel, BorderLayout.CENTER);
       contentPanel.setLayout(null);
       {
           JLabel lblDni = new JLabel("Dni:");
           lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblDni.setBounds(167, 73, 128, 30);
           contentPanel.add(lblDni);
       }
       {
           txtDniDialog = new JTextField();
           txtDniDialog.setText((String) null);
           txtDniDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtDniDialog.setColumns(10);
           txtDniDialog.setBounds(391, 81, 205, 22);
           contentPanel.add(txtDniDialog);
       }
       {
           JLabel lblNombreCliente = new JLabel("Nombre del cliente:");
           lblNombreCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblNombreCliente.setBounds(167, 134, 165, 30);
           contentPanel.add(lblNombreCliente);
       }
       {
           txtNombreDialog = new JTextField();
           txtNombreDialog.setText((String) null);
           txtNombreDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtNombreDialog.setColumns(10);
           txtNombreDialog.setBounds(391, 142, 205, 22);
           contentPanel.add(txtNombreDialog);
       }
       {
           JLabel lblApellidosCliente = new JLabel("Apellidos del cliente:");
           lblApellidosCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblApellidosCliente.setBounds(167, 192, 165, 30);
           contentPanel.add(lblApellidosCliente);
       }
       {
           txtApellidosDialog = new JTextField();
           txtApellidosDialog.setText((String) null);
           txtApellidosDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtApellidosDialog.setColumns(10);
           txtApellidosDialog.setBounds(391, 200, 205, 22);
           contentPanel.add(txtApellidosDialog);
       }
       {
           JPanel buttonPane = new JPanel();
           
           buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
           getContentPane().add(buttonPane, BorderLayout.SOUTH);
           {
               JButton okButton = new JButton("OK");
               okButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                       
                       
                       
                       clienteInsertado=
                               new Cliente(txtNombreDialog.getText(),txtApellidosDialog.getText(), txtDniDialog.getText());
                       
                       appTienda.setEsInsertado(true);
                       appTienda.setClienteInsertado(clienteInsertado);
                       dispose();
                       
                       
                   }
               });
               okButton.setActionCommand("OK");
               buttonPane.add(okButton);
               getRootPane().setDefaultButton(okButton);
           }
           {
               JButton cancelButton = new JButton("Cancel");
               cancelButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                       appTienda.setEsInsertado(false);
                       dispose();
                   }
               });
               cancelButton.setActionCommand("Cancel");
               buttonPane.add(cancelButton);
           }
       }
   }
   


}