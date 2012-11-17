import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Color;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 12, 512, 160);
		contentPane.add(textPane);
		
		txtA = new JTextField();
		txtA.setBackground(Color.WHITE);
		txtA.setEditable(false);
		txtA.setText("A");
		txtA.setBounds(12, 184, 20, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		textField = new JTextField();
		textField.setText("0.005");
		textField.setBounds(12, 215, 44, 19);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
