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
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login extends JDialog implements ActionListener{
	private JTextField txtCarNumber;
	private JTextField tfname;
	private JTextField tfphone;
	private JTextField tfcarnumber;
	private JTextField txtCarCompany;
	private JTextField txtCarModel;
	private JComboBox cbcarmodel,cbcarcompany;
	private JButton btnsubmit;
	private JLabel lblNewUser;
	int k;
	private JLabel lblName;
	private JLabel label;

	public Login() {
		getContentPane().setBackground(Color.WHITE);
		setTitle("Authentication");
		getContentPane().setLayout(null);
		
		txtCarNumber = new JTextField();
		txtCarNumber.setText("CAR NUMBER");
		txtCarNumber.setBounds(42, 179, 84, 22);
		getContentPane().add(txtCarNumber);
		txtCarNumber.setColumns(10);
		
		tfname = new JTextField();
		tfname.setBounds(198, 80, 116, 22);
		getContentPane().add(tfname);
		tfname.setColumns(10);
		
		tfphone = new JTextField();
		tfphone.setBounds(198, 131, 116, 22);
		getContentPane().add(tfphone);
		tfphone.setColumns(10);
		
		tfcarnumber = new JTextField();
		tfcarnumber.setBounds(198, 179, 116, 22);
		getContentPane().add(tfcarnumber);
		tfcarnumber.setColumns(10);
		
		txtCarCompany = new JTextField();
		txtCarCompany.setText("CAR COMPANY");
		txtCarCompany.setBounds(30, 230, 96, 22);
		getContentPane().add(txtCarCompany);
		txtCarCompany.setColumns(10);
		
		cbcarcompany = new JComboBox();
		cbcarcompany.setModel(new DefaultComboBoxModel(new String[] {"HONDA", "HYUNDAI", "TOYOTA", "SKODA", "MARUTI SUZUKI", "TATA"}));
		cbcarcompany.setBounds(198, 230, 116, 22);
		getContentPane().add(cbcarcompany);
		
		txtCarModel = new JTextField();
		txtCarModel.setText("CAR MODEL");
		txtCarModel.setBounds(42, 284, 84, 22);
		getContentPane().add(txtCarModel);
		txtCarModel.setColumns(10);
		
		cbcarmodel = new JComboBox();
		cbcarmodel.setModel(new DefaultComboBoxModel(new String[] {"i10", "VERNA", "FABIA", "CRETA", "NANO", "i20", "800", "POLO", "VENTO"}));
		cbcarmodel.setBounds(198, 284, 116, 22);
		getContentPane().add(cbcarmodel);
		
		btnsubmit = new JButton("SUBMIT");
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsubmit.setBounds(121, 368, 97, 25);
		btnsubmit.addActionListener(this);
		
		getContentPane().add(btnsubmit);
		
		lblNewUser = new JLabel("NEW USER");
		lblNewUser.setBackground(Color.LIGHT_GRAY);
		lblNewUser.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewUser.setBounds(124, 13, 122, 43);
		getContentPane().add(lblNewUser);
		
		lblName = new JLabel("NAME");
		lblName.setBounds(53, 83, 56, 16);
		getContentPane().add(lblName);
		
		label = new JLabel("NAME");
		label.setBounds(53, 131, 56, 16);
		getContentPane().add(label);
		setVisible(true);
		setSize(400,600);
		getID();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Login();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==btnsubmit)

		{
			
				String name=tfname.getText();
				int token=k;
				
				String company=cbcarcompany.getSelectedItem().toString();//return type is object so covert to string
				String model=cbcarmodel.getSelectedItem().toString();
				int phone=Integer.parseInt(tfphone.getText());//convert string to integer
				String carnumber=tfcarnumber.getText();
				String st="insert into parking_car(token,name,phone,carnumber,company,model)values(?,?,?,?,?,?)";
				try{
					Connection cc=MyConnection.connect();
					PreparedStatement ps=cc.prepareStatement(st);
					ps.setInt(1, token);
					ps.setString(2, name);
					ps.setInt(3, phone);
					ps.setString(4, carnumber);
					ps.setString(5,company);
					ps.setString(6,model);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Done");
					dispose();
				}
				catch(SQLException se){
					se.printStackTrace();
				}
			new ParkingLot();
			dispose();// TODO Auto-generated method stub
		}
		
	}
	void getID()
	{
		String st="select max(token) from parking_car";
		Connection cc=MyConnection.connect();
		try{
			PreparedStatement ps=cc.prepareStatement(st);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				k=rs.getInt(1);
			
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		++k;
		
	}
}
