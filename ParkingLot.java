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

public class ParkingLot extends JDialog implements ActionListener {
	JLabel lblEntry,lblExit,lblBikes,lblBikes_1,lblCars,lblCars_1;
	JRadioButton  b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
	JRadioButton c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41,c42,c43,c44,c45,c46,c47,c48,c49,c50,c51,c52,c53,c54,c55,c56,c57,c58,c59,c60,c61,c62,c63,c64;
	JButton btnSubmit,btnCancel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public ParkingLot() {
		getContentPane().setLayout(null);
		setTitle("PARKING LOT");
		String st="select Blocked from parking_car where Token=?";
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
		b1.setEnabled(false);
		b1.setBounds(187, 19, 25, 24);
		getContentPane().add(b1);
		
		b2 = new JRadioButton(" ");
		b2.setEnabled(false);
		b2.setBounds(216, 19, 25, 24);
		getContentPane().add(b2);
		
		b3 = new JRadioButton(" ");
		b3.setEnabled(false);
		b3.setBounds(245, 19, 25, 24);
		getContentPane().add(b3);
		
		b4 = new JRadioButton(" ");
		b4.setEnabled(false);
		b4.setBounds(274, 19, 25, 24);
		getContentPane().add(b4);
		
		b5 = new JRadioButton(" ");
		b5.setEnabled(false);
		b5.setBounds(303, 19, 25, 24);
		getContentPane().add(b5);
		
		b6 = new JRadioButton(" ");
		b6.setEnabled(false);
		b6.setBounds(332, 19, 25, 24);
		getContentPane().add(b6);
		
		b7 = new JRadioButton(" ");
		b7.setEnabled(false);
		b7.setBounds(361, 19, 25, 24);
		getContentPane().add(b7);
		
		b8 = new JRadioButton(" ");
		b8.setEnabled(false);
		b8.setBounds(390, 19, 25, 24);
		getContentPane().add(b8);
		
		b9 = new JRadioButton(" ");
		b9.setEnabled(false);
		b9.setBounds(419, 19, 25, 24);
		getContentPane().add(b9);
		
		b10 = new JRadioButton(" ");
		b10.setEnabled(false);
		b10.setBounds(448, 19, 25, 24);
		getContentPane().add(b10);
		
		b11 = new JRadioButton(" ");
		b11.setEnabled(false);
		b11.setBounds(477, 19, 25, 24);
		getContentPane().add(b11);
		
		b12 = new JRadioButton(" ");
		b12.setEnabled(false);
		b12.setBounds(506, 19, 25, 24);
		getContentPane().add(b12);
		
		b13 = new JRadioButton(" ");
		b13.setEnabled(false);
		b13.setBounds(535, 19, 25, 24);
		getContentPane().add(b13);
		
		b14 = new JRadioButton(" ");
		b14.setEnabled(false);
		b14.setBounds(564, 19, 25, 24);
		getContentPane().add(b14);
		
		b15 = new JRadioButton(" ");
		b15.setEnabled(false);
		b15.setBounds(593, 19, 25, 24);
		getContentPane().add(b15);
		
		b16 = new JRadioButton(" ");
		b16.setEnabled(false);
		b16.setBounds(622, 19, 25, 24);
		getContentPane().add(b16);
		
		c1 = new JRadioButton(" ");
		buttonGroup.add(c1);
		c1.setBounds(187, 98, 25, 24);
		getContentPane().add(c1);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,1);
	        ResultSet rs=ps.executeQuery();
	        
	       
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c1.setEnabled(!k);
	        
	       
	        
	}
	catch(SQLException se){
	    se.printStackTrace();
	}

		
		c2 = new JRadioButton(" ");
		buttonGroup.add(c2);
		c2.setBounds(216, 98, 25, 24);
		getContentPane().add(c2);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,2);
	        ResultSet rs=ps.executeQuery();
	        
	       
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c2.setEnabled(!k);
	        
	       
	        
	}
	catch(SQLException se){
	    se.printStackTrace();
	}

		
		c3 = new JRadioButton(" ");
		buttonGroup.add(c3);
		c3.setBounds(245, 98, 25, 24);
		getContentPane().add(c3);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,3);
	        ResultSet rs=ps.executeQuery();
	        
	       
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c3.setEnabled(!k);
	        
	       
	        
	}
	catch(SQLException se){
	    se.printStackTrace();
	}

		
		c4 = new JRadioButton(" ");
		buttonGroup.add(c4);
		c4.setBounds(274, 98, 25, 24);
		getContentPane().add(c4);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,4);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c4.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}

		
		c5 = new JRadioButton(" ");
		buttonGroup.add(c5);
		c5.setBounds(303, 98, 25, 24);
		getContentPane().add(c5);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,5);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c5.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c6 = new JRadioButton(" ");
		buttonGroup.add(c6);
		c6.setBounds(332, 98, 25, 24);
		getContentPane().add(c6);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,6);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c6.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c7 = new JRadioButton(" ");
		buttonGroup.add(c7);
		c7.setBounds(361, 98, 25, 24);
		getContentPane().add(c7);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,7);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c7.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c8 = new JRadioButton(" ");
		buttonGroup.add(c8);
		c8.setBounds(390, 98, 25, 24);
		getContentPane().add(c8);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,8);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c8.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		c9 = new JRadioButton(" ");
		buttonGroup.add(c9);
		c9.setBounds(419, 98, 25, 24);
		getContentPane().add(c9);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,9);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c9.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c10 = new JRadioButton(" ");
		buttonGroup.add(c10);
		c10.setBounds(448, 98, 25, 24);
		getContentPane().add(c10);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,10);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c10.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		c11 = new JRadioButton(" ");
		buttonGroup.add(c11);
		c11.setBounds(477, 98, 25, 24);
		getContentPane().add(c11);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,11);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c11.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c12 = new JRadioButton(" ");
		buttonGroup.add(c12);
		c12.setBounds(506, 98, 25, 24);
		getContentPane().add(c12);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,12);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c12.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c13 = new JRadioButton(" ");
		buttonGroup.add(c13);
		c13.setBounds(535, 98, 25, 24);
		getContentPane().add(c13);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,13);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c13.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c14 = new JRadioButton(" ");
		buttonGroup.add(c14);
		c14.setBounds(564, 98, 25, 24);
		getContentPane().add(c14);
		try{
	        PreparedStatement ps=con.prepareStatement(st);
	        ps.setInt(1,14);
	        ResultSet rs=ps.executeQuery();
	        Boolean k=true;
	        rs.next();
	        int jj=rs.getInt("Blocked");
	        if(jj==0)
	        {
	            k=false;
	        }
	        c14.setEnabled(!k);
	        }
	catch(SQLException se){
	    se.printStackTrace();
	}
		
		c15 = new JRadioButton(" ");
		buttonGroup.add(c15);
		c15.setBounds(593, 98, 25, 24);
		getContentPane().add(c15);
		
		
		c16 = new JRadioButton(" ");
		buttonGroup.add(c16);
		c16.setBounds(622, 98, 25, 24);
		getContentPane().add(c16);
		
		c17 = new JRadioButton(" ");
		buttonGroup.add(c17);
		c17.setBounds(187, 127, 25, 24);
		getContentPane().add(c17);
		
		c18 = new JRadioButton(" ");
		buttonGroup.add(c18);
		c18.setBounds(216, 127, 25, 24);
		getContentPane().add(c18);
		
		c19 = new JRadioButton(" ");
		buttonGroup.add(c19);
		c19.setBounds(245, 127, 25, 24);
		getContentPane().add(c19);
		
		c20 = new JRadioButton(" ");
		buttonGroup.add(c20);
		c20.setBounds(274, 127, 25, 24);
		getContentPane().add(c20);
		
		c21 = new JRadioButton(" ");
		buttonGroup.add(c21);
		c21.setBounds(303, 127, 25, 24);
		getContentPane().add(c21);
		
		c22 = new JRadioButton(" ");
		buttonGroup.add(c22);
		c22.setBounds(332, 127, 25, 24);
		getContentPane().add(c22);
		
		c23 = new JRadioButton(" ");
		buttonGroup.add(c23);
		c23.setBounds(361, 127, 25, 24);
		getContentPane().add(c23);
		
		c24 = new JRadioButton(" ");
		buttonGroup.add(c24);
		c24.setBounds(390, 127, 25, 24);
		getContentPane().add(c24);
		
		c25 = new JRadioButton(" ");
		buttonGroup.add(c25);
		c25.setBounds(419, 127, 25, 24);
		getContentPane().add(c25);
		
		c26 = new JRadioButton(" ");
		buttonGroup.add(c26);
		c26.setBounds(448, 127, 25, 24);
		getContentPane().add(c26);
		
		c27 = new JRadioButton(" ");
		buttonGroup.add(c27);
		c27.setBounds(477, 127, 25, 24);
		getContentPane().add(c27);
		
		c28 = new JRadioButton(" ");
		buttonGroup.add(c28);
		c28.setBounds(506, 127, 25, 24);
		getContentPane().add(c28);
		
		c29 = new JRadioButton(" ");
		buttonGroup.add(c29);
		c29.setBounds(535, 127, 25, 24);
		getContentPane().add(c29);
		
		c30 = new JRadioButton(" ");
		buttonGroup.add(c30);
		c30.setBounds(564, 127, 25, 24);
		getContentPane().add(c30);
		
		c31 = new JRadioButton(" ");
		buttonGroup.add(c31);
		c31.setBounds(593, 127, 25, 24);
		getContentPane().add(c31);
		
		c32 = new JRadioButton(" ");
		buttonGroup.add(c32);
		c32.setBounds(622, 127, 25, 24);
		getContentPane().add(c32);
		
		c33 = new JRadioButton(" ");
		buttonGroup.add(c33);
		c33.setBounds(187, 237, 25, 24);
		getContentPane().add(c33);
		
		c34 = new JRadioButton(" ");
		buttonGroup.add(c34);
		c34.setBounds(216, 236, 25, 24);
		getContentPane().add(c34);
		
		c35 = new JRadioButton(" ");
		buttonGroup.add(c35);
		c35.setBounds(245, 236, 25, 24);
		getContentPane().add(c35);
		
		c36 = new JRadioButton(" ");
		buttonGroup.add(c36);
		c36.setBounds(274, 236, 25, 24);
		getContentPane().add(c36);
		
		c37 = new JRadioButton(" ");
		buttonGroup.add(c37);
		c37.setBounds(303, 236, 25, 24);
		getContentPane().add(c37);
		
		c38 = new JRadioButton(" ");
		buttonGroup.add(c38);
		c38.setBounds(332, 236, 25, 24);
		getContentPane().add(c38);
		
		c39 = new JRadioButton(" ");
		buttonGroup.add(c39);
		c39.setBounds(361, 236, 25, 24);
		getContentPane().add(c39);
		
		c40 = new JRadioButton(" ");
		buttonGroup.add(c40);
		c40.setBounds(390, 236, 25, 24);
		getContentPane().add(c40);
		
		c41 = new JRadioButton(" ");
		buttonGroup.add(c41);
		c41.setBounds(419, 236, 25, 24);
		getContentPane().add(c41);
		
		c42 = new JRadioButton(" ");
		buttonGroup.add(c42);
		c42.setBounds(448, 236, 25, 24);
		getContentPane().add(c42);
		
		c43 = new JRadioButton(" ");
		buttonGroup.add(c43);
		c43.setBounds(477, 236, 25, 24);
		getContentPane().add(c43);
		
		c44 = new JRadioButton(" ");
		buttonGroup.add(c44);
		c44.setBounds(506, 236, 25, 24);
		getContentPane().add(c44);
		
		c45 = new JRadioButton(" ");
		buttonGroup.add(c45);
		c45.setBounds(535, 236, 25, 24);
		getContentPane().add(c45);
		
		c46 = new JRadioButton(" ");
		buttonGroup.add(c46);
		c46.setBounds(564, 236, 25, 24);
		getContentPane().add(c46);
		
		c47 = new JRadioButton(" ");
		buttonGroup.add(c47);
		c47.setBounds(593, 236, 25, 24);
		getContentPane().add(c47);
		
		c48 = new JRadioButton(" ");
		buttonGroup.add(c48);
		c48.setBounds(622, 236, 25, 24);
		getContentPane().add(c48);
		
		c49 = new JRadioButton(" ");
		buttonGroup.add(c49);
		c49.setBounds(187, 265, 25, 24);
		getContentPane().add(c49);
		
		c50 = new JRadioButton(" ");
		buttonGroup.add(c50);
		c50.setBounds(216, 265, 25, 24);
		getContentPane().add(c50);
		
		c51 = new JRadioButton(" ");
		buttonGroup.add(c51);
		c51.setBounds(245, 265, 25, 24);
		getContentPane().add(c51);
		
		c52 = new JRadioButton(" ");
		buttonGroup.add(c52);
		c52.setBounds(274, 265, 25, 24);
		getContentPane().add(c52);
		
		c53 = new JRadioButton(" ");
		buttonGroup.add(c53);
		c53.setBounds(303, 265, 25, 24);
		getContentPane().add(c53);
		
		c54 = new JRadioButton(" ");
		buttonGroup.add(c54);
		c54.setBounds(332, 265, 25, 24);
		getContentPane().add(c54);
		
		c55 = new JRadioButton(" ");
		buttonGroup.add(c55);
		c55.setBounds(361, 265, 25, 24);
		getContentPane().add(c55);
		
		c56 = new JRadioButton(" ");
		buttonGroup.add(c56);
		c56.setBounds(390, 265, 25, 24);
		getContentPane().add(c56);
		
		c57 = new JRadioButton(" ");
		buttonGroup.add(c57);
		c57.setBounds(419, 265, 25, 24);
		getContentPane().add(c57);
		
		c58 = new JRadioButton(" ");
		buttonGroup.add(c58);
		c58.setBounds(448, 265, 25, 24);
		getContentPane().add(c58);
		
		c59 = new JRadioButton(" ");
		buttonGroup.add(c59);
		c59.setBounds(477, 265, 25, 24);
		getContentPane().add(c59);
		
		c60 = new JRadioButton(" ");
		buttonGroup.add(c60);
		c60.setBounds(506, 265, 25, 24);
		getContentPane().add(c60);
		
		c61 = new JRadioButton(" ");
		buttonGroup.add(c61);
		c61.setBounds(535, 265, 25, 24);
		getContentPane().add(c61);
		
		c62 = new JRadioButton(" ");
		buttonGroup.add(c62);
		c62.setBounds(564, 265, 25, 24);
		getContentPane().add(c62);
		
		c63 = new JRadioButton(" ");
		buttonGroup.add(c63);
		c63.setBounds(593, 265, 25, 24);
		getContentPane().add(c63);
		
		c64 = new JRadioButton(" ");
		buttonGroup.add(c64);
		c64.setBounds(622, 265, 25, 24);
		getContentPane().add(c64);
		
		JButton button_1 = new JButton(" ");
		button_1.setEnabled(false);
		getContentPane().add(b1);
		b1.setBounds(187, 19, 25, 24);
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
		b17.setEnabled(false);
		b17.setBounds(187, 360, 25, 24);
		getContentPane().add(b17);
		
		b18 = new JRadioButton(" ");
		b18.setEnabled(false);
		b18.setBounds(216, 360, 25, 24);
		getContentPane().add(b18);
		
		b19 = new JRadioButton(" ");
		b19.setEnabled(false);
		b19.setBounds(245, 360, 25, 24);
		getContentPane().add(b19);
		
		b20 = new JRadioButton(" ");
		b20.setEnabled(false);
		b20.setBounds(274, 360, 25, 24);
		getContentPane().add(b20);
		
		b21 = new JRadioButton(" ");
		b21.setEnabled(false);
		b21.setBounds(303, 360, 25, 24);
		getContentPane().add(b21);
		
		b22 = new JRadioButton(" ");
		b22.setEnabled(false);
		b22.setBounds(332, 360, 25, 24);
		getContentPane().add(b22);
		
		b23 = new JRadioButton(" ");
		b23.setEnabled(false);
		b23.setBounds(361, 360, 25, 24);
		getContentPane().add(b23);
		
		b24 = new JRadioButton(" ");
		b24.setEnabled(false);
		b24.setBounds(390, 360, 25, 24);
		getContentPane().add(b24);
		
		b25 = new JRadioButton(" ");
		b25.setEnabled(false);
		b25.setBounds(419, 360, 25, 24);
		getContentPane().add(b25);
		
		b26 = new JRadioButton(" ");
		b26.setEnabled(false);
		b26.setBounds(448, 360, 25, 24);
		getContentPane().add(b26);
		
		b27 = new JRadioButton(" ");
		b27.setEnabled(false);
		b27.setBounds(477, 360, 25, 24);
		getContentPane().add(b27);
		
		b28 = new JRadioButton(" ");
		b28.setEnabled(false);
		b28.setBounds(506, 360, 25, 24);
		getContentPane().add(b28);
		
		b29 = new JRadioButton(" ");
		b29.setEnabled(false);
		b29.setBounds(535, 360, 25, 24);
		getContentPane().add(b29);
		
		b30 = new JRadioButton(" ");
		b30.setEnabled(false);
		b30.setBounds(564, 360, 25, 24);
		getContentPane().add(b30);
		
		b31 = new JRadioButton(" ");
		b31.setEnabled(false);
		b31.setBounds(593, 360, 25, 24);
		getContentPane().add(b31);
		
		b32 = new JRadioButton(" ");
		b32.setEnabled(false);
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
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,15);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c15.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,16);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c16.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,17);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c17.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,18);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c18.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,19);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c19.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,20);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c20.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,21);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c21.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,22);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c22.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,23);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c23.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,24);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c24.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,25);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c25.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,26);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c26.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,27);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c27.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,28);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c28.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,29);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c29.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,30);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c30.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,31);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c31.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,32);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c32.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,33);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c33.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,34);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c34.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,35);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c35.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,36);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c36.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,37);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c37.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,38);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c38.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,39);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c39.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,40);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c40.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,41);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c41.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,42);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c42.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,43);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c43.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,44);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c44.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,45);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c45.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,46);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c46.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,47);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c47.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,48);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c48.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,49);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c49.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,50);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c50.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,51);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c51.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,52);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c52.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,53);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c53.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,54);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c54.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,55);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c55.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,56);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c56.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,57);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c57.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,58);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c58.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,59);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c59.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,60);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c60.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,61);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c61.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,62);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c62.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
		try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,63);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c63.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}
   	    try{ PreparedStatement ps=con.prepareStatement(st);ps.setInt(1,64);ResultSet rs=ps.executeQuery();Boolean k=true;rs.next();int jj=rs.getInt("Blocked");if(jj==0){k=false;}c64.setEnabled(!k);}catch(SQLException se){se.printStackTrace();}

		
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
		btnSubmit.addActionListener(this);
		btnCancel.addActionListener(this);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new ParkingLot();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSubmit)
		{
			new Login();
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
