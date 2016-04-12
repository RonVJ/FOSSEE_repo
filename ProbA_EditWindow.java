import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class ProbA_EditWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JLabel lblNull=null;
					JFrame frmNull=null;
					ProbA_EditWindow frame = new ProbA_EditWindow(lblNull,frmNull);
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
	public ProbA_EditWindow(JLabel lblOrg,JFrame mframe) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLabelText = new JLabel("Label Text");
		lblLabelText.setBounds(63, 53, 97, 14);
		contentPane.add(lblLabelText);
		
		JLabel lblLableBackground = new JLabel("Lable Background Color");
		lblLableBackground.setBounds(62, 78, 144, 14);
		contentPane.add(lblLableBackground);
		
		JLabel lblNewLabel = new JLabel("Label Font Color");
		lblNewLabel.setBounds(63, 103, 97, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(254, 50, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(254, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(254, 100, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(240, 240, 240));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().equals(""))
				{
					//System.out.println("text:"+textField.getText());
					lblOrg.setText(textField.getText());
				}
				if(!textField_1.getText().equals(""))
				{
					//System.out.println("background color:"+textField_1.getText());
					if(textField_1.getText().equals("WHITE"))
						lblOrg.setBackground(Color.WHITE);
					if(textField_1.getText().equals("GRAY"))
						lblOrg.setBackground(Color.GRAY);
					if(textField_1.getText().equals("BLACK"))
						lblOrg.setBackground(Color.BLACK);
					if(textField_1.getText().equals("PINK"))
						lblOrg.setBackground(Color.PINK);
					if(textField_1.getText().equals("YELLOW"))
						lblOrg.setBackground(Color.YELLOW);
					if(textField_1.getText().equals("MAGENTA"))
						lblOrg.setBackground(Color.MAGENTA);
					if(textField_1.getText().equals("BLUE"))
						lblOrg.setBackground(Color.BLUE);
					if(textField_1.getText().equals("RED"))
						lblOrg.setBackground(Color.RED);
					if(textField_1.getText().equals("LIGHT_GRAY"))
						lblOrg.setBackground(Color.LIGHT_GRAY);
					if(textField_1.getText().equals("DARK_GRAY"))
						lblOrg.setBackground(Color.DARK_GRAY);
					if(textField_1.getText().equals("ORANGE"))
						lblOrg.setBackground(Color.ORANGE);
					if(textField_1.getText().equals("GREEN"))
						lblOrg.setBackground(Color.GREEN);
					if(textField_1.getText().equals("CYAN"))
						lblOrg.setBackground(Color.CYAN);
					
					
				}
				if(!textField_2.getText().equals(""))
				{
					//System.out.println("foreground color:"+textField_2.getText());
					if(textField_2.getText().equals("WHITE"))
						lblOrg.setForeground(Color.WHITE);
					if(textField_2.getText().equals("GRAY"))
						lblOrg.setForeground(Color.GRAY);
					if(textField_2.getText().equals("BLACK"))
						lblOrg.setForeground(Color.BLACK);
					if(textField_2.getText().equals("PINK"))
						lblOrg.setForeground(Color.PINK);
					if(textField_2.getText().equals("YELLOW"))
						lblOrg.setForeground(Color.YELLOW);
					if(textField_2.getText().equals("MAGENTA"))
						lblOrg.setForeground(Color.MAGENTA);
					if(textField_2.getText().equals("BLUE"))
						lblOrg.setForeground(Color.BLUE);
					if(textField_2.getText().equals("RED"))
						lblOrg.setForeground(Color.RED);
					if(textField_2.getText().equals("LIGHT_GRAY"))
						lblOrg.setForeground(Color.LIGHT_GRAY);
					if(textField_2.getText().equals("DARK_GRAY"))
						lblOrg.setForeground(Color.DARK_GRAY);
					if(textField_2.getText().equals("ORANGE"))
						lblOrg.setForeground(Color.ORANGE);
					if(textField_2.getText().equals("GREEN"))
						lblOrg.setForeground(Color.GREEN);
					if(textField_2.getText().equals("CYAN"))
						lblOrg.setForeground(Color.CYAN);
				}
				
				mframe.setVisible(true);
				setVisible(false);
				
			}
		});
		btnSubmit.setBounds(254, 160, 89, 23);
		contentPane.add(btnSubmit);
		JLabel lblNote = new JLabel("Note:");
		lblNote.setBounds(63, 220, 46, 14);
		contentPane.add(lblNote);
		
		JLabel lblEnterAValid = new JLabel("Enter a valid color in capitals");
		lblEnterAValid.setBounds(114, 220, 210, 14);
		contentPane.add(lblEnterAValid);
		
		JLabel lblLeaveEmptyFor = new JLabel("Leave fields empty for no change");
		lblLeaveEmptyFor.setBounds(114, 236, 210, 14);
		contentPane.add(lblLeaveEmptyFor);
	}
}
