package Pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JButton;

public class FirstPage extends JDialog implements ActionListener {

	JButton car;
	JButton bike;
	public FirstPage() {
		getContentPane().setLayout(null);
		
		car = new JButton("CAR");
		car.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		car.setBounds(90, 78, 164, 52);
		getContentPane().add(car);
		
		
		bike = new JButton("BIKE");
		bike.setBounds(97, 164, 157, 52);
		getContentPane().add(bike);
		bike.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		car.addActionListener(this);
		bike.addActionListener(this);
		setVisible(true);
		setSize(400, 300);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		new FirstPage();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==car)
		{
			new Login();
			dispose();
		}
		if(ob==bike)
		{
			new Login();
			dispose();
		}
		// TODO Auto-generated method stub
		
	}
}
