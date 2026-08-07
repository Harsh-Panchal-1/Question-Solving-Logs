//  Problem: 266A. Stones On the Table
//  Link: https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String stoneString = scan.next();
    int count =0;
    for (int i = 0; i < (stoneString.length()-1); i++) {
      if (stoneString.charAt(i) == stoneString.charAt(i+1)) {
        count++;
      }
    }
    scan.close();
    System.out.println(count);
  }
}
