//  Problem: 200B. Drinks
//  Link: https://codeforces.com/problemset/problem/200/B

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    double totalPercentage = 0;
    
    for (int i = 0; i < n; i++) {
        totalPercentage += scan.nextInt();
    }
    scan.close();
    double average = totalPercentage / n;
    System.out.println(average);
  }
}
