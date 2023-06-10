public class PrimeNumPart2 {

    public static void main(String[] args) {


        int number=40;
        boolean[] arr=new boolean[number+1];
        isPrime(number,arr);


    }

    static void isPrime(int number,boolean[] arr) {

        for(int i=2;i*i<=number;i++){
            if(!arr[i]){
                for (int j=i*2;j<=number;j=j+i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<=number;i++){
            if(!arr[i]){
                System.out.print(i+" ");
            }
        }

    }
}

