//  Problem: 61A. Ultra-Fast Mathematician
//  Link: https://codeforces.com/problemset/problem/61/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == b.charAt(i)) {
            result.append('0');
        } else {
            result.append('1');
        }
    }
    
    System.out.println(result.toString());
  }
}
