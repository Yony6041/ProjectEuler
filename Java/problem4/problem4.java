class problem4{
  private static String reverseString(String s){
    StringBuilder rv =new StringBuilder();
    for(int k = s.length() - 1; k >= 0; k--){
      rv.append(s.charAt(k));
    }
    return rv.toString();
  }


  public static boolean isPalindrome(int i){
    String ss = String.valueOf(i);
    return reverseString(ss).equals(String.valueOf(i));
  }


  public static void main(String[] args){
    int k;
    int l=0;
    for(int i=100;i<=999;i++){
      for(int j = 999;j>=i;j--){
        k = i * j;
        if(isPalindrome(k) && k>l){
          l=k;
        }
      }
    }
    System.out.println("The largest palindrome is " + l);
  }
}
