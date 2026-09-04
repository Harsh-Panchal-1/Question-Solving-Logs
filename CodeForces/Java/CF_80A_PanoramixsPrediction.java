// Problem: 80A. Panoramix's Prediction
// Link: https://codeforces.com/problemset/problem/80/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    scan.close();
    
    int nextPrime = n + 1;
    while (!isPrime(nextPrime)) {
      nextPrime++;
    }
    
    if (nextPrime == m) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
  
  public static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
