public class Contact {
	
	private String name;
	private String phone;
	
	public Contact(String name,String phone)
	{
		this.name=name;
		this.phone=phone;
	}
	
	/*
	 * Returns the contact's attributes as a string
	 */
	public String toString()
	{
		return "["+name+","+phone+"]\r\n";
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPhone()
	{
		return phone;
	}
}
