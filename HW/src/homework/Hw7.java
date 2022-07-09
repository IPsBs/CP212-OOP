package homework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Hw7 implements ActionListener {

	private JFrame frmGuiContactApp;
	private JTextField FNtextField;
	private JTextField LntextField;
	private JTextField EmailtextField;
	private JTextField textField_2;
	private JTextField WedAdField_3;
	private JTextField AdField;
	private JTextField NotetextField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hw7 window = new Hw7();
					window.frmGuiContactApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Hw7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuiContactApp = new JFrame();
		frmGuiContactApp.setTitle("GUI Contact App");
		frmGuiContactApp.setBounds(100, 100, 450, 300);
		frmGuiContactApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmGuiContactApp.getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		
		JLabel ContactLabel = new JLabel("Contact");
		panel_1.add(ContactLabel);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		panel.add(textArea);
		
		JPanel panel_2 = new JPanel();
		frmGuiContactApp.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel ContactinfoLabel = new JLabel("Contact information");
		panel_3.add(ContactinfoLabel);
		
		JPanel panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(7, 2, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_4.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel FirstnameLabel = new JLabel("First name:");
		panel_6.add(FirstnameLabel);
		
		FNtextField = new JTextField();
		panel_6.add(FNtextField);
		FNtextField.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_4.add(panel_7);
		panel_7.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel LastnameLabel = new JLabel("Last name:");
		panel_7.add(LastnameLabel);
		
		LntextField = new JTextField();
		LntextField.setColumns(10);
		panel_7.add(LntextField);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel EmailnameLabel = new JLabel("Email:");
		panel_8.add(EmailnameLabel);
		
		EmailtextField = new JTextField();
		EmailtextField.setColumns(10);
		panel_8.add(EmailtextField);
		
		JPanel panel_9 = new JPanel();
		panel_4.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel PhoneNumLabel = new JLabel("Phone number:");
		panel_9.add(PhoneNumLabel);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		panel_9.add(textField_2);
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel WebAdLabel = new JLabel("Web Address:");
		panel_10.add(WebAdLabel);
		
		WedAdField_3 = new JTextField();
		WedAdField_3.setColumns(10);
		panel_10.add(WedAdField_3);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblAddress = new JLabel("Address:");
		panel_11.add(lblAddress);
		
		AdField = new JTextField();
		AdField.setColumns(10);
		panel_11.add(AdField);
		
		JPanel panel_12 = new JPanel();
		panel_4.add(panel_12);
		panel_12.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNotes = new JLabel("Notes:");
		panel_12.add(lblNotes);
		
		NotetextField = new JTextField();
		NotetextField.setColumns(10);
		panel_12.add(NotetextField);
		
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(this);
		panel_5.add(btnAdd);
		
		JButton btnUpdate = new JButton("Update");
		panel_5.add(btnUpdate);
		
		JButton btnRemove = new JButton("Remove");
		panel_5.add(btnRemove);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String buttonName = ((JButton)event.getSource()).getText();
		if (buttonName == "ADD") {
			addToleft();
		}
	}
	public void addToleft() {
		String Firstnametext = FNtextField.getText(), Lastnametext = LntextField.getText();
		textArea.setText(Firstnametext + " "+Lastnametext);
	}

}
