package MakeYourChoiceGame;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.concurrent.TimeUnit;
public class Console {
	
	//Static components of the java-swing "console"
	protected static JFrame frame;
	protected static JPanel panel;
	protected JTextField textField;
	protected JLabel text;
	protected static JScrollPane scrollPane;
	private Timer timer;
	
	private int recursion = 0;
	
	//A static string to carry any string throughout functions.
	private String answer = new String("");
	
	
	public Console()
	{
		initialize();
	}
	
	/*
	 * Initialize attributes of a basic jframe object
	 */
	public void initialize()
	{
		//Initialize empty component objects
		frame= new JFrame();
		panel = new JPanel();
		scrollPane = new JScrollPane(panel);
		textField = new JTextField();

		//Customize frame
		frame.setLayout(new BorderLayout());
		frame.setBackground(Color.BLACK);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    frame.setSize(300, 200);

		//Set the consoel color green and black
	    panel.setBackground(Color.BLACK);
	    panel.setForeground(Color.GREEN);
	    
	  //Initialize new field object and action 
		
		
		//Create a layout for scrolling: Put a scroll pane in center of frame box layout
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		textField.setForeground(Color.GREEN);
		textField.setBackground(Color.BLACK);
		textField.setCaretColor(Color.GREEN);
		scrollPane.setBackground(Color.BLACK);
		
		
		//Add the text field and scroll pane to their respective borders
		frame.add(textField, BorderLayout.SOUTH);
		frame.add(scrollPane,BorderLayout.CENTER);
		
		frame.setVisible(true);
		
	    
	     
	}
	
	
	/*
	 * Set the size to the passed x and y ints
	 */
	public void setSize(int x, int y)
	{
		frame.setSize(x,y);
	}
	
