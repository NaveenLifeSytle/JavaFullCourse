public class PrimeNumber {
    public static void main(String[] args) {

      for(int i=2;i<=20;i++){
          if(isPrime(i)){
              System.out.println(i+" is Prime Number");
          }
          else {
              System.out.println(i+" is not Prime Number");
          }
      }
    }
    static boolean isPrime(int number){
        if(number<=1){
            return  false;
        }
         int count=2;
        while (count*count<=number){
            if(number%count==0){
                return false;
            }
            count++;
        }

        return true;
    }
}
