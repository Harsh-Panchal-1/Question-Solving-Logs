import java.util.Scanner;

public class CF_118A_StringTask {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine().toLowerCase();

    // Convert the string to an array of strings to loop through it
    for (String i : "aeiouy".split("")) {
      word = word.replace(i, "");
    }
    StringBuilder str = new StringBuilder();
    for (int i=0; i<word.length();i++){
      str.append(".");
      str.append(word.charAt(i));
    }
    System.out.println(str);
  }
}
