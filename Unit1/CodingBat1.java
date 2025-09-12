//helloName

/*
*This returns your name within the string "Hello (your name)!"
*/
public String helloName(String name) {
  return "Hello " + name + "!";
}

//makeAbba

/*
*This returns a string within the order "a+b+b+a"
*/
public String makeAbba(String a, String b) {
  return a+b+b+a;
}

//makeTags


/*
*This returns a word with tags around it 
*Ex: "<i>Hi</i>"
*/
public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"<"+"/"+tag+">";
}

//firstHalf

/*
*This returs the first half of an even string
*/
public String firstHalf(String str) {
  int perfectHalf = (str.length())/2;
  return str.substring(0,perfectHalf);
}
