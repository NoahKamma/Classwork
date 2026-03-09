package ticTacTo;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class Board {

	//Substantiate JFrame/Window
	private JFrame frame;

	//New 2d arr to store Tiles (or buttons)
	private Tile[][] grid=new Tile[3][3];
	
	//Symbols to rotate b/w X and O every turn
	private String[] symbols= {"X","O"};
	private int symbolsMod=0;
	
	//Turn count
	private int count=0;
	
	
	
	public Board()
	{
		//Customize JFrame
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(3,3));
		
		//Create 9 Tiles in total
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
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
		//Customize Tile button
		Tile tile = new Tile();
		tile.setText(" ");
		tile.setSize(100,100);
		tile.setFont(new Font("",Font.TYPE1_FONT,40));
		
		//Add Tile to grid and JFrame
		grid[i][j]=tile;
		frame.add(grid[i][j]);
		
		tile.addActionListener(new ActionListener() {
			
			
			/*
			 * Game over messages when conditions are met
			 */
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(checkTurn(i,j))
				{
					System.out.println("Game over! "+symbols[symbolsMod%2] +" wins!");
					System.out.println("Run 'Main' to replay...");
					
					removeActionListeners();
					
				}
				else if(count>=9)
				{
					System.out.println("Tie!");
					System.out.println("Run 'Main' to replay...");
					
					removeActionListeners();
				}
				
				
			}
			
		});
	}
	
	
	/*
	 * The logic of the game every time a turn is made (Is there a winner, is the wrong button pressed, etc.)
	 * Return boolean based on if the game is over
	 */
	public boolean checkTurn(int row,int column)
	{	
	
		if(!((grid[row][column].getText()).equals(" ")))
		{
			//"Error" message for pressing a used tile
			System.out.println("That's stupid, stop doing that.");
			return false;
		}
		
		//The current symbol to be applied to the tile
		String currentSymbol= new String(symbols[symbolsMod%2]);
		
		//Change the Tile text accordingly to whose turn is it
		grid[row][column].setText(currentSymbol);
		
		for(int i=0;i<3;i++)
		{
			if((grid[i][0].getText()).equals(currentSymbol) &&
			   (grid[i][1].getText()).equals(currentSymbol) &&
			   (grid[i][2].getText()).equals(currentSymbol))
			{
				highlight(grid[i][0],grid[i][1],grid[i][2]);
				//Horizontal case
				return true;
				
			}
			else if((grid[0][i].getText()).equals(currentSymbol) &&
				   (grid[1][i].getText()).equals(currentSymbol) &&
				   (grid[2][i].getText()).equals(currentSymbol))
			{
				highlight(grid[0][i],grid[1][i],grid[2][i]);
				//Vertical case
				return true;
			}
		}
		
		for(int i=0;i<2;i++)
		{
			//Diagonal case
			int leftI=i*2;
			int rightI=2+(-2*i);
			
			
			if((grid[leftI][0].getText()).equals(currentSymbol) &&
			  (grid[1][1].getText()).equals(currentSymbol) &&
			  (grid[rightI][2].getText()).equals(currentSymbol))
			{
				highlight(grid[leftI][0],grid[1][1],grid[rightI][2]);
				return true;
			}
		}
		
		//Increment turn count and switch to next player turn if there are no winning moves
		symbolsMod++;
		count++;
		return false;
	}
	
	/*
	 * Highlight symbols on tiles red to signal a winning move
	 */
	public void highlight(Tile a, Tile b, Tile c)
	{
		a.setForeground(Color.red);
		b.setForeground(Color.red);
		c.setForeground(Color.red);
	}
	
	/*
	 * Remove action listeners when the game is over
	 */
	public void removeActionListeners()
	{
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				for(ActionListener l:grid[a][b].getActionListeners())
				{
					grid[a][b].removeActionListener(l);
				}
			}
		}
	}
	
	
	
	
	
	

}
