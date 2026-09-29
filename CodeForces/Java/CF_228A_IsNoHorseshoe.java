// Problem: 228A. Is your horseshoe on the other hoof?
// Link: https://codeforces.com/problemset/problem/228/A

import java.util.Scanner;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    HashSet<Integer> shoes = new HashSet<>();
    
    shoes.add(scan.nextInt());
    shoes.add(scan.nextInt());
    shoes.add(scan.nextInt());
    shoes.add(scan.nextInt());
    
    scan.close();
    
    System.out.println(4 - shoes.size());
  }
}
