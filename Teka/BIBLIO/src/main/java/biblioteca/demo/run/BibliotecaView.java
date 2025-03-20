package biblioteca.demo.run;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class BibliotecaView {

	protected JFrame frmBiblioteca;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
		
		frmBiblioteca=new JFrame();
		frmBiblioteca.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][][][][]"));
		
		JButton btnNewButton = new JButton("New button");
		frmBiblioteca.getContentPane().add(btnNewButton, "flowy,cell 0 0");
		
		JScrollBar scrollBar = new JScrollBar();
		frmBiblioteca.getContentPane().add(scrollBar, "cell 0 0");
		
		textField_2 = new JTextField();
		frmBiblioteca.getContentPane().add(textField_2, "cell 0 0,growx");
		textField_2.setColumns(20);
		
		btnNewButton_1 = new JButton("New button");
		frmBiblioteca.getContentPane().add(btnNewButton_1, "cell 0 5");
		frmBiblioteca.setVisible(true);
	
	
	}
	public JFrame getFrame() {
		return this.frmBiblioteca;
	}





}