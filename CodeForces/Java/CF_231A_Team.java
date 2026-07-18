// Problem: 231A. Team
// Link: https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int queNum = scan.nextInt();
    int solvable = 0;
    for (int i = 0; i < queNum; i++) {
      int petya = scan.nextInt();
      int vasya = scan.nextInt();
      int tonya = scan.nextInt();
      if ((petya==1 && vasya==1) || (petya==1 && tonya==1) || (tonya==1 && vasya==1)){
        solvable++;
      }
    }
    System.out.println(solvable);
  }
}
