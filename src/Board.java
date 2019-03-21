import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board implements ActionListener {	
	private JFrame frame = new JFrame();
	private JPanel backBoard = new JPanel();
	
	Square[] SquareBoard = new Square[65];
	Square[] SquareTemp1 = new Square[2];
	
	private int x = 0;
	private int y = 0;
	int Count = 0;
	
	private int SquareColour = 0; 
	private int counter = 1;
	private int PieceColour = 1;
	
	public Board(){
			for (int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					
					SquareColour++;
					SquareBoard[counter] = new Square(backBoard, x, y, SquareColour, PieceColour, counter);
					SquareBoard[counter].getButton().addActionListener(this);
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

			
	public static void main(String args[]) {
	
		Board g = new Board();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 1; i < SquareBoard.length; i++) {
			if(e.getSource() == SquareBoard[i].getButton()) {
					SquareTemp1[Count] = SquareBoard[i];
					Count++;
					
					if (Count == 2){
					Square.MoveTo(SquareTemp1[0], SquareTemp1[1]);
					Count = 0;
					}
			}
		}
	}
}