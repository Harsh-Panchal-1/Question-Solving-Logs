//  Problem: 734A. Anton and Danik
//  Link: https://codeforces.com/problemset/problem/734/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    String games = scan.next();
    scan.close();

    int score = 0;
    
    for (int i = 0; i < n; i++) {
        if (games.charAt(i) == 'A') {
            score++;
        } else {
            score--;
        }
    }
    
    if (score > 0) {
        System.out.println("Anton");
    } else if (score < 0) {
        System.out.println("Danik");
    } else {
        System.out.println("Friendship");
    }
  }
}
