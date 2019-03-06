import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board {

		private JFrame frame = new JFrame();
		private JPanel backBoard = new JPanel();
		private int x = 0; 
		private int y = 0; 
		
			
	public Board(){
				
			frame.setTitle("Checkers");
			backBoard.setLayout(null);
			Square[] sqs = new Square[64];
			int counter = 0;
			int offset = 0; 
			
			for (int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					
					offset++;
					sqs[counter] = new Square(backBoard, x, y, offset);
					counter++;
					x += 100;
					
				}
				
				x = 0; 
				y += 100; 
				offset++;
				
			}
			frame.setContentPane(backBoard);
			frame.setSize(900, 900);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
			
				
			}
	}
