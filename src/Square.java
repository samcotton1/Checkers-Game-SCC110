import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * 
 * Square.java class which creates
 * 1. A single square for the board class
 * 2. The methods which are used to create the square i.e. colours for each square 
 * 3. Gets the button for the action listener 
 * 4. Has the MoveTo method which moves two buttons to move the icon of the checker on each move
 * @author Samuel Cotton
 *
 */


public class Square {
  JButton CheckerBoard = new JButton();							// Creates a new JButton Called CheckerBoard
		
  public int PiecePosition = 0;
  private int positionX; 										// Creates a variable for the X position called positionX
  private int positionY;										// Creates a variable for the Y position called positionY
  private int width = 100;										// Creates a variable for the width of the square called width
  private int height = 100;										// Creates a variable for the height of the square called height					
  public int BoardStatus = 0;									// Creates a variable for the status of if a piece is on the button Square // this can be used in a if statement 
  
  /**
   * Public Method Square
   * @param backBoard
   * @param x
   * @param y
   * @param SquareColour
   * @param Piece
   * @param Counter
   * 
   * 
   * These Parameters are passed from the Board.java class which makes the 8 by 8 grid with the Button checkers on the board with the write pieces on the button
   * It then Sets the Location of the button and adds the Button to the Board.javas BackBoard
   */
  
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
    
    /**
     * BlackBoard Method
     * Creates the Image Icon BlackBoard and sets the Image Icon onto the CheckerBoard 
     */
	private void BlackBoard() {									// Method BlackBoard
																// Creates the Icon BlackBoard 
		ImageIcon BlackBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty2.png");
		 CheckerBoard = new JButton(BlackBoard); 				// Adds the Icon BlackBoard to the CheckerBoard each time it gets the method 
	}
	 
	/**
	 * WhiteBoard Method
	 * Create the Image Icon WhiteBoard and sets the Image Icon onto the CheckerBoard
	 */
	private void WhiteBoard() {									// Method WhiteBoard
																// Creates the Icon WhiteBoard
		ImageIcon WhiteBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
		CheckerBoard = new JButton(WhiteBoard);					// Adds the Icon WhiteBoard to the CheckerBoard each time it gets the called

	}
	
	/**
	 * WhitePiece Method
	 * Create the Image Icon WhitePiece and sets the Image Icon onto the CheckerBoard
	 */
	public void WhitePiece() {									// Method WhitePiece
																// Creates the Icon WhitePiece
	Icon WhitePiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/white.png");
	CheckerBoard = new JButton(WhitePiece);						// Adds the Icon WhitePiece to the CheckerBoard each time it gets called 
	
	/**
	 * RedPiece Method
	 * Create the Image Icon RedPiece and sets the Image Icon onto the CheckerBoard
	 */
	}
	public void RedPiece() {									// Method RedPiece
																// Creates the Icon RedPiece
	Icon RedPiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/red.png");
	CheckerBoard = new JButton(RedPiece);						// Adds the Icon RedPiece to the CheckerBoard each time it gets called 
	
	}
		
	/**
	 * JButton GetButton Method 
	 * Returns the CheckerBoard to the Board.java class for the action listener 
	 * @return
	 */
	public JButton getButton() {								// Method getButton 
		
		return CheckerBoard;									// Returns CheckerBoard to the Board.java file 
		
	}
	
	/**
	 * Main Method
	 * Creates a Board from the Board.java class
	 * @param args
	 */
	public static void main(String args[]) {
		
		Board g = new Board();									// Creates g which is a new Board for CheckerBoard to be Placed on 
		
	}
	
	/**															// Method MoveTo which received squareBoard1 and squareBoard2
	 * MoveTo Method
	 * Passed two squares from the Board.java class
	 * Runs checks to see which piece is being moved 
	 * Once it knows which pieces are being passed it checks the rules implemented and moves the piece if it can if not it doesn't 
	 * @param squareBoard1
	 * @param squareBoard2
	 */
	public static void MoveTo(Square squareBoard1, Square squareBoard2) {
		
		 int x = 1;
		
		if(squareBoard1.BoardStatus == 3) {						// Checks to see if the BoardStatus of squareBoard1 is 3 
																// Checks if squareBoard2's PiecePosition + 7 or + 9 to squareBoard1's Piece Position
			if (squareBoard2.PiecePosition + 7 == squareBoard1.PiecePosition || squareBoard2.PiecePosition + 9 == squareBoard1.PiecePosition) {
																// Check to see if the BoardStatus for both squareBoards is more than 5
				if( squareBoard1.BoardStatus < 4 && squareBoard2.BoardStatus < 4) {
																// Check to see  if squareBoard1's BoardStatus is equal to 3
					if (squareBoard1.BoardStatus == 3) {
																// Creates the ImageIcon White again and set it to squareBoard1
						ImageIcon White = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
						squareBoard1.CheckerBoard.setIcon(White);
						squareBoard1.BoardStatus = 2;			// Change the BoardStatus of squareBoard1 to 2
					}
																// Checks to see if squareBoard2's BoardStatus is equal to 2
					if (squareBoard2.BoardStatus == 2) {
																// Creates the ImageIcon WhitePiece again and set it to squareBoard1
						ImageIcon WhitePiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/white.png");
						squareBoard2.CheckerBoard.setIcon(WhitePiece);
						squareBoard2.BoardStatus = 3;			// Change the BoardStatus of squareBoard2 to 3
					}
				}		
			}
		}
		if(squareBoard1.BoardStatus == 4) {						// Checks to see if squareBoard1's BoardStatus equals to 4
																// Checks to see if squareBoard2's PiecePosition - 7 and 9 is equal to squareBoard1's PiecePosition 
			if (squareBoard2.PiecePosition - 7 == squareBoard1.PiecePosition || squareBoard2.PiecePosition - 9 == squareBoard1.PiecePosition) {					
																// Checks to see if both squareBoard's BoardStatus is not equal to 3
				if( squareBoard1.BoardStatus != 3 && squareBoard2.BoardStatus != 3) {	
																// Checks to see if squareBoard1's BoardStatus equals to 4 
					if (squareBoard1.BoardStatus == 4) { 
																// Creates the ImageIcon WhiteBoard again and set it to squareBoard1
						ImageIcon WhiteBoard = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/empty.png");
						squareBoard1.CheckerBoard.setIcon(WhiteBoard);
						squareBoard1.BoardStatus = 2;			// Change the BoardStatus of squareBoard1 to 2 
					}	
						
					if (squareBoard2.BoardStatus == 2) {		// Checkers to see if squareBoard2's BoardStatus is 2 
																// Create the ImageIcon RedPiece again and set it to squareBoard2
						ImageIcon RedPiece = new ImageIcon("C:/Users/Samuel Cotton/Documents/Uni/SCC110/Term2/Practicals/Assignment2/Git/pieces/red.png");
						squareBoard2.CheckerBoard.setIcon(RedPiece);
						squareBoard2.BoardStatus = 4;			// Change squareBoard2's BoardStatus to 4
					}
				}			
			}	
		}
	}
}