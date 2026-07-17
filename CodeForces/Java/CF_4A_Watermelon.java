// Problem: 4A. Watermelon
// Link: https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;
class CF_4A_Watermelon {
  public static void main(String[] args){
    java.util.Scanner sc = new Scanner(System.in);

    int weight = sc.nextInt();
    if ( weight % 2 == 0 && weight > 2) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}