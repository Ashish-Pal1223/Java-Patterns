/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA

*/


import java.util.Scanner;

public class Pattern16{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int ite = scanner.nextInt();
    int odd = 1;
    char printValue = 'A';
    for(int i=1; i<=ite; i++){
      for(int j=ite; j>i; j--){
        System.out.print(" ");
      }
      for(int k=1; k<=odd; k++){
        if(k>i){
          printValue--;
          System.out.print(printValue);
        }
        else{
          System.out.print(printValue);
          if(k != i){
            printValue++;
          }
        }
      }
      System.out.println();
      printValue = 'A';
      odd += 2;
    }
  }
}
