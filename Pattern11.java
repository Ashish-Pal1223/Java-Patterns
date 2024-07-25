import java.util.Scanner;

public class Pattern11{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int input = scanner.nextInt();
    int spaces = (input-1)*2;
    for(int i=1; i<=input; i++){
      for(int j=1; j<=i; j++){
        System.out.print(j);
      }
      for(int k=spaces; k>0; k--){
        System.out.print(" ");
      }
      for(int l=i; l>0; l--){
        System.out.print(l);
      }
      System.out.println();
      spaces -= 2;
    }
  }
}



