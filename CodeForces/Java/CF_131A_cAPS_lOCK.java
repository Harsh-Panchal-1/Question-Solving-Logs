// Problem: 131A. cAPS lOCK
// Link: https://codeforces.com/problemset/problem/131/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    scan.close();

    boolean changeCase = true;
    for (int i = 1; i < word.length(); i++) {
        if (Character.isLowerCase(word.charAt(i))) {
            changeCase = false;
            break;
        }
    }

    if (changeCase) {
        StringBuilder newWord = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                newWord.append(Character.toLowerCase(c));
            } else {
                newWord.append(Character.toUpperCase(c));
            }
        }
        System.out.println(newWord.toString());
    } else {
        System.out.println(word);
    }
  }
}
