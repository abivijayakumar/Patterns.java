import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int row=scan.nextInt();
    int col=scan.nextInt();
    for(int i=1;i<row;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i);
      }
      System.out.println(" ");
    }
  }
}
    
