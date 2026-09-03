//  Problem: 136A. Presents
//  Link: https://codeforces.com/problemset/problem/136/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int people = scan.nextInt();
    int[] arr = new int[people];
    
    for (int i =1; i<=people;i++){
      int place = scan.nextInt();
      arr[place-1] = i;
    }
    scan.close();
    
    for (int i =0; i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
  }
}