	public void promptString()
	{
		//Clear text field for player
		textField.setText("");
		
		textField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Set static answer to text field string
				Main.answerString=textField.getText();
				
				//Clear text field
				textField.setText("");
				//Move on to the next stage
				
				Main.callback();
				//Disable action listener as onetime prompt
				textField.removeActionListener(this);
				
				
			}
		});
	}
	
	
	public void promptDecisions(String decisions, String keyOne, String keyTwo, String keyThree)
	{
		//Print when first called, ignore on recursion
		if(recursion==0)
		{
			emptyLine();
			printLine("Type in one of the choices below:",Color.GRAY);
			
			String choiceOne = new String (lineNumAt(decisions,1));
			String choiceTwo = new String (lineNumAt(decisions,2));
			String choiceThree = new String (lineNumAt(decisions,3));
			
			printLine(choiceOne,Color.GRAY);
			printLine(choiceTwo,Color.GRAY);
			printLine(choiceThree,Color.GRAY);
			
		}
			
			textField.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {	
					
					answer=textField.getText();
					
					//If text field contains a keyword, that is passed as parameter, set answerDecisions, callback & remove actionListener
					if(answer.contains(keyOne))
					{
						Main.answerDecisions=1;
						emptyLine();
						emptyLine();
						printLine("<"+Main.name+">: "+ lineNumAt(decisions,1) );
						
						
						Main.callback();
						textField.removeActionListener(this);
					}
					else
					{
						if(answer.contains(keyTwo))
						{
							Main.answerDecisions=2;
							emptyLine();
							printLine("<"+Main.name+">: "+ lineNumAt(decisions,2) );
							
							Main.callback();
							textField.removeActionListener(this);
						}
						else
						{
							if(answer.contains(keyThree))
							{
								Main.answerDecisions=3;
								emptyLine();
								printLine("<"+Main.name+">: "+ lineNumAt(decisions,3) );
								
								Main.callback();
								textField.removeActionListener(this);
							}
							else
							{
								sayInvalid();
							}
						}
					}
					textField.setText("");
				
			}
		});
	}

	public void promptDecisions(String decisions, String keyOne, String keyTwo)
	{
		//Print when first called, ignore on recursion
		if(recursion==0)
		{
			emptyLine();
			printLine("Type in one of the choices below:",Color.GRAY);
			
			String choiceOne = new String (lineNumAt(decisions,1));
			String choiceTwo = new String (lineNumAt(decisions,2));
			
			printLine(choiceOne,Color.GRAY);
			printLine(choiceTwo,Color.GRAY);
			
		}
			
			textField.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {	
					
					answer=textField.getText();
					
					//If text field contains a keyword, that is passed as parameter, set answerDecisions, callback & remove actionListener
					if(answer.contains(keyOne))
					{
						Main.answerDecisions=1;
						emptyLine();
						printLine("<"+Main.name+">: "+ lineNumAt(decisions,1) );
						
						
						Main.callback();
						textField.removeActionListener(this);
					}
					else
					{
						if(answer.contains(keyTwo))
						{
							Main.answerDecisions=2;
							emptyLine();
							printLine("<"+Main.name+">: "+ lineNumAt(decisions,2) );
							
							Main.callback();
							textField.removeActionListener(this);
						}
						else
						{
							sayInvalid();
						}
					}
					textField.setText("");
				
			}
		});
	}
	
	public void printLine(String str)
	{
		emptyLine();
		JLabel text = new JLabel(str+"\n");
		text.setForeground(Color.GREEN);
		
		
		panel.add(text);
		panel.revalidate();
		panel.repaint();
		autoScroll();
	}
	
	public void sayInvalid()
	{
		emptyLine();
		JLabel text = new JLabel("This answer is invalid. Please try again.");
		text.setForeground(Color.DARK_GRAY);
		
		
		panel.add(text);
		panel.revalidate();
		panel.repaint();
		autoScroll();
	}
	
	public void printLine(String str, Color color)
	{
		emptyLine();
		JLabel text = new JLabel(str+"\n");
		text.setForeground(color);
		
		panel.add(text);
		panel.revalidate();
		panel.repaint();
		autoScroll();
	}
	
	static public void printDialogue(String name,String dialogue)
	{
		
		String sample = new String (dialogue);
		int lineNum=getLineNum(dialogue);
		
		
		//Initalize new delay to add up a total delay for each iteration
		int totalDelay=0;
		
		
		for(int i=0; i<lineNum; i++)
		{
			//New local variable to track the iteration number
			int iteration=i;
			
			String line = new String(sample.substring(0,sample.indexOf("\n")));
			int typingTime=line.length()*35;
			int readingTime=line.length()*20;
			
			
			
			//Fun fact: I learned a little a bit about lambdas. More convenient than whole addListener functions.
			Timer typingTimer = new Timer(totalDelay, e -> {
				
				//New "is typing" label in italics
				emptyLine();
				JLabel text = new JLabel("<"+name+">: is typing..." );
				text.setForeground(Color.GREEN);
				
				
				//Refresh window
				panel.add(text);
				panel.revalidate();
				panel.repaint();
				
				
				
				Timer sendTimer = new Timer(typingTime, ae -> {
					//The text message gets "sent"
					text.setText("<"+name+">: "+line);
					
					
					//Refresh Panel
					autoScroll();
					panel.revalidate();
					panel.repaint();
					
					Timer readTimer = new Timer(readingTime, ee -> {
						
						//A small delay to read
						
						//If this is the last iteration or line
						if(iteration==lineNum-1)
						{
							Main.callback();
						}
						
						
					});
					readTimer.setRepeats(false);
					readTimer.start();
					
				});
				sendTimer.setRepeats(false);
				sendTimer.start();
			});
			typingTimer.setRepeats(false);
			typingTimer.start();
			
			//Chop the used line from the overall sample string
			sample= sample.substring(sample.indexOf("\n")+1, sample.length());
			//Add additonal time to the next lines to synchronize the typing effect
			totalDelay+=typingTime+readingTime;
			
			
		}
	}
	
	/*
	 * Converts a string into a body of lines in label form
	 */
	public void printBody(String body)
	{
		emptyLine();
		String sample = new String (body);
		//Invokes when line escape is present
		while(sample.indexOf("\n") != -1)
		{
			//New label for a line that ends at a line break "/ln"
			JLabel label = new JLabel(sample.substring(0, sample.indexOf("\n") ));
	        label.setForeground(Color.green);
	        panel.add(label);
	        
	        //Chop the former line and go to the next line
	        sample= sample.substring(sample.indexOf("\n")+1, sample.length());
	       
		}
		autoScroll();
		panel.revalidate();
		panel.repaint();
	}
	
	
	/*
	 * Two strings to be passed, one is the name of the character and the other a string from file 'Response'
	 */
	static public void printResponse(String name,String response)
	{
		String sample = new String(response);
		
		if(Main.answerDecisions==1)
		{
			//Print the first portion of sample
			emptyLine();
			printDialogue(name,sample.substring(0,sample.indexOf("@")));
			
		}
		else if(Main.answerDecisions==2)
		{
			
			//Chop the first portion, then chop the portion, which isolates the second portion
			
			sample=sample.substring(sample.indexOf("@")+1,sample.length());
			sample=sample.substring(0,sample.indexOf("@"));
			emptyLine();
			printDialogue(name,sample.substring(0,sample.indexOf("@")));
		}
		else if(Main.answerDecisions==3)
		{
			//Chop the first two portions, which isolates the third portion
			for(int i=0; i<2; i++)
			{
				sample=sample.substring(sample.indexOf("@")+1,sample.length());
			}
			emptyLine();
			printDialogue(name,sample.substring(0,sample.length()));
		}
		else
		{
			System.out.print("Error - answerDecisions out of bounds");
		}
	}
	
	public static void emptyLine()
	{
		JLabel text = new JLabel("hi im dunce");
		text.setForeground(Color.BLACK);
		
		panel.add(text);
		panel.revalidate();
		panel.repaint();
		autoScroll();
	}
	
	static void autoScroll()
	{
		scrollPane.getVerticalScrollBar().setValue(scrollPane.getVerticalScrollBar().getMaximum());
	}
	
	public void clear()
	{
		panel.removeAll();
		panel.revalidate();
		panel.repaint();
	}
	
	public String returnAnswer()
	{
		return answer;
	}
	
	
	public static int getLineNum(String str)
	{
		String sample = new String(str);
		int count=0;
		
		//While there are still lines indicated by the escape
		while(sample.indexOf("\n")!=-1)
		{
			count++;
			sample= sample.substring(sample.indexOf("\n")+1, sample.length());
		}
		
		
		return count;
	}
	
	public String lineNumAt(String decisions, int line)
	{
		int iteration=1;
		String sample=new String(decisions);
		
		while(iteration<line)
		{
			//Chop away the first line until you reach desired line
			sample=sample.substring(sample.indexOf("\n")+1,sample.length());
			iteration++;
		}
		
		return sample.substring(0,sample.indexOf("\n"));
		
		
	}
	
	public void exit()
	{

		frame.dispose();
	}
	
	
}
