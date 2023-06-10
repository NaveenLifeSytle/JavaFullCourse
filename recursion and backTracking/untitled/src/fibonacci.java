public class fibonacci {
    public static void main(String[] args) {
        System.out.println(  fibonacci(5));
    }
    static int fibonacci(int num){
        if(num<2){
            return num;
        }
         return fibonacci(num-1)+fibonacci(num-2);

    }
}
