//  Problem: 66B. Petya and Countryside.
//  Link: https://codeforces.com/problemset/problem/66/B

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
        numbers[i] = scan.nextInt();
    }
    
    int maxWatered = 0;

    for (int i = 0; i < n; i++){
      int currentWater = 1;
        
      for (int j = i; j < n - 1; j++){
        if (numbers[j] >= numbers[j+1]){
          currentWater++;
        } else{
          break;
        }
      }
      
      for (int j = i; j > 0; j--){
        if (numbers[j] >= numbers[j-1]){
          currentWater++;
        } else{
          break;
        }
      }
      
      if (currentWater > maxWatered) {
          maxWatered = currentWater;
      }
    }
    
    System.out.println(maxWatered);
    
    scan.close();
  }
}
