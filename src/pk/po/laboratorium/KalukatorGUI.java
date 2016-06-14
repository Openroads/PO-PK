package pk.po.laboratorium;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class KalukatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalukatorGUI frame = new KalukatorGUI();
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
	public KalukatorGUI() {
		setTitle("Kalkulator ONP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 349, 254);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{42, 42, 42, 44, 44, 53, 0};
		gbl_contentPane.rowHeights = new int[]{40, 25, 25, 25, 26, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		KalkulatorListener listener = new KalkulatorListener();
		
		textField = new JTextField();
		textField.setEditable(true);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 6;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		
		JButton button = new JButton("1");
		button.addActionListener(listener);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 1;
		contentPane.add(button, gbc_button);
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(listener);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.BOTH;
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 1;
		contentPane.add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("3");
		button_2.addActionListener(listener);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.BOTH;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 1;
		contentPane.add(button_2, gbc_button_2);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(listener);
		GridBagConstraints gbc_button_14 = new GridBagConstraints();
		gbc_button_14.fill = GridBagConstraints.BOTH;
		gbc_button_14.insets = new Insets(0, 0, 5, 5);
		gbc_button_14.gridx = 3;
		gbc_button_14.gridy = 1;
		contentPane.add(button_14, gbc_button_14);
		
		JButton btnV = new JButton("v");
		btnV.addActionListener(listener);
		GridBagConstraints gbc_btnV = new GridBagConstraints();
		gbc_btnV.fill = GridBagConstraints.BOTH;
		gbc_btnV.insets = new Insets(0, 0, 5, 5);
		gbc_btnV.gridx = 4;
		gbc_btnV.gridy = 1;
		contentPane.add(btnV, gbc_btnV);
		
		JButton button_19 = new JButton("C");
		button_19.addActionListener(listener);
		GridBagConstraints gbc_button_19 = new GridBagConstraints();
		gbc_button_19.fill = GridBagConstraints.BOTH;
		gbc_button_19.insets = new Insets(0, 0, 5, 0);
		gbc_button_19.gridx = 5;
		gbc_button_19.gridy = 1;
		contentPane.add(button_19, gbc_button_19);
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(listener);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.BOTH;
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 0;
		gbc_button_3.gridy = 2;
		contentPane.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("5");
		button_4.addActionListener(listener);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.BOTH;
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 1;
		gbc_button_4.gridy = 2;
		contentPane.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("6");
		button_5.addActionListener(listener);
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.BOTH;
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 2;
		gbc_button_5.gridy = 2;
		contentPane.add(button_5, gbc_button_5);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(listener);
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.fill = GridBagConstraints.BOTH;
		gbc_button_12.insets = new Insets(0, 0, 5, 5);
		gbc_button_12.gridx = 3;
		gbc_button_12.gridy = 2;
		contentPane.add(button_12, gbc_button_12);
		
		JButton button_16 = new JButton("^");
		button_16.addActionListener(listener);
		GridBagConstraints gbc_button_16 = new GridBagConstraints();
		gbc_button_16.fill = GridBagConstraints.BOTH;
		gbc_button_16.insets = new Insets(0, 0, 5, 5);
		gbc_button_16.gridx = 4;
		gbc_button_16.gridy = 2;
		contentPane.add(button_16, gbc_button_16);
		
		JButton button_20 = new JButton("<-");
		button_20.addActionListener(listener);
		GridBagConstraints gbc_button_20 = new GridBagConstraints();
		gbc_button_20.fill = GridBagConstraints.BOTH;
		gbc_button_20.insets = new Insets(0, 0, 5, 0);
		gbc_button_20.gridx = 5;
		gbc_button_20.gridy = 2;
		contentPane.add(button_20, gbc_button_20);
		
		JButton button_6 = new JButton("7");
		button_6.addActionListener(listener);
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.BOTH;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 0;
		gbc_button_6.gridy = 3;
		contentPane.add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(listener);
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.fill = GridBagConstraints.BOTH;
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 1;
		gbc_button_7.gridy = 3;
		contentPane.add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(listener);
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.fill = GridBagConstraints.BOTH;
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 2;
		gbc_button_8.gridy = 3;
		contentPane.add(button_8, gbc_button_8);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(listener);
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.fill = GridBagConstraints.BOTH;
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 3;
		contentPane.add(button_11, gbc_button_11);
		
		JButton button_17 = new JButton("(");
		button_17.addActionListener(listener);
		GridBagConstraints gbc_button_17 = new GridBagConstraints();
		gbc_button_17.fill = GridBagConstraints.BOTH;
		gbc_button_17.insets = new Insets(0, 0, 5, 5);
		gbc_button_17.gridx = 4;
		gbc_button_17.gridy = 3;
		contentPane.add(button_17, gbc_button_17);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(listener);
		GridBagConstraints gbc_button_15 = new GridBagConstraints();
		gbc_button_15.fill = GridBagConstraints.BOTH;
		gbc_button_15.gridheight = 2;
		gbc_button_15.gridx = 5;
		gbc_button_15.gridy = 3;
		contentPane.add(button_15, gbc_button_15);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(listener);
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.BOTH;
		gbc_button_9.insets = new Insets(0, 0, 0, 5);
		gbc_button_9.gridwidth = 2;
		gbc_button_9.gridx = 0;
		gbc_button_9.gridy = 4;
		contentPane.add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton(".");
		button_10.addActionListener(listener);
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.fill = GridBagConstraints.BOTH;
		gbc_button_10.insets = new Insets(0, 0, 0, 5);
		gbc_button_10.gridx = 2;
		gbc_button_10.gridy = 4;
		contentPane.add(button_10, gbc_button_10);
		
		JButton button_13 = new JButton("+");
		button_13.addActionListener(listener);
		GridBagConstraints gbc_button_13 = new GridBagConstraints();
		gbc_button_13.fill = GridBagConstraints.BOTH;
		gbc_button_13.insets = new Insets(0, 0, 0, 5);
		gbc_button_13.gridx = 3;
		gbc_button_13.gridy = 4;
		contentPane.add(button_13, gbc_button_13);
		
		JButton button_18 = new JButton(")");
		button_18.addActionListener(listener);
		GridBagConstraints gbc_button_18 = new GridBagConstraints();
		gbc_button_18.fill = GridBagConstraints.BOTH;
		gbc_button_18.insets = new Insets(0, 0, 0, 5);
		gbc_button_18.gridx = 4;
		gbc_button_18.gridy = 4;
		contentPane.add(button_18, gbc_button_18);
	}
	
	private class KalkulatorListener implements ActionListener
	{
		Onp kalkulator = new Onp();
		String rownanie="";
		@Override
		public void actionPerformed(ActionEvent e) {
			String temp = ((JButton)e.getSource()).getText();
			

			if(temp == "<-")
			{
				if(rownanie.length()>0)
					rownanie=rownanie.substring(0, rownanie.length()-1);
				textField.setText(rownanie);
			}
			else if(temp =="C")
			{
				rownanie="";
				textField.setText(rownanie);
			}else if(temp =="=")
			{
				try{
				rownanie=textField.getText();
				if(!rownanie.equals("")){
				rownanie+="=";
				rownanie=rownanie.replaceAll("\\s","");
				
				ArrayList<String> rownanieOnp = kalkulator.createOnpForm(rownanie);
				textField.setText(String.valueOf(kalkulator.getResult(rownanieOnp)));
				rownanie="";
				}else{
					rownanie="0.0";
					textField.setText(rownanie);
				}
				}catch(Exception ex)
				{
					textField.setText("Nieprawidłowa forma wyrażenia");
					rownanie="";
				}
			}
			else{
				rownanie+=temp;
				textField.setText(rownanie);
			}
			
			
		}
	}
}
