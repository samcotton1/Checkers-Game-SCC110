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
			for (int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					
					SquareColour++;
					SquareBoard[counter] = new Square(backBoard, x, y, SquareColour, PieceColour, counter);
					SquareBoard[counter].GetButton().addActionListener(this);
					counter++;
					x += 100;
				}
				x = 0; 
				y += 100; 
				SquareColour++;
				PieceColour++;

								
			}
			
			backBoard.setLayout(null);
			frame.setTitle("Checkers");
			frame.setContentPane(backBoard);
			frame.setSize(900, 900);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
			
			
			}

			public void actionPerformed(ActionEvent e){
				
				for(int i = 1; i < SquareBoard.length; i++) {
					if(e.getSource() == SquareBoard[i].GetButton()) {
					
						int intArray[];    //declaring array
						intArray = new int[2];
						
						int j = 0;
						intArray[j] = i;
						intArray[j+1] = i;
						
						
						System.out.print(intArray[0] + "\n");
						System.out.print(intArray[1] + "\n");
						
						//Square.MoveTo(i);
						
						
					}
				}				
			}	
	}
