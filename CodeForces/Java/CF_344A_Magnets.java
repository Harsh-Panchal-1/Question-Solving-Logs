//  Problem: 344A. Magnets
//  Link: https://codeforces.com/problemset/problem/344/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int groups = 1;
  
    int prev = scan.nextInt();
    
    for (int i = 1; i < n; i++) {
        int current = scan.nextInt();
        if (current != prev) {
            groups++;
            prev = current;
        }
    }
    System.out.println(groups);
    
    scan.close();
  }
}
