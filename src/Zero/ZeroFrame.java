package Zero;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ZeroFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel ventana01,ventana02;
	private JTextField txtOct01;
	private JTextField txtOct02;
	private JTextField txtOct03;
	private JTextField txtOct04;
	private JButton btn01;
	private JButton btn02;
	private JLabel pan01;
	private String nk;
	private String ps;
	
	public ZeroFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 438);
		
		ventana01 = new JPanel();
		ventana01.setBounds(200,200,400,200);
		ventana01.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventana01.setBackground(Color.ORANGE);
		setContentPane(ventana01);
		ventana01.setLayout(null);
		setLocationRelativeTo(null);
		
		ventana02 = new JPanel();
		ventana02.setBorder(new EmptyBorder(5, 5, 5, 5));
		ventana02.setBackground(Color.GRAY);
		setContentPane(ventana02);
		ventana02.setLayout(null);
		setLocationRelativeTo(null);
		
		add(ventana01);
		txtOct01 = new JTextField();
		txtOct01.setBounds(92, 52, 86, 20);
		ventana01.add(txtOct01);
		//txtOct01.setColumns(5);
		
		txtOct02 = new JTextField();
		txtOct02.setBounds(92, 102, 86, 20);
		ventana01.add(txtOct02);
		
		btn01 = new JButton("Click");
		btn01.addActionListener(this);
		btn01.setBounds(192, 152, 80, 30);
		ventana01.add(btn01);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (btn01==e.getSource()){
			ventana02.setVisible(true);
			nk=txtOct01.getText();
			ps=txtOct02.getText();
			Tblalogn.login(2);
			//ventana01.setVisible(false);
			}
	
		}
	}
