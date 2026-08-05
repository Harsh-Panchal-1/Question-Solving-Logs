//  Problem: 282A. Bit++
//  Link: https://codeforces.com/problemset/problem/282/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int result = 0;
    int count = scan.nextInt();
    for ( int i = 0; i < count; i++) {
      String statement = scan.next();
      if (statement.charAt(1) == '+'){
        result ++;
      }
      if (statement.charAt(1) == '-'){
        result --;
      }
    }
    scan.close();
    System.out.println(result);
  }
}
