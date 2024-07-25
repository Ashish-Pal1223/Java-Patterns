public class Pattern10{
  public static void main(String[] args){
    int num = 1;
    for(int i=1; i<=5; i++){
      for(int j=i; j<i+num; j++){
        if(j%2==1){
          System.out.print("1 ");
        }
        else{
          System.out.print("0 ");
        }
      }
      System.out.println();
      num++;
    }
  }
}
