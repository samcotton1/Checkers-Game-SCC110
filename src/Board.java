import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Board.java Class file which creates 
 * 1. A JFrame and JPanel
 * 2. 2 Square Array Object
 * 3. Private Variables used during the Class
 * Public Method Board which creates the board and sets up the window using the JPanel and JFrame
 * An Action Listener for when a button is pressed to move a Piece 
 * @author Samuel Cotton
 *
 */
public class Board implements ActionListener {				//Board Class which Implements the Action Listener	
	private JFrame frame = new JFrame();					// Creates a Private JFrame called frame to set the Board
	private JPanel backBoard = new JPanel();				// Creates a JPanel called backBoard to apply the buttons
	
	Square[] SquareBoard = new Square[65];					// Creates a Square Array Object called SquareBoard to store all of the Buttons for the Board
	Square[] SquareTemp1 = new Square[2];					// Creates a temporary Square Array Object for the first temp square for the action listener

	private int x = 0;										// Creates a private integer variable x set to the value 0
	private int y = 0;										// Creates a private integer variable y set to the value 0
	int Count = 0;											// Creates a integer variable Count set to 0 for the action listener
	
	private int SquareColour = 0; 							// Creates a private integer SquareColour to set the colour of the square 
	private int counter = 1;								// Creates a private integer counter to count each square being made for the board
	private int PieceColour = 1; 							// Creates a private integer PieceColour to set the colour of the checkers if they have one on setup
	
	/** 
	 * Public Method Board
	 * This Method sets up the Squares to be used as a CheckerBoard Piece 
	 * Looping 64 times with an 8 by 8 grid using For Loops
	 */
	public Board(){											// Public method Board
			for (int i = 0; i < 8; i++) {					// For loop created to go around until i is more than 8, with 1 added to it each loop - outside the second loop to set up the column
				for(int j = 0; j < 8; j++) {				// For loop created to go around until j is more than 8, with 1 added to it each loop - inside the first loop to set up the row
					
					SquareColour++;							// Square colours has 1 added to it 
															// Calls the Square Method and passes the variables needed to create it - array uses counter for the location
					SquareBoard[counter] = new Square(backBoard, x, y, SquareColour, PieceColour, counter);
															// Adds an Action Listener to each button calling the getButton method on Square.java  
					SquareBoard[counter].getButton().addActionListener(this);
					counter++;								// Counter gets 1 to it each time it passes it
					x += 100;								// x Adds 100 to it each time it passes it 
				}
				x = 0; 										// Sets x to 0 to symbolise a new row 
				y += 100; 									// y Adds 100 to it each time it passes it symbolises going to a new line of the column
				SquareColour++;								// Adds 1 to the SquareColour each time it passes it 
				PieceColour++;								// Adds 1 to the PieceColour each time it passes it		

								
			}
			
			backBoard.setLayout(null);						// Sets the layout of backBoard to null each time it is opened to clear it 
			frame.setTitle("Checkers");						// Sets the title of the frame to Checkers
			frame.setContentPane(backBoard);				// Sets the ContentPane to backBoard
			frame.setSize(900, 900);						// Sets the size of the frame to 900, 900
			frame.setVisible(true);							// Sets the visibility of the frame to true
															// Sets the DefaultCloseOperation to exit on close so the program stops when it closes 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );	
			
			}

	/**
	 * Public Method Main
	 * @param args
	 */
	public static void main(String args[]) {				// Public Main Method
	
		Board g = new Board();								// Creates a Board called g
	}

	/**
	 * Public Method For ActionListener
	 * Looks for when a button is clicked
	 * Once a button is clicked it is then stored in the second Square Array Object 
	 * Once two Values are stored in the Square Array it then goes to the MoveTo Method in Square.java Class moving two Pieces 
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {			//Public  Action Listener Method
		
		for(int i = 1; i < SquareBoard.length; i++) {		// For Loop that checks to see if i is equal to the length of SquareBoard - adds 1 to i each time 
															// If Statement to see if e.getSource Which gets the info from the button pressed is equal to the SquareBoard array with i as the counter to find the right button 
															// - gets the button from the getButton from the method in the Square.java class
			if(e.getSource() == SquareBoard[i].getButton()) {
					SquareTemp1[Count] = SquareBoard[i];	// Stores the button chosen in the SquareTemp1 array at Count

					Count++;								// Adds 1 to Count each time it passes it 
					if (Count == 2){						// If Statement to see if Count is equal to 2
															// Calls the MoveTo Method in the Square.java class and passes the two array variables linked to 0 and 1
					Square.MoveTo(SquareTemp1[0], SquareTemp1[1]);
					Count = 0;								// Makes Count equal to 0
					}
			}
		}
	}
}