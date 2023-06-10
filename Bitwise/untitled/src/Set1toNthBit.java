import java.util.Arrays;

public class Set1toNthBit {
    public static void main(String[] args) {
        int num = 10;
int i=4;
        int ans=ithBit(num, i);
        System.out.println(Integer.toString(num,2));
        System.out.println(Integer.toString(1<<(i-1),2));
        System.out.println("---------------");
        System.out.println(Integer.toString(ans,2));
        System.out.println("---------------");
        System.out.println(ans);

    }
    static int ithBit(int num,int i){
        return num | (1<<(i-1));
    }
}
