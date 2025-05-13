import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    System.out.print("Enter the number of rows for half the butterfly:");
    int n = scanner.nextInt();
    scanner.close();
    for(int i =1;i <=n;i++){
      for(int j=1;j <=i;j++){
        System.out.print("*");
      }
      for(int j=1;j <=2*(n-i);j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("*");
          }
      System.out.println();
    }
    for (int i = n; i >= 1; i--) {
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
      }
      for(int j =1;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
