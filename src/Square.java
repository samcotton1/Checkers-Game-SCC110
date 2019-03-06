import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square {
	public static void main(String args[]) {

		Board g = new Board();
	
	}
  private JButton CheckerBoard = new JButton(); // Creates a new JButton Called CheckerBoard
  private int positionX; 						// Creates a variable for the X position called positionX
  private int positionY;						// Creates a variable for the Y position called positionY
  private int width = 100;						// Creates a variable for the width of the square called width
  private int height = 100;						// Creates a variable for the height of the square called height					
  					
    public Square( JPanel backBoard, int x, int y, int colour) {
	  if (colour % 2 == 0) { 			// Determines if the variable colour is odd or even
		
		ImageIcon Black = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty2.png");
	    CheckerBoard = new JButton(Black);
			
	  }else {
			
			ImageIcon White = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
		    CheckerBoard = new JButton(White);
			
	  }
	  CheckerBoard.setSize(width, height);
	  positionX = x;
	  positionY = y;
	  CheckerBoard.setLocation(positionX, positionY);	
	  backBoard.add(CheckerBoard);
	}
}
