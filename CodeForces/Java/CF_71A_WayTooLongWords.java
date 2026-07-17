import java.util.Scanner;
import java.util.ArrayList;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int wordCount = Integer.parseInt(sc.nextLine());
    ArrayList<String> words = new ArrayList<>();
    for (int i = 0; i < wordCount; i++){
      String word = sc.nextLine();
      words.add(word);
    }
    sc.close();
    for (String string : words) {
      int length = string.length();
      if (length>10) {
        String result = "%s%d%s".formatted(string.charAt(0),(length-2),string.charAt(length-1));
        System.out.println(result);
      } else {
        System.out.println(string);
      }
    }
  }
}