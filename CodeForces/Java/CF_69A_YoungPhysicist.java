// Problem: 69A. Young Physicist
// Link: https://codeforces.com/problemset/problem/69/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int sumX = 0;
    int sumY = 0;
    int sumZ = 0;
    
    for (int i = 0; i < n; i++) {
        sumX += scan.nextInt();
        sumY += scan.nextInt();
        sumZ += scan.nextInt();
    }
    
    scan.close();
    
    if (sumX == 0 && sumY == 0 && sumZ == 0) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
  }
}
