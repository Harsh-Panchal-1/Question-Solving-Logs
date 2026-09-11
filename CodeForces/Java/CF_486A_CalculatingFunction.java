//  Problem: 486A. Calculating Function
//  Link: https://codeforces.com/problemset/problem/486/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    scan.close();

    if (n % 2 == 0) {
        System.out.println(n / 2);
    } else {
        System.out.println(-(n + 1) / 2);
    }

  }
}
