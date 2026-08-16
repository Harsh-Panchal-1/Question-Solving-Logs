//  Problem: 96A. Football
//  Link: https://codeforces.com/problemset/problem/96/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String players = scan.next();
    scan.close();
    
    int count = 1; 
    int prev = players.charAt(0);

    for (int i = 1; i < players.length(); i++){
      int cur = players.charAt(i);
      
      if (prev == cur){
        count++;
      } else {
        count = 1; 
        prev = cur;
      }
      
      if (count >= 7){
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
