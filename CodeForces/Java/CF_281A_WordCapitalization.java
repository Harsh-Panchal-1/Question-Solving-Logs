//  Problem: 281A. Word Capitalization
//  Link: https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StringBuilder str = new StringBuilder(scan.nextLine());
    scan.close();
    
    str.setCharAt(0, Character.toUpperCase(str.charAt(0)));

    System.out.println(str.toString());
  }

}
