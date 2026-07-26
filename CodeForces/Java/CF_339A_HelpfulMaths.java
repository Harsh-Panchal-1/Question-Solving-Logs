//  Problem: 339A. Helpful Maths
//  Link: https://codeforces.com/problemset/problem/339/A

import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] input = scan.nextLine().split("\\+");
    scan.close();
    Arrays.sort(input);

    StringBuilder result = new StringBuilder();
    for (int i = 0; i < input.length; i++){
      result.append(input[i]);
      if (i < input.length - 1) {
          result.append("+");
      }
    }
    
    System.out.println(result);
  }
}
