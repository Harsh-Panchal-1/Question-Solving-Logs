// Problem: 50A. Domino Piling
// Link: https://codeforces.com/problemset/problem/50/A

import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    scan.close();
    System.out.println(Math.floorDiv(a*b,2));
  }
}