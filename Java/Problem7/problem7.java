class problem7{
  // i will be the counter of the kst prime number
  static int i = 3;
  // arr is the array that contains long prime numbers
  static double[] arr = new double[10000];


  public static void isPrime(double a){
    double c = a/2;
    for(double b=3.0;b<c;b+=2){
      if(a%b==0.0){
        return;
      }
    }
    arr[i]= a;
    i++;
    return;
  }

  public static void main (String[] args){
    arr[0] = 2.0;
    arr[1] = 3.0;
    arr[2] = 5.0;

    for(double j=7.0;i<=arr.length;j+=2){
      isPrime(j);
      int z = i;
      System.out.println(arr[z]);
    }
  }
}
