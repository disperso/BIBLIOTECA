package biblioteca.demo.run;


import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;



public class AltaLibros {
	
protected JFrame frmBiblioteca;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
		
public AltaLibros() {
			
initialize();
}
		
		private void initialize() {
			
			frmBiblioteca=new JFrame();
			frmBiblioteca.getContentPane().setBackground(Color.GRAY);
			frmBiblioteca.getContentPane().setForeground(Color.WHITE);
			frmBiblioteca.getContentPane().setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Título: ");
			lblNewLabel.setBounds(159, 39, 33, 14);
			frmBiblioteca.getContentPane().add(lblNewLabel);
			
			textField_2 = new JTextField();
			textField_2.setBounds(223, 36, 150, 20);
			frmBiblioteca.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setColumns(10);
			textField_3.setBounds(223, 78, 150, 20);
			frmBiblioteca.getContentPane().add(textField_3);
			
			textField_4 = new JTextField();
			textField_4.setColumns(10);
			textField_4.setBounds(223, 127, 86, 20);
			frmBiblioteca.getContentPane().add(textField_4);
			
			textField_5 = new JTextField();
			textField_5.setColumns(10);
			textField_5.setBounds(223, 171, 86, 20);
			frmBiblioteca.getContentPane().add(textField_5);
			
			JLabel lblTtu = new JLabel("ISBN:");
			lblTtu.setBounds(159, 174, 33, 14);
			frmBiblioteca.getContentPane().add(lblTtu);
			
			JLabel lblEdicin = new JLabel("Edición:");
			lblEdicin.setBounds(159, 130, 33, 14);
			frmBiblioteca.getContentPane().add(lblEdicin);
			
			JLabel lblAutor = new JLabel("Autor:");
			lblAutor.setBounds(159, 81, 33, 14);
			frmBiblioteca.getContentPane().add(lblAutor);
	
		}
}

