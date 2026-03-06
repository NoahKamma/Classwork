package ticTacTo;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class Board {

	private JFrame frame;

	private Tile[][] grid=new Tile[3][3];
	private String[] symbols= {"X","O"};
	private int symbolsMod=0;
	
	
	
	public Board()
	{
		frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(3,3));
		
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				createTile(i,j);
			}
			
		}
		frame.setVisible(true);
		
	}
	
	public void createTile(int i, int j)
	{
		Tile tile = new Tile();
		tile.setText(" ");
		tile.setSize(100,100);
		tile.setFont(new Font("",Font.TYPE1_FONT,40));
		
		
		grid[i][j]=tile;
		frame.add(grid[i][j]);
		
		tile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(checkTurn(i,j))
				{
					System.out.println("Game over! "+symbols[symbolsMod%2] +" wins!");
					System.out.println("Run 'Main' to replay...");
					
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
			
		});
	}
	
	
	
	public boolean checkTurn(int row,int column)
	{	
		if(!((grid[row][column].getText()).equals(" ")))
		{
			System.out.println("That's stupid, stop doing that.");
			return false;
		}
		
		String currentSymbol= new String(symbols[symbolsMod%2]);
		
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
		symbolsMod++;
		return false;
	}
	
	public void highlight(Tile a, Tile b, Tile c)
	{
		a.setForeground(Color.red);
		b.setForeground(Color.red);
		c.setForeground(Color.red);
	}
	
	
	
	
	
	

}
