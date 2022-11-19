public class RecursionDemo {

    public static void main(String[] args) {
        print(5);
    }
    public  static  int print(int n){
        if(n==0){
            return  0;
        }else
            System.out.println(n);
     return print(n-1);
    }
}
