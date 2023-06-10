public class NoOfDigitsBaseLog {
    public static void main(String[] args) {
        int num=6678;
        int base=10;
        int ans=(int)(Math.log(num)/Math.log(base))+1;//(log n base 2)+1 ethai nama( log n/log 2)+1 ena ezhuthalam

        System.out.println(ans);
    }

}
