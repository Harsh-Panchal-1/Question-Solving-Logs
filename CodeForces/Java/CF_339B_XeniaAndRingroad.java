//  Problem: 339B. Xenia and Ringroad
//  Link: https://codeforces.com/problemset/problem/339/B

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int timeunits = 0;
    int n = scan.nextInt();
    int m = scan.nextInt();
    int currhouse = 1;
    for (int i=0; i < m; i++){
      int house = scan.nextInt();
      if (currhouse < house){
        timeunits = timeunits + (house-currhouse);
        currhouse = house;
      } else if (currhouse == house) {
        continue;
      } else {
        timeunits = timeunits + (n-currhouse) + house;
        currhouse = house;
      }
    }
    scan.close();
    System.out.println(timeunits);
  }
}
