//  Problem: 41A. Translation
//  Link: https://codeforces.com/problemset/problem/41/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = new StringBuilder(scan.nextLine()).toString();
    StringBuilder T = new StringBuilder(scan.nextLine());

    T.reverse();
    
    if (S.equals(T.toString())) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    scan.close();
  }
}
