package recursionBasic;

public class Fun {
    public static void main(String[] args) {
        fun1(5);
    }
    //stack overflow error
    static void fun(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        fun(num--);
    }
    //correct way
    static void fun1(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        fun1(--num);
    }
}
