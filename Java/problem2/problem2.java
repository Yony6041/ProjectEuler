public class problem2{
  public static void sum(){
    int i = 1;
    int j = 1;
    int sum = 0;
    while(j<4000000){
      if(j%2==0){
        sum+=j;
      }
      int aux = i + j;
      i = j;
      j= aux;
    }
    System.out.println(sum);
  }
  public static void main(String[] args){
  sum();
  }
}
