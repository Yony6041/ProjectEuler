class problem3{
  private static long k = 600851475143L;
  public static boolean isPrime(long i){
      long j = 3;
      while(j<=i/2){
        if(i%j==0){
          return false;
        }
        j=j+2;
      }
      return true;
  }

  public static boolean isFactor(long i){
    if(k%i==0)
      return true;
    return false;
  }
  public static void main(String[] args){
    for(long i=3;i<=k/2;i++){
      if(isFactor(i)){
        k/=i;
        if(isPrime(i)){
          System.out.println(k);
        }
      }
    }
  }
}
