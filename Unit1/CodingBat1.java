//helloName

public String helloName(String name) {
  return "Hello " + name + "!";
}

//makeAbba

public String makeAbba(String a, String b) {
  return a+b+b+a;
}

//makeTags

public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"<"+"/"+tag+">";
}

//firstHalf

public String firstHalf(String str) {
  int perfectHalf = (str.length())/2;
  return str.substring(0,perfectHalf);
}
