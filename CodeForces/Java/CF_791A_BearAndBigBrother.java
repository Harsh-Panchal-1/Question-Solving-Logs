//  Problem: 791A. Bear and big brother
//  Link: https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int limak = scan.nextInt();
    int bob = scan.nextInt();
    scan.close();
    
    int years = 0;

    while (limak <= bob) {
        limak *= 3;
        bob *= 2;
        years++;
    }
        System.out.println(years);
  }
}
