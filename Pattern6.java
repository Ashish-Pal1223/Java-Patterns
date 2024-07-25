public class Pattern6{
  public static void main(String[] args){
    int odd = 1;
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
  }
}
