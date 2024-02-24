package ejemploLibreria;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ejemploLibreria.modelo.Libro;
import ejemploTienda.modelo.Cliente;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertarLibro extends JDialog {

   private static final long serialVersionUID = 1L;
   private final JPanel contentPanel = new JPanel();
   private JTextField txtTituloDialog;
   private JTextField txtAutorDialog;
   private JTextField txtAnoPublicacionDialog;
   private JTextField txtEditorialDialog;
   private JTextField txtReferenciaBibliograficaDialog;
   private Libro libroInsertado;
   private AppBiblioteca appBiblioteca;



   /**
    * Launch the application.
    */
   public static void main(String[] args) {
       try {
           InsertarLibro dialog = new InsertarLibro();
           dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
           dialog.setVisible(true);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
   
   
   
   

   public AppBiblioteca getAppBiblioteca() {
       return appBiblioteca;
   }





   public void setAppTienda(AppBiblioteca appBiblioteca) {
       this.appBiblioteca = appBiblioteca;
   }





   /**
    * Create the dialog.
    */
   public InsertarLibro() {
       
       this.appBiblioteca= appBiblioteca;
       
       setBounds(100, 100, 855, 547);
       getContentPane().setLayout(new BorderLayout());
       contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
       getContentPane().add(contentPanel, BorderLayout.CENTER);
       contentPanel.setLayout(null);
       {
           JLabel lblTitulo = new JLabel("Titulo:");
           lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblTitulo.setBounds(167, 73, 128, 30);
           contentPanel.add(lblTitulo);
       }
       {
           txtTituloDialog = new JTextField();
           txtTituloDialog.setText((String) null);
           txtTituloDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtTituloDialog.setColumns(10);
           txtTituloDialog.setBounds(391, 81, 205, 22);
           contentPanel.add(txtTituloDialog);
       }
       {
           JLabel lblAutor = new JLabel("Nombre del Autor:");
           lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblAutor.setBounds(167, 134, 165, 30);
           contentPanel.add(lblAutor);
       }
       {
           txtAutorDialog = new JTextField();
           txtAutorDialog.setText((String) null);
           txtAutorDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtAutorDialog.setColumns(10);
           txtAutorDialog.setBounds(391, 142, 205, 22);
           contentPanel.add(txtAutorDialog);
       }
       {
           JLabel lblAnoPublicacionLibro = new JLabel("Año de publicacion:");
           lblAnoPublicacionLibro.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblAnoPublicacionLibro.setBounds(167, 192, 165, 30);
           contentPanel.add(lblAnoPublicacionLibro);
       }
       {
           txtAnoPublicacionDialog = new JTextField();
           txtAnoPublicacionDialog.setText((String) null);
           txtAnoPublicacionDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtAnoPublicacionDialog.setColumns(10);
           txtAnoPublicacionDialog.setBounds(391, 200, 205, 22);
           contentPanel.add(txtAnoPublicacionDialog);
       }
       {
           JLabel lblEditorial = new JLabel("Editorial:");
           lblEditorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblEditorial.setBounds(167, 242, 165, 30);
           contentPanel.add(lblEditorial);
       }
       {
           txtEditorialDialog = new JTextField();
           txtEditorialDialog.setText((String) null);
           txtEditorialDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtEditorialDialog.setColumns(10);
           txtEditorialDialog.setBounds(391, 250, 205, 22);
           contentPanel.add(txtEditorialDialog);
       }
       {
           JLabel lblReferenciaBibliograficaLibro = new JLabel("Referencia Bibliografica:");
           lblReferenciaBibliograficaLibro.setFont(new Font("Tahoma", Font.PLAIN, 14));
           lblReferenciaBibliograficaLibro.setBounds(167, 292, 165, 30);
           contentPanel.add(lblReferenciaBibliograficaLibro);
       }
       {
           txtReferenciaBibliograficaDialog = new JTextField();
           txtReferenciaBibliograficaDialog.setText((String) null);
           txtReferenciaBibliograficaDialog.setFont(new Font("Tahoma", Font.PLAIN, 12));
           txtReferenciaBibliograficaDialog.setColumns(10);
           txtReferenciaBibliograficaDialog.setBounds(391, 300, 205, 22);
           contentPanel.add(txtReferenciaBibliograficaDialog);
       }
       {
           JPanel buttonPane = new JPanel();
           
           buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
           getContentPane().add(buttonPane, BorderLayout.SOUTH);
           {
               JButton okButton = new JButton("OK");
               okButton.addActionListener(new ActionListener() {
                   public void actionPerformed(ActionEvent e) {
                       
                       
                       
                       libroInsertado=
                               new Libro(txtTituloDialog.getText(),txtAutorDialog.getText(), txtAnoPublicacionDialog.getText(),txtEditorialDialog.getText(),txtReferenciaBibliograficaDialog.getText());
                       
                       appBiblioteca.setEsInsertado(true);
                       appBiblioteca.setLibroInsertado(libroInsertado);
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
                       appBiblioteca.setEsInsertado(false);
                       dispose();
                   }
               });
               cancelButton.setActionCommand("Cancel");
               buttonPane.add(cancelButton);
           }
       }
   }
   


}