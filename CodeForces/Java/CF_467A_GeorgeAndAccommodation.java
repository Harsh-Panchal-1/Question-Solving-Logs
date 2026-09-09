// Problem: 467A. George and Accommodation
// Link: https://codeforces.com/problemset/problem/467/A

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int rooms = scan.nextInt();
    int roomsAvailable = 0;
    for (int i=0; i<rooms;i++){
      int people = scan.nextInt();
      int capacity = scan.nextInt();
      if (capacity - people >=2){
        roomsAvailable++;
      }
    }
    scan.close();
    System.out.println(roomsAvailable);
  }
}
