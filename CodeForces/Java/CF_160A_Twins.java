//  Problem: 160A. Translation
//  Link: https://codeforces.com/problemset/problem/160/A

import java.util.*;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int[] coins = new int[n];
    int totalSum = 0;
    
    for (int i = 0; i < n; i++) {
        coins[i] = scan.nextInt();
        totalSum += coins[i];
    }
    scan.close();

    Arrays.sort(coins);
    
    int mySum = 0;
    int coinsTaken = 0;
    
    for (int i = n - 1; i >= 0; i--) {
      mySum += coins[i];
      coinsTaken++;
      if (mySum > totalSum / 2) {
          break;
      }
    }
    
    System.out.println(coinsTaken);
  }
}
