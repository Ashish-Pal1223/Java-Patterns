/*public class Pattern8{
  public static void main(String[] args){
    int odd = 1;
    int rev_odd = 9;
    for(int i=4; i>=0; i--){
      for(int j=i; j>=1; j--){
        System.out.print(" ");
      }
      for(int k=odd; k>=1; k--){
        System.out.print("*");
      }
      System.out.println();
      odd = odd + 2;
    }
    for(int i=0; i<5; i++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
      }
      for(int k=rev_odd; k>0; k--){
        System.out.print("*");
      }
      System.out.println();
      rev_odd = rev_odd-2;
    }
  }
}*/

public class Pattern8{
  public static void main(String[] args){
    int odd = 1;
    for(int i=0; i<10; i++){
      for(int j=4; j>i; j--){
        System.out.print(" ");
      }
      for(int k=odd; k>0; k--){
        System.out.print("*");
      }
      System.out.println();
      odd = odd+2;
      if(i>=5){
        for(int l=i; l<5; l--){
          System.out.print(" ");
        }
        for(int m=odd; m>=1; m--){
          System.out.print("*");
        }
        System.out.println();
        odd = odd-2;
      }
    }
  }
}
