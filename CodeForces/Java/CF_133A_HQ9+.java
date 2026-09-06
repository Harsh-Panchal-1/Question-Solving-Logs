//  Problem: 133A. HQ9+
//  Link: https://codeforces.com/problemset/problem/133/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String p = scan.next();
    scan.close();

    for (int i=0; i<p.length();i++){
      char a = p.charAt(i);
      if (a == 'H' || a == 'Q' || a == '9'){
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
