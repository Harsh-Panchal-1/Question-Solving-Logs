//  Problem: 617A. Elephant
//  Link: https://codeforces.com/problemset/problem/617/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int friend = scan.nextInt();
    int counter = 0;
    scan.close();

    for (int i = 5; i>0; i--){
      if (i<=friend){
        counter = counter + Math.floorDiv(friend, i);
        friend = friend%i;
      }
    }
    System.out.println(counter);

  }
}
