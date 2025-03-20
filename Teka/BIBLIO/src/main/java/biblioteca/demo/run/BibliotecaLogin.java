package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BibliotecaLogin {

	
	protected JFrame frmBiblioteca;
	private JTextField textField;
	private JTextField textField_1;
	
	public BibliotecaLogin() {
		
		initialize();
	}
	
	private void initialize() {
		
		frmBiblioteca=new JFrame();
		frmBiblioteca.getContentPane().setBackground(Color.ORANGE);
		frmBiblioteca.getContentPane().setForeground(Color.WHITE);
		frmBiblioteca.getContentPane().setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(213, 71, 106, 20);
		frmBiblioteca.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 103, 106, 20);
		frmBiblioteca.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(157, 74, 46, 14);
		frmBiblioteca.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pass");
		lblNewLabel_1.setBounds(157, 106, 46, 14);
		frmBiblioteca.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			AltaLibros atl= new AltaLibros();
		
			}
		});
		btnNewButton.setBounds(305, 153, 65, 23);
		frmBiblioteca.getContentPane().add(btnNewButton);
		frmBiblioteca.setVisible(true);
	}
}
