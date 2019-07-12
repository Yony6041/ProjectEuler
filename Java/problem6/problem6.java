import java.util.Scanner;
class problem6{
/*
Find the difference between the sum of the squares of the first one hundred
natural numbers and the square of the sum.
*/
private static long sumOfSquares(int z){
int j = 0;
  for(int i=1;i<=z;i++){
    j = j + i * i;
  }
  return (long)j;
}

  private static long squareOfSum(int z){
    int j=0;
    for(int i= 1;i<=z;i++){
      j = j + i;
    }
    return (long)(j*j);
  }
  public static long difference(int y){
    return (long)(squareOfSum(y) - sumOfSquares(y));
  }


  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("write a number");
    int a = in.nextInt();
    System.out.println("The difference is " + difference(a));
  }
}
