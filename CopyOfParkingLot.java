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
import javax.swing.ButtonGroup;

public class CopyOfParkingLot extends JDialog implements ActionListener {
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	public CopyOfParkingLot() {
		getContentPane().setLayout(null);
		
		JLabel lblEntry = new JLabel("ENTRY");
		lblEntry.setBackground(Color.WHITE);
		lblEntry.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblEntry.setBounds(12, 171, 98, 36);
		getContentPane().add(lblEntry);
		
		JLabel lblExit = new JLabel("EXIT");
		lblExit.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblExit.setBounds(706, 416, 62, 36);
		getContentPane().add(lblExit);
		
		JLabel lblBikes = new JLabel("BIKES");
		lblBikes.setForeground(Color.GRAY);
		lblBikes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBikes.setBounds(119, 20, 56, 16);
		getContentPane().add(lblBikes);
		
		JLabel lblBikes_1 = new JLabel("BIKES");
		lblBikes_1.setForeground(Color.GRAY);
		lblBikes_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBikes_1.setBounds(119, 361, 56, 16);
		getContentPane().add(lblBikes_1);
		
		JRadioButton radioButton = new JRadioButton(" ");
		radioButton.setEnabled(false);
		radioButton.setSelected(true);
		radioButton.setBounds(187, 19, 25, 24);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton(" ");
		radioButton_1.setSelected(true);
		radioButton_1.setEnabled(false);
		radioButton_1.setBounds(216, 19, 25, 24);
		getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton(" ");
		radioButton_2.setEnabled(false);
		radioButton_2.setSelected(true);
		radioButton_2.setBounds(245, 19, 25, 24);
		getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_18 = new JRadioButton(" ");
		buttonGroup.add(radioButton_18);
		radioButton_18.setBounds(187, 98, 25, 24);
		getContentPane().add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton(" ");
		buttonGroup.add(radioButton_19);
		radioButton_19.setBounds(216, 98, 25, 24);
		getContentPane().add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton(" ");
		buttonGroup.add(radioButton_20);
		radioButton_20.setBounds(245, 98, 25, 24);
		getContentPane().add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton(" ");
		buttonGroup.add(radioButton_21);
		radioButton_21.setBounds(274, 98, 25, 24);
		getContentPane().add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton(" ");
		buttonGroup.add(radioButton_22);
		radioButton_22.setBounds(303, 98, 25, 24);
		getContentPane().add(radioButton_22);
		
		JRadioButton radioButton_23 = new JRadioButton(" ");
		buttonGroup.add(radioButton_23);
		radioButton_23.setBounds(332, 98, 25, 24);
		getContentPane().add(radioButton_23);
		
		JRadioButton radioButton_24 = new JRadioButton(" ");
		buttonGroup.add(radioButton_24);
		radioButton_24.setBounds(361, 98, 25, 24);
		getContentPane().add(radioButton_24);
		
		JRadioButton radioButton_25 = new JRadioButton(" ");
		buttonGroup.add(radioButton_25);
		radioButton_25.setBounds(390, 98, 25, 24);
		getContentPane().add(radioButton_25);
		
		JRadioButton radioButton_26 = new JRadioButton(" ");
		buttonGroup.add(radioButton_26);
		radioButton_26.setBounds(419, 98, 25, 24);
		getContentPane().add(radioButton_26);
		
		JRadioButton radioButton_27 = new JRadioButton(" ");
		buttonGroup.add(radioButton_27);
		radioButton_27.setBounds(448, 98, 25, 24);
		getContentPane().add(radioButton_27);
		
		JRadioButton radioButton_28 = new JRadioButton(" ");
		buttonGroup.add(radioButton_28);
		radioButton_28.setBounds(477, 98, 25, 24);
		getContentPane().add(radioButton_28);
		
		JRadioButton radioButton_29 = new JRadioButton(" ");
		buttonGroup.add(radioButton_29);
		radioButton_29.setBounds(506, 98, 25, 24);
		getContentPane().add(radioButton_29);
		
		JRadioButton radioButton_30 = new JRadioButton(" ");
		buttonGroup.add(radioButton_30);
		radioButton_30.setBounds(535, 98, 25, 24);
		getContentPane().add(radioButton_30);
		
		JRadioButton radioButton_31 = new JRadioButton(" ");
		buttonGroup.add(radioButton_31);
		radioButton_31.setBounds(564, 98, 25, 24);
		getContentPane().add(radioButton_31);
		
		JRadioButton radioButton_32 = new JRadioButton(" ");
		buttonGroup.add(radioButton_32);
		radioButton_32.setBounds(593, 98, 25, 24);
		getContentPane().add(radioButton_32);
		
		JRadioButton radioButton_33 = new JRadioButton(" ");
		buttonGroup.add(radioButton_33);
		radioButton_33.setBounds(622, 98, 25, 24);
		getContentPane().add(radioButton_33);
		
		JRadioButton radioButton_34 = new JRadioButton(" ");
		buttonGroup.add(radioButton_34);
		radioButton_34.setBounds(187, 127, 25, 24);
		getContentPane().add(radioButton_34);
		
		JRadioButton radioButton_35 = new JRadioButton(" ");
		buttonGroup.add(radioButton_35);
		radioButton_35.setBounds(216, 127, 25, 24);
		getContentPane().add(radioButton_35);
		
		JRadioButton radioButton_36 = new JRadioButton(" ");
		buttonGroup.add(radioButton_36);
		radioButton_36.setBounds(245, 127, 25, 24);
		getContentPane().add(radioButton_36);
		
		JRadioButton radioButton_37 = new JRadioButton(" ");
		buttonGroup.add(radioButton_37);
		radioButton_37.setBounds(274, 127, 25, 24);
		getContentPane().add(radioButton_37);
		
		JRadioButton radioButton_38 = new JRadioButton(" ");
		buttonGroup.add(radioButton_38);
		radioButton_38.setBounds(303, 127, 25, 24);
		getContentPane().add(radioButton_38);
		
		JRadioButton radioButton_39 = new JRadioButton(" ");
		buttonGroup.add(radioButton_39);
		radioButton_39.setBounds(332, 127, 25, 24);
		getContentPane().add(radioButton_39);
		
		JRadioButton radioButton_40 = new JRadioButton(" ");
		buttonGroup.add(radioButton_40);
		radioButton_40.setBounds(361, 127, 25, 24);
		getContentPane().add(radioButton_40);
		
		JRadioButton radioButton_41 = new JRadioButton(" ");
		buttonGroup.add(radioButton_41);
		radioButton_41.setBounds(390, 127, 25, 24);
		getContentPane().add(radioButton_41);
		
		JRadioButton radioButton_42 = new JRadioButton(" ");
		buttonGroup.add(radioButton_42);
		radioButton_42.setBounds(419, 127, 25, 24);
		getContentPane().add(radioButton_42);
		
		JRadioButton radioButton_43 = new JRadioButton(" ");
		buttonGroup.add(radioButton_43);
		radioButton_43.setBounds(448, 127, 25, 24);
		getContentPane().add(radioButton_43);
		
		JRadioButton radioButton_44 = new JRadioButton(" ");
		buttonGroup.add(radioButton_44);
		radioButton_44.setBounds(477, 127, 25, 24);
		getContentPane().add(radioButton_44);
		
		JRadioButton radioButton_45 = new JRadioButton(" ");
		buttonGroup.add(radioButton_45);
		radioButton_45.setBounds(506, 127, 25, 24);
		getContentPane().add(radioButton_45);
		
		JRadioButton radioButton_46 = new JRadioButton(" ");
		buttonGroup.add(radioButton_46);
		radioButton_46.setBounds(535, 127, 25, 24);
		getContentPane().add(radioButton_46);
		
		JRadioButton radioButton_47 = new JRadioButton(" ");
		buttonGroup.add(radioButton_47);
		radioButton_47.setBounds(564, 127, 25, 24);
		getContentPane().add(radioButton_47);
		
		JRadioButton radioButton_48 = new JRadioButton(" ");
		buttonGroup.add(radioButton_48);
		radioButton_48.setBounds(593, 127, 25, 24);
		getContentPane().add(radioButton_48);
		
		JRadioButton radioButton_49 = new JRadioButton(" ");
		buttonGroup.add(radioButton_49);
		radioButton_49.setBounds(622, 127, 25, 24);
		getContentPane().add(radioButton_49);
		
		JRadioButton radioButton_50 = new JRadioButton(" ");
		buttonGroup.add(radioButton_50);
		radioButton_50.setBounds(187, 236, 25, 24);
		getContentPane().add(radioButton_50);
		
		JRadioButton radioButton_51 = new JRadioButton(" ");
		buttonGroup.add(radioButton_51);
		radioButton_51.setBounds(216, 236, 25, 24);
		getContentPane().add(radioButton_51);
		
		JRadioButton radioButton_52 = new JRadioButton(" ");
		buttonGroup.add(radioButton_52);
		radioButton_52.setBounds(245, 236, 25, 24);
		getContentPane().add(radioButton_52);
		
		JRadioButton radioButton_53 = new JRadioButton(" ");
		buttonGroup.add(radioButton_53);
		radioButton_53.setBounds(274, 236, 25, 24);
		getContentPane().add(radioButton_53);
		
		JRadioButton radioButton_54 = new JRadioButton(" ");
		buttonGroup.add(radioButton_54);
		radioButton_54.setBounds(303, 236, 25, 24);
		getContentPane().add(radioButton_54);
		
		JRadioButton radioButton_55 = new JRadioButton(" ");
		buttonGroup.add(radioButton_55);
		radioButton_55.setBounds(332, 236, 25, 24);
		getContentPane().add(radioButton_55);
		
		JRadioButton radioButton_56 = new JRadioButton(" ");
		buttonGroup.add(radioButton_56);
		radioButton_56.setBounds(361, 236, 25, 24);
		getContentPane().add(radioButton_56);
		
		JRadioButton radioButton_57 = new JRadioButton(" ");
		buttonGroup.add(radioButton_57);
		radioButton_57.setBounds(390, 236, 25, 24);
		getContentPane().add(radioButton_57);
		
		JRadioButton radioButton_58 = new JRadioButton(" ");
		buttonGroup.add(radioButton_58);
		radioButton_58.setBounds(419, 236, 25, 24);
		getContentPane().add(radioButton_58);
		
		JRadioButton radioButton_59 = new JRadioButton(" ");
		buttonGroup.add(radioButton_59);
		radioButton_59.setBounds(448, 236, 25, 24);
		getContentPane().add(radioButton_59);
		
		JRadioButton radioButton_60 = new JRadioButton(" ");
		buttonGroup.add(radioButton_60);
		radioButton_60.setBounds(477, 236, 25, 24);
		getContentPane().add(radioButton_60);
		
		JRadioButton radioButton_61 = new JRadioButton(" ");
		buttonGroup.add(radioButton_61);
		radioButton_61.setBounds(506, 236, 25, 24);
		getContentPane().add(radioButton_61);
		
		JRadioButton radioButton_62 = new JRadioButton(" ");
		buttonGroup.add(radioButton_62);
		radioButton_62.setBounds(535, 236, 25, 24);
		getContentPane().add(radioButton_62);
		
		JRadioButton radioButton_63 = new JRadioButton(" ");
		buttonGroup.add(radioButton_63);
		radioButton_63.setBounds(564, 236, 25, 24);
		getContentPane().add(radioButton_63);
		
		JRadioButton radioButton_64 = new JRadioButton(" ");
		buttonGroup.add(radioButton_64);
		radioButton_64.setBounds(593, 236, 25, 24);
		getContentPane().add(radioButton_64);
		
		JRadioButton radioButton_65 = new JRadioButton(" ");
		buttonGroup.add(radioButton_65);
		radioButton_65.setBounds(622, 236, 25, 24);
		getContentPane().add(radioButton_65);
		
		JRadioButton radioButton_66 = new JRadioButton(" ");
		buttonGroup.add(radioButton_66);
		radioButton_66.setBounds(187, 265, 25, 24);
		getContentPane().add(radioButton_66);
		
		JRadioButton radioButton_67 = new JRadioButton(" ");
		buttonGroup.add(radioButton_67);
		radioButton_67.setBounds(216, 265, 25, 24);
		getContentPane().add(radioButton_67);
		
		JRadioButton radioButton_68 = new JRadioButton(" ");
		buttonGroup.add(radioButton_68);
		radioButton_68.setBounds(245, 265, 25, 24);
		getContentPane().add(radioButton_68);
		
		JRadioButton radioButton_69 = new JRadioButton(" ");
		buttonGroup.add(radioButton_69);
		radioButton_69.setBounds(274, 265, 25, 24);
		getContentPane().add(radioButton_69);
		
		JRadioButton radioButton_70 = new JRadioButton(" ");
		buttonGroup.add(radioButton_70);
		radioButton_70.setBounds(303, 265, 25, 24);
		getContentPane().add(radioButton_70);
		
		JRadioButton radioButton_71 = new JRadioButton(" ");
		buttonGroup.add(radioButton_71);
		radioButton_71.setBounds(332, 265, 25, 24);
		getContentPane().add(radioButton_71);
		
		JRadioButton radioButton_72 = new JRadioButton(" ");
		buttonGroup.add(radioButton_72);
		radioButton_72.setBounds(361, 265, 25, 24);
		getContentPane().add(radioButton_72);
		
		JRadioButton radioButton_73 = new JRadioButton(" ");
		buttonGroup.add(radioButton_73);
		radioButton_73.setBounds(390, 265, 25, 24);
		getContentPane().add(radioButton_73);
		
		JRadioButton radioButton_74 = new JRadioButton(" ");
		buttonGroup.add(radioButton_74);
		radioButton_74.setBounds(419, 265, 25, 24);
		getContentPane().add(radioButton_74);
		
		JRadioButton radioButton_75 = new JRadioButton(" ");
		buttonGroup.add(radioButton_75);
		radioButton_75.setBounds(448, 265, 25, 24);
		getContentPane().add(radioButton_75);
		
		JRadioButton radioButton_76 = new JRadioButton(" ");
		buttonGroup.add(radioButton_76);
		radioButton_76.setBounds(477, 265, 25, 24);
		getContentPane().add(radioButton_76);
		
		JRadioButton radioButton_77 = new JRadioButton(" ");
		buttonGroup.add(radioButton_77);
		radioButton_77.setBounds(506, 265, 25, 24);
		getContentPane().add(radioButton_77);
		
		JRadioButton radioButton_78 = new JRadioButton(" ");
		buttonGroup.add(radioButton_78);
		radioButton_78.setBounds(535, 265, 25, 24);
		getContentPane().add(radioButton_78);
		
		JRadioButton radioButton_79 = new JRadioButton(" ");
		buttonGroup.add(radioButton_79);
		radioButton_79.setBounds(564, 265, 25, 24);
		getContentPane().add(radioButton_79);
		
		JRadioButton radioButton_80 = new JRadioButton(" ");
		buttonGroup.add(radioButton_80);
		radioButton_80.setBounds(593, 265, 25, 24);
		getContentPane().add(radioButton_80);
		
		JRadioButton radioButton_81 = new JRadioButton(" ");
		buttonGroup.add(radioButton_81);
		radioButton_81.setBounds(622, 265, 25, 24);
		getContentPane().add(radioButton_81);
		
		JButton button_1 = new JButton(" ");
		button_1.setBounds(181, 159, 466, 4);
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton(" ");
		button_2.setBounds(181, 85, 466, 4);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton(" ");
		button_3.setBounds(187, 299, 466, 4);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton(" ");
		button_4.setBounds(181, 223, 466, 4);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton(" ");
		button_5.setBounds(187, 349, 466, 4);
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton(" ");
		button_6.setBounds(181, 52, 466, 4);
		getContentPane().add(button_6);
		
		JLabel lblCars = new JLabel("CARS");
		lblCars.setForeground(Color.GRAY);
		lblCars.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCars.setBounds(119, 116, 56, 16);
		getContentPane().add(lblCars);
		
		JLabel lblCars_1 = new JLabel("CARS");
		lblCars_1.setForeground(Color.GRAY);
		lblCars_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCars_1.setBounds(119, 251, 56, 16);
		getContentPane().add(lblCars_1);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(347, 426, 97, 25);
		getContentPane().add(btnSubmit);
		
		JRadioButton radioButton_16 = new JRadioButton(" ");
		radioButton_16.setSelected(true);
		radioButton_16.setEnabled(false);
		radioButton_16.setBounds(622, 19, 25, 24);
		getContentPane().add(radioButton_16);
		
		JRadioButton radioButton_3 = new JRadioButton(" ");
		radioButton_3.setSelected(true);
		radioButton_3.setEnabled(false);
		radioButton_3.setBounds(274, 19, 25, 24);
		getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton(" ");
		radioButton_4.setSelected(true);
		radioButton_4.setEnabled(false);
		radioButton_4.setBounds(303, 19, 25, 24);
		getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton(" ");
		radioButton_5.setSelected(true);
		radioButton_5.setEnabled(false);
		radioButton_5.setBounds(332, 19, 25, 24);
		getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton(" ");
		radioButton_6.setSelected(true);
		radioButton_6.setEnabled(false);
		radioButton_6.setBounds(361, 19, 25, 24);
		getContentPane().add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton(" ");
		radioButton_7.setSelected(true);
		radioButton_7.setEnabled(false);
		radioButton_7.setBounds(390, 19, 25, 24);
		getContentPane().add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton(" ");
		radioButton_8.setSelected(true);
		radioButton_8.setEnabled(false);
		radioButton_8.setBounds(419, 19, 25, 24);
		getContentPane().add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton(" ");
		radioButton_9.setSelected(true);
		radioButton_9.setEnabled(false);
		radioButton_9.setBounds(448, 20, 25, 24);
		getContentPane().add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton(" ");
		radioButton_10.setSelected(true);
		radioButton_10.setEnabled(false);
		radioButton_10.setBounds(477, 20, 25, 24);
		getContentPane().add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton(" ");
		radioButton_11.setSelected(true);
		radioButton_11.setEnabled(false);
		radioButton_11.setBounds(506, 20, 25, 24);
		getContentPane().add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton(" ");
		radioButton_12.setSelected(true);
		radioButton_12.setEnabled(false);
		radioButton_12.setBounds(535, 20, 25, 24);
		getContentPane().add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton(" ");
		radioButton_13.setSelected(true);
		radioButton_13.setEnabled(false);
		radioButton_13.setBounds(564, 20, 25, 24);
		getContentPane().add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton(" ");
		radioButton_14.setSelected(true);
		radioButton_14.setEnabled(false);
		radioButton_14.setBounds(593, 20, 25, 24);
		getContentPane().add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton(" ");
		radioButton_15.setSelected(true);
		radioButton_15.setEnabled(false);
		radioButton_15.setBounds(187, 361, 25, 24);
		getContentPane().add(radioButton_15);
		
		JRadioButton radioButton_17 = new JRadioButton(" ");
		radioButton_17.setSelected(true);
		radioButton_17.setEnabled(false);
		radioButton_17.setBounds(216, 361, 25, 24);
		getContentPane().add(radioButton_17);
		
		JRadioButton radioButton_82 = new JRadioButton(" ");
		radioButton_82.setSelected(true);
		radioButton_82.setEnabled(false);
		radioButton_82.setBounds(245, 361, 25, 24);
		getContentPane().add(radioButton_82);
		
		JRadioButton radioButton_83 = new JRadioButton(" ");
		radioButton_83.setSelected(true);
		radioButton_83.setEnabled(false);
		radioButton_83.setBounds(274, 361, 25, 24);
		getContentPane().add(radioButton_83);
		
		JRadioButton radioButton_84 = new JRadioButton(" ");
		radioButton_84.setSelected(true);
		radioButton_84.setEnabled(false);
		radioButton_84.setBounds(303, 361, 25, 24);
		getContentPane().add(radioButton_84);
		
		JRadioButton radioButton_85 = new JRadioButton(" ");
		radioButton_85.setSelected(true);
		radioButton_85.setEnabled(false);
		radioButton_85.setBounds(332, 361, 25, 24);
		getContentPane().add(radioButton_85);
		
		JRadioButton radioButton_86 = new JRadioButton(" ");
		radioButton_86.setSelected(true);
		radioButton_86.setEnabled(false);
		radioButton_86.setBounds(361, 361, 25, 24);
		getContentPane().add(radioButton_86);
		
		JRadioButton radioButton_87 = new JRadioButton(" ");
		radioButton_87.setSelected(true);
		radioButton_87.setEnabled(false);
		radioButton_87.setBounds(390, 361, 25, 24);
		getContentPane().add(radioButton_87);
		
		JRadioButton radioButton_88 = new JRadioButton(" ");
		radioButton_88.setSelected(true);
		radioButton_88.setEnabled(false);
		radioButton_88.setBounds(419, 361, 25, 24);
		getContentPane().add(radioButton_88);
		
		JRadioButton radioButton_89 = new JRadioButton(" ");
		radioButton_89.setSelected(true);
		radioButton_89.setEnabled(false);
		radioButton_89.setBounds(448, 361, 25, 24);
		getContentPane().add(radioButton_89);
		
		JRadioButton radioButton_90 = new JRadioButton(" ");
		radioButton_90.setSelected(true);
		radioButton_90.setEnabled(false);
		radioButton_90.setBounds(477, 361, 25, 24);
		getContentPane().add(radioButton_90);
		
		JRadioButton radioButton_91 = new JRadioButton(" ");
		radioButton_91.setSelected(true);
		radioButton_91.setEnabled(false);
		radioButton_91.setBounds(506, 361, 25, 24);
		getContentPane().add(radioButton_91);
		
		JRadioButton radioButton_92 = new JRadioButton(" ");
		radioButton_92.setSelected(true);
		radioButton_92.setEnabled(false);
		radioButton_92.setBounds(535, 361, 25, 24);
		getContentPane().add(radioButton_92);
		
		JRadioButton radioButton_93 = new JRadioButton(" ");
		radioButton_93.setSelected(true);
		radioButton_93.setEnabled(false);
		radioButton_93.setBounds(564, 361, 25, 24);
		getContentPane().add(radioButton_93);
		
		JRadioButton radioButton_94 = new JRadioButton(" ");
		radioButton_94.setSelected(true);
		radioButton_94.setEnabled(false);
		radioButton_94.setBounds(593, 361, 25, 24);
		getContentPane().add(radioButton_94);
		
		JRadioButton radioButton_95 = new JRadioButton(" ");
		radioButton_95.setSelected(true);
		radioButton_95.setEnabled(false);
		radioButton_95.setBounds(622, 361, 25, 24);
		getContentPane().add(radioButton_95);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setBounds(0, 0, 805, 481);
		getContentPane().add(lblNewLabel);
		setVisible(true);
		setSize(823,528);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new CopyOfParkingLot();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
