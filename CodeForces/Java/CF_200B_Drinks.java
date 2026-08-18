//  Problem: 200B. Drinks
//  Link: https://codeforces.com/problemset/problem/200/B

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    // 1. Read the total number of drinks
    int n = scan.nextInt();
    
    // 2. We need a variable to store the sum of all the orange juice percentages.
    // We use a 'double' instead of an 'int' because we need decimals for our final answer!
    double totalPercentage = 0;
    
    // 3. Loop through each drink and add its percentage to our total
    for (int i = 0; i < n; i++) {
        totalPercentage += scan.nextInt();
    }
    scan.close();
    
    // 4. The final fraction of orange juice is simply the average!
    // (Total sum of percentages divided by the total number of drinks)
    double average = totalPercentage / n;
    
    // 5. Print the result
    System.out.println(average);
  }
}
