//  Problem: 469A. I Wanna Be the Guy
//  Link: https://codeforces.com/problemset/problem/469/A

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int levels = scan.nextInt();
    ArrayList<Integer> level_arr = new ArrayList<>();
    int xlevels = scan.nextInt();
    for (int i=0; i < xlevels; i++){
      int n = scan.nextInt();
      if (level_arr.contains(n)){
        continue;
      } else {
        level_arr.add(n);
      }
    }
    int ylevels = scan.nextInt();
    for (int i=0; i < ylevels; i++){
      int n = scan.nextInt();
      if (level_arr.contains(n)){
        continue;
      } else {
        level_arr.add(n);
      }
    }
    scan.close();
    if (level_arr.size()==levels){
      System.out.println("I become the guy.");
    } else {
      System.out.println("Oh, my keyboard!");
    }
  }
}
