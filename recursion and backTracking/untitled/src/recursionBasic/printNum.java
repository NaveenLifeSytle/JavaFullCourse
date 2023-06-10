package recursionBasic;

public class printNum {
    public static void main(String[] args) {
print2(5);
    }
    static void print(int num){
        if(num==0){
            return;
        }
        System.out.print(num+" ");
        print(num-1);
    }
    static void print2(int num){
        if(num==0){
            return;
        }

        print2(num-1);
        System.out.print(num+" ");
    }
}
