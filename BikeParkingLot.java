package Pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ButtonGroup;

public class BikeParkingLot extends JDialog implements ActionListener {
	JLabel lblEntry,lblExit,lblBikes,lblBikes_1,lblCars,lblCars_1;
	JRadioButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
	JRadioButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,c61,c62,c63,c64;
	JButton btnSubmit,btnCancel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public BikeParkingLot() {
		getContentPane().setLayout(null);
		setTitle("PARKING LOT");
		String st="select Blocked from parking_bike where Token=?";
        Connection con=MyConnection.connect();
		
		lblEntry = new JLabel("ENTRY---->");
		lblEntry.setBackground(Color.WHITE);
		lblEntry.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblEntry.setBounds(12, 171, 152, 36);
		getContentPane().add(lblEntry);
		
		lblExit = new JLabel("EXIT-->");
		lblExit.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblExit.setBounds(689, 416, 108, 36);
		getContentPane().add(lblExit);
		
		lblBikes = new JLabel("BIKES");
		lblBikes.setForeground(Color.GRAY);
		lblBikes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBikes.setBounds(119, 20, 56, 16);
		getContentPane().add(lblBikes);
		
		lblBikes_1 = new JLabel("BIKES");
		lblBikes_1.setForeground(Color.GRAY);
		lblBikes_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBikes_1.setBounds(119, 361, 56, 16);
		getContentPane().add(lblBikes_1);
		
		b1 = new JRadioButton(" ");
		buttonGroup.add(b1);
		b1.setBounds(187, 19, 25, 24);
		getContentPane().add(b1);
		
		b2 = new JRadioButton(" ");
		buttonGroup.add(b2);
		b2.setBounds(216, 19, 25, 24);
		getContentPane().add(b2);
		
		b3 = new JRadioButton(" ");
		buttonGroup.add(b3);
		b3.setBounds(245, 19, 25, 24);
		getContentPane().add(b3);
		
		b4 = new JRadioButton(" ");
		buttonGroup.add(b4);
		b4.setBounds(274, 19, 25, 24);
		getContentPane().add(b4);
		
		b5 = new JRadioButton(" ");
		buttonGroup.add(b5);
		b5.setBounds(303, 19, 25, 24);
		getContentPane().add(b5);
		
		b6 = new JRadioButton(" ");
		buttonGroup.add(b6);
		b6.setBounds(332, 19, 25, 24);
		getContentPane().add(b6);
		
		b7 = new JRadioButton(" ");
		buttonGroup.add(b7);
		b7.setBounds(361, 19, 25, 24);
		getContentPane().add(b7);
		
		b8 = new JRadioButton(" ");
		buttonGroup.add(b8);
		b8.setBounds(390, 19, 25, 24);
		getContentPane().add(b8);
		
		b9 = new JRadioButton(" ");
		buttonGroup.add(b9);
		b9.setBounds(419, 19, 25, 24);
		getContentPane().add(b9);
		
		b10 = new JRadioButton(" ");
		buttonGroup.add(b10);
		b10.setBounds(448, 19, 25, 24);
		getContentPane().add(b10);
		
		b11 = new JRadioButton(" ");
		buttonGroup.add(b11);
		b11.setBounds(477, 19, 25, 24);
		getContentPane().add(b11);
		
		b12 = new JRadioButton(" ");
		buttonGroup.add(b12);
		b12.setBounds(506, 19, 25, 24);
		getContentPane().add(b12);
		
		b13 = new JRadioButton(" ");
		buttonGroup.add(b13);
		b13.setBounds(535, 19, 25, 24);
		getContentPane().add(b13);
		
		b14 = new JRadioButton(" ");
		buttonGroup.add(b14);
		b14.setBounds(564, 19, 25, 24);
		getContentPane().add(b14);
		
		b15 = new JRadioButton(" ");
		buttonGroup.add(b15);
		b15.setBounds(593, 19, 25, 24);
		getContentPane().add(b15);
		
		b16 = new JRadioButton(" ");
		buttonGroup.add(b16);
		b16.setBounds(622, 19, 25, 24);
		getContentPane().add(b16);
		
		c1 = new JRadioButton(" ");
		c1.setEnabled(false);
		c1.setBounds(187, 98, 25, 24);
		getContentPane().add(c1);
		
		c2 = new JRadioButton(" ");
		c2.setEnabled(false);
		c2.setBounds(216, 98, 25, 24);
		getContentPane().add(c2);
		
		c3 = new JRadioButton(" ");
		c3.setEnabled(false);
		c3.setBounds(245, 98, 25, 24);
		getContentPane().add(c3);
		
		c4 = new JRadioButton(" ");
		c4.setEnabled(false);
		c4.setBounds(274, 98, 25, 24);
		getContentPane().add(c4);
		
		c5 = new JRadioButton(" ");
		c5.setEnabled(false);
		c5.setBounds(303, 98, 25, 24);
		getContentPane().add(c5);
		
		c6 = new JRadioButton(" ");
		c6.setEnabled(false);
		c6.setBounds(332, 98, 25, 24);
		getContentPane().add(c6);
		
		c7 = new JRadioButton(" ");
		c7.setEnabled(false);
		c7.setBounds(361, 98, 25, 24);
		getContentPane().add(c7);
		
		c8 = new JRadioButton(" ");
		c8.setEnabled(false);
		c8.setBounds(390, 98, 25, 24);
		getContentPane().add(c8);
		
		c9 = new JRadioButton(" ");
		c9.setEnabled(false);
		c9.setBounds(419, 98, 25, 24);
		getContentPane().add(c9);
		
		c10 = new JRadioButton(" ");
		c10.setEnabled(false);
		c10.setBounds(448, 98, 25, 24);
		getContentPane().add(c10);
		
		c11 = new JRadioButton(" ");
		c11.setEnabled(false);
		c11.setBounds(477, 98, 25, 24);
		getContentPane().add(c11);
		
		c12 = new JRadioButton(" ");
		c12.setEnabled(false);
		c12.setBounds(506, 98, 25, 24);
		getContentPane().add(c12);
		
		c13 = new JRadioButton(" ");
		c13.setEnabled(false);
		c13.setBounds(535, 98, 25, 24);
		getContentPane().add(c13);
		
		c14 = new JRadioButton(" ");
		c14.setEnabled(false);
		c14.setBounds(564, 98, 25, 24);
		getContentPane().add(c14);
		
		c15 = new JRadioButton(" ");
		c15.setEnabled(false);
		c15.setBounds(593, 98, 25, 24);
		getContentPane().add(c15);
		
		c16 = new JRadioButton(" ");
		c16.setEnabled(false);
		c16.setBounds(622, 98, 25, 24);
		getContentPane().add(c16);
		
		c17 = new JRadioButton(" ");
		c17.setEnabled(false);
		c17.setBounds(187, 127, 25, 24);
		getContentPane().add(c17);
		
		c18 = new JRadioButton(" ");
		c18.setEnabled(false);
		c18.setBounds(216, 127, 25, 24);
		getContentPane().add(c18);
		
		c19 = new JRadioButton(" ");
		c19.setEnabled(false);
		c19.setBounds(245, 127, 25, 24);
		getContentPane().add(c19);
		
		c20 = new JRadioButton(" ");
		c20.setEnabled(false);
		c20.setBounds(274, 127, 25, 24);
		getContentPane().add(c20);
		
		c21 = new JRadioButton(" ");
		c21.setEnabled(false);
		c21.setBounds(303, 127, 25, 24);
		getContentPane().add(c21);
		
		c22 = new JRadioButton(" ");
		c22.setEnabled(false);
		c22.setBounds(332, 127, 25, 24);
		getContentPane().add(c22);
		
		c23 = new JRadioButton(" ");
		c23.setEnabled(false);
		c23.setBounds(361, 127, 25, 24);
		getContentPane().add(c23);
		
		c24 = new JRadioButton(" ");
		c24.setEnabled(false);
		c24.setBounds(390, 127, 25, 24);
		getContentPane().add(c24);
		
		c25 = new JRadioButton(" ");
		c25.setEnabled(false);
		c25.setBounds(419, 127, 25, 24);
		getContentPane().add(c25);
		
		c26 = new JRadioButton(" ");
		c26.setEnabled(false);
		c26.setBounds(448, 127, 25, 24);
		getContentPane().add(c26);
		
		c27 = new JRadioButton(" ");
		c27.setEnabled(false);
		c27.setBounds(477, 127, 25, 24);
		getContentPane().add(c27);
		
		c28 = new JRadioButton(" ");
		c28.setEnabled(false);
		c28.setBounds(506, 127, 25, 24);
		getContentPane().add(c28);
		
		c29 = new JRadioButton(" ");
		c29.setEnabled(false);
		c29.setBounds(535, 127, 25, 24);
		getContentPane().add(c29);
		
		c30 = new JRadioButton(" ");
		c30.setEnabled(false);
		c30.setBounds(564, 127, 25, 24);
		getContentPane().add(c30);
		
		c31 = new JRadioButton(" ");
		c31.setEnabled(false);
		c31.setBounds(593, 127, 25, 24);
		getContentPane().add(c31);
		
		c32 = new JRadioButton(" ");
		c32.setEnabled(false);
		c32.setBounds(622, 127, 25, 24);
		getContentPane().add(c32);
		
		c33 = new JRadioButton(" ");
		c33.setEnabled(false);
		c33.setBounds(187, 236, 25, 24);
		getContentPane().add(c33);
		
		c34 = new JRadioButton(" ");
		c34.setEnabled(false);
		c34.setBounds(216, 236, 25, 24);
		getContentPane().add(c34);
		
		c35 = new JRadioButton(" ");
		c35.setEnabled(false);
		c35.setBounds(245, 236, 25, 24);
		getContentPane().add(c35);
		
		c36 = new JRadioButton(" ");
		c36.setEnabled(false);
		c36.setBounds(274, 236, 25, 24);
		getContentPane().add(c36);
		
		c37 = new JRadioButton(" ");
		c37.setEnabled(false);
		c37.setBounds(303, 236, 25, 24);
		getContentPane().add(c37);
		
		c38 = new JRadioButton(" ");
		c38.setEnabled(false);
		c38.setBounds(332, 236, 25, 24);
		getContentPane().add(c38);
		
		c39 = new JRadioButton(" ");
		c39.setEnabled(false);
		c39.setBounds(361, 236, 25, 24);
		getContentPane().add(c39);
		
		c40 = new JRadioButton(" ");
		c40.setEnabled(false);
		c40.setBounds(390, 236, 25, 24);
		getContentPane().add(c40);
		
		c41 = new JRadioButton(" ");
		c41.setEnabled(false);
		c41.setBounds(419, 236, 25, 24);
		getContentPane().add(c41);
		
		c42 = new JRadioButton(" ");
		c42.setEnabled(false);
		c42.setBounds(448, 236, 25, 24);
		getContentPane().add(c42);
		
		c43 = new JRadioButton(" ");
		c43.setEnabled(false);
		c43.setBounds(477, 236, 25, 24);
		getContentPane().add(c43);
		
		c44 = new JRadioButton(" ");
		c44.setEnabled(false);
		c44.setBounds(506, 236, 25, 24);
		getContentPane().add(c44);
		
		c45 = new JRadioButton(" ");
		c45.setEnabled(false);
		c45.setBounds(535, 236, 25, 24);
		getContentPane().add(c45);
		
		c46 = new JRadioButton(" ");
		c46.setEnabled(false);
		c46.setBounds(564, 236, 25, 24);
		getContentPane().add(c46);
		
		c47 = new JRadioButton(" ");
		c47.setEnabled(false);
		c47.setBounds(593, 236, 25, 24);
		getContentPane().add(c47);
		
		c48 = new JRadioButton(" ");
		c48.setEnabled(false);
		c48.setBounds(622, 236, 25, 24);
		getContentPane().add(c48);
		
		c49 = new JRadioButton(" ");
		c49.setEnabled(false);
		c49.setBounds(187, 265, 25, 24);
		getContentPane().add(c49);
		
		c50 = new JRadioButton(" ");
		c50.setEnabled(false);
		c50.setBounds(216, 265, 25, 24);
		getContentPane().add(c50);
		
		c51 = new JRadioButton(" ");
		c51.setEnabled(false);
		c51.setBounds(245, 265, 25, 24);
		getContentPane().add(c51);
		
		c52 = new JRadioButton(" ");
		c52.setEnabled(false);
		c52.setBounds(274, 265, 25, 24);
		getContentPane().add(c52);
		
		c53 = new JRadioButton(" ");
		c53.setEnabled(false);
		c53.setBounds(303, 265, 25, 24);
		getContentPane().add(c53);
		
		c54 = new JRadioButton(" ");
		c54.setEnabled(false);
		c54.setBounds(332, 265, 25, 24);
		getContentPane().add(c54);
		
		c55 = new JRadioButton(" ");
		c55.setEnabled(false);
		c55.setBounds(361, 265, 25, 24);
		getContentPane().add(c55);
		
		c56 = new JRadioButton(" ");
		c56.setEnabled(false);
		c56.setBounds(390, 265, 25, 24);
		getContentPane().add(c56);
		
		c57 = new JRadioButton(" ");
		c57.setEnabled(false);
		c57.setBounds(419, 265, 25, 24);
		getContentPane().add(c57);
		
		c58 = new JRadioButton(" ");
		c58.setEnabled(false);
		c58.setBounds(448, 265, 25, 24);
		getContentPane().add(c58);
		
		c59 = new JRadioButton(" ");
		c59.setEnabled(false);
		c59.setBounds(477, 265, 25, 24);
		getContentPane().add(c59);
		
		c60 = new JRadioButton(" ");
		c60.setEnabled(false);
		c60.setBounds(506, 265, 25, 24);
		getContentPane().add(c60);
		
		c61 = new JRadioButton(" ");
		c61.setEnabled(false);
		c61.setBounds(535, 265, 25, 24);
		getContentPane().add(c61);
		
		c62 = new JRadioButton(" ");
		c62.setEnabled(false);
		c62.setBounds(564, 265, 25, 24);
		getContentPane().add(c62);
		
		c63 = new JRadioButton(" ");
		c63.setEnabled(false);
		c63.setBounds(593, 265, 25, 24);
		getContentPane().add(c63);
		
		c64 = new JRadioButton(" ");
		c64.setEnabled(false);
		c64.setBounds(622, 265, 25, 24);
		getContentPane().add(c64);
		
		JButton button_1 = new JButton(" ");
		button_1.setEnabled(false);
		button_1.setBounds(181, 159, 466, 4);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton(" ");
		button_2.setEnabled(false);
		button_2.setBounds(181, 85, 466, 4);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton(" ");
		button_3.setEnabled(false);
		button_3.setBounds(187, 299, 466, 4);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton(" ");
		button_4.setEnabled(false);
		button_4.setBounds(181, 223, 466, 4);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton(" ");
		button_5.setEnabled(false);
		button_5.setBounds(187, 349, 466, 4);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton(" ");
		button_6.setEnabled(false);
		button_6.setBounds(181, 52, 466, 4);
		getContentPane().add(button_6);
		
		b17 = new JRadioButton(" ");
		buttonGroup.add(b17);
		b17.setBounds(187, 360, 25, 24);
		getContentPane().add(b17);
		
		b18 = new JRadioButton(" ");
		buttonGroup.add(b18);
		b18.setBounds(216, 360, 25, 24);
		getContentPane().add(b18);
		
		b19 = new JRadioButton(" ");
		buttonGroup.add(b19);
		b19.setBounds(245, 360, 25, 24);
		getContentPane().add(b19);
		
		b20 = new JRadioButton(" ");
		buttonGroup.add(b20);
		b20.setBounds(274, 360, 25, 24);
		getContentPane().add(b20);
		
		b21 = new JRadioButton(" ");
		buttonGroup.add(b21);
		b21.setBounds(303, 360, 25, 24);
		getContentPane().add(b21);
		
		b22 = new JRadioButton(" ");
		buttonGroup.add(b22);
		b22.setBounds(332, 360, 25, 24);
		getContentPane().add(b22);
		
		b23 = new JRadioButton(" ");
		buttonGroup.add(b23);
		b23.setBounds(361, 360, 25, 24);
		getContentPane().add(b23);
		
		b24 = new JRadioButton(" ");
		buttonGroup.add(b24);
		b24.setBounds(390, 360, 25, 24);
		getContentPane().add(b24);
		
		b25 = new JRadioButton(" ");
		buttonGroup.add(b25);
		b25.setBounds(419, 360, 25, 24);
		getContentPane().add(b25);
		
		b26 = new JRadioButton(" ");
		buttonGroup.add(b26);
		b26.setBounds(448, 360, 25, 24);
		getContentPane().add(b26);
		
		b27 = new JRadioButton(" ");
		buttonGroup.add(b27);
		b27.setBounds(477, 360, 25, 24);
		getContentPane().add(b27);
		
		b28 = new JRadioButton(" ");
		buttonGroup.add(b28);
		b28.setBounds(506, 360, 25, 24);
		getContentPane().add(b28);
		
		b29 = new JRadioButton(" ");
		buttonGroup.add(b29);
		b29.setBounds(535, 360, 25, 24);
		getContentPane().add(b29);
		
		b30 = new JRadioButton(" ");
		buttonGroup.add(b30);
		b30.setBounds(564, 360, 25, 24);
		getContentPane().add(b30);
		
		b31 = new JRadioButton(" ");
		buttonGroup.add(b31);
		b31.setBounds(593, 360, 25, 24);
		getContentPane().add(b31);
		
		b32 = new JRadioButton(" ");
		buttonGroup.add(b32);
		b32.setBounds(622, 360, 25, 24);
		getContentPane().add(b32);
		
		lblCars = new JLabel("CARS");
		lblCars.setForeground(Color.GRAY);
		lblCars.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCars.setBounds(119, 116, 56, 16);
		getContentPane().add(lblCars);
		
		lblCars_1 = new JLabel("CARS");
		lblCars_1.setForeground(Color.GRAY);
		lblCars_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCars_1.setBounds(119, 251, 56, 16);
		getContentPane().add(lblCars_1);
		
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(347, 426, 97, 25);
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
			}
		});
		getContentPane().add(btnSubmit);
		
		btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(477, 427, 98, 24);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		getContentPane().add(btnCancel);
		setVisible(true);
		setSize(823,528);
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,1);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b1.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,2);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b2.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,3);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b3.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,4);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b4.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,5);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b5.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,6);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b6.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,7);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b7.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,8);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b8.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,9);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b9.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,10);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b10.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,11);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b11.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,12);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b12.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,13);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b13.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,14);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b14.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,15);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b15.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,16);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b16.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,17);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b17.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,18);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b18.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,19);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b19.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,20);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b20.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,21);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b21.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,22);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b22.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,23);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b23.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,24);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b24.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,25);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b25.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,26);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b26.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,27);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b27.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,28);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b28.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,29);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b29.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,30);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b30.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,31);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b31.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,32);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}b32.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		btnSubmit.addActionListener(this);
		btnCancel.addActionListener(this);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new BikeParkingLot();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSubmit)
		{
			
			new bikelogin();
			dispose();
		}
		else if(e.getSource()==btnCancel)
		{
			new Beforefirstpage();
			dispose();
		}
		// TODO Auto-generated method stub
		
	}
}
