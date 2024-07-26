import java.util.Scanner;

public class Pattern14{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int ite = scanner.nextInt();
    char printValue;
    for(int i=ite; i>0; i--){
      printValue = 'A';
      for(int j=0; j<i; j++){
        System.out.print(printValue);
        printValue++;
      }
      System.out.println();
    }
  }
}
