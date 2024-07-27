/*
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
*/

public class Pattern19{
  public static void main(String[] args){
    int num = 8;
    for(int i=0; i<10; i++){
      if(i<5){
        for(int j=0; j<=i; j++){
          System.out.print("*");
        }
        for(int k=num; k>0; k--){
          System.out.print(" ");
        }
        for(int l=0; l<=i; l++){
          System.out.print("*");
        }
        System.out.println();
        num -= 2;
      }
      else{
        num += 2;
        for(int j=i+1; j<10; j++){
          System.out.print("*");
        }
        for(int k=0; k<num+2; k++){
          System.out.print(" ");
        }
        for(int l=i+1; l<10; l++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }
}
