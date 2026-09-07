//  Problem: 155A. I_love_%username%
//  Link: https://codeforces.com/problemset/problem/155/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int first = scan.nextInt();
    int min = first;
    int max = first;
    int amazing = 0;
    
    for (int i = 1; i < n; i++) {
        int score = scan.nextInt();
        if (score > max) {
            max = score;
            amazing++;
        } else if (score < min) {
            min = score;
            amazing++;
        }
    }
    
    System.out.println(amazing);
    scan.close();
  }
}
