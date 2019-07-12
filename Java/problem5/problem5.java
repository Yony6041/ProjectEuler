class problem5{
  private static boolean divide(long x){
    for(int i = 11;i<=20;i++){
      if(!(x%i==0)){
        return false;
      }
    }
    return true;
  }

  private static long noReminder(long x){
    long j = 2520;
    while(!divide(j)){
      j+=2;
    }
    return j;
  }


  public static void main(String[] args){
    System.out.println("The smallest even divisible number is " + noReminder(2520));
  }
}
