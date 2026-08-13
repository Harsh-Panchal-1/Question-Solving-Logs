//  Problem: 546A. Soldier and Bananas
//  Link: https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int k = scan.nextInt();
    int n = scan.nextInt();
    int w = scan.nextInt();
    int amount = k * w * (w + 1)/2;
    scan.close();
    if(n < amount){
      System.out.println(amount - n);
    } else {
      System.out.println(0);
    }
  }
}
