import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2 = scan.nextLine();
    scan.close();
    int result = str1.compareToIgnoreCase(str2);
    if (result<0){
      result=-1;
    } else if(result>0){
      result = 1;
    } else if(result==0){
      result=0;
    }
    System.out.println(result);
  }
}
