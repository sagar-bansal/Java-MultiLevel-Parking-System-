package Pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Beforefirstpage extends JDialog implements ActionListener{
	
	JButton entry,exitt;

	public Beforefirstpage() {
		getContentPane().setLayout(null);
		
		entry = new JButton("ENTRY");
		entry.setBounds(136, 60, 97, 25);
		getContentPane().add(entry);
		entry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		exitt = new JButton("EXIT");
		exitt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		entry.addActionListener(this);
		exitt.addActionListener(this);
		exitt.setBounds(136, 164, 97, 25);
		getContentPane().add(exitt);
		setVisible(true);
		setSize(300, 300);
		
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Beforefirstpage();
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		if(ob==entry)
		{
			new FirstPage();
			dispose();
		}
		else if(ob==exitt)
		{
			
				String a=JOptionPane.showInputDialog(null, "enter token number");
				//int b=Integer.parseInt(a);
				
				//new EmployeeUpdate(b);
			
		}
		// TODO Auto-generated method stub
		
	}
}
