import java.util.Scanner;

public class Pattern12{
  public static void main(String[] args){
    int counter = 1;
    System.out.print("Enter the number : ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    for(int i=0; i<input; i++){
      for(int j=0; j<=i; j++){
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }
}
