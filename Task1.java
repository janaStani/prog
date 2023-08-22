import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Task1 extends JFrame{
	JButton b1, b2;
	public Task1() {
		setSize(400, 200);
		b1 = new JButton("Close program");
		b2 = new JButton("16");
		setLayout(new GridLayout(1, 2));
		Listener1 l1 = new Listener1();
		Listener2 l2 = new Listener2();
		b1.addActionListener(l1);
		b2.addActionListener(l2);
		add(b1);
		add(b2);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task1 tt = new Task1();

	}
	
	class Listener1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	
	class Listener2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String tmp = b2.getText();
			int tmpInt = Integer.parseInt(tmp);
			if(tmpInt > 1) {
				tmpInt = tmpInt / 2;
			}
			b2.setText("" + tmpInt);
		}
	}

}
