/*
*****
*   *
*   *
*   *
*****
*/

import java.util.Scanner;

public class Pattern20{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int ite = scanner.nextInt();
    for(int i=1; i<=ite; i++){
      if(i==1 || i==ite){
        for(int j=1; j<=ite; j++){
          System.out.print("*");
        }
      }
      else{
        for(int k=1; k<=ite; k++){
          if(k==1 || k==ite){
            System.out.print("*");
          }
          else{
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}
