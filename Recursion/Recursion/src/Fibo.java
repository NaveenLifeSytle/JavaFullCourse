public class Fibo {
    public static void main(String[] args) {
        int f=0,s=1;
        int count=10;

        System.out.println("0");
       System.out.println("1");
        System.out.println(fibo(f,s,count));
     //////////////////////////////////////////////////////////////
        System.out.println("0");

        System.out.println(fibo2(f,s,count));
    }

    private static int fibo(int f, int s, int count) {

        if(count==3){
            return f+s+s;
        }
        s=f+s;//1
        f=s-f;//1
        System.out.println(f+s);

       return fibo(f,s,count-1);

    }

    private static int fibo2(int f, int s, int count) {

        if(count==0){
            return f;
        }
        s=f+s;//1         0 1 1 2 3 5
        f=s-f;//1
        System.out.println(f);

        return fibo(f,s,count-1);

    }

}
