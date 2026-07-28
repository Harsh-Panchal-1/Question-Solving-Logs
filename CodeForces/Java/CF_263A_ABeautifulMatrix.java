//  Problem: 263A. Beautiful Matrix
//  Link: https://codeforces.com/problemset/problem/263/A
import java.util.*;

class Main {
  public static void main(String[] args) {
    int a = 0;
    int b = 0;
    int count = 0;
    Scanner scan = new Scanner(System.in);
    int[][] matrix = new int[5][5];
    
    for (int i=0; i<5; i++){
      for (int j=0; j<5; j++){
        matrix[i][j] = scan.nextInt();
        if (matrix[i][j] == 1){
          a = i;
          b = j;
        }
      }
    }
    scan.close();
    
    while (a != 2 || b != 2) {
      if (a < 2){
        a++;
        count++;
      }
      else if (a > 2){ 
        a--;
        count++;
      }
      
      if (b < 2){
        b++;
        count++;
      }
      else if (b > 2){ 
        b--;
        count++;
      }
    }
    System.out.println(count);
  }
}
