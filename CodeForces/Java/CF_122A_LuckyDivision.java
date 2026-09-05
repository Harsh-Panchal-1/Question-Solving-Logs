//  Problem: 122A. Lucky Division
//  Link: https://codeforces.com/problemset/problem/122/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    scan.close();
    
    int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
    boolean isAlmostLucky = false;
    
    for (int i = 0; i < luckyNumbers.length; i++) {
        if (n % luckyNumbers[i] == 0) {
            isAlmostLucky = true;
            break;
        }
    }
    
    if (isAlmostLucky) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }
  }
}
