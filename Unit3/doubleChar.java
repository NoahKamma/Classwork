public String doubleChar(String str) 
{

String total = new String("");

for(int i=0; i<str.length(); i++)
  {
    total += str.charAt(i);
    total += str.charAt(i);
    
  }

return total;

}
