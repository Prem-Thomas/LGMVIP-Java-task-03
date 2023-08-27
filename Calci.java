package Calculator;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.SystemColor;

public class Calci {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double res;
	String Optn;
	String Ans;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 21));
		frame.setBounds(100, 100, 364, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setBackground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(10, 11, 357, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.textHighlightText);
		textField.setForeground(SystemColor.activeCaptionText);
		textField.setBounds(0, 40, 348, 53);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_6_1 = new JButton("0");
		btnNewButton_6_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_6_1.setBounds(61, 354, 46, 1);
		frame.getContentPane().add(btnNewButton_6_1);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_9.setBounds(163, 54, 46, 39);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnroot = new JButton("\u221A");
		btnroot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);

			}
		});
		btnroot.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnroot.setBounds(10, 114, 60, 45);
		frame.getContentPane().add(btnroot);
		
		JButton btnEX = new JButton("e^x");
		btnEX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnEX.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnEX.setBounds(72, 114, 60, 45);
		frame.getContentPane().add(btnEX);
		
		JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnCos.setBounds(195, 115, 66, 45);
		frame.getContentPane().add(btnCos);
		
		JButton btn1X = new JButton("1/x");
		btn1X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btn1X.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn1X.setBounds(10, 162, 60, 45);
		frame.getContentPane().add(btn1X);
		
		JButton btnLog = new JButton("Log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnLog.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnLog.setBounds(72, 162, 60, 45);
		frame.getContentPane().add(btnLog);
		
		JButton btnSinh = new JButton("Sinh");
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSinh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSinh.setBounds(133, 162, 60, 45);
		frame.getContentPane().add(btnSinh);
		
		JButton btnCosh = new JButton("Cosh");
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCosh.setBounds(195, 162, 66, 45);
		frame.getContentPane().add(btnCosh);
		
		JButton btnTanh = new JButton("Tanh");
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTanh.setBounds(265, 162, 73, 45);
		frame.getContentPane().add(btnTanh);
		
		JButton btnPower = new JButton("X^Y");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Optn="X^Y";
			}
		});
		btnPower.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnPower.setBounds(10, 209, 60, 45);
		frame.getContentPane().add(btnPower);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Optn="%";
			}
		});
		btnPercent.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnPercent.setBounds(72, 209, 60, 45);
		frame.getContentPane().add(btnPercent);
		
		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCancel.setBounds(133, 209, 60, 45);
		frame.getContentPane().add(btnCancel);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder st=new StringBuilder(textField.getText());
					st.deleteCharAt(textField.getText().length()-1);
					backSpace=st.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.PLAIN, 18));
		btnBackspace.setBounds(195, 209, 66, 45);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Optn="+";
			}
		});
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnAdd.setBounds(265, 209, 73, 45);
		frame.getContentPane().add(btnAdd);
		
		JButton btnCube = new JButton("X^3");
		btnCube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);

			}
		});
		btnCube.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnCube.setBounds(10, 254, 60, 45);
		frame.getContentPane().add(btnCube);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn7.setBounds(72, 254, 60, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn8.setBounds(133, 254, 60, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn9.setBounds(195, 254, 66, 45);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Optn="-";
			}
		});
		btnSub.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnSub.setBounds(265, 254, 73, 45);
		frame.getContentPane().add(btnSub);
		
		JButton btnSquare = new JButton("X^2");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText(" ");
				textField.setText(textField.getText()+a);
			}
		});
		btnSquare.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSquare.setBounds(10, 298, 60, 45);
		frame.getContentPane().add(btnSquare);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn4.setBounds(72, 298, 60, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn5.setBounds(133, 298, 60, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn6.setBounds(195, 298, 66, 45);
		frame.getContentPane().add(btn6);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Optn="*";
			}
		});
		btnMulti.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnMulti.setBounds(265, 298, 73, 45);
		frame.getContentPane().add(btnMulti);
		
		JButton btnFact = new JButton("n!");
		btnFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText(" ");
				textField.setText(textField.getText()+fact);
			}
		});
		btnFact.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnFact.setBounds(10, 341, 60, 45);
		frame.getContentPane().add(btnFact);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
				
			}
		});
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn1.setBounds(72, 341, 60, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn2.setBounds(133, 341, 60, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn3.setBounds(195, 341, 66, 45);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Optn="/";
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnDivide.setBounds(265, 341, 73, 45);
		frame.getContentPane().add(btnDivide);
		
		JButton btnAdd_Minus = new JButton("+/-");
		btnAdd_Minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
				
			}
		});
		btnAdd_Minus.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnAdd_Minus.setBounds(10, 384, 60, 45);
		frame.getContentPane().add(btnAdd_Minus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btn0.setBounds(72, 384, 121, 45);
		frame.getContentPane().add(btn0);
		
		JButton btnNewButton_2_6 = new JButton("0");
		btnNewButton_2_6.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnNewButton_2_6.setBounds(133, 384, 60, 45);
		frame.getContentPane().add(btnNewButton_2_6);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnDot.setBounds(195, 384, 66, 45);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(Optn=="+")
				{
					res=first+second;
					Ans=String.format("%.2f", res);
					textField.setText(Ans);
				}
				else if(Optn=="-")
				{
					res=first-second;
					Ans=String.format("%.2f", res);
					textField.setText(Ans);
				}
				else if(Optn=="*")
				{
					res=first*second;
					Ans=String.format("%.2f", res);
					textField.setText(Ans);
				}
				else if(Optn=="/")
				{
					res=first/second;
					Ans=String.format("%.2f", res);
					textField.setText(Ans);
				}
				else if(Optn=="%")
				{
					res=first%second;
					Ans=String.format("%.2f", res);
					textField.setText(Ans);
				}
				else if(Optn=="X^Y")
				{
					double rst=1;
					for(int i=0;i<second;i++)
					{
						rst=first*rst;
						
					}
					Ans=String.format("%.2f", rst);
					textField.setText(Ans);
				}
			}
		});
		btnEqual.setFont(new Font("Times New Roman", Font.BOLD, 21));
		btnEqual.setBounds(265, 384, 73, 45);
		frame.getContentPane().add(btnEqual);
		
		JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnSin.setBounds(133, 114, 60, 45);
		frame.getContentPane().add(btnSin);
		
		JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText(" ");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnTan.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnTan.setBounds(265, 114, 73, 45);
		frame.getContentPane().add(btnTan);
		
		JRadioButton btnOn = new JRadioButton("ON");
		btnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnDivide.setEnabled(true);
				btnMulti.setEnabled(true);
				btnSub.setEnabled(true);
				btnAdd.setEnabled(true);
				btnBackspace.setEnabled(true);
				btnPower.setEnabled(true);
				btnEX.setEnabled(true);
				btnLog.setEnabled(true);
				btnTan.setEnabled(true);
				btnCos.setEnabled(true);
				btn1X.setEnabled(true);
				btnDot.setEnabled(true);
				btnEqual.setEnabled(true);
				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTanh.setEnabled(true);
				btnSquare.setEnabled(true);
				btnCube.setEnabled(true);
				btnPercent.setEnabled(true);
				btnFact.setEnabled(true);
				btnCancel.setEnabled(true);
				btnAdd_Minus.setEnabled(true);
				btnroot.setEnabled(true);
				textField.setEnabled(true);
			}
		});
		buttonGroup.add(btnOn);
		btnOn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnOn.setBounds(10, 96, 52, 16);
		frame.getContentPane().add(btnOn);
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnDivide.setEnabled(false);
				btnMulti.setEnabled(false);
				btnSub.setEnabled(false);
				btnAdd.setEnabled(false);
				btnBackspace.setEnabled(false);
				btnPower.setEnabled(false);
				btnEX.setEnabled(false);
				btnLog.setEnabled(false);
				btnTan.setEnabled(false);
				btnCos.setEnabled(false);
				btn1X.setEnabled(false);
				btnDot.setEnabled(false);
				btnEqual.setEnabled(false);
				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTanh.setEnabled(false);
				btnSquare.setEnabled(false);
				btnCube.setEnabled(false);
				btnPercent.setEnabled(false);
				btnFact.setEnabled(false);
				btnCancel.setEnabled(false);
				btnAdd_Minus.setEnabled(false);
				btnroot.setEnabled(false);
				textField.setEnabled(false);
				
				
			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOff.setBounds(66, 96, 66, 16);
		frame.getContentPane().add(rdbtnOff);
	}
}
