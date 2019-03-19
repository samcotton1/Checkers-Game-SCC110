import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square {
	static int x = 1;
	JButton CheckerBoard = new JButton(); 						// Creates a new JButton Called CheckerBoard
  
  public int PiecePosition = 0;
  private int positionX; 										// Creates a variable for the X position called positionX
  private int positionY;										// Creates a variable for the Y position called positionY
  private int width = 100;										// Creates a variable for the width of the square called width
  private int height = 100;										// Creates a variable for the height of the square called height					
  public int BoardStatus = 0;									// Creates a variable for the status of if a piece is on the button Square // this can be used in a if statement 
  
    public Square( JPanel backBoard, int x, int y, int SquareColour, int Piece, int Counter) {
    	BoardStatus = Piece;									//Takes the Variable Piece from the Board class and stores it in the PieceStatus to be used to see what needs to go in each button
    	PiecePosition = Counter;    							//Takes the counter variable and stores it in PiecePosition to be used a an ID for each button 
    	
	  if (SquareColour % 2 == 1) { 								// Determines if the variable colour is odd or even
		  BoardStatus = 1;										//1 means that the status is a blank black board piece 
		 BlackBoard(); 											
		  
	  }else {
		  	BoardStatus = 2;
		  	WhiteBoard();
		  	// White Piece Input Onto Board 
			if (BoardStatus == 2 && PiecePosition >= 41) {
				  BoardStatus = 3;
				  WhitePiece();
			  } 
			//Red Piece Input Onto Board
			if (BoardStatus == 2 && PiecePosition <= 24) {
				//BoardStatus = 4;
				  //RedPiece();	
			}
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
	
	public int GetX() {
		
		return positionX;
		
	}
	
	public int GetY() {
		
		return positionY;
		
	}	
	public JButton getButton() {
		
		return CheckerBoard;
		
	}
	
	public static void main(String args[]) {
		
		Board g = new Board();
		
	}

	public static void MoveTo(Square squareBoard1, Square squareBoard2) {
		 int SB1Pp = 0; 
		 int SB2Pp = 0;
		 int SB1PosX = 0;
		 int SB1PosY = 0;
		 int SB2PosX = 0;
		 int SB2PosY = 0;
		 
		 
		SB1PosX = squareBoard1.positionX;
		SB1PosY = squareBoard1.positionY;
		
		SB2PosX = squareBoard2.positionX;
		SB2PosY = squareBoard2.positionY;	
				
		squareBoard2.CheckerBoard.setLocation(SB1PosX, SB1PosY);
		squareBoard1.CheckerBoard.setLocation(SB2PosX, SB2PosY);
		 
		squareBoard1 = null;
		squareBoard2 = null;
		
	}
 }