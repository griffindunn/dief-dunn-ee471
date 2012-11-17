import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtD;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;

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
		setBounds(100, 100, 700, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextPane txtpnGriffin = new JTextPane();
		txtpnGriffin.setFont(new Font("Dialog", Font.PLAIN, 24));
		txtpnGriffin.setText("Griffin!");
		txtpnGriffin.setBounds(12, 12, 668, 160);
		contentPane.add(txtpnGriffin);

		txt = new JTextField();
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setBackground(Color.WHITE);
		txt.setEditable(false);
		txt.setText("A");
		txt.setBounds(12, 184, 44, 19);
		contentPane.add(txt);
		txt.setColumns(10);

		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setText("0.005");
		txtA.setBounds(12, 205, 44, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);

		txtB = new JTextField();
		txtB.setText("B");
		txtB.setHorizontalAlignment(SwingConstants.CENTER);
		txtB.setEditable(false);
		txtB.setColumns(10);
		txtB.setBackground(Color.WHITE);
		txtB.setBounds(60, 184, 44, 19);
		contentPane.add(txtB);

		txtC = new JTextField();
		txtC.setText("C");
		txtC.setHorizontalAlignment(SwingConstants.CENTER);
		txtC.setEditable(false);
		txtC.setColumns(10);
		txtC.setBackground(Color.WHITE);
		txtC.setBounds(108, 184, 44, 19);
		contentPane.add(txtC);

		txtD = new JTextField();
		txtD.setText("D");
		txtD.setHorizontalAlignment(SwingConstants.CENTER);
		txtD.setEditable(false);
		txtD.setColumns(10);
		txtD.setBackground(Color.WHITE);
		txtD.setBounds(156, 184, 44, 19);
		contentPane.add(txtD);

		textField_4 = new JTextField();
		textField_4.setText("E");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(204, 184, 44, 19);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("F");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		textField_5.setBounds(252, 184, 44, 19);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setText("G");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(300, 184, 44, 19);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("H");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(348, 184, 44, 19);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setText("I");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(396, 184, 44, 19);
		contentPane.add(textField_8);

		textField_9 = new JTextField();
		textField_9.setText("J");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.WHITE);
		textField_9.setBounds(444, 184, 44, 19);
		contentPane.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setText("K");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(492, 184, 44, 19);
		contentPane.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setText("L");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.WHITE);
		textField_11.setBounds(540, 184, 44, 19);
		contentPane.add(textField_11);

		textField_12 = new JTextField();
		textField_12.setText("M");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(588, 184, 44, 19);
		contentPane.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setText("'");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(636, 184, 44, 19);
		contentPane.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setText("0.005");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		textField_14.setBounds(60, 205, 44, 19);
		contentPane.add(textField_14);

		textField_15 = new JTextField();
		textField_15.setText("0.005");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		textField_15.setBounds(108, 205, 44, 19);
		contentPane.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setText("0.005");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		textField_16.setBounds(156, 205, 44, 19);
		contentPane.add(textField_16);

		textField_17 = new JTextField();
		textField_17.setText("0.005");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		textField_17.setBounds(204, 205, 44, 19);
		contentPane.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setText("0.005");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBounds(252, 205, 44, 19);
		contentPane.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setText("0.005");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		textField_19.setBounds(300, 205, 44, 19);
		contentPane.add(textField_19);

		textField_20 = new JTextField();
		textField_20.setText("0.005");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(348, 205, 44, 19);
		contentPane.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setText("0.005");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		textField_21.setBounds(396, 205, 44, 19);
		contentPane.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setText("0.005");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(444, 205, 44, 19);
		contentPane.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setText("0.005");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(492, 205, 44, 19);
		contentPane.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setText("0.005");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(540, 205, 44, 19);
		contentPane.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setText("0.005");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBounds(588, 205, 44, 19);
		contentPane.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setText("0.005");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBounds(636, 205, 44, 19);
		contentPane.add(textField_26);

		textField_27 = new JTextField();
		textField_27.setText("N");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setEditable(false);
		textField_27.setColumns(10);
		textField_27.setBackground(Color.WHITE);
		textField_27.setBounds(12, 237, 44, 19);
		contentPane.add(textField_27);

		textField_28 = new JTextField();
		textField_28.setText("O");
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBackground(Color.WHITE);
		textField_28.setBounds(60, 237, 44, 19);
		contentPane.add(textField_28);

		textField_29 = new JTextField();
		textField_29.setText("0.005");
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setColumns(10);
		textField_29.setBounds(12, 258, 44, 19);
		contentPane.add(textField_29);

		textField_30 = new JTextField();
		textField_30.setText("0.005");
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		textField_30.setBounds(60, 258, 44, 19);
		contentPane.add(textField_30);

		textField_31 = new JTextField();
		textField_31.setText("0.005");
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setColumns(10);
		textField_31.setBounds(108, 258, 44, 19);
		contentPane.add(textField_31);

		textField_32 = new JTextField();
		textField_32.setText("P");
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBackground(Color.WHITE);
		textField_32.setBounds(108, 237, 44, 19);
		contentPane.add(textField_32);

		textField_33 = new JTextField();
		textField_33.setText("Q");
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBackground(Color.WHITE);
		textField_33.setBounds(156, 237, 44, 19);
		contentPane.add(textField_33);

		textField_34 = new JTextField();
		textField_34.setText("0.005");
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setColumns(10);
		textField_34.setBounds(156, 258, 44, 19);
		contentPane.add(textField_34);

		textField_35 = new JTextField();
		textField_35.setText("0.005");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setColumns(10);
		textField_35.setBounds(204, 258, 44, 19);
		contentPane.add(textField_35);

		textField_36 = new JTextField();
		textField_36.setText("R");
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBackground(Color.WHITE);
		textField_36.setBounds(204, 237, 44, 19);
		contentPane.add(textField_36);

		textField_37 = new JTextField();
		textField_37.setText("S");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBackground(Color.WHITE);
		textField_37.setBounds(252, 237, 44, 19);
		contentPane.add(textField_37);

		textField_38 = new JTextField();
		textField_38.setText("0.005");
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setColumns(10);
		textField_38.setBounds(252, 258, 44, 19);
		contentPane.add(textField_38);

		textField_39 = new JTextField();
		textField_39.setText("0.005");
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setColumns(10);
		textField_39.setBounds(300, 258, 44, 19);
		contentPane.add(textField_39);

		textField_40 = new JTextField();
		textField_40.setText("T");
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setEditable(false);
		textField_40.setColumns(10);
		textField_40.setBackground(Color.WHITE);
		textField_40.setBounds(300, 237, 44, 19);
		contentPane.add(textField_40);

		textField_41 = new JTextField();
		textField_41.setText("U");
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setEditable(false);
		textField_41.setColumns(10);
		textField_41.setBackground(Color.WHITE);
		textField_41.setBounds(348, 237, 44, 19);
		contentPane.add(textField_41);

		textField_42 = new JTextField();
		textField_42.setText("0.005");
		textField_42.setHorizontalAlignment(SwingConstants.CENTER);
		textField_42.setColumns(10);
		textField_42.setBounds(348, 258, 44, 19);
		contentPane.add(textField_42);

		textField_43 = new JTextField();
		textField_43.setText("0.005");
		textField_43.setHorizontalAlignment(SwingConstants.CENTER);
		textField_43.setColumns(10);
		textField_43.setBounds(396, 258, 44, 19);
		contentPane.add(textField_43);

		textField_44 = new JTextField();
		textField_44.setText("V");
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setEditable(false);
		textField_44.setColumns(10);
		textField_44.setBackground(Color.WHITE);
		textField_44.setBounds(396, 237, 44, 19);
		contentPane.add(textField_44);

		textField_45 = new JTextField();
		textField_45.setText("W");
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setEditable(false);
		textField_45.setColumns(10);
		textField_45.setBackground(Color.WHITE);
		textField_45.setBounds(444, 237, 44, 19);
		contentPane.add(textField_45);

		textField_46 = new JTextField();
		textField_46.setText("0.005");
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setColumns(10);
		textField_46.setBounds(444, 258, 44, 19);
		contentPane.add(textField_46);

		textField_47 = new JTextField();
		textField_47.setText("X");
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setEditable(false);
		textField_47.setColumns(10);
		textField_47.setBackground(Color.WHITE);
		textField_47.setBounds(492, 237, 44, 19);
		contentPane.add(textField_47);

		textField_48 = new JTextField();
		textField_48.setText("0.005");
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setColumns(10);
		textField_48.setBounds(492, 258, 44, 19);
		contentPane.add(textField_48);

		textField_49 = new JTextField();
		textField_49.setText("0.005");
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setColumns(10);
		textField_49.setBounds(540, 258, 44, 19);
		contentPane.add(textField_49);

		textField_50 = new JTextField();
		textField_50.setText("Y");
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setEditable(false);
		textField_50.setColumns(10);
		textField_50.setBackground(Color.WHITE);
		textField_50.setBounds(540, 237, 44, 19);
		contentPane.add(textField_50);

		textField_51 = new JTextField();
		textField_51.setText("Z");
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setEditable(false);
		textField_51.setColumns(10);
		textField_51.setBackground(Color.WHITE);
		textField_51.setBounds(588, 237, 44, 19);
		contentPane.add(textField_51);

		textField_52 = new JTextField();
		textField_52.setText("0.005");
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setColumns(10);
		textField_52.setBounds(588, 258, 44, 19);
		contentPane.add(textField_52);

		textField_53 = new JTextField();
		textField_53.setText("0.005");
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setColumns(10);
		textField_53.setBounds(636, 258, 44, 19);
		contentPane.add(textField_53);

		textField_54 = new JTextField();
		textField_54.setText("_");
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setEditable(false);
		textField_54.setColumns(10);
		textField_54.setBackground(Color.WHITE);
		textField_54.setBounds(636, 237, 44, 19);
		contentPane.add(textField_54);
	}
}
