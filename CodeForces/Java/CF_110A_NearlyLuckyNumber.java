//  Problem: 110A. Nearly Lucky Number
//  Link: https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String n = scan.next();
    scan.close();
    
    int count = 0;
    for (int i = 0; i < n.length(); i++) {
        if (n.charAt(i) == '4' || n.charAt(i) == '7') {
            count++;
        }
    }
    
    if (count == 4 || count == 7) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
  }
}
