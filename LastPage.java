package Pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LastPage extends JDialog implements ActionListener{
	private JTextField txtEnterTokenNumber;
	private JTextField textField;

	public LastPage() {
		getContentPane().setLayout(null);
		
		txtEnterTokenNumber = new JTextField();
		txtEnterTokenNumber.setText("   ENTER TOKEN NUMBER");
		txtEnterTokenNumber.setBounds(128, 45, 162, 48);
		getContentPane().add(txtEnterTokenNumber);
		txtEnterTokenNumber.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(143, 130, 129, 22);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(162, 188, 97, 25);
		getContentPane().add(btnSubmit);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
