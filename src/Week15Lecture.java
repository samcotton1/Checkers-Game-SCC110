import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Week15Lecture implements ActionListener {

	public static void main(String[] args) {
		Week15Lecture g = new Week15Lecture();
		
	}
	
	public Week15Lecture() {
		JFrame window = new JFrame();
		JPanel panel = new JPanel();
		
		JButton button = new JButton ("<");
		JButton button2 = new JButton (">");
		JButton button3 = new JButton ("=");
		JButton button4 = new JButton ("Ask me a new question");
				
		// BorderLayout B = new BorderLayout(); 
		GridLayout g  = new GridLayout(3,3);
		
		button.setLocation(10,10);
		
		button.addActionListener(this);
		
		panel.setLayout(g);
		
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		window.setContentPane(panel);
		
		window.setTitle("Hello my Dudes");
		window.setSize(750, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public void actionPerformed (ActionEvent e) {
		
		System.out.println("You Pressed Me!");
	}
	
}

