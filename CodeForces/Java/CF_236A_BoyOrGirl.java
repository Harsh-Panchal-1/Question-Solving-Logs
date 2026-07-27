//  Problem: 236A. Boy Or Girl
//  Link: https://codeforces.com/problemset/problem/236/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    scan.close();

    StringBuilder unique = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      String currentChar = Character.toString(str.charAt(i));
      if (!unique.toString().contains(currentChar)) {
        unique.append(currentChar);
      }
    }

    if (unique.length() % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}