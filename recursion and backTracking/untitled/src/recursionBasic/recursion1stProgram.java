package recursionBasic;

public class recursion1stProgram {
    public static void main(String[] args) {
print(5);
    }
    static void print(int num){
        if(num==0){
            return;
        }
        System.out.println(num);
        print(num-1);
        System.out.println(num);
    }
}
