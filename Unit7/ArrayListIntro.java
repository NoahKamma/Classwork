import java.util.ArrayList;


public class ArrayListIntro {

	public static void main(String[] args) {
		
		
		//One
		ArrayList<String> emptyArr= new ArrayList<String>();
		
		//Two
		ArrayList<Integer> intArrList= new ArrayList<Integer>();
		ArrayList<String> stringArrList= new ArrayList<String>();
		
		//Three
		for(int i=1;i<4;i++)
		{
			intArrList.add(i);
		}
		System.out.println(intArrList);
		
		stringArrList.add("Alice");
		stringArrList.add("Bob");
		stringArrList.add("Charlie");
		System.out.println(stringArrList);
		
		//Four
		intArrList.add(2,5);
		stringArrList.add(1,"Derek");
		System.out.println(intArrList);
		System.out.println(stringArrList);
		
		//Five
		System.out.println(intArrList.get(1));
		System.out.println(intArrList.get(intArrList.size()-1));
		
		//Six
		System.out.println("Before: "+intArrList );
		intArrList.set(0, 0);
		System.out.println("After: "+intArrList );
		
		System.out.println("Before: "+ stringArrList);
		stringArrList.set(0, "Zero");
		System.out.println("After: "+stringArrList );
		
		
		//Seven
		int intLast =intArrList.get(intArrList.size()-1);
		String strLast = new String(stringArrList.get(stringArrList.size()-1));
		
		intArrList.remove(intLast);
		stringArrList.remove(stringArrList);
		
		System.out.println(intLast);
		System.out.println(strLast);
		
	
	}

}
