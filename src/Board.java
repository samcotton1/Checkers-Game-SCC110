import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener {

	public static void main(String args[]) {
		Board g = new Board();
}
	
	private JFrame frame = new JFrame();
	private JPanel backBoard = new JPanel();
	private int x = 0; 
	private int y = 0;
	
	int PieceColour = 1;
	int PieceStatus = 0;
	
	public Board(){
		
		int counter = 1;
		int offset = 0; 
		
			frame.setTitle("Checkers");
			backBoard.setLayout(null);
			Square[] SquareBoard = new Square[65];
			
			for (int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					
					offset++;
					SquareBoard[counter] = new Square(backBoard, x, y, offset, PieceColour, counter);
					SquareBoard[counter].returnButton().addActionListener(this);
					counter++;
					x += 100;
				}
				x = 0; 
				y += 100; 
				offset++;
				PieceColour++;

								
			}
			frame.setContentPane(backBoard);
			frame.setSize(900, 900);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
			
				
			}

			public void actionPerformed(ActionEvent e){
			int PosX  = Square.getX();
		    System.out.println(PosX);
		    
		    int PosY = Square.getY();
		    System.out.println(PosY);
	
		}	
	}
