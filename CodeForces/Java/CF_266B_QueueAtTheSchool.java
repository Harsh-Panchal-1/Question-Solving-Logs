//  Problem: 266B. Queue at the School
//  Link: https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int students = scan.nextInt();
    int time = scan.nextInt();

    StringBuilder str = new StringBuilder(scan.next());
    scan.close();

    int timerTracker = 0;

    while(timerTracker!=time){
      for (int i =0; i < students-1; i++){
        if (str.charAt(i)=='B' && str.charAt(i+1)=='G'){
          str.setCharAt(i, 'G');
          str.setCharAt(i+1, 'B');
          i++;
        }
      }
      timerTracker ++;
    }
    System.out.println(str);
  }

}
