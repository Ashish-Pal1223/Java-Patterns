import java.util.Scanner;

public class Pattern13{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int ite = scanner.nextInt();
    char printValue = 'A';
    for(int i=1; i<=ite; i++){
      for(int j=0; j<i; j++){
        System.out.print(printValue);
        printValue++;
      }
      System.out.println();
      printValue-=i;
    }
  }
}
