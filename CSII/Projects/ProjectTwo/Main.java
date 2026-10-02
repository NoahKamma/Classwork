import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		AddressBook book = new AddressBook();
		
		//Intialize variables
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while(running)
		{
			System.out.print("~ Address Book Menu ~\r\n"
					+ "+-------------------------+\r\n"
					+ "ADD Adds a contact\r\n"
					+ "FIND Finds contacts\r\n"
					+ "PRINT Prints contacts\r\n"
					+ "QUIT Quits\r\n"
					+ "+-------------------------+\r\n"
					+ "-->");
			
			String input = new String(scanner.nextLine());
			
			
			if(input.equals("add")) {
				
				//Prompt user for non-empty strings for name and phone
				//of the added contact
				String name;
				
				do
				{
					System.out.println();
					
					System.out.print("NAME --->");
					name=new String(scanner.nextLine());
				}while(name.equals(""));
				
				String phone;
				
				do
				{
					System.out.println();
					
					System.out.print("PHONE --->");
					phone=new String(scanner.nextLine());
				}while(phone.equals(""));
				
				Contact c = new Contact(name,phone);
				book.add(c);
				
				System.out.println("\r\n"
						+"Added "+c);
				
			}
			else if(input.equals("find")) {
				//Prompt user for search keyword before returning contacts
				System.out.println();
				
				System.out.print("WHAT --->");
				String keyword=new String(scanner.nextLine());
				
				System.out.println(book.find(keyword));
			}
			else if(input.equals("print")) {
				System.out.println(book.toString() + "\r\n");
				System.out.println();
			}
			else if(input.equals("quit")) {
				running=false;
			}
			else {
				System.out.println();
				System.out.println("Invalid command.\r\n");
			}
		}
		
		scanner.close();

	}

}
