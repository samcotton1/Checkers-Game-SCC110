import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square {
  JButton CheckerBoard = new JButton();							// Creates a new JButton Called CheckerBoard
		
  public int PiecePosition = 0;
  private int positionX; 										// Creates a variable for the X position called positionX
  private int positionY;										// Creates a variable for the Y position called positionY
  private int width = 100;										// Creates a variable for the width of the square called width
  private int height = 100;										// Creates a variable for the height of the square called height					
  public int BoardStatus = 0;									// Creates a variable for the status of if a piece is on the button Square // this can be used in a if statement 
  
  
    public Square( JPanel backBoard, int x, int y, int SquareColour, int Piece, int Counter) {
    	BoardStatus = Piece;									// Takes the Variable Piece from the Board class and stores it in the PieceStatus to be used to see what needs to go in each button
    	PiecePosition = Counter;    							// Takes the counter variable and stores it in PiecePosition to be used a an ID for each button 
    	
	  if (SquareColour % 2 == 1) { 								// Determines if the variable colour is odd or even
		  BoardStatus = 1;										// 1 means that the status is a blank black board piece 
		 BlackBoard(); 											// Calls the BlackBoard method 
		  
	  }else {
		  	BoardStatus = 2;									// 2 means that the status is a blank white board piece
		  	WhiteBoard();										// Calls the WhiteBoard method

			if (BoardStatus == 2 && PiecePosition >= 41) {		// White Piece Input Onto Board if statement is correct  
				  BoardStatus = 3;								// 3 means that it is has a WhitePiece then below has WhiteBoard as well  
				  WhitePiece();									// Calls the WhitePiece method 
			  } 
			if (BoardStatus == 2 && PiecePosition <= 24) { 		// Red Piece Input Onto Board if statement is correct
				BoardStatus = 4;								// 4 means that it is has a RedPiece then below has WhiteBoard as well 
				  RedPiece();									// Calls the RedPiece method
			}
	  }
	  CheckerBoard.setSize(width, height);						// Sets the width and height of each button
	  positionX = x;											// Sets x to positionX
	  positionY = y;											// Sets y to positionY
	  CheckerBoard.setLocation(positionX, positionY);			// Sets the location of each button to the CheckerBoard 
	  backBoard.add(CheckerBoard);								// Adds the new button saved as CheckerBoard to backBoard 
	  
    }
    
	private void BlackBoard() {									// Method BlackBoard
																// Creates the Icon BlackBoard 
		ImageIcon BlackBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty2.png");
		 CheckerBoard = new JButton(BlackBoard); 				// Adds the Icon BlackBoard to the CheckerBoard each time it gets the method 
	}
	 
	private void WhiteBoard() {									// Method WhiteBoard
																// Creates the Icon WhiteBoard
		ImageIcon WhiteBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
		CheckerBoard = new JButton(WhiteBoard);					// Adds the Icon WhiteBoard to the CheckerBoard each time it gets the called

	}
	
	public void WhitePiece() {									// Method WhitePiece
																// Creates the Icon WhitePiece
	Icon WhitePiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/white.png");
	CheckerBoard = new JButton(WhitePiece);						// Adds the Icon WhitePiece to the CheckerBoard each time it gets called 
	
	}
	public void RedPiece() {									// Method RedPiece
																// Creates the Icon RedPiece
	Icon RedPiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/red.png");
	CheckerBoard = new JButton(RedPiece);						// Adds the Icon RedPiece to the CheckerBoard each time it gets called 
	
	}
		
	public JButton getButton() {								// Method getButton 
		
		return CheckerBoard;									// Returns CheckerBoard to the Board.java file 
		
	}
	
	public static void main(String args[]) {
		
		Board g = new Board();									// Creates g which is a new Board for CheckerBoard to be Placed on 
		
	}
																// Method MoveTo which received squareBoard1 and squareBoard2
	public static void MoveTo(Square squareBoard1, Square squareBoard2) {
		
		 int x = 1;
		
		if(squareBoard1.BoardStatus == 3) {						// Checks to see if the BoardStatus of squareBoard1 is 3 
																// Checks if squareBoard2's PiecePosition + 7 or + 9 to squareBoard1's Piece Position
			if (squareBoard2.PiecePosition + 7 == squareBoard1.PiecePosition || squareBoard2.PiecePosition + 9 == squareBoard1.PiecePosition) {
				if( squareBoard1.BoardStatus < 4 && squareBoard2.BoardStatus < 4) {
					if (squareBoard1.BoardStatus == 3) {
						ImageIcon White = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
						squareBoard1.CheckerBoard.setIcon(White);
						squareBoard1.BoardStatus = 2;
					}

					if (squareBoard2.BoardStatus == 2) {
						ImageIcon WhitePiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/white.png");
						squareBoard2.CheckerBoard.setIcon(WhitePiece);
						squareBoard2.BoardStatus = 3;
					}
				}		
			}
		}
		if(squareBoard1.BoardStatus == 4) {
			
			if (squareBoard2.PiecePosition - 7 == squareBoard1.PiecePosition || squareBoard2.PiecePosition - 9 == squareBoard1.PiecePosition) {					if( squareBoard1.BoardStatus != 3 && squareBoard2.BoardStatus != 3) {	
				if (squareBoard1.BoardStatus == 4) {
						ImageIcon WhiteBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
						squareBoard1.CheckerBoard.setIcon(WhiteBoard);
						squareBoard1.BoardStatus = 2;
					}	
						
					if (squareBoard2.BoardStatus == 2) {
						ImageIcon RedPiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/red.png");
						squareBoard2.CheckerBoard.setIcon(RedPiece);
						squareBoard2.BoardStatus = 4;	
					}
				}			
			}	
		}
	}
}