/* 
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
*/

public class Pattern18{
  public static void main(String[] args){
    int num = 0;
    for(int i=0; i<10; i++){
      if(i<5){
        for(int j=i; j<5; j++){
          System.out.print("*");
        }
        for(int l=0; l<num; l++){
          System.out.print(" ");
        }
        for(int k=i; k<5; k++){
          System.out.print("*");
        }
        System.out.println();
        num += 2;
      }
      else{
        num -= 2;
        for(int j=5; j<=i; j++){
          System.out.print("*");
        }
        for(int k=0; k<num; k++){
          System.out.print(" ");
        }
        for(int l=5; l<=i; l++){
          System.out.print("*");
        }
        System.out.println();
      }
    } 
  }
}
