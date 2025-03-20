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

	
	protected JFrame frmBib;
	private JTextField text01;
	private JTextField text02;
	private JLabel label01;
	private JLabel label02;
	private JButton btn01;
	private BibliotecaController controller;
	
	
	public BibliotecaLogin() {
		
		initialize();
	}
	
	private void initialize() {
		
		frmBib=new JFrame();
		frmBib.getContentPane().setBackground(Color.ORANGE);
		frmBib.getContentPane().setForeground(Color.WHITE);
		frmBib.getContentPane().setLayout(null);
		frmBib.setBounds(100,100,350,300);
		this.controller=controlador;
		
		
		text01 = new JTextField();
		text01.setBounds(113, 71, 106, 20);
		frmBib.getContentPane().add(text01);
		text01.setColumns(10);
		
		text02 = new JTextField();
		text02.setBounds(113, 103, 106, 20);
		frmBib.getContentPane().add(text02);
		text02.setColumns(10);

		
		label01 = new JLabel("Login");
		label01.setBounds(57, 74, 46, 14);
		frmBib.getContentPane().add(label01);
		
		label02 = new JLabel("Pass");
		label02.setBounds(57, 106, 46, 14);
		frmBib.getContentPane().add(label02);
		
		
		btn01 = new JButton("Click");
		btn01.setBounds(200,130,70,25);
		frmBib.getContentPane().add(btn01);
		
		btn01.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
		//AltaLibros atl= new AltaLibros();    //Abre ventana Altalibros
		controller.logVista(text01.getText(),text02.getText());	
	
		}
		});
		frmBib.setVisible(true);
	}
	
	
	public JFrame getFrame() {
		return this.frmBib;
	}

	
}
