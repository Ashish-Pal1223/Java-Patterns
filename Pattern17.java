/* 
E
DE
CDE
BCDE
ABCDE
*/



import java.util.Scanner;

public class Pattern17{
  public static void main(String[] args){
    char printValue = 'D';
    for(int i=2; i<=6; i++){
      for(int j=1; j<i; j++){
        printValue++;
        System.out.print(printValue);
      }
      printValue -= i;
      System.out.println();
    }
  }
}
