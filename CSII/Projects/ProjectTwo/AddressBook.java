package projectTwo;

import java.util.List;
import java.util.ArrayList;

public class AddressBook {
	
	private List <Contact> contacts= new ArrayList<>();
	
	
	public AddressBook()
	{
		
	}
	
	/*
	 * Adds a contact to the list contacts
	 */
	public void add(Contact contact)
	{
		contacts.add(contact);
	}
	
	/*
	 * Returns all contacts that include str
	 */
	public List<Contact> find(String str)
	{
		List<Contact> matches = new ArrayList<>();
		
		
		for(int i=0; i<contacts.size(); i++)
		{
			Contact c =contacts.get(i);
			
			boolean doesMatch= c.getName().contains(str) || c.getPhone().contains(str);
			
			
			if(doesMatch)
			{
				//Str matches phone and/or name
				matches.add(c);
			}
		}
		
		System.out.println("Number of contacts found: "+ matches.size() +"\r\n");
		System.out.println();
		
		return matches;
	}
	
	public String toString()
	{
		return contacts.toString();
	}
	
	
	
	
	
}
