import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square {
  JButton CheckerBoard = new JButton(); // Creates a new JButton Called CheckerBoard
  public int PiecePosition = 0;
  private int positionX; 						// Creates a variable for the X position called positionX
  private int positionY;						// Creates a variable for the Y position called positionY
  private int width = 100;						// Creates a variable for the width of the square called width
  private int height = 100;						// Creates a variable for the height of the square called height					
  int PieceStatus = 0;					// Creates a variable for the status of if a piece is on the button Square // this can be used in a if statement 
  
  int ButtonPositionX = 0;
  int ButtonPositionY = 0;
  
    public Square( JPanel backBoard, int x, int y, int SquareColour, int Piece, int Counter) {
    	PieceStatus = Piece;
    	PiecePosition = Counter;    	
    	
	  if (SquareColour % 2 == 0) { 			// Determines if the variable colour is odd or even
		  PieceStatus = 1;
		 BlackBoard(); 
		  
	  }else {
		  	PieceStatus = 2;
		  	WhiteBoard();
		  	// White Piece Input Onto Board 
			if (PieceStatus == 2 && PiecePosition >= 40) {
				  PieceStatus = 3;
				  WhitePiece();
			  } 
			//Red Piece Input Onto Board
			//if (PieceStatus == 2 && PiecePosition <= 25) {
				//PieceStatus = 4;
				//  RedPiece();	
			//}
	  }
	  CheckerBoard.setSize(width, height);
	  positionX = x;
	  positionY = y;
  	 // System.out.println(positionX);
      //System.out.println(positionY);
	  CheckerBoard.setLocation(positionX, positionY);	
	  backBoard.add(CheckerBoard);
	  
    }
    
	private void BlackBoard() {
		
		ImageIcon BlackBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty2.png");
		 CheckerBoard = new JButton(BlackBoard); 
	}
	 
	private void WhiteBoard() {
		
		ImageIcon White = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
		CheckerBoard = new JButton(White);

	}
	
	public void WhitePiece() {
	
	Icon WhitePiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/white.png");
	CheckerBoard = new JButton(WhitePiece);
	
	}
	public void RedPiece() {
		
	Icon RedPiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/red.png");
	CheckerBoard = new JButton(RedPiece);
	
	}
	
	public JButton returnButton() 
	{
		
	     return CheckerBoard;
	  
	}
	
	public int GetPosition() {
		
		return PiecePosition;
		
	}
	
	public static void main(String args[]) {
		
		Board g = new Board();
		
	}

	public void addActionListener(Board board) {
		// TODO Auto-generated method stub
		
	}
 }