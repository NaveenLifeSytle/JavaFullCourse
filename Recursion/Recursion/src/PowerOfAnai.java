public class PowerOfAnai {
    public static void main(String[] args) {
        System.out.println(pow(5,3));
    }
    public static int pow(int x,int n){
        if(n==1){
            return x;
        }
            int y = pow(x, n / 2); //y=2,1
             y = y * y;
        if(n%2==0){
            return y;
        }
        return x*y;

    }
}
