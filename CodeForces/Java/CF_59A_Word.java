//  Problem: 59A. Helpful Maths
//  Link: https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String word = scan.next();
    int upper = 0;
    scan.close();
  
    for (char c : word.toCharArray()){
      if(c>='A' && c<='Z'){
        upper++;
      }
    }
    if(upper>word.length()/2){
      word = word.toUpperCase();
    } else{
      word = word.toLowerCase();
    }
    System.out.println(word);

  }
}
