package Pack1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class bikelogin extends JDialog implements ActionListener{
	private JTextField name;
	private JTextField phno;
	private JTextField bikeno;
	private JComboBox bikemo,bikeco;
	private JButton btnsubmit;
	private JLabel lblName;
	private JLabel lblPhoneNo;
	private JLabel lblCarNumber;
	private JLabel lblCarCompany;
	private JLabel lblCarModel;
	private JLabel lblCarDetails;
	int k;

	public bikelogin() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("USER DETAILS");
		getContentPane().setLayout(null);
		
		name = new JTextField();
		name.setBounds(198, 80, 116, 22);
		getContentPane().add(name);
		name.setColumns(10);
		
		phno = new JTextField();
		phno.setBounds(198, 125, 116, 22);
		getContentPane().add(phno);
		phno.setColumns(10);
		
		bikeno = new JTextField();
		bikeno.setBounds(198, 167, 116, 22);
		getContentPane().add(bikeno);
		bikeno.setColumns(10);
		
		bikeco = new JComboBox();
		bikeco.setModel(new DefaultComboBoxModel(new String[] {"","HONDA", "KTM", "BAJAJ", "ROYAL ENFIELD", "SUZUKI","HERO","TVS"}));
		bikeco.setBounds(198, 213, 116, 22);
		getContentPane().add(bikeco);
		
		bikemo = new JComboBox();
		bikemo.setModel(new DefaultComboBoxModel(new String[] {"","SPLENDER", "DUKE", "IGNITOR", "PULSAR", "BULLET", "AVENGER","APACHE"}));
		bikemo.setBounds(198, 265, 116, 22);
		getContentPane().add(bikemo);
		
		btnsubmit = new JButton("SUBMIT");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsubmit.setBounds(127, 339, 97, 25);
		btnsubmit.addActionListener(this);
		
		getContentPane().add(btnsubmit);
		
		lblName = new JLabel("NAME");
		lblName.setBounds(42, 80, 53, 22);
		getContentPane().add(lblName);
		
		lblPhoneNo = new JLabel("PHONE NO:");
		lblPhoneNo.setBounds(42, 125, 84, 22);
		getContentPane().add(lblPhoneNo);
		
		lblCarNumber = new JLabel("BIKE NUMBER");
		lblCarNumber.setBounds(42, 167, 84, 22);
		getContentPane().add(lblCarNumber);
		
		lblCarCompany = new JLabel("BIKE COMPANY");
		lblCarCompany.setBounds(42, 215, 94, 19);
		getContentPane().add(lblCarCompany);
		
		lblCarModel = new JLabel("BIKE MODEL");
		lblCarModel.setBounds(42, 267, 84, 19);
		getContentPane().add(lblCarModel);
		
		lblCarDetails = new JLabel("BIKE DETAILS");
		lblCarDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblCarDetails.setBounds(127, 21, 116, 22);
		getContentPane().add(lblCarDetails);
		setVisible(true);
		setSize(400,600);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new bikelogin();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnsubmit)
		{
			if(e.getSource()==btnsubmit)
			{
				String nm=name.getText();
				int token=k;
				String company=bikeco.getSelectedItem().toString();
				String model=bikemo.getSelectedItem().toString();
				int ph=Integer.parseInt(phno.getText());
				String bikenum=bikeno.getText();
				String st="insert into bikeentry(Token,Name,Phone,BikeNumber,BikeCompany,BikeModel)values(?,?,?,?,?,?)";
				try
				{
					Connection cc=MyConnection.connect();
					PreparedStatement ps=cc.prepareStatement(st);
					ps.setInt(1,token);
					ps.setString(2, nm);
					ps.setInt(3, ph);
					ps.setString(4, bikenum);
					ps.setString(6, company);
					ps.setString(7, model);
					ps.executeQuery();
					JOptionPane.showMessageDialog(null, "Done");
					dispose();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}

			JOptionPane.showMessageDialog(null, "hell");
		}
		
	}
}
}