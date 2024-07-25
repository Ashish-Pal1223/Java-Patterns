public class Pattern7{  
  public static void main(String[] args){
    int odd = 9;
    for(int i=0; i<5; i++){
      for(int j=0; j<i; j++){
        System.out.print(" ");
      }
      for(int k=odd; k>0; k--){
        System.out.print("*");
      }
      System.out.println();
      odd = odd-2;
    }
  }
}
