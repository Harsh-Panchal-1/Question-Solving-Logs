//  Problem: 96A. Football
//  Link: https://codeforces.com/problemset/problem/96/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String players = scan.next();
    scan.close();

    if (players.contains("1111111") || players.contains("0000000")) {
    System.out.println("YES");
    } else {
    System.out.println("NO");
    }
  }
}
