package connectFour;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import ticTacTo.Tile;

public class ConnectFourBoard {

//Substantiate JFrame/Window
	private JFrame frame;

	//New 2d arr to store Tiles (or buttons)
	private Space[][] grid=new Space[6][7];
	private int[] colCount={5,5,5,5,5,5,5};
	
				//Symbols to rotate b/w X and O every turn
	private Color[] colors= {Color.red,Color.black};
	private int colorsMod=0;
		
	//Turn count
	private int count=0;
		
		
		
	public ConnectFourBoard()
	{
		
		//Customize JFrame
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,700);		
		frame.setLayout(new GridLayout(6,7));
			
			//Create 9 Tiles in total
			for(int i=0; i<6;i++)
			{
				for(int j=0;j<7;j++)
				{
					createTile(i,j);
				}
				
			}
			frame.setVisible(true);
		}
		
		/*
		 * Creates tile objects attached with action listeners <-(allows for inputs)
		 */
		public void createTile(int i, int j)
		{
			//Customize Tile space
			Space button = new Space();
			button.setText(" ");
			button.setSize(100,100);
			button.setFont(new Font("",Font.TYPE1_FONT,40));
		
			
			//Add Tile to grid and JFrame
			grid[i][j]=button;
			frame.add(grid[i][j]);
			
			button.addActionListener(new ActionListener() {
		
				/*
				 * Game over messages when conditions are met
				 */
				@Override
				public void actionPerformed(ActionEvent e)
				{
					
					
					if(colCount[j]<0)
					{
						//If designated column is full
						System.out.println("Stop doing that. That's stupid.");
					}
					else 
					{
						//The default case: when there is an empty space in column j
						//Place piece at lowest possible button/space
						grid[colCount[j]][j].setText("⬤");
						grid[colCount[j]][j].setForeground(colors[colorsMod%2]);
						grid[colCount[j]][j].setColor(colorsMod%2);
						
						colCount[j]--;
						
						//A true or false for continuing or ending the game computed by the "logic" method
						if(logic())
						{
							System.out.println("Game Over! Re-run 'Main' to play again!");
							removeActionListeners();
						}
					}
				}
			});
		}
		
		/*
		 * Removes action listeners when the game is over (stops the buttons from working)
		 */
		public void removeActionListeners()
		{
			for(int a=0;a<6;a++)
			{
				for(int b=0;b<7;b++)
				{
					for(ActionListener l:grid[a][b].getActionListeners())
					{
						grid[a][b].removeActionListener(l);
					}
				}
			}
		}
		
	/*
	 * Where the game logic is handled, specifially winning cases
	 */
	public boolean logic()
	{
		boolean endGame=false;
		
		
		//A number to refer to when considering diagonal cases
		final int margin=3;
		
		//Determines which color to look for according to global int "colorsMod"
		//Red=0 Black=1 Empty=-1
		int curColor=colorsMod%2;
		
		//The spaces that are being checked for winning cases (all spaces contain color -> win)
		//win(one,two,three,four)
		Space one;
		Space two;
		Space three;
		Space four;
		
		for(int i=0;i<6;i++ )
		{
			for(int j=margin;j<7;j++ )
			{
				one=grid[i][j-3];
				two=grid[i][j-2];
				three=grid[i][j-1];
				four=grid[i][j];
				
				//Check horizontal cases
				if(one.getColor()== curColor &&
				   two.getColor()== curColor &&
				   three.getColor()== curColor &&
				   four.getColor()== curColor )
				{
					highlight(one,two,three,four);
					endGame=true;
				}
			}
		}
		
		for(int i=margin;i<6;i++ )
		{
			for(int j=0;j<7;j++ )
			{
				one=grid[i-3][j];
				two=grid[i-2][j];
				three=grid[i-1][j];
				four=grid[i][j];
				
				//Check vertical cases
				if(one.getColor()== curColor &&
				   two.getColor()== curColor &&
				   three.getColor()== curColor &&
				   four.getColor()== curColor )
				{
					highlight(one,two,three,four);
					endGame=true;
				}
			}
			
			for(int j=margin;j<7;j++ )
			{
				one=grid[i-3][j-3];
				two=grid[i-2][j-2];
				three=grid[i-1][j-1];
				four=grid[i][j];
				
				
				//Check diagonal cases (Top-left to Bottom-right)
				if(one.getColor()== curColor &&
				   two.getColor()== curColor &&
				   three.getColor()== curColor &&
				   four.getColor()== curColor )
				{
					highlight(one,two,three,four);
					endGame=true;
				}
				
			}
			
			for(int j=0;j<4;j++)
			{
				one=grid[i-3][j+3];
				two=grid[i-2][j+2];
				three=grid[i-1][j+1];
				four=grid[i][j];
				
				//Check diagonal cases (Bottom-left to Top-right)
				if(one.getColor()== curColor &&
				   two.getColor()== curColor &&
				   three.getColor()== curColor &&
				   four.getColor()== curColor )
				{
					highlight(one,two,three,four);
					endGame=true;
				}
			}
		}
		
		//If there is no winning moves when the board is full, end the game
		if(count>=49)
		{
			removeActionListeners();
			System.out.println("It's a Tie! Re-run 'Main' again to play again!");
		}
		
		//Switch to the color of the next turn and increment turn count
		colorsMod++;
		count++;
		
		return endGame;
	}
	
	/*
	 * Done when connect four is made, if you couldn't tell already
	 * Change the shape of the winning spaces/pieces to stars to highlight the winning move
	 */
	public void highlight(Space one,Space two, Space three, Space four )
	{
		//Change appearance of winning pieces
		one.setFont(new Font("",Font.TYPE1_FONT,50));
		two.setFont(new Font("",Font.TYPE1_FONT,50));
		three.setFont(new Font("",Font.TYPE1_FONT,50));
		four.setFont(new Font("",Font.TYPE1_FONT,50));
		
		one.setText("★");
		two.setText("★");
		three.setText("★");
		four.setText("★");
		
	}
	
}
