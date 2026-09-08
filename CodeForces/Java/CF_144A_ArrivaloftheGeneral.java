// Problem: 144A. Arrival of the General
// Link: https://codeforces.com/problemset/problem/144/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    
    int maxVal = 0;
    int minVal = 101;
    int maxIndex = 0;
    int minIndex = 0;
    
    for (int i = 0; i < n; i++) {
      int height = scan.nextInt();
      
      if (height > maxVal) {
        maxVal = height;
        maxIndex = i;
      }
      
      if (height <= minVal) {
        minVal = height;
        minIndex = i;
      }
    }
    
    scan.close();
    
    if (maxIndex > minIndex) {
      System.out.println(maxIndex + (n - 1 - minIndex) - 1);
    } else {
      System.out.println(maxIndex + (n - 1 - minIndex));
    }
  }
}
