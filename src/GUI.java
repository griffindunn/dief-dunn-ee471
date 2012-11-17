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
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtD;
	private JTextField txtE;
	private JTextField txtF;
	private JTextField txtG;
	private JTextField txtH;
	private JTextField txtI;
	private JTextField txtJ;
	private JTextField txtK;
	private JTextField txtL;
	private JTextField txtM;
	private JTextField txtApos;
	private JTextField txtN;
	private JTextField txtO;
	private JTextField txtP;
	private JTextField txtQ;
	private JTextField txtR;
	private JTextField txtS;
	private JTextField txtT;
	private JTextField txtU;
	private JTextField txtV;
	private JTextField txtW;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtZ;
	private JTextField txt_;

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
					System.exit(1);
				}
			}
		});

		System.out.println("Begin Program");
		// create the tree
		DictionaryTree tree = new DictionaryTree();
		// A:
		// load probabilities into the GUI
		// highlight most likely probabilities
		// wait for input from text field
		// goto A

		System.out.println("Done");
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

		txtA = new JTextField();
		txtA.setHorizontalAlignment(SwingConstants.CENTER);
		txtA.setBackground(Color.WHITE);
		txtA.setEditable(false);
		txtA.setText("A");
		txtA.setBounds(12, 184, 44, 19);
		contentPane.add(txtA);
		txtA.setColumns(10);

		JTextField[] probFields = new JTextField[28];

		probFields[0] = new JTextField();
		probFields[0].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[0].setText("0.000");
		probFields[0].setBounds(12, 205, 44, 19);
		contentPane.add(probFields[0]);
		probFields[0].setColumns(10);

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

		txtE = new JTextField();
		txtE.setText("E");
		txtE.setHorizontalAlignment(SwingConstants.CENTER);
		txtE.setEditable(false);
		txtE.setColumns(10);
		txtE.setBackground(Color.WHITE);
		txtE.setBounds(204, 184, 44, 19);
		contentPane.add(txtE);

		txtF = new JTextField();
		txtF.setText("F");
		txtF.setHorizontalAlignment(SwingConstants.CENTER);
		txtF.setEditable(false);
		txtF.setColumns(10);
		txtF.setBackground(Color.WHITE);
		txtF.setBounds(252, 184, 44, 19);
		contentPane.add(txtF);

		txtG = new JTextField();
		txtG.setText("G");
		txtG.setHorizontalAlignment(SwingConstants.CENTER);
		txtG.setEditable(false);
		txtG.setColumns(10);
		txtG.setBackground(Color.WHITE);
		txtG.setBounds(300, 184, 44, 19);
		contentPane.add(txtG);

		txtH = new JTextField();
		txtH.setText("H");
		txtH.setHorizontalAlignment(SwingConstants.CENTER);
		txtH.setEditable(false);
		txtH.setColumns(10);
		txtH.setBackground(Color.WHITE);
		txtH.setBounds(348, 184, 44, 19);
		contentPane.add(txtH);

		txtI = new JTextField();
		txtI.setText("I");
		txtI.setHorizontalAlignment(SwingConstants.CENTER);
		txtI.setEditable(false);
		txtI.setColumns(10);
		txtI.setBackground(Color.WHITE);
		txtI.setBounds(396, 184, 44, 19);
		contentPane.add(txtI);

		txtJ = new JTextField();
		txtJ.setText("J");
		txtJ.setHorizontalAlignment(SwingConstants.CENTER);
		txtJ.setEditable(false);
		txtJ.setColumns(10);
		txtJ.setBackground(Color.WHITE);
		txtJ.setBounds(444, 184, 44, 19);
		contentPane.add(txtJ);

		txtK = new JTextField();
		txtK.setText("K");
		txtK.setHorizontalAlignment(SwingConstants.CENTER);
		txtK.setEditable(false);
		txtK.setColumns(10);
		txtK.setBackground(Color.WHITE);
		txtK.setBounds(492, 184, 44, 19);
		contentPane.add(txtK);

		txtL = new JTextField();
		txtL.setText("L");
		txtL.setHorizontalAlignment(SwingConstants.CENTER);
		txtL.setEditable(false);
		txtL.setColumns(10);
		txtL.setBackground(Color.WHITE);
		txtL.setBounds(540, 184, 44, 19);
		contentPane.add(txtL);

		txtM = new JTextField();
		txtM.setText("M");
		txtM.setHorizontalAlignment(SwingConstants.CENTER);
		txtM.setEditable(false);
		txtM.setColumns(10);
		txtM.setBackground(Color.WHITE);
		txtM.setBounds(588, 184, 44, 19);
		contentPane.add(txtM);

		txtApos = new JTextField();
		txtApos.setText("'");
		txtApos.setHorizontalAlignment(SwingConstants.CENTER);
		txtApos.setEditable(false);
		txtApos.setColumns(10);
		txtApos.setBackground(Color.WHITE);
		txtApos.setBounds(636, 184, 44, 19);
		contentPane.add(txtApos);

		probFields[1] = new JTextField();
		probFields[1].setText("0.000");
		probFields[1].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[1].setColumns(10);
		probFields[1].setBounds(60, 205, 44, 19);
		contentPane.add(probFields[1]);

		probFields[2] = new JTextField();
		probFields[2].setText("0.000");
		probFields[2].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[2].setColumns(10);
		probFields[2].setBounds(108, 205, 44, 19);
		contentPane.add(probFields[2]);

		probFields[3] = new JTextField();
		probFields[3].setText("0.000");
		probFields[3].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[3].setColumns(10);
		probFields[3].setBounds(156, 205, 44, 19);
		contentPane.add(probFields[3]);

		probFields[4] = new JTextField();
		probFields[4].setText("0.000");
		probFields[4].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[4].setColumns(10);
		probFields[4].setBounds(204, 205, 44, 19);
		contentPane.add(probFields[4]);

		probFields[5] = new JTextField();
		probFields[5].setText("0.000");
		probFields[5].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[5].setColumns(10);
		probFields[5].setBounds(252, 205, 44, 19);
		contentPane.add(probFields[5]);

		probFields[6] = new JTextField();
		probFields[6].setText("0.000");
		probFields[6].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[6].setColumns(10);
		probFields[6].setBounds(300, 205, 44, 19);
		contentPane.add(probFields[6]);

		probFields[7] = new JTextField();
		probFields[7].setText("0.000");
		probFields[7].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[7].setColumns(10);
		probFields[7].setBounds(348, 205, 44, 19);
		contentPane.add(probFields[7]);

		probFields[8] = new JTextField();
		probFields[8].setText("0.000");
		probFields[8].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[8].setColumns(10);
		probFields[8].setBounds(396, 205, 44, 19);
		contentPane.add(probFields[8]);

		probFields[9] = new JTextField();
		probFields[9].setText("0.000");
		probFields[9].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[9].setColumns(10);
		probFields[9].setBounds(444, 205, 44, 19);
		contentPane.add(probFields[9]);

		probFields[10] = new JTextField();
		probFields[10].setText("0.000");
		probFields[10].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[10].setColumns(10);
		probFields[10].setBounds(492, 205, 44, 19);
		contentPane.add(probFields[10]);

		probFields[11] = new JTextField();
		probFields[11].setText("0.000");
		probFields[11].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[11].setColumns(10);
		probFields[11].setBounds(540, 205, 44, 19);
		contentPane.add(probFields[11]);

		probFields[12] = new JTextField();
		probFields[12].setText("0.000");
		probFields[12].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[12].setColumns(10);
		probFields[12].setBounds(588, 205, 44, 19);
		contentPane.add(probFields[12]);

		probFields[13] = new JTextField();
		probFields[13].setText("0.000");
		probFields[13].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[13].setColumns(10);
		probFields[13].setBounds(636, 205, 44, 19);
		contentPane.add(probFields[13]);

		txtN = new JTextField();
		txtN.setText("N");
		txtN.setHorizontalAlignment(SwingConstants.CENTER);
		txtN.setEditable(false);
		txtN.setColumns(10);
		txtN.setBackground(Color.WHITE);
		txtN.setBounds(12, 237, 44, 19);
		contentPane.add(txtN);

		txtO = new JTextField();
		txtO.setText("O");
		txtO.setHorizontalAlignment(SwingConstants.CENTER);
		txtO.setEditable(false);
		txtO.setColumns(10);
		txtO.setBackground(Color.WHITE);
		txtO.setBounds(60, 237, 44, 19);
		contentPane.add(txtO);

		probFields[14] = new JTextField();
		probFields[14].setText("0.000");
		probFields[14].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[14].setColumns(10);
		probFields[14].setBounds(12, 258, 44, 19);
		contentPane.add(probFields[14]);

		probFields[15] = new JTextField();
		probFields[15].setText("0.000");
		probFields[15].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[15].setColumns(10);
		probFields[15].setBounds(60, 258, 44, 19);
		contentPane.add(probFields[15]);

		probFields[16] = new JTextField();
		probFields[16].setText("0.000");
		probFields[16].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[16].setColumns(10);
		probFields[16].setBounds(108, 258, 44, 19);
		contentPane.add(probFields[16]);

		txtP = new JTextField();
		txtP.setText("P");
		txtP.setHorizontalAlignment(SwingConstants.CENTER);
		txtP.setEditable(false);
		txtP.setColumns(10);
		txtP.setBackground(Color.WHITE);
		txtP.setBounds(108, 237, 44, 19);
		contentPane.add(txtP);

		txtQ = new JTextField();
		txtQ.setText("Q");
		txtQ.setHorizontalAlignment(SwingConstants.CENTER);
		txtQ.setEditable(false);
		txtQ.setColumns(10);
		txtQ.setBackground(Color.WHITE);
		txtQ.setBounds(156, 237, 44, 19);
		contentPane.add(txtQ);

		probFields[17] = new JTextField();
		probFields[17].setText("0.000");
		probFields[17].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[17].setColumns(10);
		probFields[17].setBounds(156, 258, 44, 19);
		contentPane.add(probFields[17]);

		probFields[18] = new JTextField();
		probFields[18].setText("0.000");
		probFields[18].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[18].setColumns(10);
		probFields[18].setBounds(204, 258, 44, 19);
		contentPane.add(probFields[18]);

		txtR = new JTextField();
		txtR.setText("R");
		txtR.setHorizontalAlignment(SwingConstants.CENTER);
		txtR.setEditable(false);
		txtR.setColumns(10);
		txtR.setBackground(Color.WHITE);
		txtR.setBounds(204, 237, 44, 19);
		contentPane.add(txtR);

		txtS = new JTextField();
		txtS.setText("S");
		txtS.setHorizontalAlignment(SwingConstants.CENTER);
		txtS.setEditable(false);
		txtS.setColumns(10);
		txtS.setBackground(Color.WHITE);
		txtS.setBounds(252, 237, 44, 19);
		contentPane.add(txtS);

		probFields[19] = new JTextField();
		probFields[19].setText("0.000");
		probFields[19].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[19].setColumns(10);
		probFields[19].setBounds(252, 258, 44, 19);
		contentPane.add(probFields[19]);

		probFields[20] = new JTextField();
		probFields[20].setText("0.000");
		probFields[20].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[20].setColumns(10);
		probFields[20].setBounds(300, 258, 44, 19);
		contentPane.add(probFields[20]);

		txtT = new JTextField();
		txtT.setText("T");
		txtT.setHorizontalAlignment(SwingConstants.CENTER);
		txtT.setEditable(false);
		txtT.setColumns(10);
		txtT.setBackground(Color.WHITE);
		txtT.setBounds(300, 237, 44, 19);
		contentPane.add(txtT);

		txtU = new JTextField();
		txtU.setText("U");
		txtU.setHorizontalAlignment(SwingConstants.CENTER);
		txtU.setEditable(false);
		txtU.setColumns(10);
		txtU.setBackground(Color.WHITE);
		txtU.setBounds(348, 237, 44, 19);
		contentPane.add(txtU);

		probFields[21] = new JTextField();
		probFields[21].setText("0.000");
		probFields[21].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[21].setColumns(10);
		probFields[21].setBounds(348, 258, 44, 19);
		contentPane.add(probFields[21]);

		probFields[22] = new JTextField();
		probFields[22].setText("0.000");
		probFields[22].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[22].setColumns(10);
		probFields[22].setBounds(396, 258, 44, 19);
		contentPane.add(probFields[22]);

		txtV = new JTextField();
		txtV.setText("V");
		txtV.setHorizontalAlignment(SwingConstants.CENTER);
		txtV.setEditable(false);
		txtV.setColumns(10);
		txtV.setBackground(Color.WHITE);
		txtV.setBounds(396, 237, 44, 19);
		contentPane.add(txtV);

		txtW = new JTextField();
		txtW.setText("W");
		txtW.setHorizontalAlignment(SwingConstants.CENTER);
		txtW.setEditable(false);
		txtW.setColumns(10);
		txtW.setBackground(Color.WHITE);
		txtW.setBounds(444, 237, 44, 19);
		contentPane.add(txtW);

		probFields[23] = new JTextField();
		probFields[23].setText("0.000");
		probFields[23].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[23].setColumns(10);
		probFields[23].setBounds(444, 258, 44, 19);
		contentPane.add(probFields[23]);

		txtX = new JTextField();
		txtX.setText("X");
		txtX.setHorizontalAlignment(SwingConstants.CENTER);
		txtX.setEditable(false);
		txtX.setColumns(10);
		txtX.setBackground(Color.WHITE);
		txtX.setBounds(492, 237, 44, 19);
		contentPane.add(txtX);

		probFields[24] = new JTextField();
		probFields[24].setText("0.000");
		probFields[24].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[24].setColumns(10);
		probFields[24].setBounds(492, 258, 44, 19);
		contentPane.add(probFields[24]);

		probFields[25] = new JTextField();
		probFields[25].setText("0.000");
		probFields[25].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[25].setColumns(10);
		probFields[25].setBounds(540, 258, 44, 19);
		contentPane.add(probFields[25]);

		txtY = new JTextField();
		txtY.setText("Y");
		txtY.setHorizontalAlignment(SwingConstants.CENTER);
		txtY.setEditable(false);
		txtY.setColumns(10);
		txtY.setBackground(Color.WHITE);
		txtY.setBounds(540, 237, 44, 19);
		contentPane.add(txtY);

		txtZ = new JTextField();
		txtZ.setText("Z");
		txtZ.setHorizontalAlignment(SwingConstants.CENTER);
		txtZ.setEditable(false);
		txtZ.setColumns(10);
		txtZ.setBackground(Color.WHITE);
		txtZ.setBounds(588, 237, 44, 19);
		contentPane.add(txtZ);

		probFields[26] = new JTextField();
		probFields[26].setText("0.000");
		probFields[26].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[26].setColumns(10);
		probFields[26].setBounds(588, 258, 44, 19);
		contentPane.add(probFields[26]);

		probFields[27] = new JTextField();
		probFields[27].setText("0.000");
		probFields[27].setHorizontalAlignment(SwingConstants.CENTER);
		probFields[27].setColumns(10);
		probFields[27].setBounds(636, 258, 44, 19);
		contentPane.add(probFields[27]);

		txt_ = new JTextField();
		txt_.setText("_");
		txt_.setHorizontalAlignment(SwingConstants.CENTER);
		txt_.setEditable(false);
		txt_.setColumns(10);
		txt_.setBackground(Color.WHITE);
		txt_.setBounds(636, 237, 44, 19);
		contentPane.add(txt_);
	}
}
