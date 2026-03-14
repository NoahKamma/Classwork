package connectFour;

import javax.swing.JButton;

public class Space extends JButton{
	

		JButton button;
		int color=-1;
		
		
		public Space()
		{
			//Substantiate button and determine size
			
			
					button=new JButton(" ");
					button.setSize(200,200);
					button.setVisible(true);
		}
		
		public int getColor()
		{
			return color;
		}
		
		/*
		 * Store a color in the tile, according to colorsMod in ConnectFourBoard
		 * Red=0 Black=1
		 * Empty=-1
		 */
		public void setColor(int i)
		{
			color=i;
		}
		
		
		
		
		
		
		
		
		
		
	}
