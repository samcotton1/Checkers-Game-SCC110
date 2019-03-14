import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener {

	public static void main(String args[]) {
		Board g = new Board();
}
	
	private JFrame frame = new JFrame();
	private JPanel backBoard = new JPanel();
	
	Square[] SquareBoard = new Square[65];
	
	private int x = 0;
	private int y = 0;
	
	private int SquareColour = 0; 
	private int counter = 1;
	
	private int PieceColour = 1;
	
	public Board(){
				
			frame.setTitle("Checkers");
			backBoard.setLayout(null);
			
			for (int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					
					SquareColour++;
					SquareBoard[counter] = new Square(backBoard, x, y, SquareColour, PieceColour, counter);
					SquareBoard[counter].addActionListener(this);
					SquareBoard[counter].setActionCommand(Integer.toString(i));
					counter++;
					x += 100;
				}
				x = 0; 
				y += 100; 
				SquareColour++;
				PieceColour++;

								
			}
			frame.setContentPane(backBoard);
			frame.setSize(900, 900);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );	
			}

			public void actionPerformed(ActionEvent e){
				
				System.out.println("1");				
				System.out.print(e.getSource());
				
				
				}	
	}
