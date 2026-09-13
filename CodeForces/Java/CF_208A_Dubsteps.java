// Problem: 208A. Dubstep
// Link: https://codeforces.com/problemset/problem/208/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String song = scan.next();
    scan.close();
    
    System.out.println(song.replaceAll("(WUB)+", " ").trim());
  }
}
