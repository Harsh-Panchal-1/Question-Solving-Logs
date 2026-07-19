// Problem: 158A. Team
// Link: https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int nextRound = 0;
    int[] playerScore = new int[n];
    for (int i = 0; i < n; i++) {
      int score = scan.nextInt();
      playerScore[i] = score;
    }
    scan.close();
    for (int i : playerScore) {
      if (playerScore[k-1] <= i && i>0){
        nextRound++;
      }
    }
    System.out.println(nextRound);
  }
}
