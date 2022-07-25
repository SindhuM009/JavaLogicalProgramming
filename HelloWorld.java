//print the duplicate characters from the given String
class HelloWorld {
    public static void main(String[] args) {
      String str="Meghana";
      char string[]=str.toCharArray();
       System.out.print("Duplicate Characters in above string are: ");
      for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
            if (string[i] == string[j]) {
               System.out.print(string[j] + " ");
               break;
      }
         }
    }
}
}